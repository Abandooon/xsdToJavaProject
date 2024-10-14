10.14 变量名不合法--class、break、
               --修改变量名、getter方法名(break不用)------直接在模版里改
10.9.1 choice group ref未正确生成，重复提取了element
10.9 extractGroup里面的endswith判断不对，
10.8 group ref的目的是提取引到的group中的element放到elements列表中，不需要做额外的事，对于group ref本身的操作已经在三个地方都写好了，只需提取element返回出去即可.
      对于引到的group中的element，不能调用process_elements否则会循环依赖，单独写extract_element。
     
10.4 三处group ref都调用extractchoicegroup,对里面element的处理调用extract_element，最终将引用到的group里面所有的element放到列表中返回出去，只要里面的element
     ，如果有group ref，则递归调用，提取每个group的element

9.27 提取内部类

9.24 实现wrapper

9.19 SDG-CONTENTS里面的SW-VARIABLE-REFS类型多了s；把四个复杂类型里加同名的element内部类，两个相同两个不同对应四种情况做测试，是不是可以直接把主类的生成也放在InternalClassExtractor里面避免传主类信息的参数

     如果开启wrapper则判断内部类element数量，为1则添加wrapper注解，若同时开启wrapper和内部类，则只有一个element的内部类嵌套内部类只生成里层的类
     如果开启extractinnerClass则提取内部类----没有写重名情况的代码

     对比文件发现生成的list的属性名不能直接用现在的规则，用更上层element的name?, 对比一下不是用插件生成的原始类--------->如果是只有一个element的list，变量名用上层element的name---多个的，上面element不能用作name

9.12 @xmlElementWrapper还没生成
     xsd文件各厂商实现不一，用户具体需求不一样，jaxb生成规则不能满足需求，以autosar为例，，，，，

9.11 把choice group ref取消注释，没有循环调用，但是性能不好

9.8 两个调用group ref的地方一直重复，怎么调用的，怎么传参数的？
    传的参数有问题？测试用例改为simpleTest，注掉了choiceref
    task：重新捋一遍逻辑，看为什么一直调用它

    一直处理group: SW-VARIABLE-REF-PROXY，这个是choice下的group ref，考虑把所有逻辑抽出来单独放在这个类，不调用其他函数
9.3 没必要list<object>，直接拆开，以前就是这么写的


匹配标签正则式：<xsd:group name\b[^>]*>([\s\S]*?)<\/xsd:group>



## 标签含义

- <xsd:group>不会被解析为类，定义了一个元素组，里面的<xsd:element>定义了组里的元素,

- <xsd:group>里面的如果有<xsd:complexType>，则引用它的类会将它里面的complexType解析为内部类。<xsd:element >在group标签中

- <xsd:attributegroup>也不会被解析为类

- <xsd:complexType>定义一个复杂类型，jaxb会将它解析为类

- <xsd:simpleType> 含xsd:enumeration 会被解析为类，含Enum的Simple指<xsd:enumeration value="   "/>、只含简单类型的Simple指里面只有<xsd:pattern>模式约束格式

- 如果Enum里面继承了-Enum-Simple，则该Enum为complexType，Enum类里面成员为Simple类

- <xsd:extension>表示继承关系,但是只有complexType才会有 extends，会继承simpletype，或者一种complextype即REF，继承simpletype不会有extens

- <xsd:element maxOccurs="1" minOccurs="0" name="FRAGMENT" type="AR:IDENTIFIER">，定义元素名为#，类型为#，这里的类型对应的不是group而是complextype或者simpletype

- <xs:element name="items"> 包裹 <xs:element name="item" maxOccurs="unbounded"/>当XSD定义了一个嵌套的复杂类型，且该复杂类型包含了可多次出现的子元素时，JAXB将生成一个带有@XmlElementWrapper注解的Java类字段

- <xsd:sequence>定义子元素及出现的顺序

- <xsd:choice>用于指定一组可选的子元素

- <type="AR:STRING"/>, AR:STRING会映射为定义的STRING类， <xsd:restriction base="xsd:string"/>,xsd:string会映射为java.lang.string

  

  

  ##  choice

  group里面有element，应该编辑为@xmlElement注解，element里面可能定义complexType，complexType里面会引用group和attributeGroup。element下面如果有<xsd:choice>就是且maxOccurs="unbounded"，2也是，即为List，对应Wrapper。

  maxOccurs="1"则对应类和类中元素，若choice下不止一个Element，则对应@XmlElements{（@XmlElement...）}，怎么识别出来的，结合subtypeEnum吗？---

  complex里面的choice好像没有生效？---》TOPIC-CONTENT-OR-MSR-QUERY

  ```
  group
  <xsd:element maxOccurs="1" minOccurs="0" name="ENTITYS">
          <xsd:complexType>
            <xsd:choice maxOccurs="unbounded" minOccurs="0">
              <xsd:element name="BSW-CALLED-ENTITY" type="AR:BSW-CALLED-ENTITY"/>
              <xsd:element name="BSW-INTERRUPT-ENTITY" type="AR:BSW-INTERRUPT-ENTITY"/>
              <xsd:element name="BSW-SCHEDULABLE-ENTITY" type="AR:BSW-SCHEDULABLE-ENTITY"/>
            </xsd:choice>
          </xsd:complexType>
        </xsd:element>
        
    public class Entitys {    
        protected List<Object> bswCalledEntityOrBswInterruptEntityOrBswSchedulableEntity;
  	@XmlElements({ @XmlElement(name = "BSW-CALLED-ENTITY", type = BswCalledEntity.class),
  			@XmlElement(name = "BSW-INTERRUPT-ENTITY", type = BswInterruptEntity.class),
  			@XmlElement(name = "BSW-SCHEDULABLE-ENTITY", type = BswSchedulableEntity.class) })
  ```

  是因为里面的<xsd:choice maxOccurs="unbounded"，改为1后，解析成

  ```
  public static class Entitys {
  
          @XmlElement(name = "BSW-CALLED-ENTITY")
          protected BswCalledEntity bswCalledEntity;
          @XmlElement(name = "BSW-INTERRUPT-ENTITY")
          protected BswInterruptEntity bswInterruptEntity;
          @XmlElement(name = "BSW-SCHEDULABLE-ENTITY")
          protected BswSchedulableEntity bswSchedulableEntity;
  ```

  这个就没有解析为@XmlElements{}，而是普通的成员变量，改为unbounded就变list<Object>,和@XmlElements了

  ```
  <xsd:element maxOccurs="1" minOccurs="0" name="APPL-INIT-VALUE">
          <xsd:complexType>
            <xsd:choice maxOccurs="1" minOccurs="0">
              <xsd:element name="APPLICATION-RULE-BASED-VALUE-SPECIFICATION" type="AR:APPLICATION-RULE-BASED-VALUE-SPECIFICATION"/>
              <xsd:element name="APPLICATION-VALUE-SPECIFICATION" type="AR:APPLICATION-VALUE-SPECIFICATION"/>
              <xsd:element name="ARRAY-VALUE-SPECIFICATION" type="AR:ARRAY-VALUE-SPECIFICATION"/>
              <xsd:element name="CONSTANT-REFERENCE" type="AR:CONSTANT-REFERENCE"/>
              <xsd:element name="NUMERICAL-RULE-BASED-VALUE-SPECIFICATION" type="AR:NUMERICAL-RULE-BASED-VALUE-SPECIFICATION"/>
              <xsd:element name="NUMERICAL-VALUE-SPECIFICATION" type="AR:NUMERICAL-VALUE-SPECIFICATION"/>
              <xsd:element name="RECORD-VALUE-SPECIFICATION" type="AR:RECORD-VALUE-SPECIFICATION"/>
              <xsd:element name="REFERENCE-VALUE-SPECIFICATION" type="AR:REFERENCE-VALUE-SPECIFICATION"/>
              <xsd:element name="TEXT-VALUE-SPECIFICATION" type="AR:TEXT-VALUE-SPECIFICATION"/>
            </xsd:choice>
          </xsd:complexType>
        </xsd:element>
  ```

  


attributeGroup里面是<xsd:attribute >,应该编辑为@xmlAttribute注解



解析xsd文件时，将<xsd:complexType><xsd:simpleType>映射为java类，而<xsd:complexType>中会引用<xsd:group ref和<xsd:attributeGroup ref，这时就根据引用找到对应的<xsd:group>、<xsd:attributeGroup>,<xsd:group>中会定义<xsd:element>，<xsd:element>中可能会定义复杂类型或是直接type=，type对应<xsd:complexType><xsd:simpleType>，若是<xsd:group>中定义<xsd:complexType>将会被映射为内部类。

## complexType里面的choice

complex里面的choice全是unbounded，解析为list,@xmlelements({}),里面的@xmlelement就是引到的group里面的，提取出来都放入@xmlelements

```
  <xsd:complexType abstract="false" mixed="true" name="BOOLEAN-VALUE-VARIATION-POINT">
    <xsd:choice maxOccurs="unbounded" minOccurs="0">
      <xsd:group ref="AR:AR-OBJECT"/>
      <xsd:group ref="AR:FORMULA-EXPRESSION"/>
      <xsd:group ref="AR:SW-SYSTEMCONST-DEPENDENT-FORMULA"/>
      <xsd:group ref="AR:ATTRIBUTE-VALUE-VARIATION-POINT"/>
      <xsd:group ref="AR:BOOLEAN-VALUE-VARIATION-POINT"/>
    </xsd:choice>
    <xsd:attributeGroup ref="AR:AR-OBJECT"/>
    <xsd:attributeGroup ref="AR:ATTRIBUTE-VALUE-VARIATION-POINT"/>
  </xsd:complexType>
```

```
<xsd:group name="SW-SYSTEMCONST-DEPENDENT-FORMULA">
    <xsd:choice>
      <xsd:choice maxOccurs="unbounded" minOccurs="0">
        <xsd:element name="SYSC-STRING-REF">
          <xsd:complexType>
            <xsd:simpleContent>
              <xsd:extension base="AR:REF">
                <xsd:attribute name="DEST" type="AR:SW-SYSTEMCONST--SUBTYPES-ENUM" use="required"/>
              </xsd:extension>
            </xsd:simpleContent>
          </xsd:complexType>
        </xsd:element>
        <xsd:element name="SYSC-REF">
          <xsd:complexType>
            <xsd:simpleContent>
              <xsd:extension base="AR:REF">
                <xsd:attribute name="DEST" type="AR:SW-SYSTEMCONST--SUBTYPES-ENUM" use="required"/>
              </xsd:extension>
            </xsd:simpleContent>
          </xsd:complexType>
        </xsd:element>
      </xsd:choice>
    </xsd:choice>
  </xsd:group>
```

这里只有<xsd:group name="SW-SYSTEMCONST-DEPENDENT-FORMULA">不是空的，后面四个都是attribute解析出来的但是解析成JAXBElement.class，Serializable也不是SW-SYSTEMCONST-DEPENDENT-FORMULA里面的，而是一个io接口，这里应该不对，可能因为继承的ref

```
public class BooleanValueVariationPoint {
	@XmlElementRefs({
			@XmlElementRef(name = "SYSC-STRING-REF", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "SYSC-REF", namespace = "http://autosar.org/schema/r4.0", type = JAXBElement.class, required = false) })

	protected List<Serializable> content;

	protected java.lang.String s;

	protected java.lang.String t;

	protected BindingTimeEnumSimple bindingTime;

	protected java.lang.String blueprintValue;

	protected java.lang.String sd;

	protected java.lang.String shortLabel;
```

## attributeGroup里面的ref

```
<xsd:attributeGroup name="WHITESPACE-CONTROLLED">
    <xsd:attribute ref="xml:space" use="required"/>
  </xsd:attributeGroup>
```

解析为

```
protected java.lang.String space;
	
	@XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	public java.lang.String getSpace() {
		if (space == null) {
			return "preserve";
		} else {
			return space;
		}
	}

	public void setSpace(java.lang.String value) {
		this.space = value;
	}
```



---

XML Schema继承关系

适用转为父类的场景

- 代码生成接口调用返回类型

逐层继承不适用，转父类丢失信息----->除了转父类的逐层建模？文件量增加

SUBTYPES-ENUM列出当前父类的子类，------>提取出不重复的成员放在父类中

分类，哪些不用体现出父类

- ENUM只有自己
- ref（已有继承）
- Abstract------>enum中的直接跳过？
- BluePrint
- atp
- collectable

`<!-- PortInterface -->`

`<xs:simpleType name="PORT-INTERFACE--SUBTYPES-ENUM">`

      `<xs:restriction base="xsd:string">`

         `<xs:enumeration value="CLIENT-SERVER-INTERFACE" />`

         `<xs:enumeration value="DATA-INTERFACE" />`

         `<xs:enumeration value="MODE-SWITCH-INTERFACE" />`

         `<xs:enumeration value="NV-DATA-INTERFACE" />`

         `<xs:enumeration value="PARAMETER-INTERFACE" />`

         `<xs:enumeration value="PORT-INTERFACE" />`

         `<xs:enumeration value="SENDER-RECEIVER-INTERFACE" />`

         `<xs:enumeration value="TRIGGER-INTERFACE" />`

      `</xs:restriction>`

`</xs:simpleType>`

```
<xsd:element maxOccurs="1" minOccurs="0" name="VENDOR-SPECIFIC-MODULE-DEF-REFS">
        <xsd:complexType>
          <xsd:choice maxOccurs="unbounded" minOccurs="0">
            <xsd:element name="VENDOR-SPECIFIC-MODULE-DEF-REF">
              <xsd:complexType>
                <xsd:simpleContent>
                  <xsd:extension base="AR:REF">
                    <xsd:attribute name="DEST" type="AR:ECUC-MODULE-DEF--SUBTYPES-ENUM" use="required"/>
                  </xsd:extension>
                </xsd:simpleContent>
              </xsd:complexType>
            </xsd:element>
          </xsd:choice>
        </xsd:complexType>
      </xsd:element>
```



test.xsd跳过![image-20240822144603219](C:\Users\User\AppData\Roaming\Typora\typora-user-images\image-20240822144603219.png)

## mixed标签

@mixed标签jaxb解析为Serializable和@XmlElementRefs，应该改为object和@xmlElements，

```
<xsd:complexType abstract="false" mixed="true" name="FM-CONDITION-BY-FEATURES-AND-ATTRIBUTES">
```

```
@XmlMixed
@XmlElements({
    @XmlElement(name = "CONFIG-ELEMENT-DEF-GLOBAL-REF", type = ConfigElementDefGlobalRef.class),
    @XmlElement(name = "CONFIG-ELEMENT-DEF-LOCAL-REF", type = ConfigElementDefLocalRef.class)
})
protected List<Object> mixed;

```

解析后的 Java 对象中的 `mixed` 列表可能会包含：

- `"Some text"`：作为 `String` 类型。
- 一个 `ConfigElementDefGlobalRef` 对象。
- `"More text"`：作为 `String` 类型。
- 一个 `ConfigElementDefLocalRef` 对象。

遍历mixed列表来访问里面的内容

```
for (Object obj : ecucQueryExpression.getMixed()) {
    if (obj instanceof String) {
        // 处理文本
        System.out.println("Text: " + (String) obj);
    } else if (obj instanceof ConfigElementDefGlobalRef) {
        // 处理 CONFIG-ELEMENT-DEF-GLOBAL-REF
        ConfigElementDefGlobalRef globalRef = (ConfigElementDefGlobalRef) obj;
        System.out.println("Global Ref DEST: " + globalRef.getDest());
    } else if (obj instanceof ConfigElementDefLocalRef) {
        // 处理 CONFIG-ELEMENT-DEF-LOCAL-REF
        ConfigElementDefLocalRef localRef = (ConfigElementDefLocalRef) obj;
        System.out.println("Local Ref DEST: " + localRef.getDest());
    }
}

```


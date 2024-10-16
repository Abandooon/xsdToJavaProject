package stdgui.data.model.orimodel;
@XmlRootElement(name = "BASE-TYPE-DIRECT-DEFINITION")
public class BaseTypeDirectDefinition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger baseTypeSize;
    
    
    
    protected PositiveInteger maxBaseTypeSize;
    
    
    
    protected BaseTypeEncodingString baseTypeEncoding;
    
    
    
    protected PositiveInteger memAlignment;
    
    
    
    protected ByteOrderEnum byteOrder;
    
    
    
    protected NativeDeclarationString nativeDeclaration;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-SIZE")
    public PositiveInteger getBaseTypeSize() {
    return this.baseTypeSize;
}

    public void setBaseTypeSize(PositiveInteger value) {
        this.baseTypeSize = value;
    }
    
    
    
    @XmlElement(name="MAX-BASE-TYPE-SIZE")
    public PositiveInteger getMaxBaseTypeSize() {
    return this.maxBaseTypeSize;
}

    public void setMaxBaseTypeSize(PositiveInteger value) {
        this.maxBaseTypeSize = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-ENCODING")
    public BaseTypeEncodingString getBaseTypeEncoding() {
    return this.baseTypeEncoding;
}

    public void setBaseTypeEncoding(BaseTypeEncodingString value) {
        this.baseTypeEncoding = value;
    }
    
    
    
    @XmlElement(name="MEM-ALIGNMENT")
    public PositiveInteger getMemAlignment() {
    return this.memAlignment;
}

    public void setMemAlignment(PositiveInteger value) {
        this.memAlignment = value;
    }
    
    
    
    @XmlElement(name="BYTE-ORDER")
    public ByteOrderEnum getByteOrder() {
    return this.byteOrder;
}

    public void setByteOrder(ByteOrderEnum value) {
        this.byteOrder = value;
    }
    
    
    
    @XmlElement(name="NATIVE-DECLARATION")
    public NativeDeclarationString getNativeDeclaration() {
    return this.nativeDeclaration;
}

    public void setNativeDeclaration(NativeDeclarationString value) {
        this.nativeDeclaration = value;
    }
    
    
}
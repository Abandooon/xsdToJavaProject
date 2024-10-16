package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLOAT-VALUE-VARIATION-POINT")
public class FloatValueVariationPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BindingTimeEnumSimple bindingTime;
    
    
    
    protected java.lang.String blueprintValue;
    
    
    
    protected java.lang.String sd;
    
    
    
    protected java.lang.String shortLabel;
    
    
    
    protected ArrayList<Serializable> content;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="BINDING-TIME")
    public BindingTimeEnumSimple getBindingTime() {
    return this.bindingTime;
}

    public void setBindingTime(BindingTimeEnumSimple value) {
        this.bindingTime = value;
    }
    
    
    
    @XmlAttribute(name="BLUEPRINT-VALUE")
    public java.lang.String getBlueprintValue() {
    return this.blueprintValue;
}

    public void setBlueprintValue(java.lang.String value) {
        this.blueprintValue = value;
    }
    
    
    
    @XmlAttribute(name="SD")
    public java.lang.String getSd() {
    return this.sd;
}

    public void setSd(java.lang.String value) {
        this.sd = value;
    }
    
    
    
    @XmlAttribute(name="SHORT-LABEL")
    public java.lang.String getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(java.lang.String value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElementRefs({
        @XmlElementRef(name="SYSC-STRING-REF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="SYSC-REF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false)
    })
    @XmlMixed
    public ArrayList<Serializable> getContent() {
    return this.content;
}

    public void setContent(ArrayList<Serializable> value) {
        this.content = value;
    }
    
    
}
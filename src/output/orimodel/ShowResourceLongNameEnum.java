package stdgui.data.model.orimodel;
@XmlRootElement(name = "SHOW-RESOURCE-LONG-NAME-ENUM")
public class ShowResourceLongNameEnum {

    
    
    protected ShowResourceLongNameEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public ShowResourceLongNameEnumSimple getValue() {
    return this.value;
}

    public void setValue(ShowResourceLongNameEnumSimple value) {
        this.value = value;
    }
    
    
    
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
    
    
}
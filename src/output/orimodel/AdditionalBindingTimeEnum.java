package stdgui.data.model.orimodel;
@XmlRootElement(name = "ADDITIONAL-BINDING-TIME-ENUM")
public class AdditionalBindingTimeEnum {

    
    
    protected AdditionalBindingTimeEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public AdditionalBindingTimeEnumSimple getValue() {
    return this.value;
}

    public void setValue(AdditionalBindingTimeEnumSimple value) {
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
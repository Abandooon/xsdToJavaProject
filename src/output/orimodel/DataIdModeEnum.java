package stdgui.data.model.orimodel;
@XmlRootElement(name = "DATA-ID-MODE-ENUM")
public class DataIdModeEnum {

    
    
    protected DataIdModeEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public DataIdModeEnumSimple getValue() {
    return this.value;
}

    public void setValue(DataIdModeEnumSimple value) {
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
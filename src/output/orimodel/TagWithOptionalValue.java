package stdgui.data.model.orimodel;
@XmlRootElement(name = "TAG-WITH-OPTIONAL-VALUE")
public class TagWithOptionalValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String key;
    
    
    
    protected String value;
    
    

    
    
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
    
    
    
    @XmlElement(name="KEY")
    public String getKey() {
    return this.key;
}

    public void setKey(String value) {
        this.key = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public String getValue() {
    return this.value;
}

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
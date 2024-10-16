package stdgui.data.model.orimodel;
@XmlRootElement(name = "URL")
public class Url {

    
    
    protected java.lang.String value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String mimeType;
    
    

    
    
    @XmlValue
    public java.lang.String getValue() {
    return this.value;
}

    public void setValue(java.lang.String value) {
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
    
    
    
    @XmlAttribute(name="MIME-TYPE")
    public java.lang.String getMimeType() {
    return this.mimeType;
}

    public void setMimeType(java.lang.String value) {
        this.mimeType = value;
    }
    
    
}
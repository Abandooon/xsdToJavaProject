package stdgui.data.model.orimodel;
@XmlRootElement(name = "IPV-4-ADDRESS-SOURCE-ENUM")
public class Ipv4AddressSourceEnum {

    
    
    protected Ipv4AddressSourceEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public Ipv4AddressSourceEnumSimple getValue() {
    return this.value;
}

    public void setValue(Ipv4AddressSourceEnumSimple value) {
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
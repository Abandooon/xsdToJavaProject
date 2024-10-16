package stdgui.data.model.orimodel;
@XmlRootElement(name = "ETHERNET-CONNECTION-NEGOTIATION-ENUM")
public class EthernetConnectionNegotiationEnum {

    
    
    protected EthernetConnectionNegotiationEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public EthernetConnectionNegotiationEnumSimple getValue() {
    return this.value;
}

    public void setValue(EthernetConnectionNegotiationEnumSimple value) {
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
package stdgui.data.model.orimodel;
@XmlRootElement(name = "CONTAINER-I-PDU-HEADER-TYPE-ENUM")
public class ContainerIPduHeaderTypeEnum {

    
    
    protected ContainerIPduHeaderTypeEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public ContainerIPduHeaderTypeEnumSimple getValue() {
    return this.value;
}

    public void setValue(ContainerIPduHeaderTypeEnumSimple value) {
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
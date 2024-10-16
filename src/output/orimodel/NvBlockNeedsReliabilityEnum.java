package stdgui.data.model.orimodel;
@XmlRootElement(name = "NV-BLOCK-NEEDS-RELIABILITY-ENUM")
public class NvBlockNeedsReliabilityEnum {

    
    
    protected NvBlockNeedsReliabilityEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public NvBlockNeedsReliabilityEnumSimple getValue() {
    return this.value;
}

    public void setValue(NvBlockNeedsReliabilityEnumSimple value) {
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
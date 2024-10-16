package stdgui.data.model.orimodel;
@XmlRootElement(name = "PHYSICAL-DIMENSION-MAPPING")
public class PhysicalDimensionMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstPhysicalDimensionRef firstPhysicalDimensionRef;
    
    
    
    protected SecondPhysicalDimensionRef secondPhysicalDimensionRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-PHYSICAL-DIMENSION-REF")
    public FirstPhysicalDimensionRef getFirstPhysicalDimensionRef() {
    return this.firstPhysicalDimensionRef;
}

    public void setFirstPhysicalDimensionRef(FirstPhysicalDimensionRef value) {
        this.firstPhysicalDimensionRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-PHYSICAL-DIMENSION-REF")
    public SecondPhysicalDimensionRef getSecondPhysicalDimensionRef() {
    return this.secondPhysicalDimensionRef;
}

    public void setSecondPhysicalDimensionRef(SecondPhysicalDimensionRef value) {
        this.secondPhysicalDimensionRef = value;
    }
    
    
}
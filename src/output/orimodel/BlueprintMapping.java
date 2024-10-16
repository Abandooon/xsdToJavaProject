package stdgui.data.model.orimodel;
@XmlRootElement(name = "BLUEPRINT-MAPPING")
public class BlueprintMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BlueprintRef blueprintRef;
    
    
    
    protected DerivedObjectRef derivedObjectRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="BLUEPRINT-REF")
    public BlueprintRef getBlueprintRef() {
    return this.blueprintRef;
}

    public void setBlueprintRef(BlueprintRef value) {
        this.blueprintRef = value;
    }
    
    
    
    @XmlElement(name="DERIVED-OBJECT-REF")
    public DerivedObjectRef getDerivedObjectRef() {
    return this.derivedObjectRef;
}

    public void setDerivedObjectRef(DerivedObjectRef value) {
        this.derivedObjectRef = value;
    }
    
    
}
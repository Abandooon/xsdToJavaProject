package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-INTERFACE-BLUEPRINT-MAPPING")
public class PortInterfaceBlueprintMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortInterfaceBlueprintRef portInterfaceBlueprintRef;
    
    
    
    protected DerivedPortInterfaceRef derivedPortInterfaceRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="PORT-INTERFACE-BLUEPRINT-REF")
    public PortInterfaceBlueprintRef getPortInterfaceBlueprintRef() {
    return this.portInterfaceBlueprintRef;
}

    public void setPortInterfaceBlueprintRef(PortInterfaceBlueprintRef value) {
        this.portInterfaceBlueprintRef = value;
    }
    
    
    
    @XmlElement(name="DERIVED-PORT-INTERFACE-REF")
    public DerivedPortInterfaceRef getDerivedPortInterfaceRef() {
    return this.derivedPortInterfaceRef;
}

    public void setDerivedPortInterfaceRef(DerivedPortInterfaceRef value) {
        this.derivedPortInterfaceRef = value;
    }
    
    
}
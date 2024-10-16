package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPOSITE-NETWORK-REPRESENTATION")
public class CompositeNetworkRepresentation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ApplicationCompositeElementInPortInterfaceInstanceRef leafElementIref;
    
    
    
    protected SwDataDefProps networkRepresentation;
    
    

    
    
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
    
    
    
    @XmlElement(name="LEAF-ELEMENT-IREF")
    public ApplicationCompositeElementInPortInterfaceInstanceRef getLeafElementIref() {
    return this.leafElementIref;
}

    public void setLeafElementIref(ApplicationCompositeElementInPortInterfaceInstanceRef value) {
        this.leafElementIref = value;
    }
    
    
    
    @XmlElement(name="NETWORK-REPRESENTATION")
    public SwDataDefProps getNetworkRepresentation() {
    return this.networkRepresentation;
}

    public void setNetworkRepresentation(SwDataDefProps value) {
        this.networkRepresentation = value;
    }
    
    
}
package stdgui.data.model.orimodel;
@XmlRootElement(name = "SOCKET-CONNECTION-BUNDLE")
public class SocketConnectionBundle {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected ArrayList<SocketConnection> bundledConnections;
    
    
    
    protected ArrayList<SocketConnectionIpduIdentifier> pdus;
    
    
    
    protected ServerPortRef serverPortRef;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElementWrapper(name="BUNDLED-CONNECTIONS")
@XmlElement(name="SOCKET-CONNECTION")
    public ArrayList<SocketConnection> getBundledConnections() {
    return this.bundledConnections;
}

    public void setBundledConnections(ArrayList<SocketConnection> value) {
        this.bundledConnections = value;
    }
    
    
    
    @XmlElementWrapper(name="PDUS")
@XmlElement(name="SOCKET-CONNECTION-IPDU-IDENTIFIER")
    public ArrayList<SocketConnectionIpduIdentifier> getPdus() {
    return this.pdus;
}

    public void setPdus(ArrayList<SocketConnectionIpduIdentifier> value) {
        this.pdus = value;
    }
    
    
    
    @XmlElement(name="SERVER-PORT-REF")
    public ServerPortRef getServerPortRef() {
    return this.serverPortRef;
}

    public void setServerPortRef(ServerPortRef value) {
        this.serverPortRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}
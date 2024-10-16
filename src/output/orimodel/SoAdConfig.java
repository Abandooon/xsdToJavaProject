package stdgui.data.model.orimodel;
@XmlRootElement(name = "SO-AD-CONFIG")
public class SoAdConfig {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SocketConnection> connections;
    
    
    
    protected ArrayList<SocketConnectionBundle> connectionBundles;
    
    
    
    protected ArrayList<LogicAddress> logicAddresss;
    
    
    
    protected ArrayList<SocketAddress> socketAddresss;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="CONNECTIONS")
@XmlElement(name="SOCKET-CONNECTION")
    public ArrayList<SocketConnection> getConnections() {
    return this.connections;
}

    public void setConnections(ArrayList<SocketConnection> value) {
        this.connections = value;
    }
    
    
    
    @XmlElementWrapper(name="CONNECTION-BUNDLES")
@XmlElement(name="SOCKET-CONNECTION-BUNDLE")
    public ArrayList<SocketConnectionBundle> getConnectionBundles() {
    return this.connectionBundles;
}

    public void setConnectionBundles(ArrayList<SocketConnectionBundle> value) {
        this.connectionBundles = value;
    }
    
    
    
    @XmlElementWrapper(name="LOGIC-ADDRESSS")
@XmlElement(name="LOGIC-ADDRESS")
    public ArrayList<LogicAddress> getLogicAddresss() {
    return this.logicAddresss;
}

    public void setLogicAddresss(ArrayList<LogicAddress> value) {
        this.logicAddresss = value;
    }
    
    
    
    @XmlElementWrapper(name="SOCKET-ADDRESSS")
@XmlElement(name="SOCKET-ADDRESS")
    public ArrayList<SocketAddress> getSocketAddresss() {
    return this.socketAddresss;
}

    public void setSocketAddresss(ArrayList<SocketAddress> value) {
        this.socketAddresss = value;
    }
    
    
}
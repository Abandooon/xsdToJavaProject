package stdgui.data.model.orimodel;
@XmlRootElement(name = "SOCKET-CONNECTION")
public class SocketConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected SoAdConnectorType autosarConnector;
    
    
    
    protected Boolean clientIpAddrFromConnectionRequest;
    
    
    
    protected Boolean clientPortFromConnectionRequest;
    
    
    
    protected ClientPortRef clientPortRef;
    
    
    
    protected DoIpSourceAddressRef_SocketConnection doIpSourceAddressRef;
    
    
    
    protected DoIpTargetAddressRef_SocketConnection doIpTargetAddressRef;
    
    
    
    protected TpConnectionIdent ident;
    
    
    
    protected LocalPortRef localPortRef;
    
    
    
    protected NPduRef nPduRef;
    
    
    
    protected ArrayList<SocketConnectionIpduIdentifier> pdus;
    
    
    
    protected PositiveInteger pduCollectionMaxBufferSize;
    
    
    
    protected TimeValue pduCollectionTimeout;
    
    
    
    protected RemotePortRef remotePortRef;
    
    
    
    protected RuntimeAddressConfigurationEnum runtimeIpAddressConfiguration;
    
    
    
    protected RuntimeAddressConfigurationEnum runtimePortConfiguration;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected SoAdProtocolType socketProtocol;
    
    
    
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
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="AUTOSAR-CONNECTOR")
    public SoAdConnectorType getAutosarConnector() {
    return this.autosarConnector;
}

    public void setAutosarConnector(SoAdConnectorType value) {
        this.autosarConnector = value;
    }
    
    
    
    @XmlElement(name="CLIENT-IP-ADDR-FROM-CONNECTION-REQUEST")
    public Boolean getClientIpAddrFromConnectionRequest() {
    return this.clientIpAddrFromConnectionRequest;
}

    public void setClientIpAddrFromConnectionRequest(Boolean value) {
        this.clientIpAddrFromConnectionRequest = value;
    }
    
    
    
    @XmlElement(name="CLIENT-PORT-FROM-CONNECTION-REQUEST")
    public Boolean getClientPortFromConnectionRequest() {
    return this.clientPortFromConnectionRequest;
}

    public void setClientPortFromConnectionRequest(Boolean value) {
        this.clientPortFromConnectionRequest = value;
    }
    
    
    
    @XmlElement(name="CLIENT-PORT-REF")
    public ClientPortRef getClientPortRef() {
    return this.clientPortRef;
}

    public void setClientPortRef(ClientPortRef value) {
        this.clientPortRef = value;
    }
    
    
    
    @XmlElement(name="DO-IP-SOURCE-ADDRESS-REF")
    public DoIpSourceAddressRef_SocketConnection getDoIpSourceAddressRef() {
    return this.doIpSourceAddressRef;
}

    public void setDoIpSourceAddressRef(DoIpSourceAddressRef_SocketConnection value) {
        this.doIpSourceAddressRef = value;
    }
    
    
    
    @XmlElement(name="DO-IP-TARGET-ADDRESS-REF")
    public DoIpTargetAddressRef_SocketConnection getDoIpTargetAddressRef() {
    return this.doIpTargetAddressRef;
}

    public void setDoIpTargetAddressRef(DoIpTargetAddressRef_SocketConnection value) {
        this.doIpTargetAddressRef = value;
    }
    
    
    
    @XmlElement(name="IDENT")
    public TpConnectionIdent getIdent() {
    return this.ident;
}

    public void setIdent(TpConnectionIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="LOCAL-PORT-REF")
    public LocalPortRef getLocalPortRef() {
    return this.localPortRef;
}

    public void setLocalPortRef(LocalPortRef value) {
        this.localPortRef = value;
    }
    
    
    
    @XmlElement(name="N-PDU-REF")
    public NPduRef getNPduRef() {
    return this.nPduRef;
}

    public void setNPduRef(NPduRef value) {
        this.nPduRef = value;
    }
    
    
    
    @XmlElementWrapper(name="PDUS")
@XmlElement(name="SOCKET-CONNECTION-IPDU-IDENTIFIER")
    public ArrayList<SocketConnectionIpduIdentifier> getPdus() {
    return this.pdus;
}

    public void setPdus(ArrayList<SocketConnectionIpduIdentifier> value) {
        this.pdus = value;
    }
    
    
    
    @XmlElement(name="PDU-COLLECTION-MAX-BUFFER-SIZE")
    public PositiveInteger getPduCollectionMaxBufferSize() {
    return this.pduCollectionMaxBufferSize;
}

    public void setPduCollectionMaxBufferSize(PositiveInteger value) {
        this.pduCollectionMaxBufferSize = value;
    }
    
    
    
    @XmlElement(name="PDU-COLLECTION-TIMEOUT")
    public TimeValue getPduCollectionTimeout() {
    return this.pduCollectionTimeout;
}

    public void setPduCollectionTimeout(TimeValue value) {
        this.pduCollectionTimeout = value;
    }
    
    
    
    @XmlElement(name="REMOTE-PORT-REF")
    public RemotePortRef getRemotePortRef() {
    return this.remotePortRef;
}

    public void setRemotePortRef(RemotePortRef value) {
        this.remotePortRef = value;
    }
    
    
    
    @XmlElement(name="RUNTIME-IP-ADDRESS-CONFIGURATION")
    public RuntimeAddressConfigurationEnum getRuntimeIpAddressConfiguration() {
    return this.runtimeIpAddressConfiguration;
}

    public void setRuntimeIpAddressConfiguration(RuntimeAddressConfigurationEnum value) {
        this.runtimeIpAddressConfiguration = value;
    }
    
    
    
    @XmlElement(name="RUNTIME-PORT-CONFIGURATION")
    public RuntimeAddressConfigurationEnum getRuntimePortConfiguration() {
    return this.runtimePortConfiguration;
}

    public void setRuntimePortConfiguration(RuntimeAddressConfigurationEnum value) {
        this.runtimePortConfiguration = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="SOCKET-PROTOCOL")
    public SoAdProtocolType getSocketProtocol() {
    return this.socketProtocol;
}

    public void setSocketProtocol(SoAdProtocolType value) {
        this.socketProtocol = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}
package stdgui.data.model.orimodel;
@XmlRootElement(name = "ETHERNET-PHYSICAL-CHANNEL")
public class EthernetPhysicalChannel {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<CommunicationConnectorRefConditional> commConnectors;
    
    
    
    protected FrameTriggerings frameTriggerings;
    
    
    
    protected ArrayList<ISignalTriggering> iSignalTriggerings;
    
    
    
    protected ArrayList<PduTriggering> pduTriggerings;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<NetworkEndpoint> networkEndpoints;
    
    
    
    protected SoAdConfig soAdConfig;
    
    
    
    protected VlanConfig vlan;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
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
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
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
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElementWrapper(name="COMM-CONNECTORS")
@XmlElement(name="COMMUNICATION-CONNECTOR-REF-CONDITIONAL")
    public ArrayList<CommunicationConnectorRefConditional> getCommConnectors() {
    return this.commConnectors;
}

    public void setCommConnectors(ArrayList<CommunicationConnectorRefConditional> value) {
        this.commConnectors = value;
    }
    
    
    
    @XmlElement(name="FRAME-TRIGGERINGS")
    public FrameTriggerings getFrameTriggerings() {
    return this.frameTriggerings;
}

    public void setFrameTriggerings(FrameTriggerings value) {
        this.frameTriggerings = value;
    }
    
    
    
    @XmlElementWrapper(name="I-SIGNAL-TRIGGERINGS")
@XmlElement(name="I-SIGNAL-TRIGGERING")
    public ArrayList<ISignalTriggering> getISignalTriggerings() {
    return this.iSignalTriggerings;
}

    public void setISignalTriggerings(ArrayList<ISignalTriggering> value) {
        this.iSignalTriggerings = value;
    }
    
    
    
    @XmlElementWrapper(name="PDU-TRIGGERINGS")
@XmlElement(name="PDU-TRIGGERING")
    public ArrayList<PduTriggering> getPduTriggerings() {
    return this.pduTriggerings;
}

    public void setPduTriggerings(ArrayList<PduTriggering> value) {
        this.pduTriggerings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="NETWORK-ENDPOINTS")
@XmlElement(name="NETWORK-ENDPOINT")
    public ArrayList<NetworkEndpoint> getNetworkEndpoints() {
    return this.networkEndpoints;
}

    public void setNetworkEndpoints(ArrayList<NetworkEndpoint> value) {
        this.networkEndpoints = value;
    }
    
    
    
    @XmlElement(name="SO-AD-CONFIG")
    public SoAdConfig getSoAdConfig() {
    return this.soAdConfig;
}

    public void setSoAdConfig(SoAdConfig value) {
        this.soAdConfig = value;
    }
    
    
    
    @XmlElement(name="VLAN")
    public VlanConfig getVlan() {
    return this.vlan;
}

    public void setVlan(VlanConfig value) {
        this.vlan = value;
    }
    
    
}
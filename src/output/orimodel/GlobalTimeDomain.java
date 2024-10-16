package stdgui.data.model.orimodel;
@XmlRootElement(name = "GLOBAL-TIME-DOMAIN")
public class GlobalTimeDomain {

    
    
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
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<CommunicationClusterRef> communicationClusterRefs;
    
    
    
    protected PositiveInteger domainId;
    
    
    
    protected TimeValue followUpTimeoutValue;
    
    
    
    protected ArrayList<GlobalTimeGateway> gateways;
    
    
    
    protected GlobalTimePduRef globalTimePduRef;
    
    
    
    protected Master master;
    
    
    
    protected OffsetTimeDomainRef offsetTimeDomainRef;
    
    
    
    protected Slaves slaves;
    
    
    
    protected ArrayList<SubDomainRef> subDomainRefs;
    
    
    
    protected TimeValue syncLossThreshold;
    
    
    
    protected TimeValue syncLossTimeout;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="COMMUNICATION-CLUSTER-REFS")
@XmlElement(name="COMMUNICATION-CLUSTER-REF")
    public ArrayList<CommunicationClusterRef> getCommunicationClusterRefs() {
    return this.communicationClusterRefs;
}

    public void setCommunicationClusterRefs(ArrayList<CommunicationClusterRef> value) {
        this.communicationClusterRefs = value;
    }
    
    
    
    @XmlElement(name="DOMAIN-ID")
    public PositiveInteger getDomainId() {
    return this.domainId;
}

    public void setDomainId(PositiveInteger value) {
        this.domainId = value;
    }
    
    
    
    @XmlElement(name="FOLLOW-UP-TIMEOUT-VALUE")
    public TimeValue getFollowUpTimeoutValue() {
    return this.followUpTimeoutValue;
}

    public void setFollowUpTimeoutValue(TimeValue value) {
        this.followUpTimeoutValue = value;
    }
    
    
    
    @XmlElementWrapper(name="GATEWAYS")
@XmlElement(name="GLOBAL-TIME-GATEWAY")
    public ArrayList<GlobalTimeGateway> getGateways() {
    return this.gateways;
}

    public void setGateways(ArrayList<GlobalTimeGateway> value) {
        this.gateways = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-PDU-REF")
    public GlobalTimePduRef getGlobalTimePduRef() {
    return this.globalTimePduRef;
}

    public void setGlobalTimePduRef(GlobalTimePduRef value) {
        this.globalTimePduRef = value;
    }
    
    
    
    @XmlElement(name="MASTER")
    public Master getMaster() {
    return this.master;
}

    public void setMaster(Master value) {
        this.master = value;
    }
    
    
    
    @XmlElement(name="OFFSET-TIME-DOMAIN-REF")
    public OffsetTimeDomainRef getOffsetTimeDomainRef() {
    return this.offsetTimeDomainRef;
}

    public void setOffsetTimeDomainRef(OffsetTimeDomainRef value) {
        this.offsetTimeDomainRef = value;
    }
    
    
    
    @XmlElement(name="SLAVES")
    public Slaves getSlaves() {
    return this.slaves;
}

    public void setSlaves(Slaves value) {
        this.slaves = value;
    }
    
    
    
    @XmlElementWrapper(name="SUB-DOMAIN-REFS")
@XmlElement(name="SUB-DOMAIN-REF")
    public ArrayList<SubDomainRef> getSubDomainRefs() {
    return this.subDomainRefs;
}

    public void setSubDomainRefs(ArrayList<SubDomainRef> value) {
        this.subDomainRefs = value;
    }
    
    
    
    @XmlElement(name="SYNC-LOSS-THRESHOLD")
    public TimeValue getSyncLossThreshold() {
    return this.syncLossThreshold;
}

    public void setSyncLossThreshold(TimeValue value) {
        this.syncLossThreshold = value;
    }
    
    
    
    @XmlElement(name="SYNC-LOSS-TIMEOUT")
    public TimeValue getSyncLossTimeout() {
    return this.syncLossTimeout;
}

    public void setSyncLossTimeout(TimeValue value) {
        this.syncLossTimeout = value;
    }
    
    
}
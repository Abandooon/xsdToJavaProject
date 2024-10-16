package stdgui.data.model.orimodel;
@XmlRootElement(name = "J-1939-TP-CONFIG")
public class J1939TpConfig {

    
    
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
    
    
    
    protected CommunicationClusterRef communicationClusterRef;
    
    
    
    protected ArrayList<TpAddress> tpAddresss;
    
    
    
    protected ArrayList<J1939TpConnection> tpConnections;
    
    
    
    protected ArrayList<J1939TpNode> tpNodes;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMUNICATION-CLUSTER-REF")
    public CommunicationClusterRef getCommunicationClusterRef() {
    return this.communicationClusterRef;
}

    public void setCommunicationClusterRef(CommunicationClusterRef value) {
        this.communicationClusterRef = value;
    }
    
    
    
    @XmlElementWrapper(name="TP-ADDRESSS")
@XmlElement(name="TP-ADDRESS")
    public ArrayList<TpAddress> getTpAddresss() {
    return this.tpAddresss;
}

    public void setTpAddresss(ArrayList<TpAddress> value) {
        this.tpAddresss = value;
    }
    
    
    
    @XmlElementWrapper(name="TP-CONNECTIONS")
@XmlElement(name="J-1939-TP-CONNECTION")
    public ArrayList<J1939TpConnection> getTpConnections() {
    return this.tpConnections;
}

    public void setTpConnections(ArrayList<J1939TpConnection> value) {
        this.tpConnections = value;
    }
    
    
    
    @XmlElementWrapper(name="TP-NODES")
@XmlElement(name="J-1939-TP-NODE")
    public ArrayList<J1939TpNode> getTpNodes() {
    return this.tpNodes;
}

    public void setTpNodes(ArrayList<J1939TpNode> value) {
        this.tpNodes = value;
    }
    
    
}
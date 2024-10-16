package stdgui.data.model.orimodel;
@XmlRootElement(name = "SOCKET-ADDRESS")
public class SocketAddress {

    
    
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
    
    
    
    protected ApplicationEndpoint applicationEndpoint;
    
    
    
    protected ConnectorRef_SocketAddress connectorRef;
    
    
    
    protected String ipAddress;
    
    
    
    protected ArrayList<MulticastConnectorRef> multicastConnectorRefs;
    
    
    
    protected Integer portAddress;
    
    
    
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
    
    
    
    @XmlElement(name="APPLICATION-ENDPOINT")
    public ApplicationEndpoint getApplicationEndpoint() {
    return this.applicationEndpoint;
}

    public void setApplicationEndpoint(ApplicationEndpoint value) {
        this.applicationEndpoint = value;
    }
    
    
    
    @XmlElement(name="CONNECTOR-REF")
    public ConnectorRef_SocketAddress getConnectorRef() {
    return this.connectorRef;
}

    public void setConnectorRef(ConnectorRef_SocketAddress value) {
        this.connectorRef = value;
    }
    
    
    
    @XmlElement(name="IP-ADDRESS")
    public String getIpAddress() {
    return this.ipAddress;
}

    public void setIpAddress(String value) {
        this.ipAddress = value;
    }
    
    
    
    @XmlElementWrapper(name="MULTICAST-CONNECTOR-REFS")
@XmlElement(name="MULTICAST-CONNECTOR-REF")
    public ArrayList<MulticastConnectorRef> getMulticastConnectorRefs() {
    return this.multicastConnectorRefs;
}

    public void setMulticastConnectorRefs(ArrayList<MulticastConnectorRef> value) {
        this.multicastConnectorRefs = value;
    }
    
    
    
    @XmlElement(name="PORT-ADDRESS")
    public Integer getPortAddress() {
    return this.portAddress;
}

    public void setPortAddress(Integer value) {
        this.portAddress = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}
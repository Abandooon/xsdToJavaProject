package stdgui.data.model.orimodel;
@XmlRootElement(name = "PROVIDED-SERVICE-INSTANCE")
public class ProvidedServiceInstance {

    
    
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
    
    
    
    protected ArrayList<RoutingGroupRef> routingGroupRefs;
    
    
    
    protected ArrayList<EventHandler> eventHandlers;
    
    
    
    protected PositiveInteger instanceIdentifier;
    
    
    
    protected PositiveInteger priority;
    
    
    
    protected SdServerConfig sdServerConfig;
    
    
    
    protected PositiveInteger serviceIdentifier;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ROUTING-GROUP-REFS")
@XmlElement(name="ROUTING-GROUP-REF")
    public ArrayList<RoutingGroupRef> getRoutingGroupRefs() {
    return this.routingGroupRefs;
}

    public void setRoutingGroupRefs(ArrayList<RoutingGroupRef> value) {
        this.routingGroupRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EVENT-HANDLERS")
@XmlElement(name="EVENT-HANDLER")
    public ArrayList<EventHandler> getEventHandlers() {
    return this.eventHandlers;
}

    public void setEventHandlers(ArrayList<EventHandler> value) {
        this.eventHandlers = value;
    }
    
    
    
    @XmlElement(name="INSTANCE-IDENTIFIER")
    public PositiveInteger getInstanceIdentifier() {
    return this.instanceIdentifier;
}

    public void setInstanceIdentifier(PositiveInteger value) {
        this.instanceIdentifier = value;
    }
    
    
    
    @XmlElement(name="PRIORITY")
    public PositiveInteger getPriority() {
    return this.priority;
}

    public void setPriority(PositiveInteger value) {
        this.priority = value;
    }
    
    
    
    @XmlElement(name="SD-SERVER-CONFIG")
    public SdServerConfig getSdServerConfig() {
    return this.sdServerConfig;
}

    public void setSdServerConfig(SdServerConfig value) {
        this.sdServerConfig = value;
    }
    
    
    
    @XmlElement(name="SERVICE-IDENTIFIER")
    public PositiveInteger getServiceIdentifier() {
    return this.serviceIdentifier;
}

    public void setServiceIdentifier(PositiveInteger value) {
        this.serviceIdentifier = value;
    }
    
    
}
package stdgui.data.model.orimodel;
@XmlRootElement(name = "SYSTEM-MAPPING")
public class SystemMapping {

    
    
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
    
    
    
    protected DataMappings dataMappings;
    
    
    
    protected ArrayList<EcuMapping> ecuResourceMappings;
    
    
    
    protected MappingConstraints mappingConstraints;
    
    
    
    protected ArrayList<PncMapping> pncMappings;
    
    
    
    protected ArrayList<EcuResourceEstimation> resourceEstimations;
    
    
    
    protected SignalPathConstraints signalPathConstraints;
    
    
    
    protected ArrayList<SwcToImplMapping> swImplMappings;
    
    
    
    protected ArrayList<SwcToEcuMapping> swMappings;
    
    
    
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
    
    
    
    @XmlElement(name="DATA-MAPPINGS")
    public DataMappings getDataMappings() {
    return this.dataMappings;
}

    public void setDataMappings(DataMappings value) {
        this.dataMappings = value;
    }
    
    
    
    @XmlElementWrapper(name="ECU-RESOURCE-MAPPINGS")
@XmlElement(name="ECU-MAPPING")
    public ArrayList<EcuMapping> getEcuResourceMappings() {
    return this.ecuResourceMappings;
}

    public void setEcuResourceMappings(ArrayList<EcuMapping> value) {
        this.ecuResourceMappings = value;
    }
    
    
    
    @XmlElement(name="MAPPING-CONSTRAINTS")
    public MappingConstraints getMappingConstraints() {
    return this.mappingConstraints;
}

    public void setMappingConstraints(MappingConstraints value) {
        this.mappingConstraints = value;
    }
    
    
    
    @XmlElementWrapper(name="PNC-MAPPINGS")
@XmlElement(name="PNC-MAPPING")
    public ArrayList<PncMapping> getPncMappings() {
    return this.pncMappings;
}

    public void setPncMappings(ArrayList<PncMapping> value) {
        this.pncMappings = value;
    }
    
    
    
    @XmlElementWrapper(name="RESOURCE-ESTIMATIONS")
@XmlElement(name="ECU-RESOURCE-ESTIMATION")
    public ArrayList<EcuResourceEstimation> getResourceEstimations() {
    return this.resourceEstimations;
}

    public void setResourceEstimations(ArrayList<EcuResourceEstimation> value) {
        this.resourceEstimations = value;
    }
    
    
    
    @XmlElement(name="SIGNAL-PATH-CONSTRAINTS")
    public SignalPathConstraints getSignalPathConstraints() {
    return this.signalPathConstraints;
}

    public void setSignalPathConstraints(SignalPathConstraints value) {
        this.signalPathConstraints = value;
    }
    
    
    
    @XmlElementWrapper(name="SW-IMPL-MAPPINGS")
@XmlElement(name="SWC-TO-IMPL-MAPPING")
    public ArrayList<SwcToImplMapping> getSwImplMappings() {
    return this.swImplMappings;
}

    public void setSwImplMappings(ArrayList<SwcToImplMapping> value) {
        this.swImplMappings = value;
    }
    
    
    
    @XmlElementWrapper(name="SW-MAPPINGS")
@XmlElement(name="SWC-TO-ECU-MAPPING")
    public ArrayList<SwcToEcuMapping> getSwMappings() {
    return this.swMappings;
}

    public void setSwMappings(ArrayList<SwcToEcuMapping> value) {
        this.swMappings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}
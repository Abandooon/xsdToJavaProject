package stdgui.data.model.orimodel;
@XmlRootElement(name = "ROUGH-ESTIMATE-OF-EXECUTION-TIME")
public class RoughEstimateOfExecutionTime {

    
    
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
    
    
    
    protected ExclusiveAreaRef exclusiveAreaRef;
    
    
    
    protected ExecutableEntityRef executableEntityRef;
    
    
    
    protected HardwareConfiguration hardwareConfiguration;
    
    
    
    protected HwElementRef hwElementRef;
    
    
    
    protected ArrayList<IncludedLibraryRef> includedLibraryRefs;
    
    
    
    protected ArrayList<MemorySectionLocation> memorySectionLocations;
    
    
    
    protected SoftwareContext softwareContext;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected String additionalInformation;
    
    
    
    protected MultidimensionalTime estimatedExecutionTime;
    
    

    
    
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
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-REF")
    public ExclusiveAreaRef getExclusiveAreaRef() {
    return this.exclusiveAreaRef;
}

    public void setExclusiveAreaRef(ExclusiveAreaRef value) {
        this.exclusiveAreaRef = value;
    }
    
    
    
    @XmlElement(name="EXECUTABLE-ENTITY-REF")
    public ExecutableEntityRef getExecutableEntityRef() {
    return this.executableEntityRef;
}

    public void setExecutableEntityRef(ExecutableEntityRef value) {
        this.executableEntityRef = value;
    }
    
    
    
    @XmlElement(name="HARDWARE-CONFIGURATION")
    public HardwareConfiguration getHardwareConfiguration() {
    return this.hardwareConfiguration;
}

    public void setHardwareConfiguration(HardwareConfiguration value) {
        this.hardwareConfiguration = value;
    }
    
    
    
    @XmlElement(name="HW-ELEMENT-REF")
    public HwElementRef getHwElementRef() {
    return this.hwElementRef;
}

    public void setHwElementRef(HwElementRef value) {
        this.hwElementRef = value;
    }
    
    
    
    @XmlElementWrapper(name="INCLUDED-LIBRARY-REFS")
@XmlElement(name="INCLUDED-LIBRARY-REF")
    public ArrayList<IncludedLibraryRef> getIncludedLibraryRefs() {
    return this.includedLibraryRefs;
}

    public void setIncludedLibraryRefs(ArrayList<IncludedLibraryRef> value) {
        this.includedLibraryRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="MEMORY-SECTION-LOCATIONS")
@XmlElement(name="MEMORY-SECTION-LOCATION")
    public ArrayList<MemorySectionLocation> getMemorySectionLocations() {
    return this.memorySectionLocations;
}

    public void setMemorySectionLocations(ArrayList<MemorySectionLocation> value) {
        this.memorySectionLocations = value;
    }
    
    
    
    @XmlElement(name="SOFTWARE-CONTEXT")
    public SoftwareContext getSoftwareContext() {
    return this.softwareContext;
}

    public void setSoftwareContext(SoftwareContext value) {
        this.softwareContext = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="ADDITIONAL-INFORMATION")
    public String getAdditionalInformation() {
    return this.additionalInformation;
}

    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }
    
    
    
    @XmlElement(name="ESTIMATED-EXECUTION-TIME")
    public MultidimensionalTime getEstimatedExecutionTime() {
    return this.estimatedExecutionTime;
}

    public void setEstimatedExecutionTime(MultidimensionalTime value) {
        this.estimatedExecutionTime = value;
    }
    
    
}
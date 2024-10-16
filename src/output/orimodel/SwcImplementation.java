package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-IMPLEMENTATION")
public class SwcImplementation {

    
    
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
    
    
    
    protected ArrayList<BuildActionManifestRefConditional> buildActionManifests;
    
    
    
    protected ArrayList<Code> codeDescriptors;
    
    
    
    protected ArrayList<Compiler> compilers;
    
    
    
    protected ArrayList<DependencyOnArtifact> generatedArtifacts;
    
    
    
    protected ArrayList<HwElementRef> hwElementRefs;
    
    
    
    protected ArrayList<Linker> linkers;
    
    
    
    protected McSupportData mcSupport;
    
    
    
    protected ProgramminglanguageEnum programmingLanguage;
    
    
    
    protected ArrayList<DependencyOnArtifact> requiredArtifacts;
    
    
    
    protected ArrayList<DependencyOnArtifact> requiredGeneratorTools;
    
    
    
    protected ResourceConsumption resourceConsumption;
    
    
    
    protected RevisionLabelString swVersion;
    
    
    
    protected SwcBswMappingRef swcBswMappingRef;
    
    
    
    protected String usedCodeGenerator;
    
    
    
    protected PositiveInteger vendorId;
    
    
    
    protected BehaviorRef_SwcImplementation behaviorRef;
    
    
    
    protected ArrayList<PerInstanceMemorySize> perInstanceMemorySizes;
    
    
    
    protected String requiredRteVendor;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="BUILD-ACTION-MANIFESTS")
@XmlElement(name="BUILD-ACTION-MANIFEST-REF-CONDITIONAL")
    public ArrayList<BuildActionManifestRefConditional> getBuildActionManifests() {
    return this.buildActionManifests;
}

    public void setBuildActionManifests(ArrayList<BuildActionManifestRefConditional> value) {
        this.buildActionManifests = value;
    }
    
    
    
    @XmlElementWrapper(name="CODE-DESCRIPTORS")
@XmlElement(name="CODE")
    public ArrayList<Code> getCodeDescriptors() {
    return this.codeDescriptors;
}

    public void setCodeDescriptors(ArrayList<Code> value) {
        this.codeDescriptors = value;
    }
    
    
    
    @XmlElementWrapper(name="COMPILERS")
@XmlElement(name="COMPILER")
    public ArrayList<Compiler> getCompilers() {
    return this.compilers;
}

    public void setCompilers(ArrayList<Compiler> value) {
        this.compilers = value;
    }
    
    
    
    @XmlElementWrapper(name="GENERATED-ARTIFACTS")
@XmlElement(name="DEPENDENCY-ON-ARTIFACT")
    public ArrayList<DependencyOnArtifact> getGeneratedArtifacts() {
    return this.generatedArtifacts;
}

    public void setGeneratedArtifacts(ArrayList<DependencyOnArtifact> value) {
        this.generatedArtifacts = value;
    }
    
    
    
    @XmlElementWrapper(name="HW-ELEMENT-REFS")
@XmlElement(name="HW-ELEMENT-REF")
    public ArrayList<HwElementRef> getHwElementRefs() {
    return this.hwElementRefs;
}

    public void setHwElementRefs(ArrayList<HwElementRef> value) {
        this.hwElementRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="LINKERS")
@XmlElement(name="LINKER")
    public ArrayList<Linker> getLinkers() {
    return this.linkers;
}

    public void setLinkers(ArrayList<Linker> value) {
        this.linkers = value;
    }
    
    
    
    @XmlElement(name="MC-SUPPORT")
    public McSupportData getMcSupport() {
    return this.mcSupport;
}

    public void setMcSupport(McSupportData value) {
        this.mcSupport = value;
    }
    
    
    
    @XmlElement(name="PROGRAMMING-LANGUAGE")
    public ProgramminglanguageEnum getProgrammingLanguage() {
    return this.programmingLanguage;
}

    public void setProgrammingLanguage(ProgramminglanguageEnum value) {
        this.programmingLanguage = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-ARTIFACTS")
@XmlElement(name="DEPENDENCY-ON-ARTIFACT")
    public ArrayList<DependencyOnArtifact> getRequiredArtifacts() {
    return this.requiredArtifacts;
}

    public void setRequiredArtifacts(ArrayList<DependencyOnArtifact> value) {
        this.requiredArtifacts = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-GENERATOR-TOOLS")
@XmlElement(name="DEPENDENCY-ON-ARTIFACT")
    public ArrayList<DependencyOnArtifact> getRequiredGeneratorTools() {
    return this.requiredGeneratorTools;
}

    public void setRequiredGeneratorTools(ArrayList<DependencyOnArtifact> value) {
        this.requiredGeneratorTools = value;
    }
    
    
    
    @XmlElement(name="RESOURCE-CONSUMPTION")
    public ResourceConsumption getResourceConsumption() {
    return this.resourceConsumption;
}

    public void setResourceConsumption(ResourceConsumption value) {
        this.resourceConsumption = value;
    }
    
    
    
    @XmlElement(name="SW-VERSION")
    public RevisionLabelString getSwVersion() {
    return this.swVersion;
}

    public void setSwVersion(RevisionLabelString value) {
        this.swVersion = value;
    }
    
    
    
    @XmlElement(name="SWC-BSW-MAPPING-REF")
    public SwcBswMappingRef getSwcBswMappingRef() {
    return this.swcBswMappingRef;
}

    public void setSwcBswMappingRef(SwcBswMappingRef value) {
        this.swcBswMappingRef = value;
    }
    
    
    
    @XmlElement(name="USED-CODE-GENERATOR")
    public String getUsedCodeGenerator() {
    return this.usedCodeGenerator;
}

    public void setUsedCodeGenerator(String value) {
        this.usedCodeGenerator = value;
    }
    
    
    
    @XmlElement(name="VENDOR-ID")
    public PositiveInteger getVendorId() {
    return this.vendorId;
}

    public void setVendorId(PositiveInteger value) {
        this.vendorId = value;
    }
    
    
    
    @XmlElement(name="BEHAVIOR-REF")
    public BehaviorRef_SwcImplementation getBehaviorRef() {
    return this.behaviorRef;
}

    public void setBehaviorRef(BehaviorRef_SwcImplementation value) {
        this.behaviorRef = value;
    }
    
    
    
    @XmlElementWrapper(name="PER-INSTANCE-MEMORY-SIZES")
@XmlElement(name="PER-INSTANCE-MEMORY-SIZE")
    public ArrayList<PerInstanceMemorySize> getPerInstanceMemorySizes() {
    return this.perInstanceMemorySizes;
}

    public void setPerInstanceMemorySizes(ArrayList<PerInstanceMemorySize> value) {
        this.perInstanceMemorySizes = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-RTE-VENDOR")
    public String getRequiredRteVendor() {
    return this.requiredRteVendor;
}

    public void setRequiredRteVendor(String value) {
        this.requiredRteVendor = value;
    }
    
    
}
package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwcImplementation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected BuildActionManifests buildActionManifests;
    
    
    
    protected CodeDescriptors codeDescriptors;
    
    
    
    protected Compilers compilers;
    
    
    
    protected GeneratedArtifacts generatedArtifacts;
    
    
    
    protected HwElementRefs hwElementRefs;
    
    
    
    protected Linkers linkers;
    
    
    
    protected McSupportData mcSupport;
    
    
    
    protected ProgramminglanguageEnum programmingLanguage;
    
    
    
    protected RequiredArtifacts requiredArtifacts;
    
    
    
    protected RequiredGeneratorTools requiredGeneratorTools;
    
    
    
    protected ResourceConsumption resourceConsumption;
    
    
    
    protected RevisionLabelString swVersion;
    
    
    
    protected SwcBswMappingRef swcBswMappingRef;
    
    
    
    protected String usedCodeGenerator;
    
    
    
    protected PositiveInteger vendorId;
    
    
    
    protected BehaviorRef behaviorRef;
    
    
    
    protected PerInstanceMemorySizes perInstanceMemorySizes;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
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
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="BUILD-ACTION-MANIFESTS")
    public BuildActionManifests getBuildActionManifests() {
        return this.buildActionManifests;
    }

    public void setBuildActionManifests(BuildActionManifests value) {
        this.buildActionManifests = value;
    }
    
    
    
    @XmlElement(name="CODE-DESCRIPTORS")
    public CodeDescriptors getCodeDescriptors() {
        return this.codeDescriptors;
    }

    public void setCodeDescriptors(CodeDescriptors value) {
        this.codeDescriptors = value;
    }
    
    
    
    @XmlElement(name="COMPILERS")
    public Compilers getCompilers() {
        return this.compilers;
    }

    public void setCompilers(Compilers value) {
        this.compilers = value;
    }
    
    
    
    @XmlElement(name="GENERATED-ARTIFACTS")
    public GeneratedArtifacts getGeneratedArtifacts() {
        return this.generatedArtifacts;
    }

    public void setGeneratedArtifacts(GeneratedArtifacts value) {
        this.generatedArtifacts = value;
    }
    
    
    
    @XmlElement(name="HW-ELEMENT-REFS")
    public HwElementRefs getHwElementRefs() {
        return this.hwElementRefs;
    }

    public void setHwElementRefs(HwElementRefs value) {
        this.hwElementRefs = value;
    }
    
    
    
    @XmlElement(name="LINKERS")
    public Linkers getLinkers() {
        return this.linkers;
    }

    public void setLinkers(Linkers value) {
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
    
    
    
    @XmlElement(name="REQUIRED-ARTIFACTS")
    public RequiredArtifacts getRequiredArtifacts() {
        return this.requiredArtifacts;
    }

    public void setRequiredArtifacts(RequiredArtifacts value) {
        this.requiredArtifacts = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-GENERATOR-TOOLS")
    public RequiredGeneratorTools getRequiredGeneratorTools() {
        return this.requiredGeneratorTools;
    }

    public void setRequiredGeneratorTools(RequiredGeneratorTools value) {
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
    public BehaviorRef getBehaviorRef() {
        return this.behaviorRef;
    }

    public void setBehaviorRef(BehaviorRef value) {
        this.behaviorRef = value;
    }
    
    
    
    @XmlElement(name="PER-INSTANCE-MEMORY-SIZES")
    public PerInstanceMemorySizes getPerInstanceMemorySizes() {
        return this.perInstanceMemorySizes;
    }

    public void setPerInstanceMemorySizes(PerInstanceMemorySizes value) {
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
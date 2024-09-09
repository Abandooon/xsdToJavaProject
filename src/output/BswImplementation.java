package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswImplementation {

    
    
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
    
    
    
    protected RevisionLabelString arReleaseVersion;
    
    
    
    protected BehaviorRef behaviorRef;
    
    
    
    protected DebugInfos debugInfos;
    
    
    
    protected PreconfiguredConfigurationRefs preconfiguredConfigurationRefs;
    
    
    
    protected RecommendedConfigurationRefs recommendedConfigurationRefs;
    
    
    
    protected Identifier vendorApiInfix;
    
    
    
    protected VendorSpecificModuleDefRefs vendorSpecificModuleDefRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="AR-RELEASE-VERSION")
    public RevisionLabelString getArReleaseVersion() {
        return this.arReleaseVersion;
    }

    public void setArReleaseVersion(RevisionLabelString value) {
        this.arReleaseVersion = value;
    }
    
    
    
    @XmlElement(name="BEHAVIOR-REF")
    public BehaviorRef getBehaviorRef() {
        return this.behaviorRef;
    }

    public void setBehaviorRef(BehaviorRef value) {
        this.behaviorRef = value;
    }
    
    
    
    @XmlElement(name="DEBUG-INFOS")
    public DebugInfos getDebugInfos() {
        return this.debugInfos;
    }

    public void setDebugInfos(DebugInfos value) {
        this.debugInfos = value;
    }
    
    
    
    @XmlElement(name="PRECONFIGURED-CONFIGURATION-REFS")
    public PreconfiguredConfigurationRefs getPreconfiguredConfigurationRefs() {
        return this.preconfiguredConfigurationRefs;
    }

    public void setPreconfiguredConfigurationRefs(PreconfiguredConfigurationRefs value) {
        this.preconfiguredConfigurationRefs = value;
    }
    
    
    
    @XmlElement(name="RECOMMENDED-CONFIGURATION-REFS")
    public RecommendedConfigurationRefs getRecommendedConfigurationRefs() {
        return this.recommendedConfigurationRefs;
    }

    public void setRecommendedConfigurationRefs(RecommendedConfigurationRefs value) {
        this.recommendedConfigurationRefs = value;
    }
    
    
    
    @XmlElement(name="VENDOR-API-INFIX")
    public Identifier getVendorApiInfix() {
        return this.vendorApiInfix;
    }

    public void setVendorApiInfix(Identifier value) {
        this.vendorApiInfix = value;
    }
    
    
    
    @XmlElement(name="VENDOR-SPECIFIC-MODULE-DEF-REFS")
    public VendorSpecificModuleDefRefs getVendorSpecificModuleDefRefs() {
        return this.vendorSpecificModuleDefRefs;
    }

    public void setVendorSpecificModuleDefRefs(VendorSpecificModuleDefRefs value) {
        this.vendorSpecificModuleDefRefs = value;
    }
    
    


    
    public static class ShortNameFragments {
        
        protected ArrayList<ShortNameFragment> shortNameFragment;
        

        
        @XmlElement(name="SHORT-NAME-FRAGMENT")
        public ArrayList<ShortNameFragment> getShortNameFragment() {
            return this.shortNameFragment;
        }

        public void setShortNameFragment(ArrayList<ShortNameFragment> value) {
            this.shortNameFragment = value;
        }
        

        
    }
    
    public static class Annotations {
        
        protected ArrayList<Annotation> annotation;
        

        
        @XmlElement(name="ANNOTATION")
        public ArrayList<Annotation> getAnnotation() {
            return this.annotation;
        }

        public void setAnnotation(ArrayList<Annotation> value) {
            this.annotation = value;
        }
        

        
    }
    
    public static class BuildActionManifests {
        
        protected ArrayList<BuildActionManifestRefConditional> buildActionManifestRefConditional;
        

        
        @XmlElement(name="BUILD-ACTION-MANIFEST-REF-CONDITIONAL")
        public ArrayList<BuildActionManifestRefConditional> getBuildActionManifestRefConditional() {
            return this.buildActionManifestRefConditional;
        }

        public void setBuildActionManifestRefConditional(ArrayList<BuildActionManifestRefConditional> value) {
            this.buildActionManifestRefConditional = value;
        }
        

        
    }
    
    public static class CodeDescriptors {
        
        protected ArrayList<Code> code;
        

        
        @XmlElement(name="CODE")
        public ArrayList<Code> getCode() {
            return this.code;
        }

        public void setCode(ArrayList<Code> value) {
            this.code = value;
        }
        

        
    }
    
    public static class Compilers {
        
        protected ArrayList<Compiler> compiler;
        

        
        @XmlElement(name="COMPILER")
        public ArrayList<Compiler> getCompiler() {
            return this.compiler;
        }

        public void setCompiler(ArrayList<Compiler> value) {
            this.compiler = value;
        }
        

        
    }
    
    public static class GeneratedArtifacts {
        
        protected ArrayList<DependencyOnArtifact> dependencyOnArtifact;
        

        
        @XmlElement(name="DEPENDENCY-ON-ARTIFACT")
        public ArrayList<DependencyOnArtifact> getDependencyOnArtifact() {
            return this.dependencyOnArtifact;
        }

        public void setDependencyOnArtifact(ArrayList<DependencyOnArtifact> value) {
            this.dependencyOnArtifact = value;
        }
        

        
    }
    
    public static class HwElementRefs {
        
        protected ArrayList<HwElementRef> hwElementRef;
        

        
        @XmlElement(name="HW-ELEMENT-REF")
        public ArrayList<HwElementRef> getHwElementRef() {
            return this.hwElementRef;
        }

        public void setHwElementRef(ArrayList<HwElementRef> value) {
            this.hwElementRef = value;
        }
        

        
        
        public static class HwElementRef extends Ref {
            
            protected HwElementSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public HwElementSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(HwElementSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
    public static class Linkers {
        
        protected ArrayList<Linker> linker;
        

        
        @XmlElement(name="LINKER")
        public ArrayList<Linker> getLinker() {
            return this.linker;
        }

        public void setLinker(ArrayList<Linker> value) {
            this.linker = value;
        }
        

        
    }
    
    public static class RequiredArtifacts {
        
        protected ArrayList<DependencyOnArtifact> dependencyOnArtifact;
        

        
        @XmlElement(name="DEPENDENCY-ON-ARTIFACT")
        public ArrayList<DependencyOnArtifact> getDependencyOnArtifact() {
            return this.dependencyOnArtifact;
        }

        public void setDependencyOnArtifact(ArrayList<DependencyOnArtifact> value) {
            this.dependencyOnArtifact = value;
        }
        

        
    }
    
    public static class RequiredGeneratorTools {
        
        protected ArrayList<DependencyOnArtifact> dependencyOnArtifact;
        

        
        @XmlElement(name="DEPENDENCY-ON-ARTIFACT")
        public ArrayList<DependencyOnArtifact> getDependencyOnArtifact() {
            return this.dependencyOnArtifact;
        }

        public void setDependencyOnArtifact(ArrayList<DependencyOnArtifact> value) {
            this.dependencyOnArtifact = value;
        }
        

        
    }
    
    public static class SwcBswMappingRef extends Ref {
        
        protected SwcBswMappingSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwcBswMappingSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwcBswMappingSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class BehaviorRef extends Ref {
        
        protected BswInternalBehaviorSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public BswInternalBehaviorSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(BswInternalBehaviorSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class DebugInfos {
        
        protected ArrayList<BswDebugInfo> bswDebugInfo;
        

        
        @XmlElement(name="BSW-DEBUG-INFO")
        public ArrayList<BswDebugInfo> getBswDebugInfo() {
            return this.bswDebugInfo;
        }

        public void setBswDebugInfo(ArrayList<BswDebugInfo> value) {
            this.bswDebugInfo = value;
        }
        

        
    }
    
    public static class PreconfiguredConfigurationRefs {
        
        protected ArrayList<PreconfiguredConfigurationRef> preconfiguredConfigurationRef;
        

        
        @XmlElement(name="PRECONFIGURED-CONFIGURATION-REF")
        public ArrayList<PreconfiguredConfigurationRef> getPreconfiguredConfigurationRef() {
            return this.preconfiguredConfigurationRef;
        }

        public void setPreconfiguredConfigurationRef(ArrayList<PreconfiguredConfigurationRef> value) {
            this.preconfiguredConfigurationRef = value;
        }
        

        
        
        public static class PreconfiguredConfigurationRef extends Ref {
            
            protected EcucModuleConfigurationValuesSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public EcucModuleConfigurationValuesSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(EcucModuleConfigurationValuesSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
    public static class RecommendedConfigurationRefs {
        
        protected ArrayList<RecommendedConfigurationRef> recommendedConfigurationRef;
        

        
        @XmlElement(name="RECOMMENDED-CONFIGURATION-REF")
        public ArrayList<RecommendedConfigurationRef> getRecommendedConfigurationRef() {
            return this.recommendedConfigurationRef;
        }

        public void setRecommendedConfigurationRef(ArrayList<RecommendedConfigurationRef> value) {
            this.recommendedConfigurationRef = value;
        }
        

        
        
        public static class RecommendedConfigurationRef extends Ref {
            
            protected EcucModuleConfigurationValuesSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public EcucModuleConfigurationValuesSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(EcucModuleConfigurationValuesSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
    public static class VendorSpecificModuleDefRefs {
        
        protected ArrayList<VendorSpecificModuleDefRef> vendorSpecificModuleDefRef;
        

        
        @XmlElement(name="VENDOR-SPECIFIC-MODULE-DEF-REF")
        public ArrayList<VendorSpecificModuleDefRef> getVendorSpecificModuleDefRef() {
            return this.vendorSpecificModuleDefRef;
        }

        public void setVendorSpecificModuleDefRef(ArrayList<VendorSpecificModuleDefRef> value) {
            this.vendorSpecificModuleDefRef = value;
        }
        

        
        
        public static class VendorSpecificModuleDefRef extends Ref {
            
            protected EcucModuleDefSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public EcucModuleDefSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(EcucModuleDefSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
}
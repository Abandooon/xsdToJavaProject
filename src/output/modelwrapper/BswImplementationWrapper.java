package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Linker;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswImplementationWrapper {

    
    private BswImplementation bswImplementation;

    public BswImplementationWrapper(BswImplementation bswImplementation) {
        this.bswImplementation = bswImplementation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getS())) {
            
            return bswImplementation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getT())) {
            
            return bswImplementation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getUuid())) {
            
            return bswImplementation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getShortName())) {
            
            return new IdentifierWrapper(bswImplementation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswImplementation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswImplementation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswImplementation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getCategory())) {
            
            return new CategoryStringWrapper(bswImplementation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getAdminData())) {
            
            return new AdminDataWrapper(bswImplementation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswImplementation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getAnnotations())) {
            ArrayList<Annotation> originalList = bswImplementation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getVariationPoint())) {
            
            return new VariationPointWrapper(bswImplementation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionManifestRefConditionalWrapper> getBuildActionManifests() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getBuildActionManifests())) {
            ArrayList<BuildActionManifestRefConditional> originalList = bswImplementation.getBuildActionManifests();
            ArrayList<BuildActionManifestRefConditionalWrapper> wrapperList = (ArrayList<BuildActionManifestRefConditionalWrapper>)originalList.stream()
                .map(item -> new BuildActionManifestRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CodeWrapper> getCodeDescriptors() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getCodeDescriptors())) {
            ArrayList<Code> originalList = bswImplementation.getCodeDescriptors();
            ArrayList<CodeWrapper> wrapperList = (ArrayList<CodeWrapper>)originalList.stream()
                .map(item -> new CodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CompilerWrapper> getCompilers() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getCompilers())) {
            ArrayList<Compiler> originalList = bswImplementation.getCompilers();
            ArrayList<CompilerWrapper> wrapperList = (ArrayList<CompilerWrapper>)originalList.stream()
                .map(item -> new CompilerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getGeneratedArtifacts() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getGeneratedArtifacts())) {
            ArrayList<DependencyOnArtifact> originalList = bswImplementation.getGeneratedArtifacts();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementRefWrapper> getHwElementRefs() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getHwElementRefs())) {
            ArrayList<HwElementRef> originalList = bswImplementation.getHwElementRefs();
            ArrayList<HwElementRefWrapper> wrapperList = (ArrayList<HwElementRefWrapper>)originalList.stream()
                .map(item -> new HwElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinkerWrapper> getLinkers() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getLinkers())) {
            ArrayList<Linker> originalList = bswImplementation.getLinkers();
            ArrayList<LinkerWrapper> wrapperList = (ArrayList<LinkerWrapper>)originalList.stream()
                .map(item -> new LinkerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public McSupportDataWrapper getMcSupport() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getMcSupport())) {
            
            return new McSupportDataWrapper(bswImplementation.getMcSupport());
            
        } else {
            return null;
        }
        
    }

    public ProgramminglanguageEnumWrapper getProgrammingLanguage() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getProgrammingLanguage())) {
            
            return new ProgramminglanguageEnumWrapper(bswImplementation.getProgrammingLanguage());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getRequiredArtifacts() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getRequiredArtifacts())) {
            ArrayList<DependencyOnArtifact> originalList = bswImplementation.getRequiredArtifacts();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getRequiredGeneratorTools() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getRequiredGeneratorTools())) {
            ArrayList<DependencyOnArtifact> originalList = bswImplementation.getRequiredGeneratorTools();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ResourceConsumptionWrapper getResourceConsumption() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getResourceConsumption())) {
            
            return new ResourceConsumptionWrapper(bswImplementation.getResourceConsumption());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getSwVersion() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getSwVersion())) {
            
            return new RevisionLabelStringWrapper(bswImplementation.getSwVersion());
            
        } else {
            return null;
        }
        
    }

    public SwcBswMappingRefWrapper getSwcBswMappingRef() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getSwcBswMappingRef())) {
            
            return new SwcBswMappingRefWrapper(bswImplementation.getSwcBswMappingRef());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getUsedCodeGenerator() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getUsedCodeGenerator())) {
            
            return new StringWrapper(bswImplementation.getUsedCodeGenerator());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVendorId() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getVendorId())) {
            
            return new PositiveIntegerWrapper(bswImplementation.getVendorId());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getArReleaseVersion() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getArReleaseVersion())) {
            
            return new RevisionLabelStringWrapper(bswImplementation.getArReleaseVersion());
            
        } else {
            return null;
        }
        
    }

    public BehaviorRefWrapper getBehaviorRef() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getBehaviorRef())) {
            
            return new BehaviorRefWrapper(bswImplementation.getBehaviorRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswDebugInfoWrapper> getDebugInfos() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getDebugInfos())) {
            ArrayList<BswDebugInfo> originalList = bswImplementation.getDebugInfos();
            ArrayList<BswDebugInfoWrapper> wrapperList = (ArrayList<BswDebugInfoWrapper>)originalList.stream()
                .map(item -> new BswDebugInfoWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PreconfiguredConfigurationRefWrapper> getPreconfiguredConfigurationRefs() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getPreconfiguredConfigurationRefs())) {
            ArrayList<PreconfiguredConfigurationRef> originalList = bswImplementation.getPreconfiguredConfigurationRefs();
            ArrayList<PreconfiguredConfigurationRefWrapper> wrapperList = (ArrayList<PreconfiguredConfigurationRefWrapper>)originalList.stream()
                .map(item -> new PreconfiguredConfigurationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RecommendedConfigurationRefWrapper> getRecommendedConfigurationRefs() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getRecommendedConfigurationRefs())) {
            ArrayList<RecommendedConfigurationRef> originalList = bswImplementation.getRecommendedConfigurationRefs();
            ArrayList<RecommendedConfigurationRefWrapper> wrapperList = (ArrayList<RecommendedConfigurationRefWrapper>)originalList.stream()
                .map(item -> new RecommendedConfigurationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getVendorApiInfix() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getVendorApiInfix())) {
            
            return new IdentifierWrapper(bswImplementation.getVendorApiInfix());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VendorSpecificModuleDefRefWrapper> getVendorSpecificModuleDefRefs() {
        
        if (CollUtil.isNotEmpty(bswImplementation.getVendorSpecificModuleDefRefs())) {
            ArrayList<VendorSpecificModuleDefRef> originalList = bswImplementation.getVendorSpecificModuleDefRefs();
            ArrayList<VendorSpecificModuleDefRefWrapper> wrapperList = (ArrayList<VendorSpecificModuleDefRefWrapper>)originalList.stream()
                .map(item -> new VendorSpecificModuleDefRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Linker;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class SwcImplementationWrapper {

    
    private SwcImplementation swcImplementation;

    public SwcImplementationWrapper(SwcImplementation swcImplementation) {
        this.swcImplementation = swcImplementation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getS())) {
            
            return swcImplementation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getT())) {
            
            return swcImplementation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getUuid())) {
            
            return swcImplementation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getShortName())) {
            
            return new IdentifierWrapper(swcImplementation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcImplementation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcImplementation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcImplementation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getCategory())) {
            
            return new CategoryStringWrapper(swcImplementation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getAdminData())) {
            
            return new AdminDataWrapper(swcImplementation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcImplementation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getAnnotations())) {
            ArrayList<Annotation> originalList = swcImplementation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getVariationPoint())) {
            
            return new VariationPointWrapper(swcImplementation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionManifestRefConditionalWrapper> getBuildActionManifests() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getBuildActionManifests())) {
            ArrayList<BuildActionManifestRefConditional> originalList = swcImplementation.getBuildActionManifests();
            ArrayList<BuildActionManifestRefConditionalWrapper> wrapperList = (ArrayList<BuildActionManifestRefConditionalWrapper>)originalList.stream()
                .map(item -> new BuildActionManifestRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CodeWrapper> getCodeDescriptors() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getCodeDescriptors())) {
            ArrayList<Code> originalList = swcImplementation.getCodeDescriptors();
            ArrayList<CodeWrapper> wrapperList = (ArrayList<CodeWrapper>)originalList.stream()
                .map(item -> new CodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CompilerWrapper> getCompilers() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getCompilers())) {
            ArrayList<Compiler> originalList = swcImplementation.getCompilers();
            ArrayList<CompilerWrapper> wrapperList = (ArrayList<CompilerWrapper>)originalList.stream()
                .map(item -> new CompilerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getGeneratedArtifacts() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getGeneratedArtifacts())) {
            ArrayList<DependencyOnArtifact> originalList = swcImplementation.getGeneratedArtifacts();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementRefWrapper> getHwElementRefs() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getHwElementRefs())) {
            ArrayList<HwElementRef> originalList = swcImplementation.getHwElementRefs();
            ArrayList<HwElementRefWrapper> wrapperList = (ArrayList<HwElementRefWrapper>)originalList.stream()
                .map(item -> new HwElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinkerWrapper> getLinkers() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getLinkers())) {
            ArrayList<Linker> originalList = swcImplementation.getLinkers();
            ArrayList<LinkerWrapper> wrapperList = (ArrayList<LinkerWrapper>)originalList.stream()
                .map(item -> new LinkerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public McSupportDataWrapper getMcSupport() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getMcSupport())) {
            
            return new McSupportDataWrapper(swcImplementation.getMcSupport());
            
        } else {
            return null;
        }
        
    }

    public ProgramminglanguageEnumWrapper getProgrammingLanguage() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getProgrammingLanguage())) {
            
            return new ProgramminglanguageEnumWrapper(swcImplementation.getProgrammingLanguage());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getRequiredArtifacts() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getRequiredArtifacts())) {
            ArrayList<DependencyOnArtifact> originalList = swcImplementation.getRequiredArtifacts();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DependencyOnArtifactWrapper> getRequiredGeneratorTools() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getRequiredGeneratorTools())) {
            ArrayList<DependencyOnArtifact> originalList = swcImplementation.getRequiredGeneratorTools();
            ArrayList<DependencyOnArtifactWrapper> wrapperList = (ArrayList<DependencyOnArtifactWrapper>)originalList.stream()
                .map(item -> new DependencyOnArtifactWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ResourceConsumptionWrapper getResourceConsumption() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getResourceConsumption())) {
            
            return new ResourceConsumptionWrapper(swcImplementation.getResourceConsumption());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getSwVersion() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getSwVersion())) {
            
            return new RevisionLabelStringWrapper(swcImplementation.getSwVersion());
            
        } else {
            return null;
        }
        
    }

    public SwcBswMappingRefWrapper getSwcBswMappingRef() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getSwcBswMappingRef())) {
            
            return new SwcBswMappingRefWrapper(swcImplementation.getSwcBswMappingRef());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getUsedCodeGenerator() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getUsedCodeGenerator())) {
            
            return new StringWrapper(swcImplementation.getUsedCodeGenerator());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVendorId() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getVendorId())) {
            
            return new PositiveIntegerWrapper(swcImplementation.getVendorId());
            
        } else {
            return null;
        }
        
    }

    public BehaviorRef_SwcImplementationWrapper getBehaviorRef() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getBehaviorRef())) {
            
            return new BehaviorRef_SwcImplementationWrapper(swcImplementation.getBehaviorRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PerInstanceMemorySizeWrapper> getPerInstanceMemorySizes() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getPerInstanceMemorySizes())) {
            ArrayList<PerInstanceMemorySize> originalList = swcImplementation.getPerInstanceMemorySizes();
            ArrayList<PerInstanceMemorySizeWrapper> wrapperList = (ArrayList<PerInstanceMemorySizeWrapper>)originalList.stream()
                .map(item -> new PerInstanceMemorySizeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getRequiredRteVendor() {
        
        if (CollUtil.isNotEmpty(swcImplementation.getRequiredRteVendor())) {
            
            return new StringWrapper(swcImplementation.getRequiredRteVendor());
            
        } else {
            return null;
        }
        
    }




    


    
}
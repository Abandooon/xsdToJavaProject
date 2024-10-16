package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class RoughEstimateOfExecutionTimeWrapper {

    
    private RoughEstimateOfExecutionTime roughEstimateOfExecutionTime;

    public RoughEstimateOfExecutionTimeWrapper(RoughEstimateOfExecutionTime roughEstimateOfExecutionTime) {
        this.roughEstimateOfExecutionTime = roughEstimateOfExecutionTime;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getS())) {
            
            return roughEstimateOfExecutionTime.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getT())) {
            
            return roughEstimateOfExecutionTime.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getUuid())) {
            
            return roughEstimateOfExecutionTime.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getShortName())) {
            
            return new IdentifierWrapper(roughEstimateOfExecutionTime.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = roughEstimateOfExecutionTime.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getLongName())) {
            
            return new MultilanguageLongNameWrapper(roughEstimateOfExecutionTime.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(roughEstimateOfExecutionTime.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getCategory())) {
            
            return new CategoryStringWrapper(roughEstimateOfExecutionTime.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getAdminData())) {
            
            return new AdminDataWrapper(roughEstimateOfExecutionTime.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getIntroduction())) {
            
            return new DocumentationBlockWrapper(roughEstimateOfExecutionTime.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getAnnotations())) {
            ArrayList<Annotation> originalList = roughEstimateOfExecutionTime.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExclusiveAreaRefWrapper getExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getExclusiveAreaRef())) {
            
            return new ExclusiveAreaRefWrapper(roughEstimateOfExecutionTime.getExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(roughEstimateOfExecutionTime.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(roughEstimateOfExecutionTime.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getHwElementRef())) {
            
            return new HwElementRefWrapper(roughEstimateOfExecutionTime.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedLibraryRefWrapper> getIncludedLibraryRefs() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getIncludedLibraryRefs())) {
            ArrayList<IncludedLibraryRef> originalList = roughEstimateOfExecutionTime.getIncludedLibraryRefs();
            ArrayList<IncludedLibraryRefWrapper> wrapperList = (ArrayList<IncludedLibraryRefWrapper>)originalList.stream()
                .map(item -> new IncludedLibraryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MemorySectionLocationWrapper> getMemorySectionLocations() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getMemorySectionLocations())) {
            ArrayList<MemorySectionLocation> originalList = roughEstimateOfExecutionTime.getMemorySectionLocations();
            ArrayList<MemorySectionLocationWrapper> wrapperList = (ArrayList<MemorySectionLocationWrapper>)originalList.stream()
                .map(item -> new MemorySectionLocationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(roughEstimateOfExecutionTime.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getVariationPoint())) {
            
            return new VariationPointWrapper(roughEstimateOfExecutionTime.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAdditionalInformation() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getAdditionalInformation())) {
            
            return new StringWrapper(roughEstimateOfExecutionTime.getAdditionalInformation());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getEstimatedExecutionTime() {
        
        if (CollUtil.isNotEmpty(roughEstimateOfExecutionTime.getEstimatedExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(roughEstimateOfExecutionTime.getEstimatedExecutionTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
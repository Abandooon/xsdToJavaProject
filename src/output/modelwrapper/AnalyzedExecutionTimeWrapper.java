package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class AnalyzedExecutionTimeWrapper {

    
    private AnalyzedExecutionTime analyzedExecutionTime;

    public AnalyzedExecutionTimeWrapper(AnalyzedExecutionTime analyzedExecutionTime) {
        this.analyzedExecutionTime = analyzedExecutionTime;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getS())) {
            
            return analyzedExecutionTime.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getT())) {
            
            return analyzedExecutionTime.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getUuid())) {
            
            return analyzedExecutionTime.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getShortName())) {
            
            return new IdentifierWrapper(analyzedExecutionTime.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = analyzedExecutionTime.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getLongName())) {
            
            return new MultilanguageLongNameWrapper(analyzedExecutionTime.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(analyzedExecutionTime.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getCategory())) {
            
            return new CategoryStringWrapper(analyzedExecutionTime.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getAdminData())) {
            
            return new AdminDataWrapper(analyzedExecutionTime.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getIntroduction())) {
            
            return new DocumentationBlockWrapper(analyzedExecutionTime.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getAnnotations())) {
            ArrayList<Annotation> originalList = analyzedExecutionTime.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExclusiveAreaRefWrapper getExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getExclusiveAreaRef())) {
            
            return new ExclusiveAreaRefWrapper(analyzedExecutionTime.getExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(analyzedExecutionTime.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(analyzedExecutionTime.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getHwElementRef())) {
            
            return new HwElementRefWrapper(analyzedExecutionTime.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedLibraryRefWrapper> getIncludedLibraryRefs() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getIncludedLibraryRefs())) {
            ArrayList<IncludedLibraryRef> originalList = analyzedExecutionTime.getIncludedLibraryRefs();
            ArrayList<IncludedLibraryRefWrapper> wrapperList = (ArrayList<IncludedLibraryRefWrapper>)originalList.stream()
                .map(item -> new IncludedLibraryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MemorySectionLocationWrapper> getMemorySectionLocations() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getMemorySectionLocations())) {
            ArrayList<MemorySectionLocation> originalList = analyzedExecutionTime.getMemorySectionLocations();
            ArrayList<MemorySectionLocationWrapper> wrapperList = (ArrayList<MemorySectionLocationWrapper>)originalList.stream()
                .map(item -> new MemorySectionLocationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(analyzedExecutionTime.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getVariationPoint())) {
            
            return new VariationPointWrapper(analyzedExecutionTime.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getBestCaseExecutionTime() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getBestCaseExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(analyzedExecutionTime.getBestCaseExecutionTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getWorstCaseExecutionTime() {
        
        if (CollUtil.isNotEmpty(analyzedExecutionTime.getWorstCaseExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(analyzedExecutionTime.getWorstCaseExecutionTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
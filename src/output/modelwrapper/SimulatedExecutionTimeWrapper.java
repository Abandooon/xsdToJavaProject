package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SimulatedExecutionTimeWrapper {

    
    private SimulatedExecutionTime simulatedExecutionTime;

    public SimulatedExecutionTimeWrapper(SimulatedExecutionTime simulatedExecutionTime) {
        this.simulatedExecutionTime = simulatedExecutionTime;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getS())) {
            
            return simulatedExecutionTime.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getT())) {
            
            return simulatedExecutionTime.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getUuid())) {
            
            return simulatedExecutionTime.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getShortName())) {
            
            return new IdentifierWrapper(simulatedExecutionTime.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = simulatedExecutionTime.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getLongName())) {
            
            return new MultilanguageLongNameWrapper(simulatedExecutionTime.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(simulatedExecutionTime.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getCategory())) {
            
            return new CategoryStringWrapper(simulatedExecutionTime.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getAdminData())) {
            
            return new AdminDataWrapper(simulatedExecutionTime.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getIntroduction())) {
            
            return new DocumentationBlockWrapper(simulatedExecutionTime.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getAnnotations())) {
            ArrayList<Annotation> originalList = simulatedExecutionTime.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExclusiveAreaRefWrapper getExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getExclusiveAreaRef())) {
            
            return new ExclusiveAreaRefWrapper(simulatedExecutionTime.getExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(simulatedExecutionTime.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(simulatedExecutionTime.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getHwElementRef())) {
            
            return new HwElementRefWrapper(simulatedExecutionTime.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedLibraryRefWrapper> getIncludedLibraryRefs() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getIncludedLibraryRefs())) {
            ArrayList<IncludedLibraryRef> originalList = simulatedExecutionTime.getIncludedLibraryRefs();
            ArrayList<IncludedLibraryRefWrapper> wrapperList = (ArrayList<IncludedLibraryRefWrapper>)originalList.stream()
                .map(item -> new IncludedLibraryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MemorySectionLocationWrapper> getMemorySectionLocations() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getMemorySectionLocations())) {
            ArrayList<MemorySectionLocation> originalList = simulatedExecutionTime.getMemorySectionLocations();
            ArrayList<MemorySectionLocationWrapper> wrapperList = (ArrayList<MemorySectionLocationWrapper>)originalList.stream()
                .map(item -> new MemorySectionLocationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(simulatedExecutionTime.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getVariationPoint())) {
            
            return new VariationPointWrapper(simulatedExecutionTime.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximumExecutionTime() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getMaximumExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(simulatedExecutionTime.getMaximumExecutionTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimumExecutionTime() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getMinimumExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(simulatedExecutionTime.getMinimumExecutionTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getNominalExecutionTime() {
        
        if (CollUtil.isNotEmpty(simulatedExecutionTime.getNominalExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(simulatedExecutionTime.getNominalExecutionTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
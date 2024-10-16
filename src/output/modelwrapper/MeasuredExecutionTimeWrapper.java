package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MeasuredExecutionTimeWrapper {

    
    private MeasuredExecutionTime measuredExecutionTime;

    public MeasuredExecutionTimeWrapper(MeasuredExecutionTime measuredExecutionTime) {
        this.measuredExecutionTime = measuredExecutionTime;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getS())) {
            
            return measuredExecutionTime.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getT())) {
            
            return measuredExecutionTime.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getUuid())) {
            
            return measuredExecutionTime.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getShortName())) {
            
            return new IdentifierWrapper(measuredExecutionTime.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = measuredExecutionTime.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getLongName())) {
            
            return new MultilanguageLongNameWrapper(measuredExecutionTime.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(measuredExecutionTime.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getCategory())) {
            
            return new CategoryStringWrapper(measuredExecutionTime.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getAdminData())) {
            
            return new AdminDataWrapper(measuredExecutionTime.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getIntroduction())) {
            
            return new DocumentationBlockWrapper(measuredExecutionTime.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getAnnotations())) {
            ArrayList<Annotation> originalList = measuredExecutionTime.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExclusiveAreaRefWrapper getExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getExclusiveAreaRef())) {
            
            return new ExclusiveAreaRefWrapper(measuredExecutionTime.getExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(measuredExecutionTime.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(measuredExecutionTime.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getHwElementRef())) {
            
            return new HwElementRefWrapper(measuredExecutionTime.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedLibraryRefWrapper> getIncludedLibraryRefs() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getIncludedLibraryRefs())) {
            ArrayList<IncludedLibraryRef> originalList = measuredExecutionTime.getIncludedLibraryRefs();
            ArrayList<IncludedLibraryRefWrapper> wrapperList = (ArrayList<IncludedLibraryRefWrapper>)originalList.stream()
                .map(item -> new IncludedLibraryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MemorySectionLocationWrapper> getMemorySectionLocations() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getMemorySectionLocations())) {
            ArrayList<MemorySectionLocation> originalList = measuredExecutionTime.getMemorySectionLocations();
            ArrayList<MemorySectionLocationWrapper> wrapperList = (ArrayList<MemorySectionLocationWrapper>)originalList.stream()
                .map(item -> new MemorySectionLocationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(measuredExecutionTime.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getVariationPoint())) {
            
            return new VariationPointWrapper(measuredExecutionTime.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximumExecutionTime() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getMaximumExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(measuredExecutionTime.getMaximumExecutionTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimumExecutionTime() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getMinimumExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(measuredExecutionTime.getMinimumExecutionTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getNominalExecutionTime() {
        
        if (CollUtil.isNotEmpty(measuredExecutionTime.getNominalExecutionTime())) {
            
            return new MultidimensionalTimeWrapper(measuredExecutionTime.getNominalExecutionTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
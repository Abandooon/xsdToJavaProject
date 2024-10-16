package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class MeasuredHeapUsageWrapper {

    
    private MeasuredHeapUsage measuredHeapUsage;

    public MeasuredHeapUsageWrapper(MeasuredHeapUsage measuredHeapUsage) {
        this.measuredHeapUsage = measuredHeapUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getS())) {
            
            return measuredHeapUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getT())) {
            
            return measuredHeapUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getUuid())) {
            
            return measuredHeapUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getShortName())) {
            
            return new IdentifierWrapper(measuredHeapUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = measuredHeapUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(measuredHeapUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(measuredHeapUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getCategory())) {
            
            return new CategoryStringWrapper(measuredHeapUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getAdminData())) {
            
            return new AdminDataWrapper(measuredHeapUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(measuredHeapUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = measuredHeapUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(measuredHeapUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(measuredHeapUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(measuredHeapUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(measuredHeapUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAverageMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getAverageMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredHeapUsage.getAverageMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaximumMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getMaximumMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredHeapUsage.getMaximumMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinimumMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getMinimumMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredHeapUsage.getMinimumMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTestPattern() {
        
        if (CollUtil.isNotEmpty(measuredHeapUsage.getTestPattern())) {
            
            return new StringWrapper(measuredHeapUsage.getTestPattern());
            
        } else {
            return null;
        }
        
    }




    


    
}
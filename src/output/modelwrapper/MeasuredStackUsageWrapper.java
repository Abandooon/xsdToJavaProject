package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class MeasuredStackUsageWrapper {

    
    private MeasuredStackUsage measuredStackUsage;

    public MeasuredStackUsageWrapper(MeasuredStackUsage measuredStackUsage) {
        this.measuredStackUsage = measuredStackUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getS())) {
            
            return measuredStackUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getT())) {
            
            return measuredStackUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getUuid())) {
            
            return measuredStackUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getShortName())) {
            
            return new IdentifierWrapper(measuredStackUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = measuredStackUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(measuredStackUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(measuredStackUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getCategory())) {
            
            return new CategoryStringWrapper(measuredStackUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getAdminData())) {
            
            return new AdminDataWrapper(measuredStackUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(measuredStackUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = measuredStackUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(measuredStackUsage.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(measuredStackUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(measuredStackUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(measuredStackUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(measuredStackUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAverageMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getAverageMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredStackUsage.getAverageMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaximumMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getMaximumMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredStackUsage.getMaximumMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinimumMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getMinimumMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(measuredStackUsage.getMinimumMemoryConsumption());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTestPattern() {
        
        if (CollUtil.isNotEmpty(measuredStackUsage.getTestPattern())) {
            
            return new StringWrapper(measuredStackUsage.getTestPattern());
            
        } else {
            return null;
        }
        
    }




    


    
}
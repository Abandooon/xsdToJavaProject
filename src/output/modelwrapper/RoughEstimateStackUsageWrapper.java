package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RoughEstimateStackUsageWrapper {

    
    private RoughEstimateStackUsage roughEstimateStackUsage;

    public RoughEstimateStackUsageWrapper(RoughEstimateStackUsage roughEstimateStackUsage) {
        this.roughEstimateStackUsage = roughEstimateStackUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getS())) {
            
            return roughEstimateStackUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getT())) {
            
            return roughEstimateStackUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getUuid())) {
            
            return roughEstimateStackUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getShortName())) {
            
            return new IdentifierWrapper(roughEstimateStackUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = roughEstimateStackUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(roughEstimateStackUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(roughEstimateStackUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getCategory())) {
            
            return new CategoryStringWrapper(roughEstimateStackUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getAdminData())) {
            
            return new AdminDataWrapper(roughEstimateStackUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(roughEstimateStackUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = roughEstimateStackUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(roughEstimateStackUsage.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(roughEstimateStackUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(roughEstimateStackUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(roughEstimateStackUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(roughEstimateStackUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(roughEstimateStackUsage.getMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(roughEstimateStackUsage.getMemoryConsumption());
            
        } else {
            return null;
        }
        
    }




    


    
}
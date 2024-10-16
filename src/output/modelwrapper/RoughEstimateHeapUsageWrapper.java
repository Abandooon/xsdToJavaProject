package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class RoughEstimateHeapUsageWrapper {

    
    private RoughEstimateHeapUsage roughEstimateHeapUsage;

    public RoughEstimateHeapUsageWrapper(RoughEstimateHeapUsage roughEstimateHeapUsage) {
        this.roughEstimateHeapUsage = roughEstimateHeapUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getS())) {
            
            return roughEstimateHeapUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getT())) {
            
            return roughEstimateHeapUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getUuid())) {
            
            return roughEstimateHeapUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getShortName())) {
            
            return new IdentifierWrapper(roughEstimateHeapUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = roughEstimateHeapUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(roughEstimateHeapUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(roughEstimateHeapUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getCategory())) {
            
            return new CategoryStringWrapper(roughEstimateHeapUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getAdminData())) {
            
            return new AdminDataWrapper(roughEstimateHeapUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(roughEstimateHeapUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = roughEstimateHeapUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(roughEstimateHeapUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(roughEstimateHeapUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(roughEstimateHeapUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(roughEstimateHeapUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(roughEstimateHeapUsage.getMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(roughEstimateHeapUsage.getMemoryConsumption());
            
        } else {
            return null;
        }
        
    }




    


    
}
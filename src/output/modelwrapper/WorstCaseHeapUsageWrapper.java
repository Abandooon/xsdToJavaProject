package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class WorstCaseHeapUsageWrapper {

    
    private WorstCaseHeapUsage worstCaseHeapUsage;

    public WorstCaseHeapUsageWrapper(WorstCaseHeapUsage worstCaseHeapUsage) {
        this.worstCaseHeapUsage = worstCaseHeapUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getS())) {
            
            return worstCaseHeapUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getT())) {
            
            return worstCaseHeapUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getUuid())) {
            
            return worstCaseHeapUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getShortName())) {
            
            return new IdentifierWrapper(worstCaseHeapUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = worstCaseHeapUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(worstCaseHeapUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(worstCaseHeapUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getCategory())) {
            
            return new CategoryStringWrapper(worstCaseHeapUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getAdminData())) {
            
            return new AdminDataWrapper(worstCaseHeapUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(worstCaseHeapUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = worstCaseHeapUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(worstCaseHeapUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(worstCaseHeapUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(worstCaseHeapUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(worstCaseHeapUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(worstCaseHeapUsage.getMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(worstCaseHeapUsage.getMemoryConsumption());
            
        } else {
            return null;
        }
        
    }




    


    
}
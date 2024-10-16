package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class WorstCaseStackUsageWrapper {

    
    private WorstCaseStackUsage worstCaseStackUsage;

    public WorstCaseStackUsageWrapper(WorstCaseStackUsage worstCaseStackUsage) {
        this.worstCaseStackUsage = worstCaseStackUsage;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getS())) {
            
            return worstCaseStackUsage.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getT())) {
            
            return worstCaseStackUsage.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getUuid())) {
            
            return worstCaseStackUsage.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getShortName())) {
            
            return new IdentifierWrapper(worstCaseStackUsage.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = worstCaseStackUsage.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getLongName())) {
            
            return new MultilanguageLongNameWrapper(worstCaseStackUsage.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(worstCaseStackUsage.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getCategory())) {
            
            return new CategoryStringWrapper(worstCaseStackUsage.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getAdminData())) {
            
            return new AdminDataWrapper(worstCaseStackUsage.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getIntroduction())) {
            
            return new DocumentationBlockWrapper(worstCaseStackUsage.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getAnnotations())) {
            ArrayList<Annotation> originalList = worstCaseStackUsage.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExecutableEntityRefWrapper getExecutableEntityRef() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getExecutableEntityRef())) {
            
            return new ExecutableEntityRefWrapper(worstCaseStackUsage.getExecutableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public HardwareConfigurationWrapper getHardwareConfiguration() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getHardwareConfiguration())) {
            
            return new HardwareConfigurationWrapper(worstCaseStackUsage.getHardwareConfiguration());
            
        } else {
            return null;
        }
        
    }

    public HwElementRefWrapper getHwElementRef() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getHwElementRef())) {
            
            return new HwElementRefWrapper(worstCaseStackUsage.getHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public SoftwareContextWrapper getSoftwareContext() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getSoftwareContext())) {
            
            return new SoftwareContextWrapper(worstCaseStackUsage.getSoftwareContext());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getVariationPoint())) {
            
            return new VariationPointWrapper(worstCaseStackUsage.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryConsumption() {
        
        if (CollUtil.isNotEmpty(worstCaseStackUsage.getMemoryConsumption())) {
            
            return new PositiveIntegerWrapper(worstCaseStackUsage.getMemoryConsumption());
            
        } else {
            return null;
        }
        
    }




    


    
}
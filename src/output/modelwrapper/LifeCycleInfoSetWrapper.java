package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LifeCycleInfoSetWrapper {

    
    private LifeCycleInfoSet lifeCycleInfoSet;

    public LifeCycleInfoSetWrapper(LifeCycleInfoSet lifeCycleInfoSet) {
        this.lifeCycleInfoSet = lifeCycleInfoSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getS())) {
            
            return lifeCycleInfoSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getT())) {
            
            return lifeCycleInfoSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getUuid())) {
            
            return lifeCycleInfoSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getShortName())) {
            
            return new IdentifierWrapper(lifeCycleInfoSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = lifeCycleInfoSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(lifeCycleInfoSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(lifeCycleInfoSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getCategory())) {
            
            return new CategoryStringWrapper(lifeCycleInfoSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getAdminData())) {
            
            return new AdminDataWrapper(lifeCycleInfoSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(lifeCycleInfoSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getAnnotations())) {
            ArrayList<Annotation> originalList = lifeCycleInfoSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getVariationPoint())) {
            
            return new VariationPointWrapper(lifeCycleInfoSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DefaultLcStateRefWrapper getDefaultLcStateRef() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getDefaultLcStateRef())) {
            
            return new DefaultLcStateRefWrapper(lifeCycleInfoSet.getDefaultLcStateRef());
            
        } else {
            return null;
        }
        
    }

    public LifeCyclePeriodWrapper getDefaultPeriodBegin() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getDefaultPeriodBegin())) {
            
            return new LifeCyclePeriodWrapper(lifeCycleInfoSet.getDefaultPeriodBegin());
            
        } else {
            return null;
        }
        
    }

    public LifeCyclePeriodWrapper getDefaultPeriodEnd() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getDefaultPeriodEnd())) {
            
            return new LifeCyclePeriodWrapper(lifeCycleInfoSet.getDefaultPeriodEnd());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LifeCycleInfoWrapper> getLifeCycleInfos() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getLifeCycleInfos())) {
            ArrayList<LifeCycleInfo> originalList = lifeCycleInfoSet.getLifeCycleInfos();
            ArrayList<LifeCycleInfoWrapper> wrapperList = (ArrayList<LifeCycleInfoWrapper>)originalList.stream()
                .map(item -> new LifeCycleInfoWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public UsedLifeCycleStateDefinitionGroupRefWrapper getUsedLifeCycleStateDefinitionGroupRef() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfoSet.getUsedLifeCycleStateDefinitionGroupRef())) {
            
            return new UsedLifeCycleStateDefinitionGroupRefWrapper(lifeCycleInfoSet.getUsedLifeCycleStateDefinitionGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
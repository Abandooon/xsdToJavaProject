package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class LifeCycleStateWrapper {

    
    private LifeCycleState lifeCycleState;

    public LifeCycleStateWrapper(LifeCycleState lifeCycleState) {
        this.lifeCycleState = lifeCycleState;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getS())) {
            
            return lifeCycleState.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getT())) {
            
            return lifeCycleState.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getUuid())) {
            
            return lifeCycleState.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getShortName())) {
            
            return new IdentifierWrapper(lifeCycleState.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = lifeCycleState.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getLongName())) {
            
            return new MultilanguageLongNameWrapper(lifeCycleState.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(lifeCycleState.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getCategory())) {
            
            return new CategoryStringWrapper(lifeCycleState.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getAdminData())) {
            
            return new AdminDataWrapper(lifeCycleState.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getIntroduction())) {
            
            return new DocumentationBlockWrapper(lifeCycleState.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getAnnotations())) {
            ArrayList<Annotation> originalList = lifeCycleState.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(lifeCycleState.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(lifeCycleState.getShortNamePattern())) {
            
            return new StringWrapper(lifeCycleState.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }




    


    
}
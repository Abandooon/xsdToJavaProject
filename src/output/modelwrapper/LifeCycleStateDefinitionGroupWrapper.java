package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class LifeCycleStateDefinitionGroupWrapper {

    
    private LifeCycleStateDefinitionGroup lifeCycleStateDefinitionGroup;

    public LifeCycleStateDefinitionGroupWrapper(LifeCycleStateDefinitionGroup lifeCycleStateDefinitionGroup) {
        this.lifeCycleStateDefinitionGroup = lifeCycleStateDefinitionGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getS())) {
            
            return lifeCycleStateDefinitionGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getT())) {
            
            return lifeCycleStateDefinitionGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getUuid())) {
            
            return lifeCycleStateDefinitionGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getShortName())) {
            
            return new IdentifierWrapper(lifeCycleStateDefinitionGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = lifeCycleStateDefinitionGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(lifeCycleStateDefinitionGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(lifeCycleStateDefinitionGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getCategory())) {
            
            return new CategoryStringWrapper(lifeCycleStateDefinitionGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getAdminData())) {
            
            return new AdminDataWrapper(lifeCycleStateDefinitionGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(lifeCycleStateDefinitionGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = lifeCycleStateDefinitionGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(lifeCycleStateDefinitionGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(lifeCycleStateDefinitionGroup.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getShortNamePattern())) {
            
            return new StringWrapper(lifeCycleStateDefinitionGroup.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LifeCycleStateWrapper> getLcStates() {
        
        if (CollUtil.isNotEmpty(lifeCycleStateDefinitionGroup.getLcStates())) {
            ArrayList<LifeCycleState> originalList = lifeCycleStateDefinitionGroup.getLcStates();
            ArrayList<LifeCycleStateWrapper> wrapperList = (ArrayList<LifeCycleStateWrapper>)originalList.stream()
                .map(item -> new LifeCycleStateWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
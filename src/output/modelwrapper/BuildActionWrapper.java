package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BuildActionWrapper {

    
    private BuildAction buildAction;

    public BuildActionWrapper(BuildAction buildAction) {
        this.buildAction = buildAction;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildAction.getS())) {
            
            return buildAction.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildAction.getT())) {
            
            return buildAction.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(buildAction.getUuid())) {
            
            return buildAction.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(buildAction.getShortName())) {
            
            return new IdentifierWrapper(buildAction.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(buildAction.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = buildAction.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(buildAction.getLongName())) {
            
            return new MultilanguageLongNameWrapper(buildAction.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(buildAction.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(buildAction.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(buildAction.getCategory())) {
            
            return new CategoryStringWrapper(buildAction.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(buildAction.getAdminData())) {
            
            return new AdminDataWrapper(buildAction.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(buildAction.getIntroduction())) {
            
            return new DocumentationBlockWrapper(buildAction.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(buildAction.getAnnotations())) {
            ArrayList<Annotation> originalList = buildAction.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(buildAction.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(buildAction.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(buildAction.getShortNamePattern())) {
            
            return new StringWrapper(buildAction.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarEngineeringObjectWrapper> getDeliveryArtifacts() {
        
        if (CollUtil.isNotEmpty(buildAction.getDeliveryArtifacts())) {
            ArrayList<AutosarEngineeringObject> originalList = buildAction.getDeliveryArtifacts();
            ArrayList<AutosarEngineeringObjectWrapper> wrapperList = (ArrayList<AutosarEngineeringObjectWrapper>)originalList.stream()
                .map(item -> new AutosarEngineeringObjectWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BuildActionInvocatorWrapper getInvocation() {
        
        if (CollUtil.isNotEmpty(buildAction.getInvocation())) {
            
            return new BuildActionInvocatorWrapper(buildAction.getInvocation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PredecessorActionRefWrapper> getPredecessorActionRefs() {
        
        if (CollUtil.isNotEmpty(buildAction.getPredecessorActionRefs())) {
            ArrayList<PredecessorActionRef> originalList = buildAction.getPredecessorActionRefs();
            ArrayList<PredecessorActionRefWrapper> wrapperList = (ArrayList<PredecessorActionRefWrapper>)originalList.stream()
                .map(item -> new PredecessorActionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FollowUpActionRefWrapper> getFollowUpActionRefs() {
        
        if (CollUtil.isNotEmpty(buildAction.getFollowUpActionRefs())) {
            ArrayList<FollowUpActionRef> originalList = buildAction.getFollowUpActionRefs();
            ArrayList<FollowUpActionRefWrapper> wrapperList = (ArrayList<FollowUpActionRefWrapper>)originalList.stream()
                .map(item -> new FollowUpActionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionIoElementWrapper> getCreatedDatas() {
        
        if (CollUtil.isNotEmpty(buildAction.getCreatedDatas())) {
            ArrayList<BuildActionIoElement> originalList = buildAction.getCreatedDatas();
            ArrayList<BuildActionIoElementWrapper> wrapperList = (ArrayList<BuildActionIoElementWrapper>)originalList.stream()
                .map(item -> new BuildActionIoElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionIoElementWrapper> getInputDatas() {
        
        if (CollUtil.isNotEmpty(buildAction.getInputDatas())) {
            ArrayList<BuildActionIoElement> originalList = buildAction.getInputDatas();
            ArrayList<BuildActionIoElementWrapper> wrapperList = (ArrayList<BuildActionIoElementWrapper>)originalList.stream()
                .map(item -> new BuildActionIoElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionIoElementWrapper> getModifiedDatas() {
        
        if (CollUtil.isNotEmpty(buildAction.getModifiedDatas())) {
            ArrayList<BuildActionIoElement> originalList = buildAction.getModifiedDatas();
            ArrayList<BuildActionIoElementWrapper> wrapperList = (ArrayList<BuildActionIoElementWrapper>)originalList.stream()
                .map(item -> new BuildActionIoElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RequiredEnvironmentRefWrapper getRequiredEnvironmentRef() {
        
        if (CollUtil.isNotEmpty(buildAction.getRequiredEnvironmentRef())) {
            
            return new RequiredEnvironmentRefWrapper(buildAction.getRequiredEnvironmentRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(buildAction.getVariationPoint())) {
            
            return new VariationPointWrapper(buildAction.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    


public class BuildActionManifestWrapper {

    
    private BuildActionManifest buildActionManifest;

    public BuildActionManifestWrapper(BuildActionManifest buildActionManifest) {
        this.buildActionManifest = buildActionManifest;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getS())) {
            
            return buildActionManifest.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getT())) {
            
            return buildActionManifest.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getUuid())) {
            
            return buildActionManifest.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getShortName())) {
            
            return new IdentifierWrapper(buildActionManifest.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = buildActionManifest.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getLongName())) {
            
            return new MultilanguageLongNameWrapper(buildActionManifest.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(buildActionManifest.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getCategory())) {
            
            return new CategoryStringWrapper(buildActionManifest.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getAdminData())) {
            
            return new AdminDataWrapper(buildActionManifest.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getIntroduction())) {
            
            return new DocumentationBlockWrapper(buildActionManifest.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getAnnotations())) {
            ArrayList<Annotation> originalList = buildActionManifest.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getVariationPoint())) {
            
            return new VariationPointWrapper(buildActionManifest.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(buildActionManifest.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getShortNamePattern())) {
            
            return new StringWrapper(buildActionManifest.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<StartActionRefWrapper> getStartActionRefs() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getStartActionRefs())) {
            ArrayList<StartActionRef> originalList = buildActionManifest.getStartActionRefs();
            ArrayList<StartActionRefWrapper> wrapperList = (ArrayList<StartActionRefWrapper>)originalList.stream()
                .map(item -> new StartActionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TearDownActionRefWrapper> getTearDownActionRefs() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getTearDownActionRefs())) {
            ArrayList<TearDownActionRef> originalList = buildActionManifest.getTearDownActionRefs();
            ArrayList<TearDownActionRefWrapper> wrapperList = (ArrayList<TearDownActionRefWrapper>)originalList.stream()
                .map(item -> new TearDownActionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionWrapper> getBuildActions() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getBuildActions())) {
            ArrayList<BuildAction> originalList = buildActionManifest.getBuildActions();
            ArrayList<BuildActionWrapper> wrapperList = (ArrayList<BuildActionWrapper>)originalList.stream()
                .map(item -> new BuildActionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionEnvironmentWrapper> getBuildActionEnvironments() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getBuildActionEnvironments())) {
            ArrayList<BuildActionEnvironment> originalList = buildActionManifest.getBuildActionEnvironments();
            ArrayList<BuildActionEnvironmentWrapper> wrapperList = (ArrayList<BuildActionEnvironmentWrapper>)originalList.stream()
                .map(item -> new BuildActionEnvironmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DynamicActionRefWrapper> getDynamicActionRefs() {
        
        if (CollUtil.isNotEmpty(buildActionManifest.getDynamicActionRefs())) {
            ArrayList<DynamicActionRef> originalList = buildActionManifest.getDynamicActionRefs();
            ArrayList<DynamicActionRefWrapper> wrapperList = (ArrayList<DynamicActionRefWrapper>)originalList.stream()
                .map(item -> new DynamicActionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class BuildActionEnvironmentWrapper {

    
    private BuildActionEnvironment buildActionEnvironment;

    public BuildActionEnvironmentWrapper(BuildActionEnvironment buildActionEnvironment) {
        this.buildActionEnvironment = buildActionEnvironment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getS())) {
            
            return buildActionEnvironment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getT())) {
            
            return buildActionEnvironment.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getUuid())) {
            
            return buildActionEnvironment.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getShortName())) {
            
            return new IdentifierWrapper(buildActionEnvironment.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = buildActionEnvironment.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getLongName())) {
            
            return new MultilanguageLongNameWrapper(buildActionEnvironment.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(buildActionEnvironment.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getCategory())) {
            
            return new CategoryStringWrapper(buildActionEnvironment.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getAdminData())) {
            
            return new AdminDataWrapper(buildActionEnvironment.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getIntroduction())) {
            
            return new DocumentationBlockWrapper(buildActionEnvironment.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getAnnotations())) {
            ArrayList<Annotation> originalList = buildActionEnvironment.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(buildActionEnvironment.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getShortNamePattern())) {
            
            return new StringWrapper(buildActionEnvironment.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdgs() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getSdgs())) {
            ArrayList<Sdg> originalList = buildActionEnvironment.getSdgs();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(buildActionEnvironment.getVariationPoint())) {
            
            return new VariationPointWrapper(buildActionEnvironment.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class FmFeatureMapElementWrapper {

    
    private FmFeatureMapElement fmFeatureMapElement;

    public FmFeatureMapElementWrapper(FmFeatureMapElement fmFeatureMapElement) {
        this.fmFeatureMapElement = fmFeatureMapElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getS())) {
            
            return fmFeatureMapElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getT())) {
            
            return fmFeatureMapElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getUuid())) {
            
            return fmFeatureMapElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureMapElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureMapElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureMapElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureMapElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureMapElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureMapElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureMapElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureMapElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureMapAssertionWrapper> getAssertions() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getAssertions())) {
            ArrayList<FmFeatureMapAssertion> originalList = fmFeatureMapElement.getAssertions();
            ArrayList<FmFeatureMapAssertionWrapper> wrapperList = (ArrayList<FmFeatureMapAssertionWrapper>)originalList.stream()
                .map(item -> new FmFeatureMapAssertionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureMapConditionWrapper> getConditions() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getConditions())) {
            ArrayList<FmFeatureMapCondition> originalList = fmFeatureMapElement.getConditions();
            ArrayList<FmFeatureMapConditionWrapper> wrapperList = (ArrayList<FmFeatureMapConditionWrapper>)originalList.stream()
                .map(item -> new FmFeatureMapConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantCriterionValueSetRefWrapper> getPostBuildVariantCriterionValueSetRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getPostBuildVariantCriterionValueSetRefs())) {
            ArrayList<PostBuildVariantCriterionValueSetRef> originalList = fmFeatureMapElement.getPostBuildVariantCriterionValueSetRefs();
            ArrayList<PostBuildVariantCriterionValueSetRefWrapper> wrapperList = (ArrayList<PostBuildVariantCriterionValueSetRefWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantCriterionValueSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwSystemconstantValueSetRefWrapper> getSwSystemconstantValueSetRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapElement.getSwSystemconstantValueSetRefs())) {
            ArrayList<SwSystemconstantValueSetRef> originalList = fmFeatureMapElement.getSwSystemconstantValueSetRefs();
            ArrayList<SwSystemconstantValueSetRefWrapper> wrapperList = (ArrayList<SwSystemconstantValueSetRefWrapper>)originalList.stream()
                .map(item -> new SwSystemconstantValueSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
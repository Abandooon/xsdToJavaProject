package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class PostBuildVariantCriterionValueSetWrapper {

    
    private PostBuildVariantCriterionValueSet postBuildVariantCriterionValueSet;

    public PostBuildVariantCriterionValueSetWrapper(PostBuildVariantCriterionValueSet postBuildVariantCriterionValueSet) {
        this.postBuildVariantCriterionValueSet = postBuildVariantCriterionValueSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getS())) {
            
            return postBuildVariantCriterionValueSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getT())) {
            
            return postBuildVariantCriterionValueSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getUuid())) {
            
            return postBuildVariantCriterionValueSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getShortName())) {
            
            return new IdentifierWrapper(postBuildVariantCriterionValueSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = postBuildVariantCriterionValueSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(postBuildVariantCriterionValueSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(postBuildVariantCriterionValueSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getCategory())) {
            
            return new CategoryStringWrapper(postBuildVariantCriterionValueSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getAdminData())) {
            
            return new AdminDataWrapper(postBuildVariantCriterionValueSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(postBuildVariantCriterionValueSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getAnnotations())) {
            ArrayList<Annotation> originalList = postBuildVariantCriterionValueSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getVariationPoint())) {
            
            return new VariationPointWrapper(postBuildVariantCriterionValueSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantCriterionValueWrapper> getPostBuildVariantCriterionValues() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSet.getPostBuildVariantCriterionValues())) {
            ArrayList<PostBuildVariantCriterionValue> originalList = postBuildVariantCriterionValueSet.getPostBuildVariantCriterionValues();
            ArrayList<PostBuildVariantCriterionValueWrapper> wrapperList = (ArrayList<PostBuildVariantCriterionValueWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantCriterionValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
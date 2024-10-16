package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class PostBuildVariantCriterionWrapper {

    
    private PostBuildVariantCriterion postBuildVariantCriterion;

    public PostBuildVariantCriterionWrapper(PostBuildVariantCriterion postBuildVariantCriterion) {
        this.postBuildVariantCriterion = postBuildVariantCriterion;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getS())) {
            
            return postBuildVariantCriterion.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getT())) {
            
            return postBuildVariantCriterion.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getUuid())) {
            
            return postBuildVariantCriterion.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getShortName())) {
            
            return new IdentifierWrapper(postBuildVariantCriterion.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = postBuildVariantCriterion.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getLongName())) {
            
            return new MultilanguageLongNameWrapper(postBuildVariantCriterion.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(postBuildVariantCriterion.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getCategory())) {
            
            return new CategoryStringWrapper(postBuildVariantCriterion.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getAdminData())) {
            
            return new AdminDataWrapper(postBuildVariantCriterion.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getIntroduction())) {
            
            return new DocumentationBlockWrapper(postBuildVariantCriterion.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getAnnotations())) {
            ArrayList<Annotation> originalList = postBuildVariantCriterion.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getVariationPoint())) {
            
            return new VariationPointWrapper(postBuildVariantCriterion.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CompuMethodRefWrapper getCompuMethodRef() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterion.getCompuMethodRef())) {
            
            return new CompuMethodRefWrapper(postBuildVariantCriterion.getCompuMethodRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
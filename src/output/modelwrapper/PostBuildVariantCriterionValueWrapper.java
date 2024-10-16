package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class PostBuildVariantCriterionValueWrapper {

    
    private PostBuildVariantCriterionValue postBuildVariantCriterionValue;

    public PostBuildVariantCriterionValueWrapper(PostBuildVariantCriterionValue postBuildVariantCriterionValue) {
        this.postBuildVariantCriterionValue = postBuildVariantCriterionValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValue.getS())) {
            
            return postBuildVariantCriterionValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValue.getT())) {
            
            return postBuildVariantCriterionValue.getT();
            
        } else {
            return null;
        }
        
    }

    public VariantCriterionRefWrapper getVariantCriterionRef() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValue.getVariantCriterionRef())) {
            
            return new VariantCriterionRefWrapper(postBuildVariantCriterionValue.getVariantCriterionRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValue.getValue())) {
            
            return new IntegerValueVariationPointWrapper(postBuildVariantCriterionValue.getValue());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValue.getAnnotations())) {
            ArrayList<Annotation> originalList = postBuildVariantCriterionValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PostBuildVariantConditionWrapper {

    
    private PostBuildVariantCondition postBuildVariantCondition;

    public PostBuildVariantConditionWrapper(PostBuildVariantCondition postBuildVariantCondition) {
        this.postBuildVariantCondition = postBuildVariantCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCondition.getS())) {
            
            return postBuildVariantCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCondition.getT())) {
            
            return postBuildVariantCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public MatchingCriterionRefWrapper getMatchingCriterionRef() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCondition.getMatchingCriterionRef())) {
            
            return new MatchingCriterionRefWrapper(postBuildVariantCondition.getMatchingCriterionRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCondition.getValue())) {
            
            return new IntegerValueVariationPointWrapper(postBuildVariantCondition.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class UserDefinedTransformationISignalPropsConditionalWrapper {

    
    private UserDefinedTransformationISignalPropsConditional userDefinedTransformationISignalPropsConditional;

    public UserDefinedTransformationISignalPropsConditionalWrapper(UserDefinedTransformationISignalPropsConditional userDefinedTransformationISignalPropsConditional) {
        this.userDefinedTransformationISignalPropsConditional = userDefinedTransformationISignalPropsConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalPropsConditional.getS())) {
            
            return userDefinedTransformationISignalPropsConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalPropsConditional.getT())) {
            
            return userDefinedTransformationISignalPropsConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public CsTransformerErrorReactionEnumWrapper getCsErrorReaction() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalPropsConditional.getCsErrorReaction())) {
            
            return new CsTransformerErrorReactionEnumWrapper(userDefinedTransformationISignalPropsConditional.getCsErrorReaction());
            
        } else {
            return null;
        }
        
    }

    public TransformerRefWrapper getTransformerRef() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalPropsConditional.getTransformerRef())) {
            
            return new TransformerRefWrapper(userDefinedTransformationISignalPropsConditional.getTransformerRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalPropsConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedTransformationISignalPropsConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CsTransformerErrorReactionEnumWrapper {

    
    private CsTransformerErrorReactionEnum csTransformerErrorReactionEnum;

    public CsTransformerErrorReactionEnumWrapper(CsTransformerErrorReactionEnum csTransformerErrorReactionEnum) {
        this.csTransformerErrorReactionEnum = csTransformerErrorReactionEnum;
    }

   
    public CsTransformerErrorReactionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(csTransformerErrorReactionEnum.getValue())) {
            
            return csTransformerErrorReactionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(csTransformerErrorReactionEnum.getS())) {
            
            return csTransformerErrorReactionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(csTransformerErrorReactionEnum.getT())) {
            
            return csTransformerErrorReactionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
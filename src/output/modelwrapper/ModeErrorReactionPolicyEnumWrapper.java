package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ModeErrorReactionPolicyEnumWrapper {

    
    private ModeErrorReactionPolicyEnum modeErrorReactionPolicyEnum;

    public ModeErrorReactionPolicyEnumWrapper(ModeErrorReactionPolicyEnum modeErrorReactionPolicyEnum) {
        this.modeErrorReactionPolicyEnum = modeErrorReactionPolicyEnum;
    }

   
    public ModeErrorReactionPolicyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(modeErrorReactionPolicyEnum.getValue())) {
            
            return modeErrorReactionPolicyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeErrorReactionPolicyEnum.getS())) {
            
            return modeErrorReactionPolicyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeErrorReactionPolicyEnum.getT())) {
            
            return modeErrorReactionPolicyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ModeErrorBehaviorWrapper {

    
    private ModeErrorBehavior modeErrorBehavior;

    public ModeErrorBehaviorWrapper(ModeErrorBehavior modeErrorBehavior) {
        this.modeErrorBehavior = modeErrorBehavior;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeErrorBehavior.getS())) {
            
            return modeErrorBehavior.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeErrorBehavior.getT())) {
            
            return modeErrorBehavior.getT();
            
        } else {
            return null;
        }
        
    }

    public DefaultModeRefWrapper getDefaultModeRef() {
        
        if (CollUtil.isNotEmpty(modeErrorBehavior.getDefaultModeRef())) {
            
            return new DefaultModeRefWrapper(modeErrorBehavior.getDefaultModeRef());
            
        } else {
            return null;
        }
        
    }

    public ModeErrorReactionPolicyEnumWrapper getErrorReactionPolicy() {
        
        if (CollUtil.isNotEmpty(modeErrorBehavior.getErrorReactionPolicy())) {
            
            return new ModeErrorReactionPolicyEnumWrapper(modeErrorBehavior.getErrorReactionPolicy());
            
        } else {
            return null;
        }
        
    }




    


    
}
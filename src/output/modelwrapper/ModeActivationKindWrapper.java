package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ModeActivationKindWrapper {

    
    private ModeActivationKind modeActivationKind;

    public ModeActivationKindWrapper(ModeActivationKind modeActivationKind) {
        this.modeActivationKind = modeActivationKind;
    }

   
    public ModeActivationKindSimple getValue() {
        
        if (CollUtil.isNotEmpty(modeActivationKind.getValue())) {
            
            return modeActivationKind.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeActivationKind.getS())) {
            
            return modeActivationKind.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeActivationKind.getT())) {
            
            return modeActivationKind.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
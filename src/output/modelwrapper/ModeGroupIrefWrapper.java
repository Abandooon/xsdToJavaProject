package stdgui.data.model.modelwrapper;


    
    

    
    


public class ModeGroupIrefWrapper {

    
    private ModeGroupIref modeGroupIref;

    public ModeGroupIrefWrapper(ModeGroupIref modeGroupIref) {
        this.modeGroupIref = modeGroupIref;
    }

   
    public PModeGroupInAtomicSwcInstanceRefWrapper getPModeGroupInAtomicSwcInstanceRef() {
        
        if (CollUtil.isNotEmpty(modeGroupIref.getPModeGroupInAtomicSwcInstanceRef())) {
            
            return new PModeGroupInAtomicSwcInstanceRefWrapper(modeGroupIref.getPModeGroupInAtomicSwcInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public RModeGroupInAtomicSwcInstanceRefWrapper getRModeGroupInAtomicSwcInstanceRef() {
        
        if (CollUtil.isNotEmpty(modeGroupIref.getRModeGroupInAtomicSwcInstanceRef())) {
            
            return new RModeGroupInAtomicSwcInstanceRefWrapper(modeGroupIref.getRModeGroupInAtomicSwcInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
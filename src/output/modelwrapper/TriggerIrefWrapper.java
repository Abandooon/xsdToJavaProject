package stdgui.data.model.modelwrapper;


    
    


public class TriggerIrefWrapper {

    
    private TriggerIref triggerIref;

    public TriggerIrefWrapper(TriggerIref triggerIref) {
        this.triggerIref = triggerIref;
    }

   
    public PTriggerInAtomicSwcTypeInstanceRefWrapper getPTriggerInAtomicSwcTypeInstanceRef() {
        
        if (CollUtil.isNotEmpty(triggerIref.getPTriggerInAtomicSwcTypeInstanceRef())) {
            
            return new PTriggerInAtomicSwcTypeInstanceRefWrapper(triggerIref.getPTriggerInAtomicSwcTypeInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
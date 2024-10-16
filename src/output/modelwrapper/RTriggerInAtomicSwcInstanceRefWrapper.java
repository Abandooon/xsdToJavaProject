package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RTriggerInAtomicSwcInstanceRefWrapper {

    
    private RTriggerInAtomicSwcInstanceRef rTriggerInAtomicSwcInstanceRef;

    public RTriggerInAtomicSwcInstanceRefWrapper(RTriggerInAtomicSwcInstanceRef rTriggerInAtomicSwcInstanceRef) {
        this.rTriggerInAtomicSwcInstanceRef = rTriggerInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rTriggerInAtomicSwcInstanceRef.getS())) {
            
            return rTriggerInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rTriggerInAtomicSwcInstanceRef.getT())) {
            
            return rTriggerInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRPortRefWrapper getContextRPortRef() {
        
        if (CollUtil.isNotEmpty(rTriggerInAtomicSwcInstanceRef.getContextRPortRef())) {
            
            return new ContextRPortRefWrapper(rTriggerInAtomicSwcInstanceRef.getContextRPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetTriggerRefWrapper getTargetTriggerRef() {
        
        if (CollUtil.isNotEmpty(rTriggerInAtomicSwcInstanceRef.getTargetTriggerRef())) {
            
            return new TargetTriggerRefWrapper(rTriggerInAtomicSwcInstanceRef.getTargetTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
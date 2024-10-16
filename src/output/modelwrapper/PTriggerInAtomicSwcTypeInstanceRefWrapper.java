package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PTriggerInAtomicSwcTypeInstanceRefWrapper {

    
    private PTriggerInAtomicSwcTypeInstanceRef pTriggerInAtomicSwcTypeInstanceRef;

    public PTriggerInAtomicSwcTypeInstanceRefWrapper(PTriggerInAtomicSwcTypeInstanceRef pTriggerInAtomicSwcTypeInstanceRef) {
        this.pTriggerInAtomicSwcTypeInstanceRef = pTriggerInAtomicSwcTypeInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pTriggerInAtomicSwcTypeInstanceRef.getS())) {
            
            return pTriggerInAtomicSwcTypeInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pTriggerInAtomicSwcTypeInstanceRef.getT())) {
            
            return pTriggerInAtomicSwcTypeInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextPPortRefWrapper getContextPPortRef() {
        
        if (CollUtil.isNotEmpty(pTriggerInAtomicSwcTypeInstanceRef.getContextPPortRef())) {
            
            return new ContextPPortRefWrapper(pTriggerInAtomicSwcTypeInstanceRef.getContextPPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetTriggerRefWrapper getTargetTriggerRef() {
        
        if (CollUtil.isNotEmpty(pTriggerInAtomicSwcTypeInstanceRef.getTargetTriggerRef())) {
            
            return new TargetTriggerRefWrapper(pTriggerInAtomicSwcTypeInstanceRef.getTargetTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
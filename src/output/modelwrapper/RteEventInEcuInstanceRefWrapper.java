package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RteEventInEcuInstanceRefWrapper {

    
    private RteEventInEcuInstanceRef rteEventInEcuInstanceRef;

    public RteEventInEcuInstanceRefWrapper(RteEventInEcuInstanceRef rteEventInEcuInstanceRef) {
        this.rteEventInEcuInstanceRef = rteEventInEcuInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rteEventInEcuInstanceRef.getS())) {
            
            return rteEventInEcuInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rteEventInEcuInstanceRef.getT())) {
            
            return rteEventInEcuInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRootCompositionRefWrapper getContextRootCompositionRef() {
        
        if (CollUtil.isNotEmpty(rteEventInEcuInstanceRef.getContextRootCompositionRef())) {
            
            return new ContextRootCompositionRefWrapper(rteEventInEcuInstanceRef.getContextRootCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ContextAtomicComponentRefWrapper getContextAtomicComponentRef() {
        
        if (CollUtil.isNotEmpty(rteEventInEcuInstanceRef.getContextAtomicComponentRef())) {
            
            return new ContextAtomicComponentRefWrapper(rteEventInEcuInstanceRef.getContextAtomicComponentRef());
            
        } else {
            return null;
        }
        
    }

    public TargetRteEventRefWrapper getTargetRteEventRef() {
        
        if (CollUtil.isNotEmpty(rteEventInEcuInstanceRef.getTargetRteEventRef())) {
            
            return new TargetRteEventRefWrapper(rteEventInEcuInstanceRef.getTargetRteEventRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
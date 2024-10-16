package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class POperationInAtomicSwcInstanceRefWrapper {

    
    private POperationInAtomicSwcInstanceRef pOperationInAtomicSwcInstanceRef;

    public POperationInAtomicSwcInstanceRefWrapper(POperationInAtomicSwcInstanceRef pOperationInAtomicSwcInstanceRef) {
        this.pOperationInAtomicSwcInstanceRef = pOperationInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pOperationInAtomicSwcInstanceRef.getS())) {
            
            return pOperationInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pOperationInAtomicSwcInstanceRef.getT())) {
            
            return pOperationInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextPPortRefWrapper getContextPPortRef() {
        
        if (CollUtil.isNotEmpty(pOperationInAtomicSwcInstanceRef.getContextPPortRef())) {
            
            return new ContextPPortRefWrapper(pOperationInAtomicSwcInstanceRef.getContextPPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetProvidedOperationRefWrapper getTargetProvidedOperationRef() {
        
        if (CollUtil.isNotEmpty(pOperationInAtomicSwcInstanceRef.getTargetProvidedOperationRef())) {
            
            return new TargetProvidedOperationRefWrapper(pOperationInAtomicSwcInstanceRef.getTargetProvidedOperationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
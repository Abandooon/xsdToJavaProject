package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ROperationInAtomicSwcInstanceRefWrapper {

    
    private ROperationInAtomicSwcInstanceRef rOperationInAtomicSwcInstanceRef;

    public ROperationInAtomicSwcInstanceRefWrapper(ROperationInAtomicSwcInstanceRef rOperationInAtomicSwcInstanceRef) {
        this.rOperationInAtomicSwcInstanceRef = rOperationInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rOperationInAtomicSwcInstanceRef.getS())) {
            
            return rOperationInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rOperationInAtomicSwcInstanceRef.getT())) {
            
            return rOperationInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRPortRefWrapper getContextRPortRef() {
        
        if (CollUtil.isNotEmpty(rOperationInAtomicSwcInstanceRef.getContextRPortRef())) {
            
            return new ContextRPortRefWrapper(rOperationInAtomicSwcInstanceRef.getContextRPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetRequiredOperationRefWrapper getTargetRequiredOperationRef() {
        
        if (CollUtil.isNotEmpty(rOperationInAtomicSwcInstanceRef.getTargetRequiredOperationRef())) {
            
            return new TargetRequiredOperationRefWrapper(rOperationInAtomicSwcInstanceRef.getTargetRequiredOperationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
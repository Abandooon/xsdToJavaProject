package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RVariableInAtomicSwcInstanceRefWrapper {

    
    private RVariableInAtomicSwcInstanceRef rVariableInAtomicSwcInstanceRef;

    public RVariableInAtomicSwcInstanceRefWrapper(RVariableInAtomicSwcInstanceRef rVariableInAtomicSwcInstanceRef) {
        this.rVariableInAtomicSwcInstanceRef = rVariableInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rVariableInAtomicSwcInstanceRef.getS())) {
            
            return rVariableInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rVariableInAtomicSwcInstanceRef.getT())) {
            
            return rVariableInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRPortRefWrapper getContextRPortRef() {
        
        if (CollUtil.isNotEmpty(rVariableInAtomicSwcInstanceRef.getContextRPortRef())) {
            
            return new ContextRPortRefWrapper(rVariableInAtomicSwcInstanceRef.getContextRPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetDataElementRefWrapper getTargetDataElementRef() {
        
        if (CollUtil.isNotEmpty(rVariableInAtomicSwcInstanceRef.getTargetDataElementRef())) {
            
            return new TargetDataElementRefWrapper(rVariableInAtomicSwcInstanceRef.getTargetDataElementRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
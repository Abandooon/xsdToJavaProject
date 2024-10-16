package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class VariableAccessInEcuInstanceRefWrapper {

    
    private VariableAccessInEcuInstanceRef variableAccessInEcuInstanceRef;

    public VariableAccessInEcuInstanceRefWrapper(VariableAccessInEcuInstanceRef variableAccessInEcuInstanceRef) {
        this.variableAccessInEcuInstanceRef = variableAccessInEcuInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableAccessInEcuInstanceRef.getS())) {
            
            return variableAccessInEcuInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableAccessInEcuInstanceRef.getT())) {
            
            return variableAccessInEcuInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRootCompositionRefWrapper getContextRootCompositionRef() {
        
        if (CollUtil.isNotEmpty(variableAccessInEcuInstanceRef.getContextRootCompositionRef())) {
            
            return new ContextRootCompositionRefWrapper(variableAccessInEcuInstanceRef.getContextRootCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ContextAtomicComponentRefWrapper getContextAtomicComponentRef() {
        
        if (CollUtil.isNotEmpty(variableAccessInEcuInstanceRef.getContextAtomicComponentRef())) {
            
            return new ContextAtomicComponentRefWrapper(variableAccessInEcuInstanceRef.getContextAtomicComponentRef());
            
        } else {
            return null;
        }
        
    }

    public TargetVariableAccessRefWrapper getTargetVariableAccessRef() {
        
        if (CollUtil.isNotEmpty(variableAccessInEcuInstanceRef.getTargetVariableAccessRef())) {
            
            return new TargetVariableAccessRefWrapper(variableAccessInEcuInstanceRef.getTargetVariableAccessRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
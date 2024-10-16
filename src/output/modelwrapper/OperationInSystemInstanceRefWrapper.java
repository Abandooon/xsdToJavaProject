package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class OperationInSystemInstanceRefWrapper {

    
    private OperationInSystemInstanceRef operationInSystemInstanceRef;

    public OperationInSystemInstanceRefWrapper(OperationInSystemInstanceRef operationInSystemInstanceRef) {
        this.operationInSystemInstanceRef = operationInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getS())) {
            
            return operationInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getT())) {
            
            return operationInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextCompositionRefWrapper getContextCompositionRef() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getContextCompositionRef())) {
            
            return new ContextCompositionRefWrapper(operationInSystemInstanceRef.getContextCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = operationInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortRefWrapper getContextPortRef() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getContextPortRef())) {
            
            return new ContextPortRefWrapper(operationInSystemInstanceRef.getContextPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetOperationRefWrapper getTargetOperationRef() {
        
        if (CollUtil.isNotEmpty(operationInSystemInstanceRef.getTargetOperationRef())) {
            
            return new TargetOperationRefWrapper(operationInSystemInstanceRef.getTargetOperationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class OperationArgumentInComponentInstanceRefWrapper {

    
    private OperationArgumentInComponentInstanceRef operationArgumentInComponentInstanceRef;

    public OperationArgumentInComponentInstanceRefWrapper(OperationArgumentInComponentInstanceRef operationArgumentInComponentInstanceRef) {
        this.operationArgumentInComponentInstanceRef = operationArgumentInComponentInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getS())) {
            
            return operationArgumentInComponentInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getT())) {
            
            return operationArgumentInComponentInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public BaseRefWrapper getBaseRef() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getBaseRef())) {
            
            return new BaseRefWrapper(operationArgumentInComponentInstanceRef.getBaseRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = operationArgumentInComponentInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortPrototypeRefWrapper getContextPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getContextPortPrototypeRef())) {
            
            return new ContextPortPrototypeRefWrapper(operationArgumentInComponentInstanceRef.getContextPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ContextOperationRefWrapper getContextOperationRef() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getContextOperationRef())) {
            
            return new ContextOperationRefWrapper(operationArgumentInComponentInstanceRef.getContextOperationRef());
            
        } else {
            return null;
        }
        
    }

    public RootArgumentDataPrototypeRefWrapper getRootArgumentDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getRootArgumentDataPrototypeRef())) {
            
            return new RootArgumentDataPrototypeRefWrapper(operationArgumentInComponentInstanceRef.getRootArgumentDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = operationArgumentInComponentInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(operationArgumentInComponentInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper(operationArgumentInComponentInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
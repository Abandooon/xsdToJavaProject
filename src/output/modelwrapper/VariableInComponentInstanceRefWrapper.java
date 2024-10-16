package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class VariableInComponentInstanceRefWrapper {

    
    private VariableInComponentInstanceRef variableInComponentInstanceRef;

    public VariableInComponentInstanceRefWrapper(VariableInComponentInstanceRef variableInComponentInstanceRef) {
        this.variableInComponentInstanceRef = variableInComponentInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getS())) {
            
            return variableInComponentInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getT())) {
            
            return variableInComponentInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = variableInComponentInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortPrototypeRefWrapper getContextPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getContextPortPrototypeRef())) {
            
            return new ContextPortPrototypeRefWrapper(variableInComponentInstanceRef.getContextPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public RootVariableDataPrototypeRefWrapper getRootVariableDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getRootVariableDataPrototypeRef())) {
            
            return new RootVariableDataPrototypeRefWrapper(variableInComponentInstanceRef.getRootVariableDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = variableInComponentInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataProtoypeRefWrapper getTargetDataProtoypeRef() {
        
        if (CollUtil.isNotEmpty(variableInComponentInstanceRef.getTargetDataProtoypeRef())) {
            
            return new TargetDataProtoypeRefWrapper(variableInComponentInstanceRef.getTargetDataProtoypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
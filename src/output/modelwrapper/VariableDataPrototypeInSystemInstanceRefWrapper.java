package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class VariableDataPrototypeInSystemInstanceRefWrapper {

    
    private VariableDataPrototypeInSystemInstanceRef variableDataPrototypeInSystemInstanceRef;

    public VariableDataPrototypeInSystemInstanceRefWrapper(VariableDataPrototypeInSystemInstanceRef variableDataPrototypeInSystemInstanceRef) {
        this.variableDataPrototypeInSystemInstanceRef = variableDataPrototypeInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getS())) {
            
            return variableDataPrototypeInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getT())) {
            
            return variableDataPrototypeInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = variableDataPrototypeInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextCompositionRefWrapper getContextCompositionRef() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getContextCompositionRef())) {
            
            return new ContextCompositionRefWrapper(variableDataPrototypeInSystemInstanceRef.getContextCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ContextPortRefWrapper getContextPortRef() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getContextPortRef())) {
            
            return new ContextPortRefWrapper(variableDataPrototypeInSystemInstanceRef.getContextPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInSystemInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRefWrapper(variableDataPrototypeInSystemInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
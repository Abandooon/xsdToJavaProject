package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class VariableInAtomicSwcTypeInstanceRefWrapper {

    
    private VariableInAtomicSwcTypeInstanceRef variableInAtomicSwcTypeInstanceRef;

    public VariableInAtomicSwcTypeInstanceRefWrapper(VariableInAtomicSwcTypeInstanceRef variableInAtomicSwcTypeInstanceRef) {
        this.variableInAtomicSwcTypeInstanceRef = variableInAtomicSwcTypeInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getS())) {
            
            return variableInAtomicSwcTypeInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getT())) {
            
            return variableInAtomicSwcTypeInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeRefWrapper getPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getPortPrototypeRef())) {
            
            return new PortPrototypeRefWrapper(variableInAtomicSwcTypeInstanceRef.getPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public RootVariableDataPrototypeRefWrapper getRootVariableDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getRootVariableDataPrototypeRef())) {
            
            return new RootVariableDataPrototypeRefWrapper(variableInAtomicSwcTypeInstanceRef.getRootVariableDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = variableInAtomicSwcTypeInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableInAtomicSwcTypeInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper(variableInAtomicSwcTypeInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
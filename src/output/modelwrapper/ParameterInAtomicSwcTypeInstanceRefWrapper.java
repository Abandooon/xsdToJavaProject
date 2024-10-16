package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ParameterInAtomicSwcTypeInstanceRefWrapper {

    
    private ParameterInAtomicSwcTypeInstanceRef parameterInAtomicSwcTypeInstanceRef;

    public ParameterInAtomicSwcTypeInstanceRefWrapper(ParameterInAtomicSwcTypeInstanceRef parameterInAtomicSwcTypeInstanceRef) {
        this.parameterInAtomicSwcTypeInstanceRef = parameterInAtomicSwcTypeInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getS())) {
            
            return parameterInAtomicSwcTypeInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getT())) {
            
            return parameterInAtomicSwcTypeInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeRefWrapper getPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getPortPrototypeRef())) {
            
            return new PortPrototypeRefWrapper(parameterInAtomicSwcTypeInstanceRef.getPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public RootParameterDataPrototypeRefWrapper getRootParameterDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getRootParameterDataPrototypeRef())) {
            
            return new RootParameterDataPrototypeRefWrapper(parameterInAtomicSwcTypeInstanceRef.getRootParameterDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = parameterInAtomicSwcTypeInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(parameterInAtomicSwcTypeInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper(parameterInAtomicSwcTypeInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
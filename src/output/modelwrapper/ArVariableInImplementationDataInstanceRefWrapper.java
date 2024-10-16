package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ArVariableInImplementationDataInstanceRefWrapper {

    
    private ArVariableInImplementationDataInstanceRef arVariableInImplementationDataInstanceRef;

    public ArVariableInImplementationDataInstanceRefWrapper(ArVariableInImplementationDataInstanceRef arVariableInImplementationDataInstanceRef) {
        this.arVariableInImplementationDataInstanceRef = arVariableInImplementationDataInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getS())) {
            
            return arVariableInImplementationDataInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getT())) {
            
            return arVariableInImplementationDataInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeRefWrapper getPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getPortPrototypeRef())) {
            
            return new PortPrototypeRefWrapper(arVariableInImplementationDataInstanceRef.getPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public RootVariableDataPrototypeRefWrapper getRootVariableDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getRootVariableDataPrototypeRef())) {
            
            return new RootVariableDataPrototypeRefWrapper(arVariableInImplementationDataInstanceRef.getRootVariableDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef> originalList = arVariableInImplementationDataInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(arVariableInImplementationDataInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRefWrapper(arVariableInImplementationDataInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DataPrototypeInSystemInstanceRefWrapper {

    
    private DataPrototypeInSystemInstanceRef dataPrototypeInSystemInstanceRef;

    public DataPrototypeInSystemInstanceRefWrapper(DataPrototypeInSystemInstanceRef dataPrototypeInSystemInstanceRef) {
        this.dataPrototypeInSystemInstanceRef = dataPrototypeInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getS())) {
            
            return dataPrototypeInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getT())) {
            
            return dataPrototypeInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRootCompositionRefWrapper getContextRootCompositionRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getContextRootCompositionRef())) {
            
            return new ContextRootCompositionRefWrapper(dataPrototypeInSystemInstanceRef.getContextRootCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = dataPrototypeInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortRefWrapper getContextPortRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getContextPortRef())) {
            
            return new ContextPortRefWrapper(dataPrototypeInSystemInstanceRef.getContextPortRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = dataPrototypeInSystemInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeInSystemInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRef_DataPrototypeInSystemInstanceRefWrapper(dataPrototypeInSystemInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ApplicationCompositeElementInPortInterfaceInstanceRefWrapper {

    
    private ApplicationCompositeElementInPortInterfaceInstanceRef applicationCompositeElementInPortInterfaceInstanceRef;

    public ApplicationCompositeElementInPortInterfaceInstanceRefWrapper(ApplicationCompositeElementInPortInterfaceInstanceRef applicationCompositeElementInPortInterfaceInstanceRef) {
        this.applicationCompositeElementInPortInterfaceInstanceRef = applicationCompositeElementInPortInterfaceInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationCompositeElementInPortInterfaceInstanceRef.getS())) {
            
            return applicationCompositeElementInPortInterfaceInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationCompositeElementInPortInterfaceInstanceRef.getT())) {
            
            return applicationCompositeElementInPortInterfaceInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public RootDataPrototypeRefWrapper getRootDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(applicationCompositeElementInPortInterfaceInstanceRef.getRootDataPrototypeRef())) {
            
            return new RootDataPrototypeRefWrapper(applicationCompositeElementInPortInterfaceInstanceRef.getRootDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextDataPrototypeRefWrapper> getContextDataPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(applicationCompositeElementInPortInterfaceInstanceRef.getContextDataPrototypeRefs())) {
            ArrayList<ContextDataPrototypeRef> originalList = applicationCompositeElementInPortInterfaceInstanceRef.getContextDataPrototypeRefs();
            ArrayList<ContextDataPrototypeRefWrapper> wrapperList = (ArrayList<ContextDataPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextDataPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeRefWrapper getTargetDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(applicationCompositeElementInPortInterfaceInstanceRef.getTargetDataPrototypeRef())) {
            
            return new TargetDataPrototypeRefWrapper(applicationCompositeElementInPortInterfaceInstanceRef.getTargetDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
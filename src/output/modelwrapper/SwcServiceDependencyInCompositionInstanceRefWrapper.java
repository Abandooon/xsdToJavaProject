package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SwcServiceDependencyInCompositionInstanceRefWrapper {

    
    private SwcServiceDependencyInCompositionInstanceRef swcServiceDependencyInCompositionInstanceRef;

    public SwcServiceDependencyInCompositionInstanceRefWrapper(SwcServiceDependencyInCompositionInstanceRef swcServiceDependencyInCompositionInstanceRef) {
        this.swcServiceDependencyInCompositionInstanceRef = swcServiceDependencyInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getS())) {
            
            return swcServiceDependencyInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getT())) {
            
            return swcServiceDependencyInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public BaseRef_SwcServiceDependencyInCompositionInstanceRefWrapper getBaseRef() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getBaseRef())) {
            
            return new BaseRef_SwcServiceDependencyInCompositionInstanceRefWrapper(swcServiceDependencyInCompositionInstanceRef.getBaseRef());
            
        } else {
            return null;
        }
        
    }

    public RootContextRefWrapper getRootContextRef() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getRootContextRef())) {
            
            return new RootContextRefWrapper(swcServiceDependencyInCompositionInstanceRef.getRootContextRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextSwComponentPrototypeRefWrapper> getContextSwComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getContextSwComponentPrototypeRefs())) {
            ArrayList<ContextSwComponentPrototypeRef> originalList = swcServiceDependencyInCompositionInstanceRef.getContextSwComponentPrototypeRefs();
            ArrayList<ContextSwComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextSwComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextSwComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetSwcServiceDependencyRefWrapper getTargetSwcServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(swcServiceDependencyInCompositionInstanceRef.getTargetSwcServiceDependencyRef())) {
            
            return new TargetSwcServiceDependencyRefWrapper(swcServiceDependencyInCompositionInstanceRef.getTargetSwcServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ComponentInSystemInstanceRefWrapper {

    
    private ComponentInSystemInstanceRef componentInSystemInstanceRef;

    public ComponentInSystemInstanceRefWrapper(ComponentInSystemInstanceRef componentInSystemInstanceRef) {
        this.componentInSystemInstanceRef = componentInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(componentInSystemInstanceRef.getS())) {
            
            return componentInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(componentInSystemInstanceRef.getT())) {
            
            return componentInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextCompositionRefWrapper getContextCompositionRef() {
        
        if (CollUtil.isNotEmpty(componentInSystemInstanceRef.getContextCompositionRef())) {
            
            return new ContextCompositionRefWrapper(componentInSystemInstanceRef.getContextCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(componentInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = componentInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetComponentRefWrapper getTargetComponentRef() {
        
        if (CollUtil.isNotEmpty(componentInSystemInstanceRef.getTargetComponentRef())) {
            
            return new TargetComponentRefWrapper(componentInSystemInstanceRef.getTargetComponentRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
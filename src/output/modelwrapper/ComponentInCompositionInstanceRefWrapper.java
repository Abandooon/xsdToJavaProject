package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ComponentInCompositionInstanceRefWrapper {

    
    private ComponentInCompositionInstanceRef componentInCompositionInstanceRef;

    public ComponentInCompositionInstanceRefWrapper(ComponentInCompositionInstanceRef componentInCompositionInstanceRef) {
        this.componentInCompositionInstanceRef = componentInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(componentInCompositionInstanceRef.getS())) {
            
            return componentInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(componentInCompositionInstanceRef.getT())) {
            
            return componentInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(componentInCompositionInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = componentInCompositionInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetComponentRefWrapper getTargetComponentRef() {
        
        if (CollUtil.isNotEmpty(componentInCompositionInstanceRef.getTargetComponentRef())) {
            
            return new TargetComponentRefWrapper(componentInCompositionInstanceRef.getTargetComponentRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
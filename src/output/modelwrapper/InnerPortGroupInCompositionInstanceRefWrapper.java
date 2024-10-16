package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class InnerPortGroupInCompositionInstanceRefWrapper {

    
    private InnerPortGroupInCompositionInstanceRef innerPortGroupInCompositionInstanceRef;

    public InnerPortGroupInCompositionInstanceRefWrapper(InnerPortGroupInCompositionInstanceRef innerPortGroupInCompositionInstanceRef) {
        this.innerPortGroupInCompositionInstanceRef = innerPortGroupInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(innerPortGroupInCompositionInstanceRef.getS())) {
            
            return innerPortGroupInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(innerPortGroupInCompositionInstanceRef.getT())) {
            
            return innerPortGroupInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRefWrapper> getContextRefs() {
        
        if (CollUtil.isNotEmpty(innerPortGroupInCompositionInstanceRef.getContextRefs())) {
            ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRef> originalList = innerPortGroupInCompositionInstanceRef.getContextRefs();
            ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRefWrapper> wrapperList = (ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new ContextRef_InnerPortGroupInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetRef_InnerPortGroupInCompositionInstanceRefWrapper getTargetRef() {
        
        if (CollUtil.isNotEmpty(innerPortGroupInCompositionInstanceRef.getTargetRef())) {
            
            return new TargetRef_InnerPortGroupInCompositionInstanceRefWrapper(innerPortGroupInCompositionInstanceRef.getTargetRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
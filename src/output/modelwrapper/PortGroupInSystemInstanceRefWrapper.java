package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class PortGroupInSystemInstanceRefWrapper {

    
    private PortGroupInSystemInstanceRef portGroupInSystemInstanceRef;

    public PortGroupInSystemInstanceRefWrapper(PortGroupInSystemInstanceRef portGroupInSystemInstanceRef) {
        this.portGroupInSystemInstanceRef = portGroupInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portGroupInSystemInstanceRef.getS())) {
            
            return portGroupInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portGroupInSystemInstanceRef.getT())) {
            
            return portGroupInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextCompositionRefWrapper getContextCompositionRef() {
        
        if (CollUtil.isNotEmpty(portGroupInSystemInstanceRef.getContextCompositionRef())) {
            
            return new ContextCompositionRefWrapper(portGroupInSystemInstanceRef.getContextCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(portGroupInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = portGroupInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetRef_InnerPortGroupInCompositionInstanceRefWrapper getTargetRef() {
        
        if (CollUtil.isNotEmpty(portGroupInSystemInstanceRef.getTargetRef())) {
            
            return new TargetRef_InnerPortGroupInCompositionInstanceRefWrapper(portGroupInSystemInstanceRef.getTargetRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
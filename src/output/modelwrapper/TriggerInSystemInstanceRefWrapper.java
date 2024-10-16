package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class TriggerInSystemInstanceRefWrapper {

    
    private TriggerInSystemInstanceRef triggerInSystemInstanceRef;

    public TriggerInSystemInstanceRefWrapper(TriggerInSystemInstanceRef triggerInSystemInstanceRef) {
        this.triggerInSystemInstanceRef = triggerInSystemInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getS())) {
            
            return triggerInSystemInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getT())) {
            
            return triggerInSystemInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextCompositionRefWrapper getContextCompositionRef() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getContextCompositionRef())) {
            
            return new ContextCompositionRefWrapper(triggerInSystemInstanceRef.getContextCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentRefWrapper> getContextComponentRefs() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getContextComponentRefs())) {
            ArrayList<ContextComponentRef> originalList = triggerInSystemInstanceRef.getContextComponentRefs();
            ArrayList<ContextComponentRefWrapper> wrapperList = (ArrayList<ContextComponentRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortRefWrapper getContextPortRef() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getContextPortRef())) {
            
            return new ContextPortRefWrapper(triggerInSystemInstanceRef.getContextPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetTriggerRefWrapper getTargetTriggerRef() {
        
        if (CollUtil.isNotEmpty(triggerInSystemInstanceRef.getTargetTriggerRef())) {
            
            return new TargetTriggerRefWrapper(triggerInSystemInstanceRef.getTargetTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class InstanceEventInCompositionInstanceRefWrapper {

    
    private InstanceEventInCompositionInstanceRef instanceEventInCompositionInstanceRef;

    public InstanceEventInCompositionInstanceRefWrapper(InstanceEventInCompositionInstanceRef instanceEventInCompositionInstanceRef) {
        this.instanceEventInCompositionInstanceRef = instanceEventInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(instanceEventInCompositionInstanceRef.getS())) {
            
            return instanceEventInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(instanceEventInCompositionInstanceRef.getT())) {
            
            return instanceEventInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextComponentPrototypeRefWrapper> getContextComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(instanceEventInCompositionInstanceRef.getContextComponentPrototypeRefs())) {
            ArrayList<ContextComponentPrototypeRef> originalList = instanceEventInCompositionInstanceRef.getContextComponentPrototypeRefs();
            ArrayList<ContextComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetEventRefWrapper getTargetEventRef() {
        
        if (CollUtil.isNotEmpty(instanceEventInCompositionInstanceRef.getTargetEventRef())) {
            
            return new TargetEventRefWrapper(instanceEventInCompositionInstanceRef.getTargetEventRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
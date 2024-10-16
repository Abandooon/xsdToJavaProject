package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RunnableEntityInCompositionInstanceRefWrapper {

    
    private RunnableEntityInCompositionInstanceRef runnableEntityInCompositionInstanceRef;

    public RunnableEntityInCompositionInstanceRefWrapper(RunnableEntityInCompositionInstanceRef runnableEntityInCompositionInstanceRef) {
        this.runnableEntityInCompositionInstanceRef = runnableEntityInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runnableEntityInCompositionInstanceRef.getS())) {
            
            return runnableEntityInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runnableEntityInCompositionInstanceRef.getT())) {
            
            return runnableEntityInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextSwComponentPrototypeRefWrapper> getContextSwComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(runnableEntityInCompositionInstanceRef.getContextSwComponentPrototypeRefs())) {
            ArrayList<ContextSwComponentPrototypeRef> originalList = runnableEntityInCompositionInstanceRef.getContextSwComponentPrototypeRefs();
            ArrayList<ContextSwComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextSwComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextSwComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetRunnableEntityRefWrapper getTargetRunnableEntityRef() {
        
        if (CollUtil.isNotEmpty(runnableEntityInCompositionInstanceRef.getTargetRunnableEntityRef())) {
            
            return new TargetRunnableEntityRefWrapper(runnableEntityInCompositionInstanceRef.getTargetRunnableEntityRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(runnableEntityInCompositionInstanceRef.getVariationPoint())) {
            
            return new VariationPointWrapper(runnableEntityInCompositionInstanceRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
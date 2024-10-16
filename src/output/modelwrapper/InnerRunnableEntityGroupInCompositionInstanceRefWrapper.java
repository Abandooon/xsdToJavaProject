package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class InnerRunnableEntityGroupInCompositionInstanceRefWrapper {

    
    private InnerRunnableEntityGroupInCompositionInstanceRef innerRunnableEntityGroupInCompositionInstanceRef;

    public InnerRunnableEntityGroupInCompositionInstanceRefWrapper(InnerRunnableEntityGroupInCompositionInstanceRef innerRunnableEntityGroupInCompositionInstanceRef) {
        this.innerRunnableEntityGroupInCompositionInstanceRef = innerRunnableEntityGroupInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(innerRunnableEntityGroupInCompositionInstanceRef.getS())) {
            
            return innerRunnableEntityGroupInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(innerRunnableEntityGroupInCompositionInstanceRef.getT())) {
            
            return innerRunnableEntityGroupInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextSwComponentPrototypeRefWrapper> getContextSwComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(innerRunnableEntityGroupInCompositionInstanceRef.getContextSwComponentPrototypeRefs())) {
            ArrayList<ContextSwComponentPrototypeRef> originalList = innerRunnableEntityGroupInCompositionInstanceRef.getContextSwComponentPrototypeRefs();
            ArrayList<ContextSwComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextSwComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextSwComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetRunnableEntityGroupRefWrapper getTargetRunnableEntityGroupRef() {
        
        if (CollUtil.isNotEmpty(innerRunnableEntityGroupInCompositionInstanceRef.getTargetRunnableEntityGroupRef())) {
            
            return new TargetRunnableEntityGroupRefWrapper(innerRunnableEntityGroupInCompositionInstanceRef.getTargetRunnableEntityGroupRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(innerRunnableEntityGroupInCompositionInstanceRef.getVariationPoint())) {
            
            return new VariationPointWrapper(innerRunnableEntityGroupInCompositionInstanceRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
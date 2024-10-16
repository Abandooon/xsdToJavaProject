package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class InnerDataPrototypeGroupInCompositionInstanceRefWrapper {

    
    private InnerDataPrototypeGroupInCompositionInstanceRef innerDataPrototypeGroupInCompositionInstanceRef;

    public InnerDataPrototypeGroupInCompositionInstanceRefWrapper(InnerDataPrototypeGroupInCompositionInstanceRef innerDataPrototypeGroupInCompositionInstanceRef) {
        this.innerDataPrototypeGroupInCompositionInstanceRef = innerDataPrototypeGroupInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(innerDataPrototypeGroupInCompositionInstanceRef.getS())) {
            
            return innerDataPrototypeGroupInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(innerDataPrototypeGroupInCompositionInstanceRef.getT())) {
            
            return innerDataPrototypeGroupInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextSwComponentPrototypeRefWrapper> getContextSwComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(innerDataPrototypeGroupInCompositionInstanceRef.getContextSwComponentPrototypeRefs())) {
            ArrayList<ContextSwComponentPrototypeRef> originalList = innerDataPrototypeGroupInCompositionInstanceRef.getContextSwComponentPrototypeRefs();
            ArrayList<ContextSwComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextSwComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextSwComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetDataPrototypeGroupRefWrapper getTargetDataPrototypeGroupRef() {
        
        if (CollUtil.isNotEmpty(innerDataPrototypeGroupInCompositionInstanceRef.getTargetDataPrototypeGroupRef())) {
            
            return new TargetDataPrototypeGroupRefWrapper(innerDataPrototypeGroupInCompositionInstanceRef.getTargetDataPrototypeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(innerDataPrototypeGroupInCompositionInstanceRef.getVariationPoint())) {
            
            return new VariationPointWrapper(innerDataPrototypeGroupInCompositionInstanceRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
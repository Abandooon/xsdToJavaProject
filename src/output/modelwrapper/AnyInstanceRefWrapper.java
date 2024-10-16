package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class AnyInstanceRefWrapper {

    
    private AnyInstanceRef anyInstanceRef;

    public AnyInstanceRefWrapper(AnyInstanceRef anyInstanceRef) {
        this.anyInstanceRef = anyInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(anyInstanceRef.getS())) {
            
            return anyInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(anyInstanceRef.getT())) {
            
            return anyInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextElementRefWrapper> getContextElementRefs() {
        
        if (CollUtil.isNotEmpty(anyInstanceRef.getContextElementRefs())) {
            ArrayList<ContextElementRef> originalList = anyInstanceRef.getContextElementRefs();
            ArrayList<ContextElementRefWrapper> wrapperList = (ArrayList<ContextElementRefWrapper>)originalList.stream()
                .map(item -> new ContextElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TargetRefWrapper getTargetRef() {
        
        if (CollUtil.isNotEmpty(anyInstanceRef.getTargetRef())) {
            
            return new TargetRefWrapper(anyInstanceRef.getTargetRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(anyInstanceRef.getVariationPoint())) {
            
            return new VariationPointWrapper(anyInstanceRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswAsynchronousServerCallResultPointWrapper {

    
    private BswAsynchronousServerCallResultPoint bswAsynchronousServerCallResultPoint;

    public BswAsynchronousServerCallResultPointWrapper(BswAsynchronousServerCallResultPoint bswAsynchronousServerCallResultPoint) {
        this.bswAsynchronousServerCallResultPoint = bswAsynchronousServerCallResultPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getS())) {
            
            return bswAsynchronousServerCallResultPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getT())) {
            
            return bswAsynchronousServerCallResultPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getShortName())) {
            
            return new IdentifierWrapper(bswAsynchronousServerCallResultPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswAsynchronousServerCallResultPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswAsynchronousServerCallResultPoint.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(bswAsynchronousServerCallResultPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPointWrapper getAsynchronousServerCallPointRef() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallResultPoint.getAsynchronousServerCallPointRef())) {
            
            return new AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPointWrapper(bswAsynchronousServerCallResultPoint.getAsynchronousServerCallPointRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
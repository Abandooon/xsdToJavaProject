package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswAsynchronousServerCallPointWrapper {

    
    private BswAsynchronousServerCallPoint bswAsynchronousServerCallPoint;

    public BswAsynchronousServerCallPointWrapper(BswAsynchronousServerCallPoint bswAsynchronousServerCallPoint) {
        this.bswAsynchronousServerCallPoint = bswAsynchronousServerCallPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getS())) {
            
            return bswAsynchronousServerCallPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getT())) {
            
            return bswAsynchronousServerCallPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getShortName())) {
            
            return new IdentifierWrapper(bswAsynchronousServerCallPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswAsynchronousServerCallPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswAsynchronousServerCallPoint.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(bswAsynchronousServerCallPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CalledEntryRef_BswSynchronousServerCallPointWrapper getCalledEntryRef() {
        
        if (CollUtil.isNotEmpty(bswAsynchronousServerCallPoint.getCalledEntryRef())) {
            
            return new CalledEntryRef_BswSynchronousServerCallPointWrapper(bswAsynchronousServerCallPoint.getCalledEntryRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
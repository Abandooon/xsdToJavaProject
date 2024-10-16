package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswSynchronousServerCallPointWrapper {

    
    private BswSynchronousServerCallPoint bswSynchronousServerCallPoint;

    public BswSynchronousServerCallPointWrapper(BswSynchronousServerCallPoint bswSynchronousServerCallPoint) {
        this.bswSynchronousServerCallPoint = bswSynchronousServerCallPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getS())) {
            
            return bswSynchronousServerCallPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getT())) {
            
            return bswSynchronousServerCallPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getShortName())) {
            
            return new IdentifierWrapper(bswSynchronousServerCallPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswSynchronousServerCallPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswSynchronousServerCallPoint.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(bswSynchronousServerCallPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CalledEntryRef_BswSynchronousServerCallPointWrapper getCalledEntryRef() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getCalledEntryRef())) {
            
            return new CalledEntryRef_BswSynchronousServerCallPointWrapper(bswSynchronousServerCallPoint.getCalledEntryRef());
            
        } else {
            return null;
        }
        
    }

    public CalledFromWithinExclusiveAreaRefWrapper getCalledFromWithinExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(bswSynchronousServerCallPoint.getCalledFromWithinExclusiveAreaRef())) {
            
            return new CalledFromWithinExclusiveAreaRefWrapper(bswSynchronousServerCallPoint.getCalledFromWithinExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
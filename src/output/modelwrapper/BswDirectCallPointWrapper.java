package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswDirectCallPointWrapper {

    
    private BswDirectCallPoint bswDirectCallPoint;

    public BswDirectCallPointWrapper(BswDirectCallPoint bswDirectCallPoint) {
        this.bswDirectCallPoint = bswDirectCallPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getS())) {
            
            return bswDirectCallPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getT())) {
            
            return bswDirectCallPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getShortName())) {
            
            return new IdentifierWrapper(bswDirectCallPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswDirectCallPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswDirectCallPoint.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(bswDirectCallPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CalledEntryRefWrapper getCalledEntryRef() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getCalledEntryRef())) {
            
            return new CalledEntryRefWrapper(bswDirectCallPoint.getCalledEntryRef());
            
        } else {
            return null;
        }
        
    }

    public CalledFromWithinExclusiveAreaRefWrapper getCalledFromWithinExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(bswDirectCallPoint.getCalledFromWithinExclusiveAreaRef())) {
            
            return new CalledFromWithinExclusiveAreaRefWrapper(bswDirectCallPoint.getCalledFromWithinExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ExclusiveAreaNestingOrderWrapper {

    
    private ExclusiveAreaNestingOrder exclusiveAreaNestingOrder;

    public ExclusiveAreaNestingOrderWrapper(ExclusiveAreaNestingOrder exclusiveAreaNestingOrder) {
        this.exclusiveAreaNestingOrder = exclusiveAreaNestingOrder;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getS())) {
            
            return exclusiveAreaNestingOrder.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getT())) {
            
            return exclusiveAreaNestingOrder.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getShortName())) {
            
            return new IdentifierWrapper(exclusiveAreaNestingOrder.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = exclusiveAreaNestingOrder.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaRefWrapper> getExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getExclusiveAreaRefs())) {
            ArrayList<ExclusiveAreaRef> originalList = exclusiveAreaNestingOrder.getExclusiveAreaRefs();
            ArrayList<ExclusiveAreaRefWrapper> wrapperList = (ArrayList<ExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(exclusiveAreaNestingOrder.getVariationPoint())) {
            
            return new VariationPointWrapper(exclusiveAreaNestingOrder.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswVariableAccessWrapper {

    
    private BswVariableAccess bswVariableAccess;

    public BswVariableAccessWrapper(BswVariableAccess bswVariableAccess) {
        this.bswVariableAccess = bswVariableAccess;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getS())) {
            
            return bswVariableAccess.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getT())) {
            
            return bswVariableAccess.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getShortName())) {
            
            return new IdentifierWrapper(bswVariableAccess.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswVariableAccess.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AccessedVariableRefWrapper getAccessedVariableRef() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getAccessedVariableRef())) {
            
            return new AccessedVariableRefWrapper(bswVariableAccess.getAccessedVariableRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextLimitationRefWrapper> getContextLimitationRefs() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getContextLimitationRefs())) {
            ArrayList<ContextLimitationRef> originalList = bswVariableAccess.getContextLimitationRefs();
            ArrayList<ContextLimitationRefWrapper> wrapperList = (ArrayList<ContextLimitationRefWrapper>)originalList.stream()
                .map(item -> new ContextLimitationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswVariableAccess.getVariationPoint())) {
            
            return new VariationPointWrapper(bswVariableAccess.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
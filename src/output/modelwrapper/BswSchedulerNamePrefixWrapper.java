package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class BswSchedulerNamePrefixWrapper {

    
    private BswSchedulerNamePrefix bswSchedulerNamePrefix;

    public BswSchedulerNamePrefixWrapper(BswSchedulerNamePrefix bswSchedulerNamePrefix) {
        this.bswSchedulerNamePrefix = bswSchedulerNamePrefix;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getS())) {
            
            return bswSchedulerNamePrefix.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getT())) {
            
            return bswSchedulerNamePrefix.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getShortName())) {
            
            return new IdentifierWrapper(bswSchedulerNamePrefix.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswSchedulerNamePrefix.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getSymbol())) {
            
            return new CIdentifierWrapper(bswSchedulerNamePrefix.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswSchedulerNamePrefix.getVariationPoint())) {
            
            return new VariationPointWrapper(bswSchedulerNamePrefix.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
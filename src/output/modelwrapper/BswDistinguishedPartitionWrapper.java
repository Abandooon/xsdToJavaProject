package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class BswDistinguishedPartitionWrapper {

    
    private BswDistinguishedPartition bswDistinguishedPartition;

    public BswDistinguishedPartitionWrapper(BswDistinguishedPartition bswDistinguishedPartition) {
        this.bswDistinguishedPartition = bswDistinguishedPartition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswDistinguishedPartition.getS())) {
            
            return bswDistinguishedPartition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswDistinguishedPartition.getT())) {
            
            return bswDistinguishedPartition.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswDistinguishedPartition.getShortName())) {
            
            return new IdentifierWrapper(bswDistinguishedPartition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswDistinguishedPartition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswDistinguishedPartition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswDistinguishedPartition.getVariationPoint())) {
            
            return new VariationPointWrapper(bswDistinguishedPartition.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
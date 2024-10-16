package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class BswModuleClientServerEntryWrapper {

    
    private BswModuleClientServerEntry bswModuleClientServerEntry;

    public BswModuleClientServerEntryWrapper(BswModuleClientServerEntry bswModuleClientServerEntry) {
        this.bswModuleClientServerEntry = bswModuleClientServerEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getS())) {
            
            return bswModuleClientServerEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getT())) {
            
            return bswModuleClientServerEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getShortName())) {
            
            return new IdentifierWrapper(bswModuleClientServerEntry.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModuleClientServerEntry.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EncapsulatedEntryRefWrapper getEncapsulatedEntryRef() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getEncapsulatedEntryRef())) {
            
            return new EncapsulatedEntryRefWrapper(bswModuleClientServerEntry.getEncapsulatedEntryRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsReentrant() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getIsReentrant())) {
            
            return new BooleanWrapper(bswModuleClientServerEntry.getIsReentrant());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsSynchronous() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getIsSynchronous())) {
            
            return new BooleanWrapper(bswModuleClientServerEntry.getIsSynchronous());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleClientServerEntry.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleClientServerEntry.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
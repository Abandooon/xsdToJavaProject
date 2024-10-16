package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SectionNamePrefixWrapper {

    
    private SectionNamePrefix sectionNamePrefix;

    public SectionNamePrefixWrapper(SectionNamePrefix sectionNamePrefix) {
        this.sectionNamePrefix = sectionNamePrefix;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getS())) {
            
            return sectionNamePrefix.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getT())) {
            
            return sectionNamePrefix.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getShortName())) {
            
            return new IdentifierWrapper(sectionNamePrefix.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = sectionNamePrefix.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getSymbol())) {
            
            return new CIdentifierWrapper(sectionNamePrefix.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public ImplementedInRefWrapper getImplementedInRef() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getImplementedInRef())) {
            
            return new ImplementedInRefWrapper(sectionNamePrefix.getImplementedInRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(sectionNamePrefix.getVariationPoint())) {
            
            return new VariationPointWrapper(sectionNamePrefix.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
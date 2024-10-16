package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SymbolPropsWrapper {

    
    private SymbolProps symbolProps;

    public SymbolPropsWrapper(SymbolProps symbolProps) {
        this.symbolProps = symbolProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(symbolProps.getS())) {
            
            return symbolProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(symbolProps.getT())) {
            
            return symbolProps.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(symbolProps.getShortName())) {
            
            return new IdentifierWrapper(symbolProps.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(symbolProps.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = symbolProps.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(symbolProps.getSymbol())) {
            
            return new CIdentifierWrapper(symbolProps.getSymbol());
            
        } else {
            return null;
        }
        
    }




    


    
}
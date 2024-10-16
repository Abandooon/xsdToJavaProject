package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SymbolicNamePropsWrapper {

    
    private SymbolicNameProps symbolicNameProps;

    public SymbolicNamePropsWrapper(SymbolicNameProps symbolicNameProps) {
        this.symbolicNameProps = symbolicNameProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(symbolicNameProps.getS())) {
            
            return symbolicNameProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(symbolicNameProps.getT())) {
            
            return symbolicNameProps.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(symbolicNameProps.getShortName())) {
            
            return new IdentifierWrapper(symbolicNameProps.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(symbolicNameProps.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = symbolicNameProps.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(symbolicNameProps.getSymbol())) {
            
            return new CIdentifierWrapper(symbolicNameProps.getSymbol());
            
        } else {
            return null;
        }
        
    }




    


    
}
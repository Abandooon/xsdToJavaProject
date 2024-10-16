package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TpConnectionIdentWrapper {

    
    private TpConnectionIdent tpConnectionIdent;

    public TpConnectionIdentWrapper(TpConnectionIdent tpConnectionIdent) {
        this.tpConnectionIdent = tpConnectionIdent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tpConnectionIdent.getS())) {
            
            return tpConnectionIdent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tpConnectionIdent.getT())) {
            
            return tpConnectionIdent.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tpConnectionIdent.getShortName())) {
            
            return new IdentifierWrapper(tpConnectionIdent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tpConnectionIdent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tpConnectionIdent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LinSlaveConfigIdentWrapper {

    
    private LinSlaveConfigIdent linSlaveConfigIdent;

    public LinSlaveConfigIdentWrapper(LinSlaveConfigIdent linSlaveConfigIdent) {
        this.linSlaveConfigIdent = linSlaveConfigIdent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linSlaveConfigIdent.getS())) {
            
            return linSlaveConfigIdent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linSlaveConfigIdent.getT())) {
            
            return linSlaveConfigIdent.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linSlaveConfigIdent.getShortName())) {
            
            return new IdentifierWrapper(linSlaveConfigIdent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linSlaveConfigIdent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linSlaveConfigIdent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MultilanguageLongNameWrapper {

    
    private MultilanguageLongName multilanguageLongName;

    public MultilanguageLongNameWrapper(MultilanguageLongName multilanguageLongName) {
        this.multilanguageLongName = multilanguageLongName;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multilanguageLongName.getS())) {
            
            return multilanguageLongName.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multilanguageLongName.getT())) {
            
            return multilanguageLongName.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LLongNameWrapper> getL4() {
        
        if (CollUtil.isNotEmpty(multilanguageLongName.getL4())) {
            ArrayList<LLongName> originalList = multilanguageLongName.getL4();
            ArrayList<LLongNameWrapper> wrapperList = (ArrayList<LLongNameWrapper>)originalList.stream()
                .map(item -> new LLongNameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
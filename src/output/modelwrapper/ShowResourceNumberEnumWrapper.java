package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceNumberEnumWrapper {

    
    private ShowResourceNumberEnum showResourceNumberEnum;

    public ShowResourceNumberEnumWrapper(ShowResourceNumberEnum showResourceNumberEnum) {
        this.showResourceNumberEnum = showResourceNumberEnum;
    }

   
    public ShowResourceNumberEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceNumberEnum.getValue())) {
            
            return showResourceNumberEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceNumberEnum.getS())) {
            
            return showResourceNumberEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceNumberEnum.getT())) {
            
            return showResourceNumberEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class UnlimitedIntegerWrapper {

    
    private UnlimitedInteger unlimitedInteger;

    public UnlimitedIntegerWrapper(UnlimitedInteger unlimitedInteger) {
        this.unlimitedInteger = unlimitedInteger;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(unlimitedInteger.getValue())) {
            
            return unlimitedInteger.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(unlimitedInteger.getS())) {
            
            return unlimitedInteger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(unlimitedInteger.getT())) {
            
            return unlimitedInteger.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
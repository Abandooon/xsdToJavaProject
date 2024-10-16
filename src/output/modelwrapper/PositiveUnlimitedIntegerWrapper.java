package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PositiveUnlimitedIntegerWrapper {

    
    private PositiveUnlimitedInteger positiveUnlimitedInteger;

    public PositiveUnlimitedIntegerWrapper(PositiveUnlimitedInteger positiveUnlimitedInteger) {
        this.positiveUnlimitedInteger = positiveUnlimitedInteger;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(positiveUnlimitedInteger.getValue())) {
            
            return positiveUnlimitedInteger.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(positiveUnlimitedInteger.getS())) {
            
            return positiveUnlimitedInteger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(positiveUnlimitedInteger.getT())) {
            
            return positiveUnlimitedInteger.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
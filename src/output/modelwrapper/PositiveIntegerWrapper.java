package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PositiveIntegerWrapper {

    
    private PositiveInteger positiveInteger;

    public PositiveIntegerWrapper(PositiveInteger positiveInteger) {
        this.positiveInteger = positiveInteger;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(positiveInteger.getValue())) {
            
            return positiveInteger.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(positiveInteger.getS())) {
            
            return positiveInteger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(positiveInteger.getT())) {
            
            return positiveInteger.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
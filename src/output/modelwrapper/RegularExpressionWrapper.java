package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RegularExpressionWrapper {

    
    private RegularExpression regularExpression;

    public RegularExpressionWrapper(RegularExpression regularExpression) {
        this.regularExpression = regularExpression;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(regularExpression.getValue())) {
            
            return regularExpression.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(regularExpression.getS())) {
            
            return regularExpression.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(regularExpression.getT())) {
            
            return regularExpression.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CseCodeTypeStringWrapper {

    
    private CseCodeTypeString cseCodeTypeString;

    public CseCodeTypeStringWrapper(CseCodeTypeString cseCodeTypeString) {
        this.cseCodeTypeString = cseCodeTypeString;
    }

   
    public java.lang.Integer getValue() {
        
        if (CollUtil.isNotEmpty(cseCodeTypeString.getValue())) {
            
            return cseCodeTypeString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cseCodeTypeString.getS())) {
            
            return cseCodeTypeString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cseCodeTypeString.getT())) {
            
            return cseCodeTypeString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
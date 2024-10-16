package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwServiceReentranceEnumWrapper {

    
    private SwServiceReentranceEnum swServiceReentranceEnum;

    public SwServiceReentranceEnumWrapper(SwServiceReentranceEnum swServiceReentranceEnum) {
        this.swServiceReentranceEnum = swServiceReentranceEnum;
    }

   
    public SwServiceReentranceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(swServiceReentranceEnum.getValue())) {
            
            return swServiceReentranceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swServiceReentranceEnum.getS())) {
            
            return swServiceReentranceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swServiceReentranceEnum.getT())) {
            
            return swServiceReentranceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
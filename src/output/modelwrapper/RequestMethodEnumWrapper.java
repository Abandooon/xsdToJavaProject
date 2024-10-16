package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RequestMethodEnumWrapper {

    
    private RequestMethodEnum requestMethodEnum;

    public RequestMethodEnumWrapper(RequestMethodEnum requestMethodEnum) {
        this.requestMethodEnum = requestMethodEnum;
    }

   
    public RequestMethodEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(requestMethodEnum.getValue())) {
            
            return requestMethodEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(requestMethodEnum.getS())) {
            
            return requestMethodEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(requestMethodEnum.getT())) {
            
            return requestMethodEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
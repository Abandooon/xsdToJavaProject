package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RequestResponseDelayWrapper {

    
    private RequestResponseDelay requestResponseDelay;

    public RequestResponseDelayWrapper(RequestResponseDelay requestResponseDelay) {
        this.requestResponseDelay = requestResponseDelay;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(requestResponseDelay.getS())) {
            
            return requestResponseDelay.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(requestResponseDelay.getT())) {
            
            return requestResponseDelay.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMaxValue() {
        
        if (CollUtil.isNotEmpty(requestResponseDelay.getMaxValue())) {
            
            return new TimeValueWrapper(requestResponseDelay.getMaxValue());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinValue() {
        
        if (CollUtil.isNotEmpty(requestResponseDelay.getMinValue())) {
            
            return new TimeValueWrapper(requestResponseDelay.getMinValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
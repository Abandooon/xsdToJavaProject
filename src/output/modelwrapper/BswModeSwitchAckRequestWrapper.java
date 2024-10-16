package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BswModeSwitchAckRequestWrapper {

    
    private BswModeSwitchAckRequest bswModeSwitchAckRequest;

    public BswModeSwitchAckRequestWrapper(BswModeSwitchAckRequest bswModeSwitchAckRequest) {
        this.bswModeSwitchAckRequest = bswModeSwitchAckRequest;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchAckRequest.getS())) {
            
            return bswModeSwitchAckRequest.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchAckRequest.getT())) {
            
            return bswModeSwitchAckRequest.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(bswModeSwitchAckRequest.getTimeout())) {
            
            return new TimeValueWrapper(bswModeSwitchAckRequest.getTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}
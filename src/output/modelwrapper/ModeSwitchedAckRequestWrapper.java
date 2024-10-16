package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ModeSwitchedAckRequestWrapper {

    
    private ModeSwitchedAckRequest modeSwitchedAckRequest;

    public ModeSwitchedAckRequestWrapper(ModeSwitchedAckRequest modeSwitchedAckRequest) {
        this.modeSwitchedAckRequest = modeSwitchedAckRequest;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckRequest.getS())) {
            
            return modeSwitchedAckRequest.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckRequest.getT())) {
            
            return modeSwitchedAckRequest.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(modeSwitchedAckRequest.getTimeout())) {
            
            return new TimeValueWrapper(modeSwitchedAckRequest.getTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}
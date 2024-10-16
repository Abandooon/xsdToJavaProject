package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TransmissionAcknowledgementRequestWrapper {

    
    private TransmissionAcknowledgementRequest transmissionAcknowledgementRequest;

    public TransmissionAcknowledgementRequestWrapper(TransmissionAcknowledgementRequest transmissionAcknowledgementRequest) {
        this.transmissionAcknowledgementRequest = transmissionAcknowledgementRequest;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transmissionAcknowledgementRequest.getS())) {
            
            return transmissionAcknowledgementRequest.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transmissionAcknowledgementRequest.getT())) {
            
            return transmissionAcknowledgementRequest.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(transmissionAcknowledgementRequest.getTimeout())) {
            
            return new TimeValueWrapper(transmissionAcknowledgementRequest.getTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}
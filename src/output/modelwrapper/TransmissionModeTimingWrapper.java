package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TransmissionModeTimingWrapper {

    
    private TransmissionModeTiming transmissionModeTiming;

    public TransmissionModeTimingWrapper(TransmissionModeTiming transmissionModeTiming) {
        this.transmissionModeTiming = transmissionModeTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transmissionModeTiming.getS())) {
            
            return transmissionModeTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transmissionModeTiming.getT())) {
            
            return transmissionModeTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public CyclicTimingWrapper getCyclicTiming() {
        
        if (CollUtil.isNotEmpty(transmissionModeTiming.getCyclicTiming())) {
            
            return new CyclicTimingWrapper(transmissionModeTiming.getCyclicTiming());
            
        } else {
            return null;
        }
        
    }

    public EventControlledTimingWrapper getEventControlledTiming() {
        
        if (CollUtil.isNotEmpty(transmissionModeTiming.getEventControlledTiming())) {
            
            return new EventControlledTimingWrapper(transmissionModeTiming.getEventControlledTiming());
            
        } else {
            return null;
        }
        
    }




    


    
}
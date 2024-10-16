package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TimeSynchronizationWrapper {

    
    private TimeSynchronization timeSynchronization;

    public TimeSynchronizationWrapper(TimeSynchronization timeSynchronization) {
        this.timeSynchronization = timeSynchronization;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeSynchronization.getS())) {
            
            return timeSynchronization.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeSynchronization.getT())) {
            
            return timeSynchronization.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeSyncClientConfigurationWrapper getTimeSyncClient() {
        
        if (CollUtil.isNotEmpty(timeSynchronization.getTimeSyncClient())) {
            
            return new TimeSyncClientConfigurationWrapper(timeSynchronization.getTimeSyncClient());
            
        } else {
            return null;
        }
        
    }

    public TimeSyncServerConfigurationWrapper getTimeSyncServer() {
        
        if (CollUtil.isNotEmpty(timeSynchronization.getTimeSyncServer())) {
            
            return new TimeSyncServerConfigurationWrapper(timeSynchronization.getTimeSyncServer());
            
        } else {
            return null;
        }
        
    }




    


    
}
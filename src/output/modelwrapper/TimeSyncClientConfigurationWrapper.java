package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TimeSyncClientConfigurationWrapper {

    
    private TimeSyncClientConfiguration timeSyncClientConfiguration;

    public TimeSyncClientConfigurationWrapper(TimeSyncClientConfiguration timeSyncClientConfiguration) {
        this.timeSyncClientConfiguration = timeSyncClientConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeSyncClientConfiguration.getS())) {
            
            return timeSyncClientConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeSyncClientConfiguration.getT())) {
            
            return timeSyncClientConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<OrderedMasterWrapper> getOrderedMasterList() {
        
        if (CollUtil.isNotEmpty(timeSyncClientConfiguration.getOrderedMasterList())) {
            ArrayList<OrderedMaster> originalList = timeSyncClientConfiguration.getOrderedMasterList();
            ArrayList<OrderedMasterWrapper> wrapperList = (ArrayList<OrderedMasterWrapper>)originalList.stream()
                .map(item -> new OrderedMasterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeSyncTechnologyEnumWrapper getTimeSyncTechnology() {
        
        if (CollUtil.isNotEmpty(timeSyncClientConfiguration.getTimeSyncTechnology())) {
            
            return new TimeSyncTechnologyEnumWrapper(timeSyncClientConfiguration.getTimeSyncTechnology());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class TimeSyncServerConfigurationWrapper {

    
    private TimeSyncServerConfiguration timeSyncServerConfiguration;

    public TimeSyncServerConfigurationWrapper(TimeSyncServerConfiguration timeSyncServerConfiguration) {
        this.timeSyncServerConfiguration = timeSyncServerConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getS())) {
            
            return timeSyncServerConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getT())) {
            
            return timeSyncServerConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getShortName())) {
            
            return new IdentifierWrapper(timeSyncServerConfiguration.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = timeSyncServerConfiguration.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPriority() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getPriority())) {
            
            return new PositiveIntegerWrapper(timeSyncServerConfiguration.getPriority());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncInterval() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getSyncInterval())) {
            
            return new TimeValueWrapper(timeSyncServerConfiguration.getSyncInterval());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTimeSyncServerIdentifier() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getTimeSyncServerIdentifier())) {
            
            return new StringWrapper(timeSyncServerConfiguration.getTimeSyncServerIdentifier());
            
        } else {
            return null;
        }
        
    }

    public TimeSyncTechnologyEnumWrapper getTimeSyncTechnology() {
        
        if (CollUtil.isNotEmpty(timeSyncServerConfiguration.getTimeSyncTechnology())) {
            
            return new TimeSyncTechnologyEnumWrapper(timeSyncServerConfiguration.getTimeSyncTechnology());
            
        } else {
            return null;
        }
        
    }




    


    
}
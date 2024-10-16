package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class PhysicalChannelsWrapper {

    
    private PhysicalChannels physicalChannels;

    public PhysicalChannelsWrapper(PhysicalChannels physicalChannels) {
        this.physicalChannels = physicalChannels;
    }

   
    public ArrayList<CanPhysicalChannelWrapper> getCanPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getCanPhysicalChannel())) {
            ArrayList<CanPhysicalChannel> originalList = physicalChannels.getCanPhysicalChannel();
            ArrayList<CanPhysicalChannelWrapper> wrapperList = (ArrayList<CanPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new CanPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetPhysicalChannelWrapper> getEthernetPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getEthernetPhysicalChannel())) {
            ArrayList<EthernetPhysicalChannel> originalList = physicalChannels.getEthernetPhysicalChannel();
            ArrayList<EthernetPhysicalChannelWrapper> wrapperList = (ArrayList<EthernetPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new EthernetPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayPhysicalChannelWrapper> getFlexrayPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getFlexrayPhysicalChannel())) {
            ArrayList<FlexrayPhysicalChannel> originalList = physicalChannels.getFlexrayPhysicalChannel();
            ArrayList<FlexrayPhysicalChannelWrapper> wrapperList = (ArrayList<FlexrayPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new FlexrayPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinPhysicalChannelWrapper> getLinPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getLinPhysicalChannel())) {
            ArrayList<LinPhysicalChannel> originalList = physicalChannels.getLinPhysicalChannel();
            ArrayList<LinPhysicalChannelWrapper> wrapperList = (ArrayList<LinPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new LinPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanPhysicalChannelWrapper> getTtcanPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getTtcanPhysicalChannel())) {
            ArrayList<TtcanPhysicalChannel> originalList = physicalChannels.getTtcanPhysicalChannel();
            ArrayList<TtcanPhysicalChannelWrapper> wrapperList = (ArrayList<TtcanPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new TtcanPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedPhysicalChannelWrapper> getUserDefinedPhysicalChannel() {
        
        if (CollUtil.isNotEmpty(physicalChannels.getUserDefinedPhysicalChannel())) {
            ArrayList<UserDefinedPhysicalChannel> originalList = physicalChannels.getUserDefinedPhysicalChannel();
            ArrayList<UserDefinedPhysicalChannelWrapper> wrapperList = (ArrayList<UserDefinedPhysicalChannelWrapper>)originalList.stream()
                .map(item -> new UserDefinedPhysicalChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
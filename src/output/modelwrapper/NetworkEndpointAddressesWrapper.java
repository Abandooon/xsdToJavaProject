package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NetworkEndpointAddressesWrapper {

    
    private NetworkEndpointAddresses networkEndpointAddresses;

    public NetworkEndpointAddressesWrapper(NetworkEndpointAddresses networkEndpointAddresses) {
        this.networkEndpointAddresses = networkEndpointAddresses;
    }

   
    public ArrayList<Ipv4ConfigurationWrapper> getIpv4Configuration() {
        
        if (CollUtil.isNotEmpty(networkEndpointAddresses.getIpv4Configuration())) {
            ArrayList<Ipv4Configuration> originalList = networkEndpointAddresses.getIpv4Configuration();
            ArrayList<Ipv4ConfigurationWrapper> wrapperList = (ArrayList<Ipv4ConfigurationWrapper>)originalList.stream()
                .map(item -> new Ipv4ConfigurationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<Ipv6ConfigurationWrapper> getIpv6Configuration() {
        
        if (CollUtil.isNotEmpty(networkEndpointAddresses.getIpv6Configuration())) {
            ArrayList<Ipv6Configuration> originalList = networkEndpointAddresses.getIpv6Configuration();
            ArrayList<Ipv6ConfigurationWrapper> wrapperList = (ArrayList<Ipv6ConfigurationWrapper>)originalList.stream()
                .map(item -> new Ipv6ConfigurationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MacMulticastConfigurationWrapper> getMacMulticastConfiguration() {
        
        if (CollUtil.isNotEmpty(networkEndpointAddresses.getMacMulticastConfiguration())) {
            ArrayList<MacMulticastConfiguration> originalList = networkEndpointAddresses.getMacMulticastConfiguration();
            ArrayList<MacMulticastConfigurationWrapper> wrapperList = (ArrayList<MacMulticastConfigurationWrapper>)originalList.stream()
                .map(item -> new MacMulticastConfigurationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
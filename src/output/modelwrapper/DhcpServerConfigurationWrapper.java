package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DhcpServerConfigurationWrapper {

    
    private DhcpServerConfiguration dhcpServerConfiguration;

    public DhcpServerConfigurationWrapper(DhcpServerConfiguration dhcpServerConfiguration) {
        this.dhcpServerConfiguration = dhcpServerConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dhcpServerConfiguration.getS())) {
            
            return dhcpServerConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dhcpServerConfiguration.getT())) {
            
            return dhcpServerConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public Ipv4DhcpServerConfigurationWrapper getIpv4DhcpServerConfiguration() {
        
        if (CollUtil.isNotEmpty(dhcpServerConfiguration.getIpv4DhcpServerConfiguration())) {
            
            return new Ipv4DhcpServerConfigurationWrapper(dhcpServerConfiguration.getIpv4DhcpServerConfiguration());
            
        } else {
            return null;
        }
        
    }

    public Ipv6DhcpServerConfigurationWrapper getIpv6DhcpServerConfiguration() {
        
        if (CollUtil.isNotEmpty(dhcpServerConfiguration.getIpv6DhcpServerConfiguration())) {
            
            return new Ipv6DhcpServerConfigurationWrapper(dhcpServerConfiguration.getIpv6DhcpServerConfiguration());
            
        } else {
            return null;
        }
        
    }




    


    
}
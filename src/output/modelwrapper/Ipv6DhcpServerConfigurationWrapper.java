package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Ipv6DhcpServerConfigurationWrapper {

    
    private Ipv6DhcpServerConfiguration ipv6DhcpServerConfiguration;

    public Ipv6DhcpServerConfigurationWrapper(Ipv6DhcpServerConfiguration ipv6DhcpServerConfiguration) {
        this.ipv6DhcpServerConfiguration = ipv6DhcpServerConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getS())) {
            
            return ipv6DhcpServerConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getT())) {
            
            return ipv6DhcpServerConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ipv6DhcpServerConfiguration.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getCategory())) {
            
            return new CategoryStringWrapper(ipv6DhcpServerConfiguration.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ipv6DhcpServerConfiguration.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getAdminData())) {
            
            return new AdminDataWrapper(ipv6DhcpServerConfiguration.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getAddressRangeLowerBound() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getAddressRangeLowerBound())) {
            
            return new Ip6AddressStringWrapper(ipv6DhcpServerConfiguration.getAddressRangeLowerBound());
            
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getAddressRangeUpperBound() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getAddressRangeUpperBound())) {
            
            return new Ip6AddressStringWrapper(ipv6DhcpServerConfiguration.getAddressRangeUpperBound());
            
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getDefaultGateway() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getDefaultGateway())) {
            
            return new Ip6AddressStringWrapper(ipv6DhcpServerConfiguration.getDefaultGateway());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDefaultLeaseTime() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getDefaultLeaseTime())) {
            
            return new TimeValueWrapper(ipv6DhcpServerConfiguration.getDefaultLeaseTime());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Ip6AddressStringWrapper> getDnsServerAddresses() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getDnsServerAddresses())) {
            ArrayList<Ip6AddressString> originalList = ipv6DhcpServerConfiguration.getDnsServerAddresses();
            ArrayList<Ip6AddressStringWrapper> wrapperList = (ArrayList<Ip6AddressStringWrapper>)originalList.stream()
                .map(item -> new Ip6AddressStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getNetworkMask() {
        
        if (CollUtil.isNotEmpty(ipv6DhcpServerConfiguration.getNetworkMask())) {
            
            return new Ip6AddressStringWrapper(ipv6DhcpServerConfiguration.getNetworkMask());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Ipv4DhcpServerConfigurationWrapper {

    
    private Ipv4DhcpServerConfiguration ipv4DhcpServerConfiguration;

    public Ipv4DhcpServerConfigurationWrapper(Ipv4DhcpServerConfiguration ipv4DhcpServerConfiguration) {
        this.ipv4DhcpServerConfiguration = ipv4DhcpServerConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getS())) {
            
            return ipv4DhcpServerConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getT())) {
            
            return ipv4DhcpServerConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ipv4DhcpServerConfiguration.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getCategory())) {
            
            return new CategoryStringWrapper(ipv4DhcpServerConfiguration.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ipv4DhcpServerConfiguration.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getAdminData())) {
            
            return new AdminDataWrapper(ipv4DhcpServerConfiguration.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getAddressRangeLowerBound() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getAddressRangeLowerBound())) {
            
            return new Ip4AddressStringWrapper(ipv4DhcpServerConfiguration.getAddressRangeLowerBound());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getAddressRangeUpperBound() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getAddressRangeUpperBound())) {
            
            return new Ip4AddressStringWrapper(ipv4DhcpServerConfiguration.getAddressRangeUpperBound());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getDefaultGateway() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getDefaultGateway())) {
            
            return new Ip4AddressStringWrapper(ipv4DhcpServerConfiguration.getDefaultGateway());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDefaultLeaseTime() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getDefaultLeaseTime())) {
            
            return new TimeValueWrapper(ipv4DhcpServerConfiguration.getDefaultLeaseTime());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Ip4AddressStringWrapper> getDnsServerAddresses() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getDnsServerAddresses())) {
            ArrayList<Ip4AddressString> originalList = ipv4DhcpServerConfiguration.getDnsServerAddresses();
            ArrayList<Ip4AddressStringWrapper> wrapperList = (ArrayList<Ip4AddressStringWrapper>)originalList.stream()
                .map(item -> new Ip4AddressStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getNetworkMask() {
        
        if (CollUtil.isNotEmpty(ipv4DhcpServerConfiguration.getNetworkMask())) {
            
            return new Ip4AddressStringWrapper(ipv4DhcpServerConfiguration.getNetworkMask());
            
        } else {
            return null;
        }
        
    }




    


    
}
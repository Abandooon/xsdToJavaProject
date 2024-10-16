package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Ipv6ConfigurationWrapper {

    
    private Ipv6Configuration ipv6Configuration;

    public Ipv6ConfigurationWrapper(Ipv6Configuration ipv6Configuration) {
        this.ipv6Configuration = ipv6Configuration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getS())) {
            
            return ipv6Configuration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getT())) {
            
            return ipv6Configuration.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAssignmentPriority() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getAssignmentPriority())) {
            
            return new PositiveIntegerWrapper(ipv6Configuration.getAssignmentPriority());
            
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getDefaultRouter() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getDefaultRouter())) {
            
            return new Ip6AddressStringWrapper(ipv6Configuration.getDefaultRouter());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Ip6AddressStringWrapper> getDnsServerAddresses() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getDnsServerAddresses())) {
            ArrayList<Ip6AddressString> originalList = ipv6Configuration.getDnsServerAddresses();
            ArrayList<Ip6AddressStringWrapper> wrapperList = (ArrayList<Ip6AddressStringWrapper>)originalList.stream()
                .map(item -> new Ip6AddressStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getHopCount() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getHopCount())) {
            
            return new PositiveIntegerWrapper(ipv6Configuration.getHopCount());
            
        } else {
            return null;
        }
        
    }

    public IpAddressKeepEnumWrapper getIpAddressKeepBehavior() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getIpAddressKeepBehavior())) {
            
            return new IpAddressKeepEnumWrapper(ipv6Configuration.getIpAddressKeepBehavior());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIpAddressPrefixLength() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getIpAddressPrefixLength())) {
            
            return new PositiveIntegerWrapper(ipv6Configuration.getIpAddressPrefixLength());
            
        } else {
            return null;
        }
        
    }

    public Ip6AddressStringWrapper getIpv6Address() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getIpv6Address())) {
            
            return new Ip6AddressStringWrapper(ipv6Configuration.getIpv6Address());
            
        } else {
            return null;
        }
        
    }

    public Ipv6AddressSourceEnumWrapper getIpv6AddressSource() {
        
        if (CollUtil.isNotEmpty(ipv6Configuration.getIpv6AddressSource())) {
            
            return new Ipv6AddressSourceEnumWrapper(ipv6Configuration.getIpv6AddressSource());
            
        } else {
            return null;
        }
        
    }




    


    
}
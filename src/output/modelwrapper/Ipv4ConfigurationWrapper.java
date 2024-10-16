package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class Ipv4ConfigurationWrapper {

    
    private Ipv4Configuration ipv4Configuration;

    public Ipv4ConfigurationWrapper(Ipv4Configuration ipv4Configuration) {
        this.ipv4Configuration = ipv4Configuration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getS())) {
            
            return ipv4Configuration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getT())) {
            
            return ipv4Configuration.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAssignmentPriority() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getAssignmentPriority())) {
            
            return new PositiveIntegerWrapper(ipv4Configuration.getAssignmentPriority());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getDefaultGateway() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getDefaultGateway())) {
            
            return new Ip4AddressStringWrapper(ipv4Configuration.getDefaultGateway());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Ip4AddressStringWrapper> getDnsServerAddresses() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getDnsServerAddresses())) {
            ArrayList<Ip4AddressString> originalList = ipv4Configuration.getDnsServerAddresses();
            ArrayList<Ip4AddressStringWrapper> wrapperList = (ArrayList<Ip4AddressStringWrapper>)originalList.stream()
                .map(item -> new Ip4AddressStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IpAddressKeepEnumWrapper getIpAddressKeepBehavior() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getIpAddressKeepBehavior())) {
            
            return new IpAddressKeepEnumWrapper(ipv4Configuration.getIpAddressKeepBehavior());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getIpv4Address() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getIpv4Address())) {
            
            return new Ip4AddressStringWrapper(ipv4Configuration.getIpv4Address());
            
        } else {
            return null;
        }
        
    }

    public Ipv4AddressSourceEnumWrapper getIpv4AddressSource() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getIpv4AddressSource())) {
            
            return new Ipv4AddressSourceEnumWrapper(ipv4Configuration.getIpv4AddressSource());
            
        } else {
            return null;
        }
        
    }

    public Ip4AddressStringWrapper getNetworkMask() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getNetworkMask())) {
            
            return new Ip4AddressStringWrapper(ipv4Configuration.getNetworkMask());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTtl() {
        
        if (CollUtil.isNotEmpty(ipv4Configuration.getTtl())) {
            
            return new PositiveIntegerWrapper(ipv4Configuration.getTtl());
            
        } else {
            return null;
        }
        
    }




    


    
}
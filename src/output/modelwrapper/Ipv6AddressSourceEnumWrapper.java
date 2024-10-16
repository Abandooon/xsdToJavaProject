package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class Ipv6AddressSourceEnumWrapper {

    
    private Ipv6AddressSourceEnum ipv6AddressSourceEnum;

    public Ipv6AddressSourceEnumWrapper(Ipv6AddressSourceEnum ipv6AddressSourceEnum) {
        this.ipv6AddressSourceEnum = ipv6AddressSourceEnum;
    }

   
    public Ipv6AddressSourceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ipv6AddressSourceEnum.getValue())) {
            
            return ipv6AddressSourceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv6AddressSourceEnum.getS())) {
            
            return ipv6AddressSourceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv6AddressSourceEnum.getT())) {
            
            return ipv6AddressSourceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
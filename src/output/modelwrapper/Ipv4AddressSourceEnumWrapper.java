package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class Ipv4AddressSourceEnumWrapper {

    
    private Ipv4AddressSourceEnum ipv4AddressSourceEnum;

    public Ipv4AddressSourceEnumWrapper(Ipv4AddressSourceEnum ipv4AddressSourceEnum) {
        this.ipv4AddressSourceEnum = ipv4AddressSourceEnum;
    }

   
    public Ipv4AddressSourceEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ipv4AddressSourceEnum.getValue())) {
            
            return ipv4AddressSourceEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipv4AddressSourceEnum.getS())) {
            
            return ipv4AddressSourceEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipv4AddressSourceEnum.getT())) {
            
            return ipv4AddressSourceEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
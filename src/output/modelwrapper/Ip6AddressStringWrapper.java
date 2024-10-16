package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class Ip6AddressStringWrapper {

    
    private Ip6AddressString ip6AddressString;

    public Ip6AddressStringWrapper(Ip6AddressString ip6AddressString) {
        this.ip6AddressString = ip6AddressString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(ip6AddressString.getValue())) {
            
            return ip6AddressString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ip6AddressString.getS())) {
            
            return ip6AddressString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ip6AddressString.getT())) {
            
            return ip6AddressString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
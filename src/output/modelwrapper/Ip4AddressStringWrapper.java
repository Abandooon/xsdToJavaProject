package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class Ip4AddressStringWrapper {

    
    private Ip4AddressString ip4AddressString;

    public Ip4AddressStringWrapper(Ip4AddressString ip4AddressString) {
        this.ip4AddressString = ip4AddressString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(ip4AddressString.getValue())) {
            
            return ip4AddressString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ip4AddressString.getS())) {
            
            return ip4AddressString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ip4AddressString.getT())) {
            
            return ip4AddressString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
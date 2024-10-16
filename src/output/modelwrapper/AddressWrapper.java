package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AddressWrapper {

    
    private Address address;

    public AddressWrapper(Address address) {
        this.address = address;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(address.getValue())) {
            
            return address.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(address.getS())) {
            
            return address.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(address.getT())) {
            
            return address.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
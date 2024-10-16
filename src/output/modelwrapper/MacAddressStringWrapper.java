package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MacAddressStringWrapper {

    
    private MacAddressString macAddressString;

    public MacAddressStringWrapper(MacAddressString macAddressString) {
        this.macAddressString = macAddressString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(macAddressString.getValue())) {
            
            return macAddressString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(macAddressString.getS())) {
            
            return macAddressString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(macAddressString.getT())) {
            
            return macAddressString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
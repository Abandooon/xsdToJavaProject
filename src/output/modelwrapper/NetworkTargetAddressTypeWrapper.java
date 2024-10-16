package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NetworkTargetAddressTypeWrapper {

    
    private NetworkTargetAddressType networkTargetAddressType;

    public NetworkTargetAddressTypeWrapper(NetworkTargetAddressType networkTargetAddressType) {
        this.networkTargetAddressType = networkTargetAddressType;
    }

   
    public NetworkTargetAddressTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(networkTargetAddressType.getValue())) {
            
            return networkTargetAddressType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(networkTargetAddressType.getS())) {
            
            return networkTargetAddressType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(networkTargetAddressType.getT())) {
            
            return networkTargetAddressType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class IpAddressKeepEnumWrapper {

    
    private IpAddressKeepEnum ipAddressKeepEnum;

    public IpAddressKeepEnumWrapper(IpAddressKeepEnum ipAddressKeepEnum) {
        this.ipAddressKeepEnum = ipAddressKeepEnum;
    }

   
    public IpAddressKeepEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ipAddressKeepEnum.getValue())) {
            
            return ipAddressKeepEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ipAddressKeepEnum.getS())) {
            
            return ipAddressKeepEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ipAddressKeepEnum.getT())) {
            
            return ipAddressKeepEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
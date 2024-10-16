package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ServiceProviderEnumWrapper {

    
    private ServiceProviderEnum serviceProviderEnum;

    public ServiceProviderEnumWrapper(ServiceProviderEnum serviceProviderEnum) {
        this.serviceProviderEnum = serviceProviderEnum;
    }

   
    public ServiceProviderEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(serviceProviderEnum.getValue())) {
            
            return serviceProviderEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(serviceProviderEnum.getS())) {
            
            return serviceProviderEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(serviceProviderEnum.getT())) {
            
            return serviceProviderEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
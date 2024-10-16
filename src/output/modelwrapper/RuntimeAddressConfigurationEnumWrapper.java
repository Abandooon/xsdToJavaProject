package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RuntimeAddressConfigurationEnumWrapper {

    
    private RuntimeAddressConfigurationEnum runtimeAddressConfigurationEnum;

    public RuntimeAddressConfigurationEnumWrapper(RuntimeAddressConfigurationEnum runtimeAddressConfigurationEnum) {
        this.runtimeAddressConfigurationEnum = runtimeAddressConfigurationEnum;
    }

   
    public RuntimeAddressConfigurationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(runtimeAddressConfigurationEnum.getValue())) {
            
            return runtimeAddressConfigurationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runtimeAddressConfigurationEnum.getS())) {
            
            return runtimeAddressConfigurationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runtimeAddressConfigurationEnum.getT())) {
            
            return runtimeAddressConfigurationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
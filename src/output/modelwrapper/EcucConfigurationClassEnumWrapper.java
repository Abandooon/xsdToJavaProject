package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucConfigurationClassEnumWrapper {

    
    private EcucConfigurationClassEnum ecucConfigurationClassEnum;

    public EcucConfigurationClassEnumWrapper(EcucConfigurationClassEnum ecucConfigurationClassEnum) {
        this.ecucConfigurationClassEnum = ecucConfigurationClassEnum;
    }

   
    public EcucConfigurationClassEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassEnum.getValue())) {
            
            return ecucConfigurationClassEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassEnum.getS())) {
            
            return ecucConfigurationClassEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassEnum.getT())) {
            
            return ecucConfigurationClassEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
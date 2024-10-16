package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucConfigurationVariantEnumWrapper {

    
    private EcucConfigurationVariantEnum ecucConfigurationVariantEnum;

    public EcucConfigurationVariantEnumWrapper(EcucConfigurationVariantEnum ecucConfigurationVariantEnum) {
        this.ecucConfigurationVariantEnum = ecucConfigurationVariantEnum;
    }

   
    public EcucConfigurationVariantEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationVariantEnum.getValue())) {
            
            return ecucConfigurationVariantEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationVariantEnum.getS())) {
            
            return ecucConfigurationVariantEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationVariantEnum.getT())) {
            
            return ecucConfigurationVariantEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
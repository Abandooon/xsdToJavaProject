package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class EcucValueConfigurationClassWrapper {

    
    private EcucValueConfigurationClass ecucValueConfigurationClass;

    public EcucValueConfigurationClassWrapper(EcucValueConfigurationClass ecucValueConfigurationClass) {
        this.ecucValueConfigurationClass = ecucValueConfigurationClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucValueConfigurationClass.getS())) {
            
            return ecucValueConfigurationClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucValueConfigurationClass.getT())) {
            
            return ecucValueConfigurationClass.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassEnumWrapper getConfigClass() {
        
        if (CollUtil.isNotEmpty(ecucValueConfigurationClass.getConfigClass())) {
            
            return new EcucConfigurationClassEnumWrapper(ecucValueConfigurationClass.getConfigClass());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationVariantEnumWrapper getConfigVariant() {
        
        if (CollUtil.isNotEmpty(ecucValueConfigurationClass.getConfigVariant())) {
            
            return new EcucConfigurationVariantEnumWrapper(ecucValueConfigurationClass.getConfigVariant());
            
        } else {
            return null;
        }
        
    }




    


    
}
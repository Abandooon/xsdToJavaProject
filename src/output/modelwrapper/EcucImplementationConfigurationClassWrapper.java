package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class EcucImplementationConfigurationClassWrapper {

    
    private EcucImplementationConfigurationClass ecucImplementationConfigurationClass;

    public EcucImplementationConfigurationClassWrapper(EcucImplementationConfigurationClass ecucImplementationConfigurationClass) {
        this.ecucImplementationConfigurationClass = ecucImplementationConfigurationClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucImplementationConfigurationClass.getS())) {
            
            return ecucImplementationConfigurationClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucImplementationConfigurationClass.getT())) {
            
            return ecucImplementationConfigurationClass.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassEnumWrapper getConfigClass() {
        
        if (CollUtil.isNotEmpty(ecucImplementationConfigurationClass.getConfigClass())) {
            
            return new EcucConfigurationClassEnumWrapper(ecucImplementationConfigurationClass.getConfigClass());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationVariantEnumWrapper getConfigVariant() {
        
        if (CollUtil.isNotEmpty(ecucImplementationConfigurationClass.getConfigVariant())) {
            
            return new EcucConfigurationVariantEnumWrapper(ecucImplementationConfigurationClass.getConfigVariant());
            
        } else {
            return null;
        }
        
    }




    


    
}
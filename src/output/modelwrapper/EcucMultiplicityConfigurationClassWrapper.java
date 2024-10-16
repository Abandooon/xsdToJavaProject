package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class EcucMultiplicityConfigurationClassWrapper {

    
    private EcucMultiplicityConfigurationClass ecucMultiplicityConfigurationClass;

    public EcucMultiplicityConfigurationClassWrapper(EcucMultiplicityConfigurationClass ecucMultiplicityConfigurationClass) {
        this.ecucMultiplicityConfigurationClass = ecucMultiplicityConfigurationClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucMultiplicityConfigurationClass.getS())) {
            
            return ecucMultiplicityConfigurationClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucMultiplicityConfigurationClass.getT())) {
            
            return ecucMultiplicityConfigurationClass.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationClassEnumWrapper getConfigClass() {
        
        if (CollUtil.isNotEmpty(ecucMultiplicityConfigurationClass.getConfigClass())) {
            
            return new EcucConfigurationClassEnumWrapper(ecucMultiplicityConfigurationClass.getConfigClass());
            
        } else {
            return null;
        }
        
    }

    public EcucConfigurationVariantEnumWrapper getConfigVariant() {
        
        if (CollUtil.isNotEmpty(ecucMultiplicityConfigurationClass.getConfigVariant())) {
            
            return new EcucConfigurationVariantEnumWrapper(ecucMultiplicityConfigurationClass.getConfigVariant());
            
        } else {
            return null;
        }
        
    }




    


    
}
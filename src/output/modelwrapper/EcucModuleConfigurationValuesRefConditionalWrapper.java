package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class EcucModuleConfigurationValuesRefConditionalWrapper {

    
    private EcucModuleConfigurationValuesRefConditional ecucModuleConfigurationValuesRefConditional;

    public EcucModuleConfigurationValuesRefConditionalWrapper(EcucModuleConfigurationValuesRefConditional ecucModuleConfigurationValuesRefConditional) {
        this.ecucModuleConfigurationValuesRefConditional = ecucModuleConfigurationValuesRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValuesRefConditional.getS())) {
            
            return ecucModuleConfigurationValuesRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValuesRefConditional.getT())) {
            
            return ecucModuleConfigurationValuesRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucModuleConfigurationValuesRefWrapper getEcucModuleConfigurationValuesRef() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValuesRefConditional.getEcucModuleConfigurationValuesRef())) {
            
            return new EcucModuleConfigurationValuesRefWrapper(ecucModuleConfigurationValuesRefConditional.getEcucModuleConfigurationValuesRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValuesRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucModuleConfigurationValuesRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
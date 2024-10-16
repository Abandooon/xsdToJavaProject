package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class ModeSwitchReceiverComSpecWrapper {

    
    private ModeSwitchReceiverComSpec modeSwitchReceiverComSpec;

    public ModeSwitchReceiverComSpecWrapper(ModeSwitchReceiverComSpec modeSwitchReceiverComSpec) {
        this.modeSwitchReceiverComSpec = modeSwitchReceiverComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchReceiverComSpec.getS())) {
            
            return modeSwitchReceiverComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchReceiverComSpec.getT())) {
            
            return modeSwitchReceiverComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnhancedModeApi() {
        
        if (CollUtil.isNotEmpty(modeSwitchReceiverComSpec.getEnhancedModeApi())) {
            
            return new BooleanWrapper(modeSwitchReceiverComSpec.getEnhancedModeApi());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRefWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modeSwitchReceiverComSpec.getModeGroupRef())) {
            
            return new ModeGroupRefWrapper(modeSwitchReceiverComSpec.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSupportsAsynchronousModeSwitch() {
        
        if (CollUtil.isNotEmpty(modeSwitchReceiverComSpec.getSupportsAsynchronousModeSwitch())) {
            
            return new BooleanWrapper(modeSwitchReceiverComSpec.getSupportsAsynchronousModeSwitch());
            
        } else {
            return null;
        }
        
    }




    


    
}
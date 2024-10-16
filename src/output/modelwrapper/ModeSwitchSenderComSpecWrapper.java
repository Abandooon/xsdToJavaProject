package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class ModeSwitchSenderComSpecWrapper {

    
    private ModeSwitchSenderComSpec modeSwitchSenderComSpec;

    public ModeSwitchSenderComSpecWrapper(ModeSwitchSenderComSpec modeSwitchSenderComSpec) {
        this.modeSwitchSenderComSpec = modeSwitchSenderComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getS())) {
            
            return modeSwitchSenderComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getT())) {
            
            return modeSwitchSenderComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnhancedModeApi() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getEnhancedModeApi())) {
            
            return new BooleanWrapper(modeSwitchSenderComSpec.getEnhancedModeApi());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRefWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getModeGroupRef())) {
            
            return new ModeGroupRefWrapper(modeSwitchSenderComSpec.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ModeSwitchedAckRequestWrapper getModeSwitchedAck() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getModeSwitchedAck())) {
            
            return new ModeSwitchedAckRequestWrapper(modeSwitchSenderComSpec.getModeSwitchedAck());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getQueueLength() {
        
        if (CollUtil.isNotEmpty(modeSwitchSenderComSpec.getQueueLength())) {
            
            return new PositiveIntegerWrapper(modeSwitchSenderComSpec.getQueueLength());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class HardwareConfigurationWrapper {

    
    private HardwareConfiguration hardwareConfiguration;

    public HardwareConfigurationWrapper(HardwareConfiguration hardwareConfiguration) {
        this.hardwareConfiguration = hardwareConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hardwareConfiguration.getS())) {
            
            return hardwareConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hardwareConfiguration.getT())) {
            
            return hardwareConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAdditionalInformation() {
        
        if (CollUtil.isNotEmpty(hardwareConfiguration.getAdditionalInformation())) {
            
            return new StringWrapper(hardwareConfiguration.getAdditionalInformation());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProcessorMode() {
        
        if (CollUtil.isNotEmpty(hardwareConfiguration.getProcessorMode())) {
            
            return new StringWrapper(hardwareConfiguration.getProcessorMode());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProcessorSpeed() {
        
        if (CollUtil.isNotEmpty(hardwareConfiguration.getProcessorSpeed())) {
            
            return new StringWrapper(hardwareConfiguration.getProcessorSpeed());
            
        } else {
            return null;
        }
        
    }




    


    
}
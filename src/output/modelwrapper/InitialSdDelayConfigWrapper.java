package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class InitialSdDelayConfigWrapper {

    
    private InitialSdDelayConfig initialSdDelayConfig;

    public InitialSdDelayConfigWrapper(InitialSdDelayConfig initialSdDelayConfig) {
        this.initialSdDelayConfig = initialSdDelayConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getS())) {
            
            return initialSdDelayConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getT())) {
            
            return initialSdDelayConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getInitialDelayMaxValue() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getInitialDelayMaxValue())) {
            
            return new TimeValueWrapper(initialSdDelayConfig.getInitialDelayMaxValue());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getInitialDelayMinValue() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getInitialDelayMinValue())) {
            
            return new TimeValueWrapper(initialSdDelayConfig.getInitialDelayMinValue());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getInitialRepetitionsBaseDelay() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getInitialRepetitionsBaseDelay())) {
            
            return new TimeValueWrapper(initialSdDelayConfig.getInitialRepetitionsBaseDelay());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getInitialRepetitionsMax() {
        
        if (CollUtil.isNotEmpty(initialSdDelayConfig.getInitialRepetitionsMax())) {
            
            return new PositiveIntegerWrapper(initialSdDelayConfig.getInitialRepetitionsMax());
            
        } else {
            return null;
        }
        
    }




    


    
}
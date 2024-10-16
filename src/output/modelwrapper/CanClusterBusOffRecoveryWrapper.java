package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CanClusterBusOffRecoveryWrapper {

    
    private CanClusterBusOffRecovery canClusterBusOffRecovery;

    public CanClusterBusOffRecoveryWrapper(CanClusterBusOffRecovery canClusterBusOffRecovery) {
        this.canClusterBusOffRecovery = canClusterBusOffRecovery;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getS())) {
            
            return canClusterBusOffRecovery.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getT())) {
            
            return canClusterBusOffRecovery.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBorCounterL1ToL2() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getBorCounterL1ToL2())) {
            
            return new PositiveIntegerWrapper(canClusterBusOffRecovery.getBorCounterL1ToL2());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getBorTimeL1() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getBorTimeL1())) {
            
            return new TimeValueWrapper(canClusterBusOffRecovery.getBorTimeL1());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getBorTimeL2() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getBorTimeL2())) {
            
            return new TimeValueWrapper(canClusterBusOffRecovery.getBorTimeL2());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getBorTimeTxEnsured() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getBorTimeTxEnsured())) {
            
            return new TimeValueWrapper(canClusterBusOffRecovery.getBorTimeTxEnsured());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMainFunctionPeriod() {
        
        if (CollUtil.isNotEmpty(canClusterBusOffRecovery.getMainFunctionPeriod())) {
            
            return new TimeValueWrapper(canClusterBusOffRecovery.getMainFunctionPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
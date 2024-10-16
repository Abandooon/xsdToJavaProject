package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class CanClusterConditionalWrapper {

    
    private CanClusterConditional canClusterConditional;

    public CanClusterConditionalWrapper(CanClusterConditional canClusterConditional) {
        this.canClusterConditional = canClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getS())) {
            
            return canClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getT())) {
            
            return canClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(canClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(canClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getProtocolName())) {
            
            return new StringWrapper(canClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(canClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(canClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public CanClusterBusOffRecoveryWrapper getBusOffRecovery() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getBusOffRecovery())) {
            
            return new CanClusterBusOffRecoveryWrapper(canClusterConditional.getBusOffRecovery());
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getCanFdBaudrate() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getCanFdBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(canClusterConditional.getCanFdBaudrate());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(canClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
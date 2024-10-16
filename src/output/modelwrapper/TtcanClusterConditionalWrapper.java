package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class TtcanClusterConditionalWrapper {

    
    private TtcanClusterConditional ttcanClusterConditional;

    public TtcanClusterConditionalWrapper(TtcanClusterConditional ttcanClusterConditional) {
        this.ttcanClusterConditional = ttcanClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getS())) {
            
            return ttcanClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getT())) {
            
            return ttcanClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(ttcanClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(ttcanClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getProtocolName())) {
            
            return new StringWrapper(ttcanClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(ttcanClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(ttcanClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public CanClusterBusOffRecoveryWrapper getBusOffRecovery() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getBusOffRecovery())) {
            
            return new CanClusterBusOffRecoveryWrapper(ttcanClusterConditional.getBusOffRecovery());
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getCanFdBaudrate() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getCanFdBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(ttcanClusterConditional.getCanFdBaudrate());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getBasicCycleLength() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getBasicCycleLength())) {
            
            return new IntegerWrapper(ttcanClusterConditional.getBasicCycleLength());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNtu() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getNtu())) {
            
            return new TimeValueWrapper(ttcanClusterConditional.getNtu());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getOperationMode() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getOperationMode())) {
            
            return new BooleanWrapper(ttcanClusterConditional.getOperationMode());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ttcanClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ttcanClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
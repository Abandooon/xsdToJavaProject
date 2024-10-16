package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class J1939ClusterConditionalWrapper {

    
    private J1939ClusterConditional j1939ClusterConditional;

    public J1939ClusterConditionalWrapper(J1939ClusterConditional j1939ClusterConditional) {
        this.j1939ClusterConditional = j1939ClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getS())) {
            
            return j1939ClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getT())) {
            
            return j1939ClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(j1939ClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(j1939ClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getProtocolName())) {
            
            return new StringWrapper(j1939ClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(j1939ClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(j1939ClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public CanClusterBusOffRecoveryWrapper getBusOffRecovery() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getBusOffRecovery())) {
            
            return new CanClusterBusOffRecoveryWrapper(j1939ClusterConditional.getBusOffRecovery());
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getCanFdBaudrate() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getCanFdBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(j1939ClusterConditional.getCanFdBaudrate());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939ClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939ClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
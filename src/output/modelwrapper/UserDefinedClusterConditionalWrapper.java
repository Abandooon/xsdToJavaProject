package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class UserDefinedClusterConditionalWrapper {

    
    private UserDefinedClusterConditional userDefinedClusterConditional;

    public UserDefinedClusterConditionalWrapper(UserDefinedClusterConditional userDefinedClusterConditional) {
        this.userDefinedClusterConditional = userDefinedClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getS())) {
            
            return userDefinedClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getT())) {
            
            return userDefinedClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(userDefinedClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(userDefinedClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getProtocolName())) {
            
            return new StringWrapper(userDefinedClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(userDefinedClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(userDefinedClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
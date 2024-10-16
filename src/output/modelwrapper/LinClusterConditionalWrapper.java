package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class LinClusterConditionalWrapper {

    
    private LinClusterConditional linClusterConditional;

    public LinClusterConditionalWrapper(LinClusterConditional linClusterConditional) {
        this.linClusterConditional = linClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getS())) {
            
            return linClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getT())) {
            
            return linClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(linClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(linClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getProtocolName())) {
            
            return new StringWrapper(linClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(linClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(linClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(linClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
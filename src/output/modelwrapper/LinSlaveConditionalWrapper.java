package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    


public class LinSlaveConditionalWrapper {

    
    private LinSlaveConditional linSlaveConditional;

    public LinSlaveConditionalWrapper(LinSlaveConditional linSlaveConditional) {
        this.linSlaveConditional = linSlaveConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getS())) {
            
            return linSlaveConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getT())) {
            
            return linSlaveConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(linSlaveConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getProtocolVersion())) {
            
            return new StringWrapper(linSlaveConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getConfiguredNad() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getConfiguredNad())) {
            
            return new IntegerWrapper(linSlaveConditional.getConfiguredNad());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFunctionId() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getFunctionId())) {
            
            return new PositiveIntegerWrapper(linSlaveConditional.getFunctionId());
            
        } else {
            return null;
        }
        
    }

    public LinErrorResponseWrapper getLinErrorResponse() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getLinErrorResponse())) {
            
            return new LinErrorResponseWrapper(linSlaveConditional.getLinErrorResponse());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSupplierId() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getSupplierId())) {
            
            return new PositiveIntegerWrapper(linSlaveConditional.getSupplierId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVariantId() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getVariantId())) {
            
            return new PositiveIntegerWrapper(linSlaveConditional.getVariantId());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linSlaveConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(linSlaveConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
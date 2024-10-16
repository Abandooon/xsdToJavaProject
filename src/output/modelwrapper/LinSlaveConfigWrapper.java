package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class LinSlaveConfigWrapper {

    
    private LinSlaveConfig linSlaveConfig;

    public LinSlaveConfigWrapper(LinSlaveConfig linSlaveConfig) {
        this.linSlaveConfig = linSlaveConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getS())) {
            
            return linSlaveConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getT())) {
            
            return linSlaveConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getConfiguredNad() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getConfiguredNad())) {
            
            return new IntegerWrapper(linSlaveConfig.getConfiguredNad());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFunctionId() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getFunctionId())) {
            
            return new PositiveIntegerWrapper(linSlaveConfig.getFunctionId());
            
        } else {
            return null;
        }
        
    }

    public LinSlaveConfigIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getIdent())) {
            
            return new LinSlaveConfigIdentWrapper(linSlaveConfig.getIdent());
            
        } else {
            return null;
        }
        
    }

    public LinErrorResponseWrapper getLinErrorResponse() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getLinErrorResponse())) {
            
            return new LinErrorResponseWrapper(linSlaveConfig.getLinErrorResponse());
            
        } else {
            return null;
        }
        
    }

    public LinSlaveEcuRefWrapper getLinSlaveEcuRef() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getLinSlaveEcuRef())) {
            
            return new LinSlaveEcuRefWrapper(linSlaveConfig.getLinSlaveEcuRef());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getProtocolVersion())) {
            
            return new StringWrapper(linSlaveConfig.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSupplierId() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getSupplierId())) {
            
            return new PositiveIntegerWrapper(linSlaveConfig.getSupplierId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVariantId() {
        
        if (CollUtil.isNotEmpty(linSlaveConfig.getVariantId())) {
            
            return new PositiveIntegerWrapper(linSlaveConfig.getVariantId());
            
        } else {
            return null;
        }
        
    }




    


    
}
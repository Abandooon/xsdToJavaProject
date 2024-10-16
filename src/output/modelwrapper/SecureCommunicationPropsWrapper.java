package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class SecureCommunicationPropsWrapper {

    
    private SecureCommunicationProps secureCommunicationProps;

    public SecureCommunicationPropsWrapper(SecureCommunicationProps secureCommunicationProps) {
        this.secureCommunicationProps = secureCommunicationProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getS())) {
            
            return secureCommunicationProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getT())) {
            
            return secureCommunicationProps.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAuthAlgorithm() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getAuthAlgorithm())) {
            
            return new StringWrapper(secureCommunicationProps.getAuthAlgorithm());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAuthInfoTxLength() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getAuthInfoTxLength())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getAuthInfoTxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAuthenticationRetries() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getAuthenticationRetries())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getAuthenticationRetries());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataId() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getDataId())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getDataId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFreshnessCounterSyncAttempts() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getFreshnessCounterSyncAttempts())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getFreshnessCounterSyncAttempts());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFreshnessTimestampTimePeriodFactor() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getFreshnessTimestampTimePeriodFactor())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getFreshnessTimestampTimePeriodFactor());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFreshnessValueId() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getFreshnessValueId())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getFreshnessValueId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFreshnessValueLength() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getFreshnessValueLength())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getFreshnessValueLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFreshnessValueTxLength() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getFreshnessValueTxLength())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getFreshnessValueTxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecondaryFreshnessValueId() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getSecondaryFreshnessValueId())) {
            
            return new PositiveIntegerWrapper(secureCommunicationProps.getSecondaryFreshnessValueId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getUseFreshnessTimestamp() {
        
        if (CollUtil.isNotEmpty(secureCommunicationProps.getUseFreshnessTimestamp())) {
            
            return new BooleanWrapper(secureCommunicationProps.getUseFreshnessTimestamp());
            
        } else {
            return null;
        }
        
    }




    


    
}
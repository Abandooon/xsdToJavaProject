package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class NonqueuedReceiverComSpecWrapper {

    
    private NonqueuedReceiverComSpec nonqueuedReceiverComSpec;

    public NonqueuedReceiverComSpecWrapper(NonqueuedReceiverComSpec nonqueuedReceiverComSpec) {
        this.nonqueuedReceiverComSpec = nonqueuedReceiverComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getS())) {
            
            return nonqueuedReceiverComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getT())) {
            
            return nonqueuedReceiverComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CompositeNetworkRepresentationWrapper> getCompositeNetworkRepresentations() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getCompositeNetworkRepresentations())) {
            ArrayList<CompositeNetworkRepresentation> originalList = nonqueuedReceiverComSpec.getCompositeNetworkRepresentations();
            ArrayList<CompositeNetworkRepresentationWrapper> wrapperList = (ArrayList<CompositeNetworkRepresentationWrapper>)originalList.stream()
                .map(item -> new CompositeNetworkRepresentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(nonqueuedReceiverComSpec.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public ExternalReplacementRefWrapper getExternalReplacementRef() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getExternalReplacementRef())) {
            
            return new ExternalReplacementRefWrapper(nonqueuedReceiverComSpec.getExternalReplacementRef());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeEnumWrapper getHandleOutOfRange() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getHandleOutOfRange())) {
            
            return new HandleOutOfRangeEnumWrapper(nonqueuedReceiverComSpec.getHandleOutOfRange());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeStatusEnumWrapper getHandleOutOfRangeStatus() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getHandleOutOfRangeStatus())) {
            
            return new HandleOutOfRangeStatusEnumWrapper(nonqueuedReceiverComSpec.getHandleOutOfRangeStatus());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getMaxDeltaCounterInit() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getMaxDeltaCounterInit())) {
            
            return new PositiveIntegerValueVariationPointWrapper(nonqueuedReceiverComSpec.getMaxDeltaCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNoNewOrRepeatedData() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getMaxNoNewOrRepeatedData())) {
            
            return new PositiveIntegerWrapper(nonqueuedReceiverComSpec.getMaxNoNewOrRepeatedData());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentation() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getNetworkRepresentation())) {
            
            return new SwDataDefPropsWrapper(nonqueuedReceiverComSpec.getNetworkRepresentation());
            
        } else {
            return null;
        }
        
    }

    public VariableAccessWrapper getReplaceWith() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getReplaceWith())) {
            
            return new VariableAccessWrapper(nonqueuedReceiverComSpec.getReplaceWith());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncCounterInit() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getSyncCounterInit())) {
            
            return new PositiveIntegerWrapper(nonqueuedReceiverComSpec.getSyncCounterInit());
            
        } else {
            return null;
        }
        
    }

    public TransformationComSpecPropssWrapper getTransformationComSpecPropss() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getTransformationComSpecPropss())) {
            
            return new TransformationComSpecPropssWrapper(nonqueuedReceiverComSpec.getTransformationComSpecPropss());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUsesEndToEndProtection() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getUsesEndToEndProtection())) {
            
            return new BooleanValueVariationPointWrapper(nonqueuedReceiverComSpec.getUsesEndToEndProtection());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getAliveTimeout() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getAliveTimeout())) {
            
            return new TimeValueWrapper(nonqueuedReceiverComSpec.getAliveTimeout());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableUpdate() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getEnableUpdate())) {
            
            return new BooleanWrapper(nonqueuedReceiverComSpec.getEnableUpdate());
            
        } else {
            return null;
        }
        
    }

    public DataFilterWrapper getFilter() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getFilter())) {
            
            return new DataFilterWrapper(nonqueuedReceiverComSpec.getFilter());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getHandleDataStatus() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getHandleDataStatus())) {
            
            return new BooleanWrapper(nonqueuedReceiverComSpec.getHandleDataStatus());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getHandleNeverReceived() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getHandleNeverReceived())) {
            
            return new BooleanWrapper(nonqueuedReceiverComSpec.getHandleNeverReceived());
            
        } else {
            return null;
        }
        
    }

    public HandleTimeoutEnumWrapper getHandleTimeoutType() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getHandleTimeoutType())) {
            
            return new HandleTimeoutEnumWrapper(nonqueuedReceiverComSpec.getHandleTimeoutType());
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(nonqueuedReceiverComSpec.getInitValue())) {
            
            return new InitValueWrapper(nonqueuedReceiverComSpec.getInitValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
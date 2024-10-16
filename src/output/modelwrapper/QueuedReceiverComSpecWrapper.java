package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class QueuedReceiverComSpecWrapper {

    
    private QueuedReceiverComSpec queuedReceiverComSpec;

    public QueuedReceiverComSpecWrapper(QueuedReceiverComSpec queuedReceiverComSpec) {
        this.queuedReceiverComSpec = queuedReceiverComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getS())) {
            
            return queuedReceiverComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getT())) {
            
            return queuedReceiverComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CompositeNetworkRepresentationWrapper> getCompositeNetworkRepresentations() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getCompositeNetworkRepresentations())) {
            ArrayList<CompositeNetworkRepresentation> originalList = queuedReceiverComSpec.getCompositeNetworkRepresentations();
            ArrayList<CompositeNetworkRepresentationWrapper> wrapperList = (ArrayList<CompositeNetworkRepresentationWrapper>)originalList.stream()
                .map(item -> new CompositeNetworkRepresentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(queuedReceiverComSpec.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public ExternalReplacementRefWrapper getExternalReplacementRef() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getExternalReplacementRef())) {
            
            return new ExternalReplacementRefWrapper(queuedReceiverComSpec.getExternalReplacementRef());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeEnumWrapper getHandleOutOfRange() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getHandleOutOfRange())) {
            
            return new HandleOutOfRangeEnumWrapper(queuedReceiverComSpec.getHandleOutOfRange());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeStatusEnumWrapper getHandleOutOfRangeStatus() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getHandleOutOfRangeStatus())) {
            
            return new HandleOutOfRangeStatusEnumWrapper(queuedReceiverComSpec.getHandleOutOfRangeStatus());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getMaxDeltaCounterInit() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getMaxDeltaCounterInit())) {
            
            return new PositiveIntegerValueVariationPointWrapper(queuedReceiverComSpec.getMaxDeltaCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNoNewOrRepeatedData() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getMaxNoNewOrRepeatedData())) {
            
            return new PositiveIntegerWrapper(queuedReceiverComSpec.getMaxNoNewOrRepeatedData());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentation() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getNetworkRepresentation())) {
            
            return new SwDataDefPropsWrapper(queuedReceiverComSpec.getNetworkRepresentation());
            
        } else {
            return null;
        }
        
    }

    public VariableAccessWrapper getReplaceWith() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getReplaceWith())) {
            
            return new VariableAccessWrapper(queuedReceiverComSpec.getReplaceWith());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncCounterInit() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getSyncCounterInit())) {
            
            return new PositiveIntegerWrapper(queuedReceiverComSpec.getSyncCounterInit());
            
        } else {
            return null;
        }
        
    }

    public TransformationComSpecPropssWrapper getTransformationComSpecPropss() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getTransformationComSpecPropss())) {
            
            return new TransformationComSpecPropssWrapper(queuedReceiverComSpec.getTransformationComSpecPropss());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUsesEndToEndProtection() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getUsesEndToEndProtection())) {
            
            return new BooleanValueVariationPointWrapper(queuedReceiverComSpec.getUsesEndToEndProtection());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getQueueLength() {
        
        if (CollUtil.isNotEmpty(queuedReceiverComSpec.getQueueLength())) {
            
            return new PositiveIntegerWrapper(queuedReceiverComSpec.getQueueLength());
            
        } else {
            return null;
        }
        
    }




    


    
}
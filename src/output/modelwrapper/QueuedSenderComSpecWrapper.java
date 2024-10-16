package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class QueuedSenderComSpecWrapper {

    
    private QueuedSenderComSpec queuedSenderComSpec;

    public QueuedSenderComSpecWrapper(QueuedSenderComSpec queuedSenderComSpec) {
        this.queuedSenderComSpec = queuedSenderComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getS())) {
            
            return queuedSenderComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getT())) {
            
            return queuedSenderComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CompositeNetworkRepresentationWrapper> getCompositeNetworkRepresentations() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getCompositeNetworkRepresentations())) {
            ArrayList<CompositeNetworkRepresentation> originalList = queuedSenderComSpec.getCompositeNetworkRepresentations();
            ArrayList<CompositeNetworkRepresentationWrapper> wrapperList = (ArrayList<CompositeNetworkRepresentationWrapper>)originalList.stream()
                .map(item -> new CompositeNetworkRepresentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(queuedSenderComSpec.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeEnumWrapper getHandleOutOfRange() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getHandleOutOfRange())) {
            
            return new HandleOutOfRangeEnumWrapper(queuedSenderComSpec.getHandleOutOfRange());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentation() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getNetworkRepresentation())) {
            
            return new SwDataDefPropsWrapper(queuedSenderComSpec.getNetworkRepresentation());
            
        } else {
            return null;
        }
        
    }

    public TransmissionAcknowledgementRequestWrapper getTransmissionAcknowledge() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getTransmissionAcknowledge())) {
            
            return new TransmissionAcknowledgementRequestWrapper(queuedSenderComSpec.getTransmissionAcknowledge());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUsesEndToEndProtection() {
        
        if (CollUtil.isNotEmpty(queuedSenderComSpec.getUsesEndToEndProtection())) {
            
            return new BooleanValueVariationPointWrapper(queuedSenderComSpec.getUsesEndToEndProtection());
            
        } else {
            return null;
        }
        
    }




    


    
}
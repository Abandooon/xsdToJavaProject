package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class NonqueuedSenderComSpecWrapper {

    
    private NonqueuedSenderComSpec nonqueuedSenderComSpec;

    public NonqueuedSenderComSpecWrapper(NonqueuedSenderComSpec nonqueuedSenderComSpec) {
        this.nonqueuedSenderComSpec = nonqueuedSenderComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getS())) {
            
            return nonqueuedSenderComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getT())) {
            
            return nonqueuedSenderComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CompositeNetworkRepresentationWrapper> getCompositeNetworkRepresentations() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getCompositeNetworkRepresentations())) {
            ArrayList<CompositeNetworkRepresentation> originalList = nonqueuedSenderComSpec.getCompositeNetworkRepresentations();
            ArrayList<CompositeNetworkRepresentationWrapper> wrapperList = (ArrayList<CompositeNetworkRepresentationWrapper>)originalList.stream()
                .map(item -> new CompositeNetworkRepresentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(nonqueuedSenderComSpec.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public HandleOutOfRangeEnumWrapper getHandleOutOfRange() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getHandleOutOfRange())) {
            
            return new HandleOutOfRangeEnumWrapper(nonqueuedSenderComSpec.getHandleOutOfRange());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentation() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getNetworkRepresentation())) {
            
            return new SwDataDefPropsWrapper(nonqueuedSenderComSpec.getNetworkRepresentation());
            
        } else {
            return null;
        }
        
    }

    public TransmissionAcknowledgementRequestWrapper getTransmissionAcknowledge() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getTransmissionAcknowledge())) {
            
            return new TransmissionAcknowledgementRequestWrapper(nonqueuedSenderComSpec.getTransmissionAcknowledge());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getUsesEndToEndProtection() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getUsesEndToEndProtection())) {
            
            return new BooleanValueVariationPointWrapper(nonqueuedSenderComSpec.getUsesEndToEndProtection());
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(nonqueuedSenderComSpec.getInitValue())) {
            
            return new InitValueWrapper(nonqueuedSenderComSpec.getInitValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
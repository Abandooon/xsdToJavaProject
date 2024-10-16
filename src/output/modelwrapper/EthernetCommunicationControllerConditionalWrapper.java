package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class EthernetCommunicationControllerConditionalWrapper {

    
    private EthernetCommunicationControllerConditional ethernetCommunicationControllerConditional;

    public EthernetCommunicationControllerConditionalWrapper(EthernetCommunicationControllerConditional ethernetCommunicationControllerConditional) {
        this.ethernetCommunicationControllerConditional = ethernetCommunicationControllerConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getS())) {
            
            return ethernetCommunicationControllerConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getT())) {
            
            return ethernetCommunicationControllerConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(ethernetCommunicationControllerConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortWrapper> getCouplingPorts() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getCouplingPorts())) {
            ArrayList<CouplingPort> originalList = ethernetCommunicationControllerConditional.getCouplingPorts();
            ArrayList<CouplingPortWrapper> wrapperList = (ArrayList<CouplingPortWrapper>)originalList.stream()
                .map(item -> new CouplingPortWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MacAddressStringWrapper getMacUnicastAddress() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getMacUnicastAddress())) {
            
            return new MacAddressStringWrapper(ethernetCommunicationControllerConditional.getMacUnicastAddress());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaximumReceiveBufferLength() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getMaximumReceiveBufferLength())) {
            
            return new IntegerWrapper(ethernetCommunicationControllerConditional.getMaximumReceiveBufferLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaximumTransmissionUnit() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getMaximumTransmissionUnit())) {
            
            return new PositiveIntegerWrapper(ethernetCommunicationControllerConditional.getMaximumTransmissionUnit());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaximumTransmitBufferLength() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getMaximumTransmitBufferLength())) {
            
            return new IntegerWrapper(ethernetCommunicationControllerConditional.getMaximumTransmitBufferLength());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationControllerConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetCommunicationControllerConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
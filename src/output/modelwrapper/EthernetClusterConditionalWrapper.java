package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class EthernetClusterConditionalWrapper {

    
    private EthernetClusterConditional ethernetClusterConditional;

    public EthernetClusterConditionalWrapper(EthernetClusterConditional ethernetClusterConditional) {
        this.ethernetClusterConditional = ethernetClusterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getS())) {
            
            return ethernetClusterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getT())) {
            
            return ethernetClusterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getBaudrate() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getBaudrate())) {
            
            return new PositiveUnlimitedIntegerWrapper(ethernetClusterConditional.getBaudrate());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelsWrapper getPhysicalChannels() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getPhysicalChannels())) {
            
            return new PhysicalChannelsWrapper(ethernetClusterConditional.getPhysicalChannels());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolName() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getProtocolName())) {
            
            return new StringWrapper(ethernetClusterConditional.getProtocolName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getProtocolVersion())) {
            
            return new StringWrapper(ethernetClusterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSpeed() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getSpeed())) {
            
            return new IntegerWrapper(ethernetClusterConditional.getSpeed());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortConnectionWrapper> getCouplingPortConnections() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getCouplingPortConnections())) {
            ArrayList<CouplingPortConnection> originalList = ethernetClusterConditional.getCouplingPortConnections();
            ArrayList<CouplingPortConnectionWrapper> wrapperList = (ArrayList<CouplingPortConnectionWrapper>)originalList.stream()
                .map(item -> new CouplingPortConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MacMulticastGroupWrapper> getMacMulticastGroups() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getMacMulticastGroups())) {
            ArrayList<MacMulticastGroup> originalList = ethernetClusterConditional.getMacMulticastGroups();
            ArrayList<MacMulticastGroupWrapper> wrapperList = (ArrayList<MacMulticastGroupWrapper>)originalList.stream()
                .map(item -> new MacMulticastGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetClusterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetClusterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
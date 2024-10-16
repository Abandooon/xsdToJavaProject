package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CommunicationConnectorRefConditionalWrapper {

    
    private CommunicationConnectorRefConditional communicationConnectorRefConditional;

    public CommunicationConnectorRefConditionalWrapper(CommunicationConnectorRefConditional communicationConnectorRefConditional) {
        this.communicationConnectorRefConditional = communicationConnectorRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(communicationConnectorRefConditional.getS())) {
            
            return communicationConnectorRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(communicationConnectorRefConditional.getT())) {
            
            return communicationConnectorRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(communicationConnectorRefConditional.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(communicationConnectorRefConditional.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(communicationConnectorRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(communicationConnectorRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
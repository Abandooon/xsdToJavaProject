package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientIdRangeWrapper {

    
    private ClientIdRange clientIdRange;

    public ClientIdRangeWrapper(ClientIdRange clientIdRange) {
        this.clientIdRange = clientIdRange;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientIdRange.getS())) {
            
            return clientIdRange.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientIdRange.getT())) {
            
            return clientIdRange.getT();
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLowerLimit() {
        
        if (CollUtil.isNotEmpty(clientIdRange.getLowerLimit())) {
            
            return new LimitWrapper(clientIdRange.getLowerLimit());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getUpperLimit() {
        
        if (CollUtil.isNotEmpty(clientIdRange.getUpperLimit())) {
            
            return new LimitWrapper(clientIdRange.getUpperLimit());
            
        } else {
            return null;
        }
        
    }




    


    
}
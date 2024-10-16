package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class TpPortWrapper {

    
    private TpPort tpPort;

    public TpPortWrapper(TpPort tpPort) {
        this.tpPort = tpPort;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tpPort.getS())) {
            
            return tpPort.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tpPort.getT())) {
            
            return tpPort.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDynamicallyAssigned() {
        
        if (CollUtil.isNotEmpty(tpPort.getDynamicallyAssigned())) {
            
            return new BooleanWrapper(tpPort.getDynamicallyAssigned());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPortNumber() {
        
        if (CollUtil.isNotEmpty(tpPort.getPortNumber())) {
            
            return new PositiveIntegerWrapper(tpPort.getPortNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
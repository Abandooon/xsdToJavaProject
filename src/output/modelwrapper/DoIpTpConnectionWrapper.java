package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class DoIpTpConnectionWrapper {

    
    private DoIpTpConnection doIpTpConnection;

    public DoIpTpConnectionWrapper(DoIpTpConnection doIpTpConnection) {
        this.doIpTpConnection = doIpTpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getS())) {
            
            return doIpTpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getT())) {
            
            return doIpTpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(doIpTpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public DoIpSourceAddressRefWrapper getDoIpSourceAddressRef() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getDoIpSourceAddressRef())) {
            
            return new DoIpSourceAddressRefWrapper(doIpTpConnection.getDoIpSourceAddressRef());
            
        } else {
            return null;
        }
        
    }

    public DoIpTargetAddressRefWrapper getDoIpTargetAddressRef() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getDoIpTargetAddressRef())) {
            
            return new DoIpTargetAddressRefWrapper(doIpTpConnection.getDoIpTargetAddressRef());
            
        } else {
            return null;
        }
        
    }

    public TpSduRefWrapper getTpSduRef() {
        
        if (CollUtil.isNotEmpty(doIpTpConnection.getTpSduRef())) {
            
            return new TpSduRefWrapper(doIpTpConnection.getTpSduRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
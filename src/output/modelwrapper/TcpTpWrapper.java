package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class TcpTpWrapper {

    
    private TcpTp tcpTp;

    public TcpTpWrapper(TcpTp tcpTp) {
        this.tcpTp = tcpTp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tcpTp.getS())) {
            
            return tcpTp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tcpTp.getT())) {
            
            return tcpTp.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getKeepAliveInterval() {
        
        if (CollUtil.isNotEmpty(tcpTp.getKeepAliveInterval())) {
            
            return new TimeValueWrapper(tcpTp.getKeepAliveInterval());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getKeepAliveProbesMax() {
        
        if (CollUtil.isNotEmpty(tcpTp.getKeepAliveProbesMax())) {
            
            return new PositiveIntegerWrapper(tcpTp.getKeepAliveProbesMax());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getKeepAliveTime() {
        
        if (CollUtil.isNotEmpty(tcpTp.getKeepAliveTime())) {
            
            return new TimeValueWrapper(tcpTp.getKeepAliveTime());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getKeepAlives() {
        
        if (CollUtil.isNotEmpty(tcpTp.getKeepAlives())) {
            
            return new BooleanWrapper(tcpTp.getKeepAlives());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNaglesAlgorithm() {
        
        if (CollUtil.isNotEmpty(tcpTp.getNaglesAlgorithm())) {
            
            return new BooleanWrapper(tcpTp.getNaglesAlgorithm());
            
        } else {
            return null;
        }
        
    }

    public TpPortWrapper getTcpTpPort() {
        
        if (CollUtil.isNotEmpty(tcpTp.getTcpTpPort())) {
            
            return new TpPortWrapper(tcpTp.getTcpTpPort());
            
        } else {
            return null;
        }
        
    }




    


    
}
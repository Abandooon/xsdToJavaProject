package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class TpConfigurationWrapper {

    
    private TpConfiguration tpConfiguration;

    public TpConfigurationWrapper(TpConfiguration tpConfiguration) {
        this.tpConfiguration = tpConfiguration;
    }

   
    public GenericTpWrapper getGenericTp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getGenericTp())) {
            
            return new GenericTpWrapper(tpConfiguration.getGenericTp());
            
        } else {
            return null;
        }
        
    }

    public HttpTpWrapper getHttpTp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getHttpTp())) {
            
            return new HttpTpWrapper(tpConfiguration.getHttpTp());
            
        } else {
            return null;
        }
        
    }

    public Ieee1722TpWrapper getIeee1722Tp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getIeee1722Tp())) {
            
            return new Ieee1722TpWrapper(tpConfiguration.getIeee1722Tp());
            
        } else {
            return null;
        }
        
    }

    public RtpTpWrapper getRtpTp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getRtpTp())) {
            
            return new RtpTpWrapper(tpConfiguration.getRtpTp());
            
        } else {
            return null;
        }
        
    }

    public TcpTpWrapper getTcpTp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getTcpTp())) {
            
            return new TcpTpWrapper(tpConfiguration.getTcpTp());
            
        } else {
            return null;
        }
        
    }

    public UdpTpWrapper getUdpTp() {
        
        if (CollUtil.isNotEmpty(tpConfiguration.getUdpTp())) {
            
            return new UdpTpWrapper(tpConfiguration.getUdpTp());
            
        } else {
            return null;
        }
        
    }




    


    
}
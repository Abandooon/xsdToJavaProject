package stdgui.data.model.modelwrapper;


    
    

    
    


public class TcpUdpConfigWrapper {

    
    private TcpUdpConfig tcpUdpConfig;

    public TcpUdpConfigWrapper(TcpUdpConfig tcpUdpConfig) {
        this.tcpUdpConfig = tcpUdpConfig;
    }

   
    public TcpTpWrapper getTcpTp() {
        
        if (CollUtil.isNotEmpty(tcpUdpConfig.getTcpTp())) {
            
            return new TcpTpWrapper(tcpUdpConfig.getTcpTp());
            
        } else {
            return null;
        }
        
    }

    public UdpTpWrapper getUdpTp() {
        
        if (CollUtil.isNotEmpty(tcpUdpConfig.getUdpTp())) {
            
            return new UdpTpWrapper(tcpUdpConfig.getUdpTp());
            
        } else {
            return null;
        }
        
    }




    


    
}
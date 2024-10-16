package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class UdpTpWrapper {

    
    private UdpTp udpTp;

    public UdpTpWrapper(UdpTp udpTp) {
        this.udpTp = udpTp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(udpTp.getS())) {
            
            return udpTp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(udpTp.getT())) {
            
            return udpTp.getT();
            
        } else {
            return null;
        }
        
    }

    public TpPortWrapper getUdpTpPort() {
        
        if (CollUtil.isNotEmpty(udpTp.getUdpTpPort())) {
            
            return new TpPortWrapper(udpTp.getUdpTpPort());
            
        } else {
            return null;
        }
        
    }




    


    
}
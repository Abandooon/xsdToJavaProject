package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RtpTpWrapper {

    
    private RtpTp rtpTp;

    public RtpTpWrapper(RtpTp rtpTp) {
        this.rtpTp = rtpTp;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rtpTp.getS())) {
            
            return rtpTp.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rtpTp.getT())) {
            
            return rtpTp.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSsrc() {
        
        if (CollUtil.isNotEmpty(rtpTp.getSsrc())) {
            
            return new PositiveIntegerWrapper(rtpTp.getSsrc());
            
        } else {
            return null;
        }
        
    }

    public TcpUdpConfigWrapper getTcpUdpConfig() {
        
        if (CollUtil.isNotEmpty(rtpTp.getTcpUdpConfig())) {
            
            return new TcpUdpConfigWrapper(rtpTp.getTcpUdpConfig());
            
        } else {
            return null;
        }
        
    }




    


    
}
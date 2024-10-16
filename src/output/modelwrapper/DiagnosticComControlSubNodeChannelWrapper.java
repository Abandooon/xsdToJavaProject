package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticComControlSubNodeChannelWrapper {

    
    private DiagnosticComControlSubNodeChannel diagnosticComControlSubNodeChannel;

    public DiagnosticComControlSubNodeChannelWrapper(DiagnosticComControlSubNodeChannel diagnosticComControlSubNodeChannel) {
        this.diagnosticComControlSubNodeChannel = diagnosticComControlSubNodeChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSubNodeChannel.getS())) {
            
            return diagnosticComControlSubNodeChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSubNodeChannel.getT())) {
            
            return diagnosticComControlSubNodeChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public SubNodeChannelRefWrapper getSubNodeChannelRef() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSubNodeChannel.getSubNodeChannelRef())) {
            
            return new SubNodeChannelRefWrapper(diagnosticComControlSubNodeChannel.getSubNodeChannelRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSubNodeNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSubNodeChannel.getSubNodeNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticComControlSubNodeChannel.getSubNodeNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
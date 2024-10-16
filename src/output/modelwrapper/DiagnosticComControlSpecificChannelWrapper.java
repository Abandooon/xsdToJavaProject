package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DiagnosticComControlSpecificChannelWrapper {

    
    private DiagnosticComControlSpecificChannel diagnosticComControlSpecificChannel;

    public DiagnosticComControlSpecificChannelWrapper(DiagnosticComControlSpecificChannel diagnosticComControlSpecificChannel) {
        this.diagnosticComControlSpecificChannel = diagnosticComControlSpecificChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSpecificChannel.getS())) {
            
            return diagnosticComControlSpecificChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSpecificChannel.getT())) {
            
            return diagnosticComControlSpecificChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public SpecificChannelRefWrapper getSpecificChannelRef() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSpecificChannel.getSpecificChannelRef())) {
            
            return new SpecificChannelRefWrapper(diagnosticComControlSpecificChannel.getSpecificChannelRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSubnetNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlSpecificChannel.getSubnetNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticComControlSpecificChannel.getSubnetNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticPeriodicRateWrapper {

    
    private DiagnosticPeriodicRate diagnosticPeriodicRate;

    public DiagnosticPeriodicRateWrapper(DiagnosticPeriodicRate diagnosticPeriodicRate) {
        this.diagnosticPeriodicRate = diagnosticPeriodicRate;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticPeriodicRate.getS())) {
            
            return diagnosticPeriodicRate.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticPeriodicRate.getT())) {
            
            return diagnosticPeriodicRate.getT();
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(diagnosticPeriodicRate.getPeriod())) {
            
            return new TimeValueWrapper(diagnosticPeriodicRate.getPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
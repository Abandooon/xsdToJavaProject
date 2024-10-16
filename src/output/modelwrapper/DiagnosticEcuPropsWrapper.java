package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticEcuPropsWrapper {

    
    private DiagnosticEcuProps diagnosticEcuProps;

    public DiagnosticEcuPropsWrapper(DiagnosticEcuProps diagnosticEcuProps) {
        this.diagnosticEcuProps = diagnosticEcuProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuProps.getS())) {
            
            return diagnosticEcuProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuProps.getT())) {
            
            return diagnosticEcuProps.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsObdRelevant() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuProps.getIsObdRelevant())) {
            
            return new BooleanWrapper(diagnosticEcuProps.getIsObdRelevant());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSendRespPendOnTransToBoot() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuProps.getSendRespPendOnTransToBoot())) {
            
            return new BooleanWrapper(diagnosticEcuProps.getSendRespPendOnTransToBoot());
            
        } else {
            return null;
        }
        
    }




    


    
}
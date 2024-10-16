package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticEventDisplacementStrategyEnumWrapper {

    
    private DiagnosticEventDisplacementStrategyEnum diagnosticEventDisplacementStrategyEnum;

    public DiagnosticEventDisplacementStrategyEnumWrapper(DiagnosticEventDisplacementStrategyEnum diagnosticEventDisplacementStrategyEnum) {
        this.diagnosticEventDisplacementStrategyEnum = diagnosticEventDisplacementStrategyEnum;
    }

   
    public DiagnosticEventDisplacementStrategyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(diagnosticEventDisplacementStrategyEnum.getValue())) {
            
            return diagnosticEventDisplacementStrategyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventDisplacementStrategyEnum.getS())) {
            
            return diagnosticEventDisplacementStrategyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventDisplacementStrategyEnum.getT())) {
            
            return diagnosticEventDisplacementStrategyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
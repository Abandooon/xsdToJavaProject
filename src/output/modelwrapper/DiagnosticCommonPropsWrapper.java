package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagnosticCommonPropsWrapper {

    
    private DiagnosticCommonProps diagnosticCommonProps;

    public DiagnosticCommonPropsWrapper(DiagnosticCommonProps diagnosticCommonProps) {
        this.diagnosticCommonProps = diagnosticCommonProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonProps.getS())) {
            
            return diagnosticCommonProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonProps.getT())) {
            
            return diagnosticCommonProps.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticCommonPropsConditionalWrapper> getDiagnosticCommonPropsVariants() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonProps.getDiagnosticCommonPropsVariants())) {
            ArrayList<DiagnosticCommonPropsConditional> originalList = diagnosticCommonProps.getDiagnosticCommonPropsVariants();
            ArrayList<DiagnosticCommonPropsConditionalWrapper> wrapperList = (ArrayList<DiagnosticCommonPropsConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticCommonPropsConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
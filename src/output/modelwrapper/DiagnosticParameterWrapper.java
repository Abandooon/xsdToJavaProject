package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class DiagnosticParameterWrapper {

    
    private DiagnosticParameter diagnosticParameter;

    public DiagnosticParameterWrapper(DiagnosticParameter diagnosticParameter) {
        this.diagnosticParameter = diagnosticParameter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticParameter.getS())) {
            
            return diagnosticParameter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticParameter.getT())) {
            
            return diagnosticParameter.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBitOffset() {
        
        if (CollUtil.isNotEmpty(diagnosticParameter.getBitOffset())) {
            
            return new PositiveIntegerWrapper(diagnosticParameter.getBitOffset());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDataElementWrapper> getDataElements() {
        
        if (CollUtil.isNotEmpty(diagnosticParameter.getDataElements())) {
            ArrayList<DiagnosticDataElement> originalList = diagnosticParameter.getDataElements();
            ArrayList<DiagnosticDataElementWrapper> wrapperList = (ArrayList<DiagnosticDataElementWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticParameter.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticParameter.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
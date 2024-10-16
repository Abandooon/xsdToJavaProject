package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticDebounceAlgorithmPropsWrapper {

    
    private DiagnosticDebounceAlgorithmProps diagnosticDebounceAlgorithmProps;

    public DiagnosticDebounceAlgorithmPropsWrapper(DiagnosticDebounceAlgorithmProps diagnosticDebounceAlgorithmProps) {
        this.diagnosticDebounceAlgorithmProps = diagnosticDebounceAlgorithmProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getS())) {
            
            return diagnosticDebounceAlgorithmProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getT())) {
            
            return diagnosticDebounceAlgorithmProps.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDebounceAlgorithmProps.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDebounceAlgorithmProps.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DebounceAlgorithmWrapper getDebounceAlgorithm() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getDebounceAlgorithm())) {
            
            return new DebounceAlgorithmWrapper(diagnosticDebounceAlgorithmProps.getDebounceAlgorithm());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticDebounceBehaviorEnumWrapper getDebounceBehavior() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getDebounceBehavior())) {
            
            return new DiagnosticDebounceBehaviorEnumWrapper(diagnosticDebounceAlgorithmProps.getDebounceBehavior());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDebounceCounterStorage() {
        
        if (CollUtil.isNotEmpty(diagnosticDebounceAlgorithmProps.getDebounceCounterStorage())) {
            
            return new BooleanWrapper(diagnosticDebounceAlgorithmProps.getDebounceCounterStorage());
            
        } else {
            return null;
        }
        
    }




    


    
}
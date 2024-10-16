package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticStopRoutineWrapper {

    
    private DiagnosticStopRoutine diagnosticStopRoutine;

    public DiagnosticStopRoutineWrapper(DiagnosticStopRoutine diagnosticStopRoutine) {
        this.diagnosticStopRoutine = diagnosticStopRoutine;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getS())) {
            
            return diagnosticStopRoutine.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getT())) {
            
            return diagnosticStopRoutine.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getUuid())) {
            
            return diagnosticStopRoutine.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStopRoutine.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStopRoutine.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStopRoutine.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStopRoutine.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStopRoutine.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStopRoutine.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStopRoutine.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStopRoutine.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getRequests() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getRequests())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticStopRoutine.getRequests();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getResponses() {
        
        if (CollUtil.isNotEmpty(diagnosticStopRoutine.getResponses())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticStopRoutine.getResponses();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
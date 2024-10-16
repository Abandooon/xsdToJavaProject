package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticStartRoutineWrapper {

    
    private DiagnosticStartRoutine diagnosticStartRoutine;

    public DiagnosticStartRoutineWrapper(DiagnosticStartRoutine diagnosticStartRoutine) {
        this.diagnosticStartRoutine = diagnosticStartRoutine;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getS())) {
            
            return diagnosticStartRoutine.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getT())) {
            
            return diagnosticStartRoutine.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getUuid())) {
            
            return diagnosticStartRoutine.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStartRoutine.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStartRoutine.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStartRoutine.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStartRoutine.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStartRoutine.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStartRoutine.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStartRoutine.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStartRoutine.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getRequests() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getRequests())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticStartRoutine.getRequests();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getResponses() {
        
        if (CollUtil.isNotEmpty(diagnosticStartRoutine.getResponses())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticStartRoutine.getResponses();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
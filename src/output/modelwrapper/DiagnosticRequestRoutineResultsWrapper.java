package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class DiagnosticRequestRoutineResultsWrapper {

    
    private DiagnosticRequestRoutineResults diagnosticRequestRoutineResults;

    public DiagnosticRequestRoutineResultsWrapper(DiagnosticRequestRoutineResults diagnosticRequestRoutineResults) {
        this.diagnosticRequestRoutineResults = diagnosticRequestRoutineResults;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getS())) {
            
            return diagnosticRequestRoutineResults.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getT())) {
            
            return diagnosticRequestRoutineResults.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getUuid())) {
            
            return diagnosticRequestRoutineResults.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestRoutineResults.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestRoutineResults.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestRoutineResults.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestRoutineResults.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestRoutineResults.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestRoutineResults.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestRoutineResults.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestRoutineResults.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getResponses() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestRoutineResults.getResponses())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticRequestRoutineResults.getResponses();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
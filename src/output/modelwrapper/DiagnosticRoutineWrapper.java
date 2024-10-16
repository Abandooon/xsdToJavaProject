package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticRoutineWrapper {

    
    private DiagnosticRoutine diagnosticRoutine;

    public DiagnosticRoutineWrapper(DiagnosticRoutine diagnosticRoutine) {
        this.diagnosticRoutine = diagnosticRoutine;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getS())) {
            
            return diagnosticRoutine.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getT())) {
            
            return diagnosticRoutine.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getUuid())) {
            
            return diagnosticRoutine.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRoutine.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRoutine.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRoutine.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRoutine.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRoutine.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRoutine.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRoutine.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRoutine.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRoutine.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getId() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getId())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticRoutine.getId());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticRequestRoutineResultsWrapper getRequestResult() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getRequestResult())) {
            
            return new DiagnosticRequestRoutineResultsWrapper(diagnosticRoutine.getRequestResult());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStartRoutineWrapper getStart() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getStart())) {
            
            return new DiagnosticStartRoutineWrapper(diagnosticRoutine.getStart());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStopRoutineWrapper getStop() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutine.getStop())) {
            
            return new DiagnosticStopRoutineWrapper(diagnosticRoutine.getStop());
            
        } else {
            return null;
        }
        
    }




    


    
}
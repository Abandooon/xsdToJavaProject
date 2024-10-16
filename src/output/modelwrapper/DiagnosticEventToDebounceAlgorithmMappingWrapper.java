package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventToDebounceAlgorithmMappingWrapper {

    
    private DiagnosticEventToDebounceAlgorithmMapping diagnosticEventToDebounceAlgorithmMapping;

    public DiagnosticEventToDebounceAlgorithmMappingWrapper(DiagnosticEventToDebounceAlgorithmMapping diagnosticEventToDebounceAlgorithmMapping) {
        this.diagnosticEventToDebounceAlgorithmMapping = diagnosticEventToDebounceAlgorithmMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getS())) {
            
            return diagnosticEventToDebounceAlgorithmMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getT())) {
            
            return diagnosticEventToDebounceAlgorithmMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getUuid())) {
            
            return diagnosticEventToDebounceAlgorithmMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventToDebounceAlgorithmMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventToDebounceAlgorithmMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventToDebounceAlgorithmMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventToDebounceAlgorithmMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventToDebounceAlgorithmMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventToDebounceAlgorithmMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventToDebounceAlgorithmMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventToDebounceAlgorithmMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventToDebounceAlgorithmMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DebounceAlgorithmRefWrapper getDebounceAlgorithmRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getDebounceAlgorithmRef())) {
            
            return new DebounceAlgorithmRefWrapper(diagnosticEventToDebounceAlgorithmMapping.getDebounceAlgorithmRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToDebounceAlgorithmMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventToDebounceAlgorithmMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
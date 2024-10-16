package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventToTroubleCodeUdsMappingWrapper {

    
    private DiagnosticEventToTroubleCodeUdsMapping diagnosticEventToTroubleCodeUdsMapping;

    public DiagnosticEventToTroubleCodeUdsMappingWrapper(DiagnosticEventToTroubleCodeUdsMapping diagnosticEventToTroubleCodeUdsMapping) {
        this.diagnosticEventToTroubleCodeUdsMapping = diagnosticEventToTroubleCodeUdsMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getS())) {
            
            return diagnosticEventToTroubleCodeUdsMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getT())) {
            
            return diagnosticEventToTroubleCodeUdsMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getUuid())) {
            
            return diagnosticEventToTroubleCodeUdsMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventToTroubleCodeUdsMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventToTroubleCodeUdsMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventToTroubleCodeUdsMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventToTroubleCodeUdsMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventToTroubleCodeUdsMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventToTroubleCodeUdsMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventToTroubleCodeUdsMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventToTroubleCodeUdsMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventToTroubleCodeUdsMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventToTroubleCodeUdsMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }

    public TroubleCodeUdsRefWrapper getTroubleCodeUdsRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToTroubleCodeUdsMapping.getTroubleCodeUdsRef())) {
            
            return new TroubleCodeUdsRefWrapper(diagnosticEventToTroubleCodeUdsMapping.getTroubleCodeUdsRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
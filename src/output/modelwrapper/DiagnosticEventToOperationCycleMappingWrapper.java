package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventToOperationCycleMappingWrapper {

    
    private DiagnosticEventToOperationCycleMapping diagnosticEventToOperationCycleMapping;

    public DiagnosticEventToOperationCycleMappingWrapper(DiagnosticEventToOperationCycleMapping diagnosticEventToOperationCycleMapping) {
        this.diagnosticEventToOperationCycleMapping = diagnosticEventToOperationCycleMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getS())) {
            
            return diagnosticEventToOperationCycleMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getT())) {
            
            return diagnosticEventToOperationCycleMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getUuid())) {
            
            return diagnosticEventToOperationCycleMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventToOperationCycleMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventToOperationCycleMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventToOperationCycleMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventToOperationCycleMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventToOperationCycleMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventToOperationCycleMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventToOperationCycleMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventToOperationCycleMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventToOperationCycleMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventToOperationCycleMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }

    public OperationCycleRefWrapper getOperationCycleRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToOperationCycleMapping.getOperationCycleRef())) {
            
            return new OperationCycleRefWrapper(diagnosticEventToOperationCycleMapping.getOperationCycleRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
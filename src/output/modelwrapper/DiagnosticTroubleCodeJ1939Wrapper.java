package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticTroubleCodeJ1939Wrapper {

    
    private DiagnosticTroubleCodeJ1939 diagnosticTroubleCodeJ1939;

    public DiagnosticTroubleCodeJ1939Wrapper(DiagnosticTroubleCodeJ1939 diagnosticTroubleCodeJ1939) {
        this.diagnosticTroubleCodeJ1939 = diagnosticTroubleCodeJ1939;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getS())) {
            
            return diagnosticTroubleCodeJ1939.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getT())) {
            
            return diagnosticTroubleCodeJ1939.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getUuid())) {
            
            return diagnosticTroubleCodeJ1939.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTroubleCodeJ1939.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTroubleCodeJ1939.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTroubleCodeJ1939.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTroubleCodeJ1939.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTroubleCodeJ1939.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTroubleCodeJ1939.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTroubleCodeJ1939.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTroubleCodeJ1939.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeJ1939.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getJ1939DtcValue() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeJ1939.getJ1939DtcValue())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticTroubleCodeJ1939.getJ1939DtcValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
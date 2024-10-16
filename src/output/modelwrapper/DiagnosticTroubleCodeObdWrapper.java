package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticTroubleCodeObdWrapper {

    
    private DiagnosticTroubleCodeObd diagnosticTroubleCodeObd;

    public DiagnosticTroubleCodeObdWrapper(DiagnosticTroubleCodeObd diagnosticTroubleCodeObd) {
        this.diagnosticTroubleCodeObd = diagnosticTroubleCodeObd;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getS())) {
            
            return diagnosticTroubleCodeObd.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getT())) {
            
            return diagnosticTroubleCodeObd.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getUuid())) {
            
            return diagnosticTroubleCodeObd.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTroubleCodeObd.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTroubleCodeObd.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTroubleCodeObd.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTroubleCodeObd.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTroubleCodeObd.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTroubleCodeObd.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTroubleCodeObd.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTroubleCodeObd.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeObd.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanValueVariationPointWrapper getConsiderPtoStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getConsiderPtoStatus())) {
            
            return new BooleanValueVariationPointWrapper(diagnosticTroubleCodeObd.getConsiderPtoStatus());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getEventObdReadinessGroup() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getEventObdReadinessGroup())) {
            
            return new NmtokenStringWrapper(diagnosticTroubleCodeObd.getEventObdReadinessGroup());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getObdDtcValue() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeObd.getObdDtcValue())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticTroubleCodeObd.getObdDtcValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
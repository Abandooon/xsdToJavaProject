package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticTroubleCodeUdsWrapper {

    
    private DiagnosticTroubleCodeUds diagnosticTroubleCodeUds;

    public DiagnosticTroubleCodeUdsWrapper(DiagnosticTroubleCodeUds diagnosticTroubleCodeUds) {
        this.diagnosticTroubleCodeUds = diagnosticTroubleCodeUds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getS())) {
            
            return diagnosticTroubleCodeUds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getT())) {
            
            return diagnosticTroubleCodeUds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getUuid())) {
            
            return diagnosticTroubleCodeUds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTroubleCodeUds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTroubleCodeUds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTroubleCodeUds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTroubleCodeUds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTroubleCodeUds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTroubleCodeUds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTroubleCodeUds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTroubleCodeUds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeUds.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DtcPropsRefWrapper getDtcPropsRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getDtcPropsRef())) {
            
            return new DtcPropsRefWrapper(diagnosticTroubleCodeUds.getDtcPropsRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getFunctionalUnit() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getFunctionalUnit())) {
            
            return new PositiveIntegerWrapper(diagnosticTroubleCodeUds.getFunctionalUnit());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticUdsSeverityEnumWrapper getSeverity() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getSeverity())) {
            
            return new DiagnosticUdsSeverityEnumWrapper(diagnosticTroubleCodeUds.getSeverity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUdsDtcValue() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeUds.getUdsDtcValue())) {
            
            return new PositiveIntegerWrapper(diagnosticTroubleCodeUds.getUdsDtcValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
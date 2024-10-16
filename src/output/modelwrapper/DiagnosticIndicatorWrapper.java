package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticIndicatorWrapper {

    
    private DiagnosticIndicator diagnosticIndicator;

    public DiagnosticIndicatorWrapper(DiagnosticIndicator diagnosticIndicator) {
        this.diagnosticIndicator = diagnosticIndicator;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getS())) {
            
            return diagnosticIndicator.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getT())) {
            
            return diagnosticIndicator.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getUuid())) {
            
            return diagnosticIndicator.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getShortName())) {
            
            return new IdentifierWrapper(diagnosticIndicator.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticIndicator.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticIndicator.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticIndicator.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticIndicator.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticIndicator.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticIndicator.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticIndicator.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticIndicator.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getHealingCycleCounterThreshold() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getHealingCycleCounterThreshold())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticIndicator.getHealingCycleCounterThreshold());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticIndicatorTypeEnumWrapper getType() {
        
        if (CollUtil.isNotEmpty(diagnosticIndicator.getType())) {
            
            return new DiagnosticIndicatorTypeEnumWrapper(diagnosticIndicator.getType());
            
        } else {
            return null;
        }
        
    }




    


    
}
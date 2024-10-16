package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticConnectedIndicatorWrapper {

    
    private DiagnosticConnectedIndicator diagnosticConnectedIndicator;

    public DiagnosticConnectedIndicatorWrapper(DiagnosticConnectedIndicator diagnosticConnectedIndicator) {
        this.diagnosticConnectedIndicator = diagnosticConnectedIndicator;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getS())) {
            
            return diagnosticConnectedIndicator.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getT())) {
            
            return diagnosticConnectedIndicator.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getUuid())) {
            
            return diagnosticConnectedIndicator.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getShortName())) {
            
            return new IdentifierWrapper(diagnosticConnectedIndicator.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticConnectedIndicator.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticConnectedIndicator.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticConnectedIndicator.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticConnectedIndicator.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticConnectedIndicator.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticConnectedIndicator.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticConnectedIndicator.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagnosticConnectedIndicatorBehaviorEnumWrapper getBehavior() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getBehavior())) {
            
            return new DiagnosticConnectedIndicatorBehaviorEnumWrapper(diagnosticConnectedIndicator.getBehavior());
            
        } else {
            return null;
        }
        
    }

    public HealingCycleRefWrapper getHealingCycleRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getHealingCycleRef())) {
            
            return new HealingCycleRefWrapper(diagnosticConnectedIndicator.getHealingCycleRef());
            
        } else {
            return null;
        }
        
    }

    public IndicatorRefWrapper getIndicatorRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getIndicatorRef())) {
            
            return new IndicatorRefWrapper(diagnosticConnectedIndicator.getIndicatorRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticConnectedIndicator.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticConnectedIndicator.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
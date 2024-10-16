package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticEventWrapper {

    
    private DiagnosticEvent diagnosticEvent;

    public DiagnosticEventWrapper(DiagnosticEvent diagnosticEvent) {
        this.diagnosticEvent = diagnosticEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getS())) {
            
            return diagnosticEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getT())) {
            
            return diagnosticEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getUuid())) {
            
            return diagnosticEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAgingAllowed() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getAgingAllowed())) {
            
            return new BooleanWrapper(diagnosticEvent.getAgingAllowed());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticClearEventBehaviorEnumWrapper getClearEventBehavior() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getClearEventBehavior())) {
            
            return new DiagnosticClearEventBehaviorEnumWrapper(diagnosticEvent.getClearEventBehavior());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticConnectedIndicatorWrapper> getConnectedIndicators() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getConnectedIndicators())) {
            ArrayList<DiagnosticConnectedIndicator> originalList = diagnosticEvent.getConnectedIndicators();
            ArrayList<DiagnosticConnectedIndicatorWrapper> wrapperList = (ArrayList<DiagnosticConnectedIndicatorWrapper>)originalList.stream()
                .map(item -> new DiagnosticConnectedIndicatorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagnosticEventClearAllowedEnumWrapper getEventClearAllowed() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getEventClearAllowed())) {
            
            return new DiagnosticEventClearAllowedEnumWrapper(diagnosticEvent.getEventClearAllowed());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getEventFailureCycleCounterThreshold() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getEventFailureCycleCounterThreshold())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticEvent.getEventFailureCycleCounterThreshold());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventKindEnumWrapper getEventKind() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getEventKind())) {
            
            return new DiagnosticEventKindEnumWrapper(diagnosticEvent.getEventKind());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPrestorageFreezeFrame() {
        
        if (CollUtil.isNotEmpty(diagnosticEvent.getPrestorageFreezeFrame())) {
            
            return new BooleanWrapper(diagnosticEvent.getPrestorageFreezeFrame());
            
        } else {
            return null;
        }
        
    }




    


    
}
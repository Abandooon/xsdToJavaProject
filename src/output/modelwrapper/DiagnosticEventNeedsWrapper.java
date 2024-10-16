package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticEventNeedsWrapper {

    
    private DiagnosticEventNeeds diagnosticEventNeeds;

    public DiagnosticEventNeedsWrapper(DiagnosticEventNeeds diagnosticEventNeeds) {
        this.diagnosticEventNeeds = diagnosticEventNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getS())) {
            
            return diagnosticEventNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getT())) {
            
            return diagnosticEventNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getUuid())) {
            
            return diagnosticEventNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticEventNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticEventNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticEventNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getConsiderPtoStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getConsiderPtoStatus())) {
            
            return new BooleanWrapper(diagnosticEventNeeds.getConsiderPtoStatus());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DeferringFidRefWrapper> getDeferringFidRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDeferringFidRefs())) {
            ArrayList<DeferringFidRef> originalList = diagnosticEventNeeds.getDeferringFidRefs();
            ArrayList<DeferringFidRefWrapper> wrapperList = (ArrayList<DeferringFidRefWrapper>)originalList.stream()
                .map(item -> new DeferringFidRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagEventDebounceAlgorithmWrapper getDiagEventDebounceAlgorithm() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDiagEventDebounceAlgorithm())) {
            
            return new DiagEventDebounceAlgorithmWrapper(diagnosticEventNeeds.getDiagEventDebounceAlgorithm());
            
        } else {
            return null;
        }
        
    }

    public DtcKindEnumWrapper getDtcKind() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDtcKind())) {
            
            return new DtcKindEnumWrapper(diagnosticEventNeeds.getDtcKind());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventNeeds.getDtcNumber());
            
        } else {
            return null;
        }
        
    }

    public InhibitingFidRefWrapper getInhibitingFidRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getInhibitingFidRef())) {
            
            return new InhibitingFidRefWrapper(diagnosticEventNeeds.getInhibitingFidRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<InhibitingSecondaryFidRefWrapper> getInhibitingSecondaryFidRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getInhibitingSecondaryFidRefs())) {
            ArrayList<InhibitingSecondaryFidRef> originalList = diagnosticEventNeeds.getInhibitingSecondaryFidRefs();
            ArrayList<InhibitingSecondaryFidRefWrapper> wrapperList = (ArrayList<InhibitingSecondaryFidRefWrapper>)originalList.stream()
                .map(item -> new InhibitingSecondaryFidRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getObdDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getObdDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventNeeds.getObdDtcNumber());
            
        } else {
            return null;
        }
        
    }

    public ReportBehaviorEnumWrapper getReportBehavior() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getReportBehavior())) {
            
            return new ReportBehaviorEnumWrapper(diagnosticEventNeeds.getReportBehavior());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUdsDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventNeeds.getUdsDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventNeeds.getUdsDtcNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
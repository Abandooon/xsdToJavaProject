package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticEventInfoNeedsWrapper {

    
    private DiagnosticEventInfoNeeds diagnosticEventInfoNeeds;

    public DiagnosticEventInfoNeedsWrapper(DiagnosticEventInfoNeeds diagnosticEventInfoNeeds) {
        this.diagnosticEventInfoNeeds = diagnosticEventInfoNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getS())) {
            
            return diagnosticEventInfoNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getT())) {
            
            return diagnosticEventInfoNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getUuid())) {
            
            return diagnosticEventInfoNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventInfoNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventInfoNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventInfoNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventInfoNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventInfoNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventInfoNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventInfoNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventInfoNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticEventInfoNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticEventInfoNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticEventInfoNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public DtcKindEnumWrapper getDtcKind() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getDtcKind())) {
            
            return new DtcKindEnumWrapper(diagnosticEventInfoNeeds.getDtcKind());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventInfoNeeds.getDtcNumber());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getObdDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getObdDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventInfoNeeds.getObdDtcNumber());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUdsDtcNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEventInfoNeeds.getUdsDtcNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEventInfoNeeds.getUdsDtcNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
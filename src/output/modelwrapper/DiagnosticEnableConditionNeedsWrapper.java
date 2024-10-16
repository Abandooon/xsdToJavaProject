package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticEnableConditionNeedsWrapper {

    
    private DiagnosticEnableConditionNeeds diagnosticEnableConditionNeeds;

    public DiagnosticEnableConditionNeedsWrapper(DiagnosticEnableConditionNeeds diagnosticEnableConditionNeeds) {
        this.diagnosticEnableConditionNeeds = diagnosticEnableConditionNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getS())) {
            
            return diagnosticEnableConditionNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getT())) {
            
            return diagnosticEnableConditionNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getUuid())) {
            
            return diagnosticEnableConditionNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEnableConditionNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEnableConditionNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEnableConditionNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEnableConditionNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEnableConditionNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEnableConditionNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEnableConditionNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEnableConditionNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticEnableConditionNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticEnableConditionNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticEnableConditionNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public EventAcceptanceStatusEnumWrapper getInitialStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionNeeds.getInitialStatus())) {
            
            return new EventAcceptanceStatusEnumWrapper(diagnosticEnableConditionNeeds.getInitialStatus());
            
        } else {
            return null;
        }
        
    }




    


    
}
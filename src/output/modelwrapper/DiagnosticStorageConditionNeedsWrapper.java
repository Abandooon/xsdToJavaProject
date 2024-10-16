package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticStorageConditionNeedsWrapper {

    
    private DiagnosticStorageConditionNeeds diagnosticStorageConditionNeeds;

    public DiagnosticStorageConditionNeedsWrapper(DiagnosticStorageConditionNeeds diagnosticStorageConditionNeeds) {
        this.diagnosticStorageConditionNeeds = diagnosticStorageConditionNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getS())) {
            
            return diagnosticStorageConditionNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getT())) {
            
            return diagnosticStorageConditionNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getUuid())) {
            
            return diagnosticStorageConditionNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStorageConditionNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStorageConditionNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStorageConditionNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStorageConditionNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStorageConditionNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStorageConditionNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStorageConditionNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStorageConditionNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticStorageConditionNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticStorageConditionNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticStorageConditionNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public StorageConditionStatusEnumWrapper getInitialStatus() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionNeeds.getInitialStatus())) {
            
            return new StorageConditionStatusEnumWrapper(diagnosticStorageConditionNeeds.getInitialStatus());
            
        } else {
            return null;
        }
        
    }




    


    
}
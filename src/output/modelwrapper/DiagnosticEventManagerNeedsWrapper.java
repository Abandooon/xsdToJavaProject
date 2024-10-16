package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventManagerNeedsWrapper {

    
    private DiagnosticEventManagerNeeds diagnosticEventManagerNeeds;

    public DiagnosticEventManagerNeedsWrapper(DiagnosticEventManagerNeeds diagnosticEventManagerNeeds) {
        this.diagnosticEventManagerNeeds = diagnosticEventManagerNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getS())) {
            
            return diagnosticEventManagerNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getT())) {
            
            return diagnosticEventManagerNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getUuid())) {
            
            return diagnosticEventManagerNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventManagerNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventManagerNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventManagerNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventManagerNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventManagerNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventManagerNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventManagerNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventManagerNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticEventManagerNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticEventManagerNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticEventManagerNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticEventManagerNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }




    


    
}
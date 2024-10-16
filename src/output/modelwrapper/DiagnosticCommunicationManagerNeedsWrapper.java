package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticCommunicationManagerNeedsWrapper {

    
    private DiagnosticCommunicationManagerNeeds diagnosticCommunicationManagerNeeds;

    public DiagnosticCommunicationManagerNeedsWrapper(DiagnosticCommunicationManagerNeeds diagnosticCommunicationManagerNeeds) {
        this.diagnosticCommunicationManagerNeeds = diagnosticCommunicationManagerNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getS())) {
            
            return diagnosticCommunicationManagerNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getT())) {
            
            return diagnosticCommunicationManagerNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getUuid())) {
            
            return diagnosticCommunicationManagerNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticCommunicationManagerNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticCommunicationManagerNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticCommunicationManagerNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticCommunicationManagerNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticCommunicationManagerNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticCommunicationManagerNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticCommunicationManagerNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticCommunicationManagerNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticCommunicationManagerNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticCommunicationManagerNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticCommunicationManagerNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticServiceRequestCallbackTypeEnumWrapper getServiceRequestCallbackType() {
        
        if (CollUtil.isNotEmpty(diagnosticCommunicationManagerNeeds.getServiceRequestCallbackType())) {
            
            return new DiagnosticServiceRequestCallbackTypeEnumWrapper(diagnosticCommunicationManagerNeeds.getServiceRequestCallbackType());
            
        } else {
            return null;
        }
        
    }




    


    
}
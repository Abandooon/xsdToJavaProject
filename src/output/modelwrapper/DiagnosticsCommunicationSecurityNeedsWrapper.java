package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticsCommunicationSecurityNeedsWrapper {

    
    private DiagnosticsCommunicationSecurityNeeds diagnosticsCommunicationSecurityNeeds;

    public DiagnosticsCommunicationSecurityNeedsWrapper(DiagnosticsCommunicationSecurityNeeds diagnosticsCommunicationSecurityNeeds) {
        this.diagnosticsCommunicationSecurityNeeds = diagnosticsCommunicationSecurityNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getS())) {
            
            return diagnosticsCommunicationSecurityNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getT())) {
            
            return diagnosticsCommunicationSecurityNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getUuid())) {
            
            return diagnosticsCommunicationSecurityNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticsCommunicationSecurityNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticsCommunicationSecurityNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticsCommunicationSecurityNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticsCommunicationSecurityNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticsCommunicationSecurityNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticsCommunicationSecurityNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticsCommunicationSecurityNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticsCommunicationSecurityNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticsCommunicationSecurityNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticsCommunicationSecurityNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticsCommunicationSecurityNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticsCommunicationSecurityNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }




    


    
}
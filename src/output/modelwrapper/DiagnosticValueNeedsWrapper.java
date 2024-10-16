package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class DiagnosticValueNeedsWrapper {

    
    private DiagnosticValueNeeds diagnosticValueNeeds;

    public DiagnosticValueNeedsWrapper(DiagnosticValueNeeds diagnosticValueNeeds) {
        this.diagnosticValueNeeds = diagnosticValueNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getS())) {
            
            return diagnosticValueNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getT())) {
            
            return diagnosticValueNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getUuid())) {
            
            return diagnosticValueNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticValueNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticValueNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticValueNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticValueNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticValueNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticValueNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticValueNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticValueNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticValueNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticValueNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticValueNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLength() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getDataLength())) {
            
            return new PositiveIntegerWrapper(diagnosticValueNeeds.getDataLength());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticValueAccessEnumWrapper getDiagnosticValueAccess() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getDiagnosticValueAccess())) {
            
            return new DiagnosticValueAccessEnumWrapper(diagnosticValueNeeds.getDiagnosticValueAccess());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDidNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getDidNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticValueNeeds.getDidNumber());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getFixedLength() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getFixedLength())) {
            
            return new BooleanWrapper(diagnosticValueNeeds.getFixedLength());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticProcessingStyleEnumWrapper getProcessingStyle() {
        
        if (CollUtil.isNotEmpty(diagnosticValueNeeds.getProcessingStyle())) {
            
            return new DiagnosticProcessingStyleEnumWrapper(diagnosticValueNeeds.getProcessingStyle());
            
        } else {
            return null;
        }
        
    }




    


    
}
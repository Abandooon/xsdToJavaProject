package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticOperationCycleNeedsWrapper {

    
    private DiagnosticOperationCycleNeeds diagnosticOperationCycleNeeds;

    public DiagnosticOperationCycleNeedsWrapper(DiagnosticOperationCycleNeeds diagnosticOperationCycleNeeds) {
        this.diagnosticOperationCycleNeeds = diagnosticOperationCycleNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getS())) {
            
            return diagnosticOperationCycleNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getT())) {
            
            return diagnosticOperationCycleNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getUuid())) {
            
            return diagnosticOperationCycleNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticOperationCycleNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticOperationCycleNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticOperationCycleNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticOperationCycleNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticOperationCycleNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticOperationCycleNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticOperationCycleNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticOperationCycleNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticOperationCycleNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticOperationCycleNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticOperationCycleNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public OperationCycleTypeEnumWrapper getOperationCycle() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getOperationCycle())) {
            
            return new OperationCycleTypeEnumWrapper(diagnosticOperationCycleNeeds.getOperationCycle());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getOperationCycleAutomaticEnd() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getOperationCycleAutomaticEnd())) {
            
            return new BooleanWrapper(diagnosticOperationCycleNeeds.getOperationCycleAutomaticEnd());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getOperationCycleAutostart() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycleNeeds.getOperationCycleAutostart())) {
            
            return new BooleanWrapper(diagnosticOperationCycleNeeds.getOperationCycleAutostart());
            
        } else {
            return null;
        }
        
    }




    


    
}
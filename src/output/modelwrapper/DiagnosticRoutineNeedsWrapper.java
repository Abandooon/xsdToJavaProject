package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticRoutineNeedsWrapper {

    
    private DiagnosticRoutineNeeds diagnosticRoutineNeeds;

    public DiagnosticRoutineNeedsWrapper(DiagnosticRoutineNeeds diagnosticRoutineNeeds) {
        this.diagnosticRoutineNeeds = diagnosticRoutineNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getS())) {
            
            return diagnosticRoutineNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getT())) {
            
            return diagnosticRoutineNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getUuid())) {
            
            return diagnosticRoutineNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRoutineNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRoutineNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRoutineNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRoutineNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRoutineNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRoutineNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRoutineNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRoutineNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticRoutineNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticRoutineNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticRoutineNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticRoutineTypeEnumWrapper getDiagRoutineType() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getDiagRoutineType())) {
            
            return new DiagnosticRoutineTypeEnumWrapper(diagnosticRoutineNeeds.getDiagRoutineType());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getRidNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineNeeds.getRidNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticRoutineNeeds.getRidNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}
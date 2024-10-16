package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticIoControlNeedsWrapper {

    
    private DiagnosticIoControlNeeds diagnosticIoControlNeeds;

    public DiagnosticIoControlNeedsWrapper(DiagnosticIoControlNeeds diagnosticIoControlNeeds) {
        this.diagnosticIoControlNeeds = diagnosticIoControlNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getS())) {
            
            return diagnosticIoControlNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getT())) {
            
            return diagnosticIoControlNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getUuid())) {
            
            return diagnosticIoControlNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getShortName())) {
            
            return new IdentifierWrapper(diagnosticIoControlNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticIoControlNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticIoControlNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticIoControlNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticIoControlNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticIoControlNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticIoControlNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticIoControlNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = diagnosticIoControlNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(diagnosticIoControlNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(diagnosticIoControlNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public CurrentValueRefWrapper getCurrentValueRef() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getCurrentValueRef())) {
            
            return new CurrentValueRefWrapper(diagnosticIoControlNeeds.getCurrentValueRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDidNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getDidNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticIoControlNeeds.getDidNumber());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getFreezeCurrentStateSupported() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getFreezeCurrentStateSupported())) {
            
            return new BooleanWrapper(diagnosticIoControlNeeds.getFreezeCurrentStateSupported());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResetToDefaultSupported() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getResetToDefaultSupported())) {
            
            return new BooleanWrapper(diagnosticIoControlNeeds.getResetToDefaultSupported());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getShortTermAdjustmentSupported() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlNeeds.getShortTermAdjustmentSupported())) {
            
            return new BooleanWrapper(diagnosticIoControlNeeds.getShortTermAdjustmentSupported());
            
        } else {
            return null;
        }
        
    }




    


    
}
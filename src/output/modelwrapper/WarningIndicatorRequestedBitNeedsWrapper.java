package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class WarningIndicatorRequestedBitNeedsWrapper {

    
    private WarningIndicatorRequestedBitNeeds warningIndicatorRequestedBitNeeds;

    public WarningIndicatorRequestedBitNeedsWrapper(WarningIndicatorRequestedBitNeeds warningIndicatorRequestedBitNeeds) {
        this.warningIndicatorRequestedBitNeeds = warningIndicatorRequestedBitNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getS())) {
            
            return warningIndicatorRequestedBitNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getT())) {
            
            return warningIndicatorRequestedBitNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getUuid())) {
            
            return warningIndicatorRequestedBitNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getShortName())) {
            
            return new IdentifierWrapper(warningIndicatorRequestedBitNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = warningIndicatorRequestedBitNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(warningIndicatorRequestedBitNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(warningIndicatorRequestedBitNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getCategory())) {
            
            return new CategoryStringWrapper(warningIndicatorRequestedBitNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getAdminData())) {
            
            return new AdminDataWrapper(warningIndicatorRequestedBitNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(warningIndicatorRequestedBitNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = warningIndicatorRequestedBitNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = warningIndicatorRequestedBitNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(warningIndicatorRequestedBitNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(warningIndicatorRequestedBitNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(warningIndicatorRequestedBitNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }




    


    
}
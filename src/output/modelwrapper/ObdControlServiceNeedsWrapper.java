package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class ObdControlServiceNeedsWrapper {

    
    private ObdControlServiceNeeds obdControlServiceNeeds;

    public ObdControlServiceNeedsWrapper(ObdControlServiceNeeds obdControlServiceNeeds) {
        this.obdControlServiceNeeds = obdControlServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getS())) {
            
            return obdControlServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getT())) {
            
            return obdControlServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getUuid())) {
            
            return obdControlServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(obdControlServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = obdControlServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(obdControlServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(obdControlServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(obdControlServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(obdControlServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(obdControlServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = obdControlServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = obdControlServiceNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(obdControlServiceNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(obdControlServiceNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTestId() {
        
        if (CollUtil.isNotEmpty(obdControlServiceNeeds.getTestId())) {
            
            return new PositiveIntegerWrapper(obdControlServiceNeeds.getTestId());
            
        } else {
            return null;
        }
        
    }




    


    
}
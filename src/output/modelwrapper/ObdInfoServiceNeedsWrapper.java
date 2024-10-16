package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ObdInfoServiceNeedsWrapper {

    
    private ObdInfoServiceNeeds obdInfoServiceNeeds;

    public ObdInfoServiceNeedsWrapper(ObdInfoServiceNeeds obdInfoServiceNeeds) {
        this.obdInfoServiceNeeds = obdInfoServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getS())) {
            
            return obdInfoServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getT())) {
            
            return obdInfoServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getUuid())) {
            
            return obdInfoServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(obdInfoServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = obdInfoServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(obdInfoServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(obdInfoServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(obdInfoServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(obdInfoServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(obdInfoServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = obdInfoServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = obdInfoServiceNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(obdInfoServiceNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(obdInfoServiceNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLength() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getDataLength())) {
            
            return new PositiveIntegerWrapper(obdInfoServiceNeeds.getDataLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getInfoType() {
        
        if (CollUtil.isNotEmpty(obdInfoServiceNeeds.getInfoType())) {
            
            return new PositiveIntegerWrapper(obdInfoServiceNeeds.getInfoType());
            
        } else {
            return null;
        }
        
    }




    


    
}
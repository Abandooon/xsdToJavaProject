package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class ObdPidServiceNeedsWrapper {

    
    private ObdPidServiceNeeds obdPidServiceNeeds;

    public ObdPidServiceNeedsWrapper(ObdPidServiceNeeds obdPidServiceNeeds) {
        this.obdPidServiceNeeds = obdPidServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getS())) {
            
            return obdPidServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getT())) {
            
            return obdPidServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getUuid())) {
            
            return obdPidServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(obdPidServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = obdPidServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(obdPidServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(obdPidServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(obdPidServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(obdPidServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(obdPidServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = obdPidServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = obdPidServiceNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(obdPidServiceNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(obdPidServiceNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLength() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getDataLength())) {
            
            return new PositiveIntegerWrapper(obdPidServiceNeeds.getDataLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getParameterId() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getParameterId())) {
            
            return new PositiveIntegerWrapper(obdPidServiceNeeds.getParameterId());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getStandard() {
        
        if (CollUtil.isNotEmpty(obdPidServiceNeeds.getStandard())) {
            
            return new StringWrapper(obdPidServiceNeeds.getStandard());
            
        } else {
            return null;
        }
        
    }




    


    
}
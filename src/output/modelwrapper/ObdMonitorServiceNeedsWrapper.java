package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ObdMonitorServiceNeedsWrapper {

    
    private ObdMonitorServiceNeeds obdMonitorServiceNeeds;

    public ObdMonitorServiceNeedsWrapper(ObdMonitorServiceNeeds obdMonitorServiceNeeds) {
        this.obdMonitorServiceNeeds = obdMonitorServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getS())) {
            
            return obdMonitorServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getT())) {
            
            return obdMonitorServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getUuid())) {
            
            return obdMonitorServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(obdMonitorServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = obdMonitorServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(obdMonitorServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(obdMonitorServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(obdMonitorServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(obdMonitorServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(obdMonitorServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = obdMonitorServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = obdMonitorServiceNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(obdMonitorServiceNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(obdMonitorServiceNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getOnBoardMonitorId() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getOnBoardMonitorId())) {
            
            return new PositiveIntegerWrapper(obdMonitorServiceNeeds.getOnBoardMonitorId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTestId() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getTestId())) {
            
            return new PositiveIntegerWrapper(obdMonitorServiceNeeds.getTestId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUnitAndScalingId() {
        
        if (CollUtil.isNotEmpty(obdMonitorServiceNeeds.getUnitAndScalingId())) {
            
            return new PositiveIntegerWrapper(obdMonitorServiceNeeds.getUnitAndScalingId());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ObdRatioServiceNeedsWrapper {

    
    private ObdRatioServiceNeeds obdRatioServiceNeeds;

    public ObdRatioServiceNeedsWrapper(ObdRatioServiceNeeds obdRatioServiceNeeds) {
        this.obdRatioServiceNeeds = obdRatioServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getS())) {
            
            return obdRatioServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getT())) {
            
            return obdRatioServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getUuid())) {
            
            return obdRatioServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(obdRatioServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = obdRatioServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(obdRatioServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(obdRatioServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(obdRatioServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(obdRatioServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(obdRatioServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = obdRatioServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = obdRatioServiceNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(obdRatioServiceNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(obdRatioServiceNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public ObdRatioConnectionKindEnumWrapper getConnectionType() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getConnectionType())) {
            
            return new ObdRatioConnectionKindEnumWrapper(obdRatioServiceNeeds.getConnectionType());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getIumprGroup() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getIumprGroup())) {
            
            return new NmtokenStringWrapper(obdRatioServiceNeeds.getIumprGroup());
            
        } else {
            return null;
        }
        
    }

    public RateBasedMonitoredEventRefWrapper getRateBasedMonitoredEventRef() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getRateBasedMonitoredEventRef())) {
            
            return new RateBasedMonitoredEventRefWrapper(obdRatioServiceNeeds.getRateBasedMonitoredEventRef());
            
        } else {
            return null;
        }
        
    }

    public UsedFidRefWrapper getUsedFidRef() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getUsedFidRef())) {
            
            return new UsedFidRefWrapper(obdRatioServiceNeeds.getUsedFidRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<UsedSecondaryFidRefWrapper> getUsedSecondaryFidRefs() {
        
        if (CollUtil.isNotEmpty(obdRatioServiceNeeds.getUsedSecondaryFidRefs())) {
            ArrayList<UsedSecondaryFidRef> originalList = obdRatioServiceNeeds.getUsedSecondaryFidRefs();
            ArrayList<UsedSecondaryFidRefWrapper> wrapperList = (ArrayList<UsedSecondaryFidRefWrapper>)originalList.stream()
                .map(item -> new UsedSecondaryFidRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
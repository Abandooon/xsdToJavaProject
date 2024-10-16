package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class GlobalTimeCanMasterWrapper {

    
    private GlobalTimeCanMaster globalTimeCanMaster;

    public GlobalTimeCanMasterWrapper(GlobalTimeCanMaster globalTimeCanMaster) {
        this.globalTimeCanMaster = globalTimeCanMaster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getS())) {
            
            return globalTimeCanMaster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getT())) {
            
            return globalTimeCanMaster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getUuid())) {
            
            return globalTimeCanMaster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getShortName())) {
            
            return new IdentifierWrapper(globalTimeCanMaster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeCanMaster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeCanMaster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeCanMaster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeCanMaster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeCanMaster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeCanMaster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeCanMaster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeCanMaster.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsSystemWideGlobalTimeMaster() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getIsSystemWideGlobalTimeMaster())) {
            
            return new BooleanWrapper(globalTimeCanMaster.getIsSystemWideGlobalTimeMaster());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncPeriod() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getSyncPeriod())) {
            
            return new TimeValueWrapper(globalTimeCanMaster.getSyncPeriod());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeCrcSupportEnumWrapper getCrcSecured() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getCrcSecured())) {
            
            return new GlobalTimeCrcSupportEnumWrapper(globalTimeCanMaster.getCrcSecured());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getFollowUpOffset() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getFollowUpOffset())) {
            
            return new TimeValueWrapper(globalTimeCanMaster.getFollowUpOffset());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncConfirmationTimeout() {
        
        if (CollUtil.isNotEmpty(globalTimeCanMaster.getSyncConfirmationTimeout())) {
            
            return new TimeValueWrapper(globalTimeCanMaster.getSyncConfirmationTimeout());
            
        } else {
            return null;
        }
        
    }




    


    
}
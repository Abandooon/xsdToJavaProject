package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class GlobalTimeFrMasterWrapper {

    
    private GlobalTimeFrMaster globalTimeFrMaster;

    public GlobalTimeFrMasterWrapper(GlobalTimeFrMaster globalTimeFrMaster) {
        this.globalTimeFrMaster = globalTimeFrMaster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getS())) {
            
            return globalTimeFrMaster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getT())) {
            
            return globalTimeFrMaster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getUuid())) {
            
            return globalTimeFrMaster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getShortName())) {
            
            return new IdentifierWrapper(globalTimeFrMaster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeFrMaster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeFrMaster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeFrMaster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeFrMaster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeFrMaster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeFrMaster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeFrMaster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeFrMaster.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsSystemWideGlobalTimeMaster() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getIsSystemWideGlobalTimeMaster())) {
            
            return new BooleanWrapper(globalTimeFrMaster.getIsSystemWideGlobalTimeMaster());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncPeriod() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getSyncPeriod())) {
            
            return new TimeValueWrapper(globalTimeFrMaster.getSyncPeriod());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeCrcSupportEnumWrapper getCrcSecured() {
        
        if (CollUtil.isNotEmpty(globalTimeFrMaster.getCrcSecured())) {
            
            return new GlobalTimeCrcSupportEnumWrapper(globalTimeFrMaster.getCrcSecured());
            
        } else {
            return null;
        }
        
    }




    


    
}
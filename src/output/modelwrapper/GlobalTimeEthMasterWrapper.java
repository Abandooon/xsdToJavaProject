package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class GlobalTimeEthMasterWrapper {

    
    private GlobalTimeEthMaster globalTimeEthMaster;

    public GlobalTimeEthMasterWrapper(GlobalTimeEthMaster globalTimeEthMaster) {
        this.globalTimeEthMaster = globalTimeEthMaster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getS())) {
            
            return globalTimeEthMaster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getT())) {
            
            return globalTimeEthMaster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getUuid())) {
            
            return globalTimeEthMaster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getShortName())) {
            
            return new IdentifierWrapper(globalTimeEthMaster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeEthMaster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeEthMaster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeEthMaster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeEthMaster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeEthMaster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeEthMaster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeEthMaster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeEthMaster.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsSystemWideGlobalTimeMaster() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getIsSystemWideGlobalTimeMaster())) {
            
            return new BooleanWrapper(globalTimeEthMaster.getIsSystemWideGlobalTimeMaster());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSyncPeriod() {
        
        if (CollUtil.isNotEmpty(globalTimeEthMaster.getSyncPeriod())) {
            
            return new TimeValueWrapper(globalTimeEthMaster.getSyncPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
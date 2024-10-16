package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class UserDefinedCommunicationConnectorWrapper {

    
    private UserDefinedCommunicationConnector userDefinedCommunicationConnector;

    public UserDefinedCommunicationConnectorWrapper(UserDefinedCommunicationConnector userDefinedCommunicationConnector) {
        this.userDefinedCommunicationConnector = userDefinedCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getS())) {
            
            return userDefinedCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getT())) {
            
            return userDefinedCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getUuid())) {
            
            return userDefinedCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(userDefinedCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(userDefinedCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(userDefinedCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(userDefinedCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(userDefinedCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }




    


    
}
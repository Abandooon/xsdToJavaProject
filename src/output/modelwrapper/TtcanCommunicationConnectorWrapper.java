package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class TtcanCommunicationConnectorWrapper {

    
    private TtcanCommunicationConnector ttcanCommunicationConnector;

    public TtcanCommunicationConnectorWrapper(TtcanCommunicationConnector ttcanCommunicationConnector) {
        this.ttcanCommunicationConnector = ttcanCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getS())) {
            
            return ttcanCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getT())) {
            
            return ttcanCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getUuid())) {
            
            return ttcanCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(ttcanCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ttcanCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ttcanCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ttcanCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(ttcanCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(ttcanCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ttcanCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = ttcanCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(ttcanCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(ttcanCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(ttcanCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(ttcanCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }




    


    
}
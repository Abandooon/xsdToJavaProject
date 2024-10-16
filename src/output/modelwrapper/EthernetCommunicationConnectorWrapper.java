package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class EthernetCommunicationConnectorWrapper {

    
    private EthernetCommunicationConnector ethernetCommunicationConnector;

    public EthernetCommunicationConnectorWrapper(EthernetCommunicationConnector ethernetCommunicationConnector) {
        this.ethernetCommunicationConnector = ethernetCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getS())) {
            
            return ethernetCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getT())) {
            
            return ethernetCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getUuid())) {
            
            return ethernetCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(ethernetCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(ethernetCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(ethernetCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(ethernetCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(ethernetCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(ethernetCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIpV6PathMtuEnabled() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getIpV6PathMtuEnabled())) {
            
            return new BooleanWrapper(ethernetCommunicationConnector.getIpV6PathMtuEnabled());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getIpV6PathMtuTimeout() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getIpV6PathMtuTimeout())) {
            
            return new TimeValueWrapper(ethernetCommunicationConnector.getIpV6PathMtuTimeout());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaximumTransmissionUnit() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getMaximumTransmissionUnit())) {
            
            return new PositiveIntegerWrapper(ethernetCommunicationConnector.getMaximumTransmissionUnit());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NetworkEndpointRefWrapper> getNetworkEndpointRefs() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getNetworkEndpointRefs())) {
            ArrayList<NetworkEndpointRef> originalList = ethernetCommunicationConnector.getNetworkEndpointRefs();
            ArrayList<NetworkEndpointRefWrapper> wrapperList = (ArrayList<NetworkEndpointRefWrapper>)originalList.stream()
                .map(item -> new NetworkEndpointRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getPncFilterDataMask() {
        
        if (CollUtil.isNotEmpty(ethernetCommunicationConnector.getPncFilterDataMask())) {
            
            return new PositiveUnlimitedIntegerWrapper(ethernetCommunicationConnector.getPncFilterDataMask());
            
        } else {
            return null;
        }
        
    }




    


    
}
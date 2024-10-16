package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class FlexrayCommunicationConnectorWrapper {

    
    private FlexrayCommunicationConnector flexrayCommunicationConnector;

    public FlexrayCommunicationConnectorWrapper(FlexrayCommunicationConnector flexrayCommunicationConnector) {
        this.flexrayCommunicationConnector = flexrayCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getS())) {
            
            return flexrayCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getT())) {
            
            return flexrayCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getUuid())) {
            
            return flexrayCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(flexrayCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(flexrayCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(flexrayCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(flexrayCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(flexrayCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(flexrayCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getNmReadySleepTime() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getNmReadySleepTime())) {
            
            return new FloatWrapper(flexrayCommunicationConnector.getNmReadySleepTime());
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getPncFilterDataMask() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getPncFilterDataMask())) {
            
            return new PositiveUnlimitedIntegerWrapper(flexrayCommunicationConnector.getPncFilterDataMask());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpChannel() {
        
        if (CollUtil.isNotEmpty(flexrayCommunicationConnector.getWakeUpChannel())) {
            
            return new BooleanWrapper(flexrayCommunicationConnector.getWakeUpChannel());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class CanCommunicationConnectorWrapper {

    
    private CanCommunicationConnector canCommunicationConnector;

    public CanCommunicationConnectorWrapper(CanCommunicationConnector canCommunicationConnector) {
        this.canCommunicationConnector = canCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getS())) {
            
            return canCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getT())) {
            
            return canCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getUuid())) {
            
            return canCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(canCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(canCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(canCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = canCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(canCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(canCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(canCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncWakeupCanId() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncWakeupCanId())) {
            
            return new PositiveIntegerWrapper(canCommunicationConnector.getPncWakeupCanId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPncWakeupCanIdExtended() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncWakeupCanIdExtended())) {
            
            return new BooleanWrapper(canCommunicationConnector.getPncWakeupCanIdExtended());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncWakeupCanIdMask() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncWakeupCanIdMask())) {
            
            return new PositiveIntegerWrapper(canCommunicationConnector.getPncWakeupCanIdMask());
            
        } else {
            return null;
        }
        
    }

    public PositiveUnlimitedIntegerWrapper getPncWakeupDataMask() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncWakeupDataMask())) {
            
            return new PositiveUnlimitedIntegerWrapper(canCommunicationConnector.getPncWakeupDataMask());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncWakeupDlc() {
        
        if (CollUtil.isNotEmpty(canCommunicationConnector.getPncWakeupDlc())) {
            
            return new PositiveIntegerWrapper(canCommunicationConnector.getPncWakeupDlc());
            
        } else {
            return null;
        }
        
    }




    


    
}
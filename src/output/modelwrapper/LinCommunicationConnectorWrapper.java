package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class LinCommunicationConnectorWrapper {

    
    private LinCommunicationConnector linCommunicationConnector;

    public LinCommunicationConnectorWrapper(LinCommunicationConnector linCommunicationConnector) {
        this.linCommunicationConnector = linCommunicationConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getS())) {
            
            return linCommunicationConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getT())) {
            
            return linCommunicationConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getUuid())) {
            
            return linCommunicationConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getShortName())) {
            
            return new IdentifierWrapper(linCommunicationConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linCommunicationConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linCommunicationConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linCommunicationConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getCategory())) {
            
            return new CategoryStringWrapper(linCommunicationConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getAdminData())) {
            
            return new AdminDataWrapper(linCommunicationConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linCommunicationConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = linCommunicationConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommControllerRefWrapper getCommControllerRef() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getCommControllerRef())) {
            
            return new CommControllerRefWrapper(linCommunicationConnector.getCommControllerRef());
            
        } else {
            return null;
        }
        
    }

    public EcuCommPortInstancesWrapper getEcuCommPortInstances() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getEcuCommPortInstances())) {
            
            return new EcuCommPortInstancesWrapper(linCommunicationConnector.getEcuCommPortInstances());
            
        } else {
            return null;
        }
        
    }

    public PncGatewayTypeEnumWrapper getPncGatewayType() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getPncGatewayType())) {
            
            return new PncGatewayTypeEnumWrapper(linCommunicationConnector.getPncGatewayType());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getInitialNad() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getInitialNad())) {
            
            return new IntegerWrapper(linCommunicationConnector.getInitialNad());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LinConfigurableFrameWrapper> getLinConfigurableFrames() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getLinConfigurableFrames())) {
            ArrayList<LinConfigurableFrame> originalList = linCommunicationConnector.getLinConfigurableFrames();
            ArrayList<LinConfigurableFrameWrapper> wrapperList = (ArrayList<LinConfigurableFrameWrapper>)originalList.stream()
                .map(item -> new LinConfigurableFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinOrderedConfigurableFrameWrapper> getLinOrderedConfigurableFrames() {
        
        if (CollUtil.isNotEmpty(linCommunicationConnector.getLinOrderedConfigurableFrames())) {
            ArrayList<LinOrderedConfigurableFrame> originalList = linCommunicationConnector.getLinOrderedConfigurableFrames();
            ArrayList<LinOrderedConfigurableFrameWrapper> wrapperList = (ArrayList<LinOrderedConfigurableFrameWrapper>)originalList.stream()
                .map(item -> new LinOrderedConfigurableFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
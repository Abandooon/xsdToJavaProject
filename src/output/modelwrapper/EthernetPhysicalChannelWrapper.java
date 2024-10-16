package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EthernetPhysicalChannelWrapper {

    
    private EthernetPhysicalChannel ethernetPhysicalChannel;

    public EthernetPhysicalChannelWrapper(EthernetPhysicalChannel ethernetPhysicalChannel) {
        this.ethernetPhysicalChannel = ethernetPhysicalChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getS())) {
            
            return ethernetPhysicalChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getT())) {
            
            return ethernetPhysicalChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getUuid())) {
            
            return ethernetPhysicalChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getShortName())) {
            
            return new IdentifierWrapper(ethernetPhysicalChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetPhysicalChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetPhysicalChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetPhysicalChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getCategory())) {
            
            return new CategoryStringWrapper(ethernetPhysicalChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getAdminData())) {
            
            return new AdminDataWrapper(ethernetPhysicalChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetPhysicalChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetPhysicalChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationConnectorRefConditionalWrapper> getCommConnectors() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getCommConnectors())) {
            ArrayList<CommunicationConnectorRefConditional> originalList = ethernetPhysicalChannel.getCommConnectors();
            ArrayList<CommunicationConnectorRefConditionalWrapper> wrapperList = (ArrayList<CommunicationConnectorRefConditionalWrapper>)originalList.stream()
                .map(item -> new CommunicationConnectorRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameTriggeringsWrapper getFrameTriggerings() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getFrameTriggerings())) {
            
            return new FrameTriggeringsWrapper(ethernetPhysicalChannel.getFrameTriggerings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getISignalTriggerings())) {
            ArrayList<ISignalTriggering> originalList = ethernetPhysicalChannel.getISignalTriggerings();
            ArrayList<ISignalTriggeringWrapper> wrapperList = (ArrayList<ISignalTriggeringWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getPduTriggerings())) {
            ArrayList<PduTriggering> originalList = ethernetPhysicalChannel.getPduTriggerings();
            ArrayList<PduTriggeringWrapper> wrapperList = (ArrayList<PduTriggeringWrapper>)originalList.stream()
                .map(item -> new PduTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetPhysicalChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NetworkEndpointWrapper> getNetworkEndpoints() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getNetworkEndpoints())) {
            ArrayList<NetworkEndpoint> originalList = ethernetPhysicalChannel.getNetworkEndpoints();
            ArrayList<NetworkEndpointWrapper> wrapperList = (ArrayList<NetworkEndpointWrapper>)originalList.stream()
                .map(item -> new NetworkEndpointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SoAdConfigWrapper getSoAdConfig() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getSoAdConfig())) {
            
            return new SoAdConfigWrapper(ethernetPhysicalChannel.getSoAdConfig());
            
        } else {
            return null;
        }
        
    }

    public VlanConfigWrapper getVlan() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalChannel.getVlan())) {
            
            return new VlanConfigWrapper(ethernetPhysicalChannel.getVlan());
            
        } else {
            return null;
        }
        
    }




    


    
}
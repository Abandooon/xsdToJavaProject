package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class UdpNmClusterWrapper {

    
    private UdpNmCluster udpNmCluster;

    public UdpNmClusterWrapper(UdpNmCluster udpNmCluster) {
        this.udpNmCluster = udpNmCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getS())) {
            
            return udpNmCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getT())) {
            
            return udpNmCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getUuid())) {
            
            return udpNmCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getShortName())) {
            
            return new IdentifierWrapper(udpNmCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = udpNmCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(udpNmCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(udpNmCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getCategory())) {
            
            return new CategoryStringWrapper(udpNmCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getAdminData())) {
            
            return new AdminDataWrapper(udpNmCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(udpNmCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = udpNmCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(udpNmCluster.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmChannelId() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmChannelId())) {
            
            return new PositiveIntegerWrapper(udpNmCluster.getNmChannelId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelSleepMaster() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmChannelSleepMaster())) {
            
            return new BooleanWrapper(udpNmCluster.getNmChannelSleepMaster());
            
        } else {
            return null;
        }
        
    }

    public NmNodesWrapper getNmNodes() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmNodes())) {
            
            return new NmNodesWrapper(udpNmCluster.getNmNodes());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmSynchronizingNetwork() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmSynchronizingNetwork())) {
            
            return new BooleanWrapper(udpNmCluster.getNmSynchronizingNetwork());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(udpNmCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmCbvPosition() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmCbvPosition())) {
            
            return new IntegerWrapper(udpNmCluster.getNmCbvPosition());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelActive() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmChannelActive())) {
            
            return new BooleanWrapper(udpNmCluster.getNmChannelActive());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMessageTimeoutTime() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmMessageTimeoutTime())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmMessageTimeoutTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMsgCycleTime() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmMsgCycleTime())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmMsgCycleTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmNetworkTimeout() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmNetworkTimeout())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmNetworkTimeout());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNidPosition() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmNidPosition())) {
            
            return new IntegerWrapper(udpNmCluster.getNmNidPosition());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRemoteSleepIndicationTime() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmRemoteSleepIndicationTime())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmRemoteSleepIndicationTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRepeatMessageTime() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmRepeatMessageTime())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmRepeatMessageTime());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmUserDataLength() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmUserDataLength())) {
            
            return new IntegerWrapper(udpNmCluster.getNmUserDataLength());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmWaitBusSleepTime() {
        
        if (CollUtil.isNotEmpty(udpNmCluster.getNmWaitBusSleepTime())) {
            
            return new TimeValueWrapper(udpNmCluster.getNmWaitBusSleepTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
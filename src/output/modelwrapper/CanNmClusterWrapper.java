package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class CanNmClusterWrapper {

    
    private CanNmCluster canNmCluster;

    public CanNmClusterWrapper(CanNmCluster canNmCluster) {
        this.canNmCluster = canNmCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getS())) {
            
            return canNmCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getT())) {
            
            return canNmCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getUuid())) {
            
            return canNmCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getShortName())) {
            
            return new IdentifierWrapper(canNmCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canNmCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canNmCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canNmCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getCategory())) {
            
            return new CategoryStringWrapper(canNmCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getAdminData())) {
            
            return new AdminDataWrapper(canNmCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canNmCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = canNmCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(canNmCluster.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmChannelId() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmChannelId())) {
            
            return new PositiveIntegerWrapper(canNmCluster.getNmChannelId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelSleepMaster() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmChannelSleepMaster())) {
            
            return new BooleanWrapper(canNmCluster.getNmChannelSleepMaster());
            
        } else {
            return null;
        }
        
    }

    public NmNodesWrapper getNmNodes() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmNodes())) {
            
            return new NmNodesWrapper(canNmCluster.getNmNodes());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmSynchronizingNetwork() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmSynchronizingNetwork())) {
            
            return new BooleanWrapper(canNmCluster.getNmSynchronizingNetwork());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(canNmCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmBusloadReductionActive() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmBusloadReductionActive())) {
            
            return new BooleanWrapper(canNmCluster.getNmBusloadReductionActive());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCarWakeUpBitPosition() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmCarWakeUpBitPosition())) {
            
            return new PositiveIntegerWrapper(canNmCluster.getNmCarWakeUpBitPosition());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpFilterEnabled() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmCarWakeUpFilterEnabled())) {
            
            return new BooleanWrapper(canNmCluster.getNmCarWakeUpFilterEnabled());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCarWakeUpFilterNodeId() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmCarWakeUpFilterNodeId())) {
            
            return new PositiveIntegerWrapper(canNmCluster.getNmCarWakeUpFilterNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpRxEnabled() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmCarWakeUpRxEnabled())) {
            
            return new BooleanWrapper(canNmCluster.getNmCarWakeUpRxEnabled());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmCbvPosition() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmCbvPosition())) {
            
            return new IntegerWrapper(canNmCluster.getNmCbvPosition());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelActive() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmChannelActive())) {
            
            return new BooleanWrapper(canNmCluster.getNmChannelActive());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmImmediateNmCycleTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmImmediateNmCycleTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmImmediateNmCycleTime());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmImmediateNmTransmissions() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmImmediateNmTransmissions())) {
            
            return new PositiveIntegerWrapper(canNmCluster.getNmImmediateNmTransmissions());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMessageTimeoutTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmMessageTimeoutTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmMessageTimeoutTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMsgCycleTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmMsgCycleTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmMsgCycleTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmNetworkTimeout() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmNetworkTimeout())) {
            
            return new TimeValueWrapper(canNmCluster.getNmNetworkTimeout());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNidPosition() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmNidPosition())) {
            
            return new IntegerWrapper(canNmCluster.getNmNidPosition());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRemoteSleepIndicationTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmRemoteSleepIndicationTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmRemoteSleepIndicationTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRepeatMessageTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmRepeatMessageTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmRepeatMessageTime());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmUserDataLength() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmUserDataLength())) {
            
            return new IntegerWrapper(canNmCluster.getNmUserDataLength());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmWaitBusSleepTime() {
        
        if (CollUtil.isNotEmpty(canNmCluster.getNmWaitBusSleepTime())) {
            
            return new TimeValueWrapper(canNmCluster.getNmWaitBusSleepTime());
            
        } else {
            return null;
        }
        
    }




    


    
}
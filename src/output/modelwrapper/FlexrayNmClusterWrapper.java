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
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class FlexrayNmClusterWrapper {

    
    private FlexrayNmCluster flexrayNmCluster;

    public FlexrayNmClusterWrapper(FlexrayNmCluster flexrayNmCluster) {
        this.flexrayNmCluster = flexrayNmCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getS())) {
            
            return flexrayNmCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getT())) {
            
            return flexrayNmCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getUuid())) {
            
            return flexrayNmCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getShortName())) {
            
            return new IdentifierWrapper(flexrayNmCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayNmCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayNmCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayNmCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getCategory())) {
            
            return new CategoryStringWrapper(flexrayNmCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getAdminData())) {
            
            return new AdminDataWrapper(flexrayNmCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayNmCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayNmCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(flexrayNmCluster.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmChannelId() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmChannelId())) {
            
            return new PositiveIntegerWrapper(flexrayNmCluster.getNmChannelId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelSleepMaster() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmChannelSleepMaster())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmChannelSleepMaster());
            
        } else {
            return null;
        }
        
    }

    public NmNodesWrapper getNmNodes() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmNodes())) {
            
            return new NmNodesWrapper(flexrayNmCluster.getNmNodes());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmSynchronizingNetwork() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmSynchronizingNetwork())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmSynchronizingNetwork());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayNmCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCarWakeUpBitPosition() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmCarWakeUpBitPosition())) {
            
            return new PositiveIntegerWrapper(flexrayNmCluster.getNmCarWakeUpBitPosition());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpFilterEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmCarWakeUpFilterEnabled())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmCarWakeUpFilterEnabled());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCarWakeUpFilterNodeId() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmCarWakeUpFilterNodeId())) {
            
            return new PositiveIntegerWrapper(flexrayNmCluster.getNmCarWakeUpFilterNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpRxEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmCarWakeUpRxEnabled())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmCarWakeUpRxEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmControlBitVectorActive() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmControlBitVectorActive())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmControlBitVectorActive());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmDataCycle() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmDataCycle())) {
            
            return new IntegerWrapper(flexrayNmCluster.getNmDataCycle());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmDataEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmDataEnabled())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmDataEnabled());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmDetectionLock() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmDetectionLock())) {
            
            return new TimeValueWrapper(flexrayNmCluster.getNmDetectionLock());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMainFunctionPeriod() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmMainFunctionPeriod())) {
            
            return new TimeValueWrapper(flexrayNmCluster.getNmMainFunctionPeriod());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMessageTimeoutTime() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmMessageTimeoutTime())) {
            
            return new TimeValueWrapper(flexrayNmCluster.getNmMessageTimeoutTime());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmReadySleepCount() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmReadySleepCount())) {
            
            return new IntegerWrapper(flexrayNmCluster.getNmReadySleepCount());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRemoteSleepIndicationTime() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmRemoteSleepIndicationTime())) {
            
            return new TimeValueWrapper(flexrayNmCluster.getNmRemoteSleepIndicationTime());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRepeatMessageBitActive() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmRepeatMessageBitActive())) {
            
            return new BooleanWrapper(flexrayNmCluster.getNmRepeatMessageBitActive());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmRepeatMessageTime() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmRepeatMessageTime())) {
            
            return new TimeValueWrapper(flexrayNmCluster.getNmRepeatMessageTime());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmRepetitionCycle() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmRepetitionCycle())) {
            
            return new IntegerWrapper(flexrayNmCluster.getNmRepetitionCycle());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmVotingCycle() {
        
        if (CollUtil.isNotEmpty(flexrayNmCluster.getNmVotingCycle())) {
            
            return new IntegerWrapper(flexrayNmCluster.getNmVotingCycle());
            
        } else {
            return null;
        }
        
    }




    


    
}
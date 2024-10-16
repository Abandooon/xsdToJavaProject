package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class CanNmNodeWrapper {

    
    private CanNmNode canNmNode;

    public CanNmNodeWrapper(CanNmNode canNmNode) {
        this.canNmNode = canNmNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canNmNode.getS())) {
            
            return canNmNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canNmNode.getT())) {
            
            return canNmNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canNmNode.getUuid())) {
            
            return canNmNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canNmNode.getShortName())) {
            
            return new IdentifierWrapper(canNmNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canNmNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canNmNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canNmNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canNmNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canNmNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canNmNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canNmNode.getCategory())) {
            
            return new CategoryStringWrapper(canNmNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canNmNode.getAdminData())) {
            
            return new AdminDataWrapper(canNmNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canNmNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canNmNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canNmNode.getAnnotations())) {
            ArrayList<Annotation> originalList = canNmNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ControllerRefWrapper getControllerRef() {
        
        if (CollUtil.isNotEmpty(canNmNode.getControllerRef())) {
            
            return new ControllerRefWrapper(canNmNode.getControllerRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCoordCluster() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmCoordCluster())) {
            
            return new PositiveIntegerWrapper(canNmNode.getNmCoordCluster());
            
        } else {
            return null;
        }
        
    }

    public NmCoordinatorRoleEnumWrapper getNmCoordinatorRole() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmCoordinatorRole())) {
            
            return new NmCoordinatorRoleEnumWrapper(canNmNode.getNmCoordinatorRole());
            
        } else {
            return null;
        }
        
    }

    public NmIfEcuRefWrapper getNmIfEcuRef() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmIfEcuRef())) {
            
            return new NmIfEcuRefWrapper(canNmNode.getNmIfEcuRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNodeId() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmNodeId())) {
            
            return new IntegerWrapper(canNmNode.getNmNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPassiveModeEnabled() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmPassiveModeEnabled())) {
            
            return new BooleanWrapper(canNmNode.getNmPassiveModeEnabled());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RxNmPduRefWrapper> getRxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(canNmNode.getRxNmPduRefs())) {
            ArrayList<RxNmPduRef> originalList = canNmNode.getRxNmPduRefs();
            ArrayList<RxNmPduRefWrapper> wrapperList = (ArrayList<RxNmPduRefWrapper>)originalList.stream()
                .map(item -> new RxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TxNmPduRefWrapper> getTxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(canNmNode.getTxNmPduRefs())) {
            ArrayList<TxNmPduRef> originalList = canNmNode.getTxNmPduRefs();
            ArrayList<TxNmPduRefWrapper> wrapperList = (ArrayList<TxNmPduRefWrapper>)originalList.stream()
                .map(item -> new TxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canNmNode.getVariationPoint())) {
            
            return new VariationPointWrapper(canNmNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpFilterEnabled() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmCarWakeUpFilterEnabled())) {
            
            return new BooleanWrapper(canNmNode.getNmCarWakeUpFilterEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCarWakeUpRxEnabled() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmCarWakeUpRxEnabled())) {
            
            return new BooleanWrapper(canNmNode.getNmCarWakeUpRxEnabled());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMsgCycleOffset() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmMsgCycleOffset())) {
            
            return new TimeValueWrapper(canNmNode.getNmMsgCycleOffset());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMsgReducedTime() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmMsgReducedTime())) {
            
            return new TimeValueWrapper(canNmNode.getNmMsgReducedTime());
            
        } else {
            return null;
        }
        
    }

    public CanNmRangeConfigWrapper getNmRangeConfig() {
        
        if (CollUtil.isNotEmpty(canNmNode.getNmRangeConfig())) {
            
            return new CanNmRangeConfigWrapper(canNmNode.getNmRangeConfig());
            
        } else {
            return null;
        }
        
    }




    


    
}
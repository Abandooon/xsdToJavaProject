package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class UdpNmNodeWrapper {

    
    private UdpNmNode udpNmNode;

    public UdpNmNodeWrapper(UdpNmNode udpNmNode) {
        this.udpNmNode = udpNmNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getS())) {
            
            return udpNmNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getT())) {
            
            return udpNmNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getUuid())) {
            
            return udpNmNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getShortName())) {
            
            return new IdentifierWrapper(udpNmNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = udpNmNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(udpNmNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(udpNmNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getCategory())) {
            
            return new CategoryStringWrapper(udpNmNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getAdminData())) {
            
            return new AdminDataWrapper(udpNmNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(udpNmNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getAnnotations())) {
            ArrayList<Annotation> originalList = udpNmNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ControllerRefWrapper getControllerRef() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getControllerRef())) {
            
            return new ControllerRefWrapper(udpNmNode.getControllerRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCoordCluster() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmCoordCluster())) {
            
            return new PositiveIntegerWrapper(udpNmNode.getNmCoordCluster());
            
        } else {
            return null;
        }
        
    }

    public NmCoordinatorRoleEnumWrapper getNmCoordinatorRole() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmCoordinatorRole())) {
            
            return new NmCoordinatorRoleEnumWrapper(udpNmNode.getNmCoordinatorRole());
            
        } else {
            return null;
        }
        
    }

    public NmIfEcuRefWrapper getNmIfEcuRef() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmIfEcuRef())) {
            
            return new NmIfEcuRefWrapper(udpNmNode.getNmIfEcuRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNodeId() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmNodeId())) {
            
            return new IntegerWrapper(udpNmNode.getNmNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPassiveModeEnabled() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmPassiveModeEnabled())) {
            
            return new BooleanWrapper(udpNmNode.getNmPassiveModeEnabled());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RxNmPduRefWrapper> getRxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getRxNmPduRefs())) {
            ArrayList<RxNmPduRef> originalList = udpNmNode.getRxNmPduRefs();
            ArrayList<RxNmPduRefWrapper> wrapperList = (ArrayList<RxNmPduRefWrapper>)originalList.stream()
                .map(item -> new RxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TxNmPduRefWrapper> getTxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getTxNmPduRefs())) {
            ArrayList<TxNmPduRef> originalList = udpNmNode.getTxNmPduRefs();
            ArrayList<TxNmPduRefWrapper> wrapperList = (ArrayList<TxNmPduRefWrapper>)originalList.stream()
                .map(item -> new TxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getVariationPoint())) {
            
            return new VariationPointWrapper(udpNmNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmMsgCycleOffset() {
        
        if (CollUtil.isNotEmpty(udpNmNode.getNmMsgCycleOffset())) {
            
            return new TimeValueWrapper(udpNmNode.getNmMsgCycleOffset());
            
        } else {
            return null;
        }
        
    }




    


    
}
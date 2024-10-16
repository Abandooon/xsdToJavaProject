package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class FlexrayNmNodeWrapper {

    
    private FlexrayNmNode flexrayNmNode;

    public FlexrayNmNodeWrapper(FlexrayNmNode flexrayNmNode) {
        this.flexrayNmNode = flexrayNmNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getS())) {
            
            return flexrayNmNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getT())) {
            
            return flexrayNmNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getUuid())) {
            
            return flexrayNmNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getShortName())) {
            
            return new IdentifierWrapper(flexrayNmNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayNmNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayNmNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayNmNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getCategory())) {
            
            return new CategoryStringWrapper(flexrayNmNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getAdminData())) {
            
            return new AdminDataWrapper(flexrayNmNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayNmNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayNmNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ControllerRefWrapper getControllerRef() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getControllerRef())) {
            
            return new ControllerRefWrapper(flexrayNmNode.getControllerRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCoordCluster() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmCoordCluster())) {
            
            return new PositiveIntegerWrapper(flexrayNmNode.getNmCoordCluster());
            
        } else {
            return null;
        }
        
    }

    public NmCoordinatorRoleEnumWrapper getNmCoordinatorRole() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmCoordinatorRole())) {
            
            return new NmCoordinatorRoleEnumWrapper(flexrayNmNode.getNmCoordinatorRole());
            
        } else {
            return null;
        }
        
    }

    public NmIfEcuRefWrapper getNmIfEcuRef() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmIfEcuRef())) {
            
            return new NmIfEcuRefWrapper(flexrayNmNode.getNmIfEcuRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNodeId() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmNodeId())) {
            
            return new IntegerWrapper(flexrayNmNode.getNmNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPassiveModeEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmPassiveModeEnabled())) {
            
            return new BooleanWrapper(flexrayNmNode.getNmPassiveModeEnabled());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RxNmPduRefWrapper> getRxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getRxNmPduRefs())) {
            ArrayList<RxNmPduRef> originalList = flexrayNmNode.getRxNmPduRefs();
            ArrayList<RxNmPduRefWrapper> wrapperList = (ArrayList<RxNmPduRefWrapper>)originalList.stream()
                .map(item -> new RxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TxNmPduRefWrapper> getTxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getTxNmPduRefs())) {
            ArrayList<TxNmPduRef> originalList = flexrayNmNode.getTxNmPduRefs();
            ArrayList<TxNmPduRefWrapper> wrapperList = (ArrayList<TxNmPduRefWrapper>)originalList.stream()
                .map(item -> new TxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayNmNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmInstanceId() {
        
        if (CollUtil.isNotEmpty(flexrayNmNode.getNmInstanceId())) {
            
            return new PositiveIntegerWrapper(flexrayNmNode.getNmInstanceId());
            
        } else {
            return null;
        }
        
    }




    


    
}
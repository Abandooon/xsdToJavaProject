package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class J1939NmNodeWrapper {

    
    private J1939NmNode j1939NmNode;

    public J1939NmNodeWrapper(J1939NmNode j1939NmNode) {
        this.j1939NmNode = j1939NmNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getS())) {
            
            return j1939NmNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getT())) {
            
            return j1939NmNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getUuid())) {
            
            return j1939NmNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getShortName())) {
            
            return new IdentifierWrapper(j1939NmNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939NmNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939NmNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939NmNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getCategory())) {
            
            return new CategoryStringWrapper(j1939NmNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getAdminData())) {
            
            return new AdminDataWrapper(j1939NmNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939NmNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939NmNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ControllerRefWrapper getControllerRef() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getControllerRef())) {
            
            return new ControllerRefWrapper(j1939NmNode.getControllerRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmCoordCluster() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNmCoordCluster())) {
            
            return new PositiveIntegerWrapper(j1939NmNode.getNmCoordCluster());
            
        } else {
            return null;
        }
        
    }

    public NmCoordinatorRoleEnumWrapper getNmCoordinatorRole() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNmCoordinatorRole())) {
            
            return new NmCoordinatorRoleEnumWrapper(j1939NmNode.getNmCoordinatorRole());
            
        } else {
            return null;
        }
        
    }

    public NmIfEcuRefWrapper getNmIfEcuRef() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNmIfEcuRef())) {
            
            return new NmIfEcuRefWrapper(j1939NmNode.getNmIfEcuRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNmNodeId() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNmNodeId())) {
            
            return new IntegerWrapper(j1939NmNode.getNmNodeId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPassiveModeEnabled() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNmPassiveModeEnabled())) {
            
            return new BooleanWrapper(j1939NmNode.getNmPassiveModeEnabled());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RxNmPduRefWrapper> getRxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getRxNmPduRefs())) {
            ArrayList<RxNmPduRef> originalList = j1939NmNode.getRxNmPduRefs();
            ArrayList<RxNmPduRefWrapper> wrapperList = (ArrayList<RxNmPduRefWrapper>)originalList.stream()
                .map(item -> new RxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TxNmPduRefWrapper> getTxNmPduRefs() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getTxNmPduRefs())) {
            ArrayList<TxNmPduRef> originalList = j1939NmNode.getTxNmPduRefs();
            ArrayList<TxNmPduRefWrapper> wrapperList = (ArrayList<TxNmPduRefWrapper>)originalList.stream()
                .map(item -> new TxNmPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939NmNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public J1939NodeNameWrapper getNodeName() {
        
        if (CollUtil.isNotEmpty(j1939NmNode.getNodeName())) {
            
            return new J1939NodeNameWrapper(j1939NmNode.getNodeName());
            
        } else {
            return null;
        }
        
    }




    


    
}
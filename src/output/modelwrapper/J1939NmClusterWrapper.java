package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class J1939NmClusterWrapper {

    
    private J1939NmCluster j1939NmCluster;

    public J1939NmClusterWrapper(J1939NmCluster j1939NmCluster) {
        this.j1939NmCluster = j1939NmCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getS())) {
            
            return j1939NmCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getT())) {
            
            return j1939NmCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getUuid())) {
            
            return j1939NmCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getShortName())) {
            
            return new IdentifierWrapper(j1939NmCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939NmCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939NmCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939NmCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getCategory())) {
            
            return new CategoryStringWrapper(j1939NmCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getAdminData())) {
            
            return new AdminDataWrapper(j1939NmCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939NmCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939NmCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(j1939NmCluster.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNmChannelId() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getNmChannelId())) {
            
            return new PositiveIntegerWrapper(j1939NmCluster.getNmChannelId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmChannelSleepMaster() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getNmChannelSleepMaster())) {
            
            return new BooleanWrapper(j1939NmCluster.getNmChannelSleepMaster());
            
        } else {
            return null;
        }
        
    }

    public NmNodesWrapper getNmNodes() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getNmNodes())) {
            
            return new NmNodesWrapper(j1939NmCluster.getNmNodes());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmSynchronizingNetwork() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getNmSynchronizingNetwork())) {
            
            return new BooleanWrapper(j1939NmCluster.getNmSynchronizingNetwork());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939NmCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAddressClaimEnabled() {
        
        if (CollUtil.isNotEmpty(j1939NmCluster.getAddressClaimEnabled())) {
            
            return new BooleanWrapper(j1939NmCluster.getAddressClaimEnabled());
            
        } else {
            return null;
        }
        
    }




    


    
}
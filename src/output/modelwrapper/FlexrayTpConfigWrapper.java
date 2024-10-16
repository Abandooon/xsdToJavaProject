package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayTpConfigWrapper {

    
    private FlexrayTpConfig flexrayTpConfig;

    public FlexrayTpConfigWrapper(FlexrayTpConfig flexrayTpConfig) {
        this.flexrayTpConfig = flexrayTpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getS())) {
            
            return flexrayTpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getT())) {
            
            return flexrayTpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getUuid())) {
            
            return flexrayTpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getShortName())) {
            
            return new IdentifierWrapper(flexrayTpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayTpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayTpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayTpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getCategory())) {
            
            return new CategoryStringWrapper(flexrayTpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getAdminData())) {
            
            return new AdminDataWrapper(flexrayTpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayTpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayTpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(flexrayTpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpPduPoolWrapper> getPduPools() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getPduPools())) {
            ArrayList<FlexrayTpPduPool> originalList = flexrayTpConfig.getPduPools();
            ArrayList<FlexrayTpPduPoolWrapper> wrapperList = (ArrayList<FlexrayTpPduPoolWrapper>)originalList.stream()
                .map(item -> new FlexrayTpPduPoolWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TpAddressWrapper> getTpAddresss() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getTpAddresss())) {
            ArrayList<TpAddress> originalList = flexrayTpConfig.getTpAddresss();
            ArrayList<TpAddressWrapper> wrapperList = (ArrayList<TpAddressWrapper>)originalList.stream()
                .map(item -> new TpAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getTpConnections())) {
            ArrayList<FlexrayTpConnection> originalList = flexrayTpConfig.getTpConnections();
            ArrayList<FlexrayTpConnectionWrapper> wrapperList = (ArrayList<FlexrayTpConnectionWrapper>)originalList.stream()
                .map(item -> new FlexrayTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpConnectionControlWrapper> getTpConnectionControls() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getTpConnectionControls())) {
            ArrayList<FlexrayTpConnectionControl> originalList = flexrayTpConfig.getTpConnectionControls();
            ArrayList<FlexrayTpConnectionControlWrapper> wrapperList = (ArrayList<FlexrayTpConnectionControlWrapper>)originalList.stream()
                .map(item -> new FlexrayTpConnectionControlWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpEcuWrapper> getTpEcus() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getTpEcus())) {
            ArrayList<FlexrayTpEcu> originalList = flexrayTpConfig.getTpEcus();
            ArrayList<FlexrayTpEcuWrapper> wrapperList = (ArrayList<FlexrayTpEcuWrapper>)originalList.stream()
                .map(item -> new FlexrayTpEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpNodeWrapper> getTpNodes() {
        
        if (CollUtil.isNotEmpty(flexrayTpConfig.getTpNodes())) {
            ArrayList<FlexrayTpNode> originalList = flexrayTpConfig.getTpNodes();
            ArrayList<FlexrayTpNodeWrapper> wrapperList = (ArrayList<FlexrayTpNodeWrapper>)originalList.stream()
                .map(item -> new FlexrayTpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
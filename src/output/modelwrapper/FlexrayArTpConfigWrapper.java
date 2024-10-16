package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayArTpConfigWrapper {

    
    private FlexrayArTpConfig flexrayArTpConfig;

    public FlexrayArTpConfigWrapper(FlexrayArTpConfig flexrayArTpConfig) {
        this.flexrayArTpConfig = flexrayArTpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getS())) {
            
            return flexrayArTpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getT())) {
            
            return flexrayArTpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getUuid())) {
            
            return flexrayArTpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getShortName())) {
            
            return new IdentifierWrapper(flexrayArTpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayArTpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayArTpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayArTpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getCategory())) {
            
            return new CategoryStringWrapper(flexrayArTpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getAdminData())) {
            
            return new AdminDataWrapper(flexrayArTpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayArTpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayArTpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayArTpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(flexrayArTpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TpAddressWrapper> getTpAddresss() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getTpAddresss())) {
            ArrayList<TpAddress> originalList = flexrayArTpConfig.getTpAddresss();
            ArrayList<TpAddressWrapper> wrapperList = (ArrayList<TpAddressWrapper>)originalList.stream()
                .map(item -> new TpAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayArTpChannelWrapper> getTpChannels() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getTpChannels())) {
            ArrayList<FlexrayArTpChannel> originalList = flexrayArTpConfig.getTpChannels();
            ArrayList<FlexrayArTpChannelWrapper> wrapperList = (ArrayList<FlexrayArTpChannelWrapper>)originalList.stream()
                .map(item -> new FlexrayArTpChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayArTpNodeWrapper> getTpNodes() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConfig.getTpNodes())) {
            ArrayList<FlexrayArTpNode> originalList = flexrayArTpConfig.getTpNodes();
            ArrayList<FlexrayArTpNodeWrapper> wrapperList = (ArrayList<FlexrayArTpNodeWrapper>)originalList.stream()
                .map(item -> new FlexrayArTpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
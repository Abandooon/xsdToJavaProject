package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CanTpConfigWrapper {

    
    private CanTpConfig canTpConfig;

    public CanTpConfigWrapper(CanTpConfig canTpConfig) {
        this.canTpConfig = canTpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getS())) {
            
            return canTpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getT())) {
            
            return canTpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getUuid())) {
            
            return canTpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getShortName())) {
            
            return new IdentifierWrapper(canTpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canTpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canTpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canTpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getCategory())) {
            
            return new CategoryStringWrapper(canTpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getAdminData())) {
            
            return new AdminDataWrapper(canTpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canTpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = canTpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(canTpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpAddressWrapper> getTpAddresss() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getTpAddresss())) {
            ArrayList<CanTpAddress> originalList = canTpConfig.getTpAddresss();
            ArrayList<CanTpAddressWrapper> wrapperList = (ArrayList<CanTpAddressWrapper>)originalList.stream()
                .map(item -> new CanTpAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpChannelWrapper> getTpChannels() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getTpChannels())) {
            ArrayList<CanTpChannel> originalList = canTpConfig.getTpChannels();
            ArrayList<CanTpChannelWrapper> wrapperList = (ArrayList<CanTpChannelWrapper>)originalList.stream()
                .map(item -> new CanTpChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getTpConnections())) {
            ArrayList<CanTpConnection> originalList = canTpConfig.getTpConnections();
            ArrayList<CanTpConnectionWrapper> wrapperList = (ArrayList<CanTpConnectionWrapper>)originalList.stream()
                .map(item -> new CanTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpEcuWrapper> getTpEcus() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getTpEcus())) {
            ArrayList<CanTpEcu> originalList = canTpConfig.getTpEcus();
            ArrayList<CanTpEcuWrapper> wrapperList = (ArrayList<CanTpEcuWrapper>)originalList.stream()
                .map(item -> new CanTpEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpNodeWrapper> getTpNodes() {
        
        if (CollUtil.isNotEmpty(canTpConfig.getTpNodes())) {
            ArrayList<CanTpNode> originalList = canTpConfig.getTpNodes();
            ArrayList<CanTpNodeWrapper> wrapperList = (ArrayList<CanTpNodeWrapper>)originalList.stream()
                .map(item -> new CanTpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
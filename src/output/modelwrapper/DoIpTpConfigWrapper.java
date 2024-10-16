package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DoIpTpConfigWrapper {

    
    private DoIpTpConfig doIpTpConfig;

    public DoIpTpConfigWrapper(DoIpTpConfig doIpTpConfig) {
        this.doIpTpConfig = doIpTpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getS())) {
            
            return doIpTpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getT())) {
            
            return doIpTpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getUuid())) {
            
            return doIpTpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getShortName())) {
            
            return new IdentifierWrapper(doIpTpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpTpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpTpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpTpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getCategory())) {
            
            return new CategoryStringWrapper(doIpTpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getAdminData())) {
            
            return new AdminDataWrapper(doIpTpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpTpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpTpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(doIpTpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(doIpTpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpLogicAddressWrapper> getDoIpLogicAddresss() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getDoIpLogicAddresss())) {
            ArrayList<DoIpLogicAddress> originalList = doIpTpConfig.getDoIpLogicAddresss();
            ArrayList<DoIpLogicAddressWrapper> wrapperList = (ArrayList<DoIpLogicAddressWrapper>)originalList.stream()
                .map(item -> new DoIpLogicAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpTpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(doIpTpConfig.getTpConnections())) {
            ArrayList<DoIpTpConnection> originalList = doIpTpConfig.getTpConnections();
            ArrayList<DoIpTpConnectionWrapper> wrapperList = (ArrayList<DoIpTpConnectionWrapper>)originalList.stream()
                .map(item -> new DoIpTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
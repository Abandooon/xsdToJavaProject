package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class J1939TpConfigWrapper {

    
    private J1939TpConfig j1939TpConfig;

    public J1939TpConfigWrapper(J1939TpConfig j1939TpConfig) {
        this.j1939TpConfig = j1939TpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getS())) {
            
            return j1939TpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getT())) {
            
            return j1939TpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getUuid())) {
            
            return j1939TpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getShortName())) {
            
            return new IdentifierWrapper(j1939TpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939TpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939TpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939TpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getCategory())) {
            
            return new CategoryStringWrapper(j1939TpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getAdminData())) {
            
            return new AdminDataWrapper(j1939TpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939TpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939TpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939TpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(j1939TpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TpAddressWrapper> getTpAddresss() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getTpAddresss())) {
            ArrayList<TpAddress> originalList = j1939TpConfig.getTpAddresss();
            ArrayList<TpAddressWrapper> wrapperList = (ArrayList<TpAddressWrapper>)originalList.stream()
                .map(item -> new TpAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939TpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getTpConnections())) {
            ArrayList<J1939TpConnection> originalList = j1939TpConfig.getTpConnections();
            ArrayList<J1939TpConnectionWrapper> wrapperList = (ArrayList<J1939TpConnectionWrapper>)originalList.stream()
                .map(item -> new J1939TpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939TpNodeWrapper> getTpNodes() {
        
        if (CollUtil.isNotEmpty(j1939TpConfig.getTpNodes())) {
            ArrayList<J1939TpNode> originalList = j1939TpConfig.getTpNodes();
            ArrayList<J1939TpNodeWrapper> wrapperList = (ArrayList<J1939TpNodeWrapper>)originalList.stream()
                .map(item -> new J1939TpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
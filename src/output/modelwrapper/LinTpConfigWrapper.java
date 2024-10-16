package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class LinTpConfigWrapper {

    
    private LinTpConfig linTpConfig;

    public LinTpConfigWrapper(LinTpConfig linTpConfig) {
        this.linTpConfig = linTpConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getS())) {
            
            return linTpConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getT())) {
            
            return linTpConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getUuid())) {
            
            return linTpConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getShortName())) {
            
            return new IdentifierWrapper(linTpConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linTpConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linTpConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linTpConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getCategory())) {
            
            return new CategoryStringWrapper(linTpConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getAdminData())) {
            
            return new AdminDataWrapper(linTpConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linTpConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = linTpConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(linTpConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRefWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRefWrapper(linTpConfig.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TpAddressWrapper> getTpAddresss() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getTpAddresss())) {
            ArrayList<TpAddress> originalList = linTpConfig.getTpAddresss();
            ArrayList<TpAddressWrapper> wrapperList = (ArrayList<TpAddressWrapper>)originalList.stream()
                .map(item -> new TpAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinTpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getTpConnections())) {
            ArrayList<LinTpConnection> originalList = linTpConfig.getTpConnections();
            ArrayList<LinTpConnectionWrapper> wrapperList = (ArrayList<LinTpConnectionWrapper>)originalList.stream()
                .map(item -> new LinTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinTpNodeWrapper> getTpNodes() {
        
        if (CollUtil.isNotEmpty(linTpConfig.getTpNodes())) {
            ArrayList<LinTpNode> originalList = linTpConfig.getTpNodes();
            ArrayList<LinTpNodeWrapper> wrapperList = (ArrayList<LinTpNodeWrapper>)originalList.stream()
                .map(item -> new LinTpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
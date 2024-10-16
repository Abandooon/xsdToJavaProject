package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class NmConfigWrapper {

    
    private NmConfig nmConfig;

    public NmConfigWrapper(NmConfig nmConfig) {
        this.nmConfig = nmConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmConfig.getS())) {
            
            return nmConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmConfig.getT())) {
            
            return nmConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nmConfig.getUuid())) {
            
            return nmConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nmConfig.getShortName())) {
            
            return new IdentifierWrapper(nmConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nmConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nmConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nmConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nmConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nmConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nmConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nmConfig.getCategory())) {
            
            return new CategoryStringWrapper(nmConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nmConfig.getAdminData())) {
            
            return new AdminDataWrapper(nmConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nmConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nmConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nmConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = nmConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nmConfig.getVariationPoint())) {
            
            return new VariationPointWrapper(nmConfig.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public NmClustersWrapper getNmClusters() {
        
        if (CollUtil.isNotEmpty(nmConfig.getNmClusters())) {
            
            return new NmClustersWrapper(nmConfig.getNmClusters());
            
        } else {
            return null;
        }
        
    }

    public NmClusterCouplingsWrapper getNmClusterCouplings() {
        
        if (CollUtil.isNotEmpty(nmConfig.getNmClusterCouplings())) {
            
            return new NmClusterCouplingsWrapper(nmConfig.getNmClusterCouplings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NmEcuWrapper> getNmIfEcus() {
        
        if (CollUtil.isNotEmpty(nmConfig.getNmIfEcus())) {
            ArrayList<NmEcu> originalList = nmConfig.getNmIfEcus();
            ArrayList<NmEcuWrapper> wrapperList = (ArrayList<NmEcuWrapper>)originalList.stream()
                .map(item -> new NmEcuWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
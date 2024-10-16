package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class EthernetClusterWrapper {

    
    private EthernetCluster ethernetCluster;

    public EthernetClusterWrapper(EthernetCluster ethernetCluster) {
        this.ethernetCluster = ethernetCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getS())) {
            
            return ethernetCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getT())) {
            
            return ethernetCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getUuid())) {
            
            return ethernetCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getShortName())) {
            
            return new IdentifierWrapper(ethernetCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getCategory())) {
            
            return new CategoryStringWrapper(ethernetCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getAdminData())) {
            
            return new AdminDataWrapper(ethernetCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetClusterConditionalWrapper> getEthernetClusterVariants() {
        
        if (CollUtil.isNotEmpty(ethernetCluster.getEthernetClusterVariants())) {
            ArrayList<EthernetClusterConditional> originalList = ethernetCluster.getEthernetClusterVariants();
            ArrayList<EthernetClusterConditionalWrapper> wrapperList = (ArrayList<EthernetClusterConditionalWrapper>)originalList.stream()
                .map(item -> new EthernetClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
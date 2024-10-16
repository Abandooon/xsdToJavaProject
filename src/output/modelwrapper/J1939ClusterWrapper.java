package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class J1939ClusterWrapper {

    
    private J1939Cluster j1939Cluster;

    public J1939ClusterWrapper(J1939Cluster j1939Cluster) {
        this.j1939Cluster = j1939Cluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getS())) {
            
            return j1939Cluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getT())) {
            
            return j1939Cluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getUuid())) {
            
            return j1939Cluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getShortName())) {
            
            return new IdentifierWrapper(j1939Cluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939Cluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939Cluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939Cluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getCategory())) {
            
            return new CategoryStringWrapper(j1939Cluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getAdminData())) {
            
            return new AdminDataWrapper(j1939Cluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939Cluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939Cluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939Cluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939ClusterConditionalWrapper> getJ1939ClusterVariants() {
        
        if (CollUtil.isNotEmpty(j1939Cluster.getJ1939ClusterVariants())) {
            ArrayList<J1939ClusterConditional> originalList = j1939Cluster.getJ1939ClusterVariants();
            ArrayList<J1939ClusterConditionalWrapper> wrapperList = (ArrayList<J1939ClusterConditionalWrapper>)originalList.stream()
                .map(item -> new J1939ClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
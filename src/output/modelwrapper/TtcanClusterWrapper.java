package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class TtcanClusterWrapper {

    
    private TtcanCluster ttcanCluster;

    public TtcanClusterWrapper(TtcanCluster ttcanCluster) {
        this.ttcanCluster = ttcanCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getS())) {
            
            return ttcanCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getT())) {
            
            return ttcanCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getUuid())) {
            
            return ttcanCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getShortName())) {
            
            return new IdentifierWrapper(ttcanCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ttcanCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ttcanCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ttcanCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getCategory())) {
            
            return new CategoryStringWrapper(ttcanCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getAdminData())) {
            
            return new AdminDataWrapper(ttcanCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ttcanCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = ttcanCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(ttcanCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanClusterConditionalWrapper> getTtcanClusterVariants() {
        
        if (CollUtil.isNotEmpty(ttcanCluster.getTtcanClusterVariants())) {
            ArrayList<TtcanClusterConditional> originalList = ttcanCluster.getTtcanClusterVariants();
            ArrayList<TtcanClusterConditionalWrapper> wrapperList = (ArrayList<TtcanClusterConditionalWrapper>)originalList.stream()
                .map(item -> new TtcanClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
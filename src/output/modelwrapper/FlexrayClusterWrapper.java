package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class FlexrayClusterWrapper {

    
    private FlexrayCluster flexrayCluster;

    public FlexrayClusterWrapper(FlexrayCluster flexrayCluster) {
        this.flexrayCluster = flexrayCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getS())) {
            
            return flexrayCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getT())) {
            
            return flexrayCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getUuid())) {
            
            return flexrayCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getShortName())) {
            
            return new IdentifierWrapper(flexrayCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getCategory())) {
            
            return new CategoryStringWrapper(flexrayCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getAdminData())) {
            
            return new AdminDataWrapper(flexrayCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayClusterConditionalWrapper> getFlexrayClusterVariants() {
        
        if (CollUtil.isNotEmpty(flexrayCluster.getFlexrayClusterVariants())) {
            ArrayList<FlexrayClusterConditional> originalList = flexrayCluster.getFlexrayClusterVariants();
            ArrayList<FlexrayClusterConditionalWrapper> wrapperList = (ArrayList<FlexrayClusterConditionalWrapper>)originalList.stream()
                .map(item -> new FlexrayClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
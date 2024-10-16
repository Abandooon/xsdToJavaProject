package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class CanClusterWrapper {

    
    private CanCluster canCluster;

    public CanClusterWrapper(CanCluster canCluster) {
        this.canCluster = canCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canCluster.getS())) {
            
            return canCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canCluster.getT())) {
            
            return canCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canCluster.getUuid())) {
            
            return canCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canCluster.getShortName())) {
            
            return new IdentifierWrapper(canCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canCluster.getCategory())) {
            
            return new CategoryStringWrapper(canCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canCluster.getAdminData())) {
            
            return new AdminDataWrapper(canCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = canCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(canCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CanClusterConditionalWrapper> getCanClusterVariants() {
        
        if (CollUtil.isNotEmpty(canCluster.getCanClusterVariants())) {
            ArrayList<CanClusterConditional> originalList = canCluster.getCanClusterVariants();
            ArrayList<CanClusterConditionalWrapper> wrapperList = (ArrayList<CanClusterConditionalWrapper>)originalList.stream()
                .map(item -> new CanClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class UserDefinedClusterWrapper {

    
    private UserDefinedCluster userDefinedCluster;

    public UserDefinedClusterWrapper(UserDefinedCluster userDefinedCluster) {
        this.userDefinedCluster = userDefinedCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getS())) {
            
            return userDefinedCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getT())) {
            
            return userDefinedCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getUuid())) {
            
            return userDefinedCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getShortName())) {
            
            return new IdentifierWrapper(userDefinedCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedClusterConditionalWrapper> getUserDefinedClusterVariants() {
        
        if (CollUtil.isNotEmpty(userDefinedCluster.getUserDefinedClusterVariants())) {
            ArrayList<UserDefinedClusterConditional> originalList = userDefinedCluster.getUserDefinedClusterVariants();
            ArrayList<UserDefinedClusterConditionalWrapper> wrapperList = (ArrayList<UserDefinedClusterConditionalWrapper>)originalList.stream()
                .map(item -> new UserDefinedClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
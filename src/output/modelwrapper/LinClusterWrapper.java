package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class LinClusterWrapper {

    
    private LinCluster linCluster;

    public LinClusterWrapper(LinCluster linCluster) {
        this.linCluster = linCluster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linCluster.getS())) {
            
            return linCluster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linCluster.getT())) {
            
            return linCluster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linCluster.getUuid())) {
            
            return linCluster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linCluster.getShortName())) {
            
            return new IdentifierWrapper(linCluster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linCluster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linCluster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linCluster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linCluster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linCluster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linCluster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linCluster.getCategory())) {
            
            return new CategoryStringWrapper(linCluster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linCluster.getAdminData())) {
            
            return new AdminDataWrapper(linCluster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linCluster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linCluster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linCluster.getAnnotations())) {
            ArrayList<Annotation> originalList = linCluster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linCluster.getVariationPoint())) {
            
            return new VariationPointWrapper(linCluster.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LinClusterConditionalWrapper> getLinClusterVariants() {
        
        if (CollUtil.isNotEmpty(linCluster.getLinClusterVariants())) {
            ArrayList<LinClusterConditional> originalList = linCluster.getLinClusterVariants();
            ArrayList<LinClusterConditionalWrapper> wrapperList = (ArrayList<LinClusterConditionalWrapper>)originalList.stream()
                .map(item -> new LinClusterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
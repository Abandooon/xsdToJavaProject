package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ConstantSpecificationMappingSetWrapper {

    
    private ConstantSpecificationMappingSet constantSpecificationMappingSet;

    public ConstantSpecificationMappingSetWrapper(ConstantSpecificationMappingSet constantSpecificationMappingSet) {
        this.constantSpecificationMappingSet = constantSpecificationMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getS())) {
            
            return constantSpecificationMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getT())) {
            
            return constantSpecificationMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getUuid())) {
            
            return constantSpecificationMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getShortName())) {
            
            return new IdentifierWrapper(constantSpecificationMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = constantSpecificationMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(constantSpecificationMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(constantSpecificationMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(constantSpecificationMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(constantSpecificationMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(constantSpecificationMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = constantSpecificationMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(constantSpecificationMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantSpecificationMappingWrapper> getMappings() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMappingSet.getMappings())) {
            ArrayList<ConstantSpecificationMapping> originalList = constantSpecificationMappingSet.getMappings();
            ArrayList<ConstantSpecificationMappingWrapper> wrapperList = (ArrayList<ConstantSpecificationMappingWrapper>)originalList.stream()
                .map(item -> new ConstantSpecificationMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
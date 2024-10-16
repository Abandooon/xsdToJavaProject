package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ConstantSpecificationWrapper {

    
    private ConstantSpecification constantSpecification;

    public ConstantSpecificationWrapper(ConstantSpecification constantSpecification) {
        this.constantSpecification = constantSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getS())) {
            
            return constantSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getT())) {
            
            return constantSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getUuid())) {
            
            return constantSpecification.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getShortName())) {
            
            return new IdentifierWrapper(constantSpecification.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = constantSpecification.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getLongName())) {
            
            return new MultilanguageLongNameWrapper(constantSpecification.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(constantSpecification.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getCategory())) {
            
            return new CategoryStringWrapper(constantSpecification.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getAdminData())) {
            
            return new AdminDataWrapper(constantSpecification.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getIntroduction())) {
            
            return new DocumentationBlockWrapper(constantSpecification.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getAnnotations())) {
            ArrayList<Annotation> originalList = constantSpecification.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(constantSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ValueSpecWrapper getValueSpec() {
        
        if (CollUtil.isNotEmpty(constantSpecification.getValueSpec())) {
            
            return new ValueSpecWrapper(constantSpecification.getValueSpec());
            
        } else {
            return null;
        }
        
    }




    


    
}
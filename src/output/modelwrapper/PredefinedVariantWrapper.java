package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class PredefinedVariantWrapper {

    
    private PredefinedVariant predefinedVariant;

    public PredefinedVariantWrapper(PredefinedVariant predefinedVariant) {
        this.predefinedVariant = predefinedVariant;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getS())) {
            
            return predefinedVariant.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getT())) {
            
            return predefinedVariant.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getUuid())) {
            
            return predefinedVariant.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getShortName())) {
            
            return new IdentifierWrapper(predefinedVariant.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = predefinedVariant.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getLongName())) {
            
            return new MultilanguageLongNameWrapper(predefinedVariant.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(predefinedVariant.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getCategory())) {
            
            return new CategoryStringWrapper(predefinedVariant.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getAdminData())) {
            
            return new AdminDataWrapper(predefinedVariant.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getIntroduction())) {
            
            return new DocumentationBlockWrapper(predefinedVariant.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getAnnotations())) {
            ArrayList<Annotation> originalList = predefinedVariant.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getVariationPoint())) {
            
            return new VariationPointWrapper(predefinedVariant.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedVariantRefWrapper> getIncludedVariantRefs() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getIncludedVariantRefs())) {
            ArrayList<IncludedVariantRef> originalList = predefinedVariant.getIncludedVariantRefs();
            ArrayList<IncludedVariantRefWrapper> wrapperList = (ArrayList<IncludedVariantRefWrapper>)originalList.stream()
                .map(item -> new IncludedVariantRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantCriterionValueSetRefWrapper> getPostBuildVariantCriterionValueSetRefs() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getPostBuildVariantCriterionValueSetRefs())) {
            ArrayList<PostBuildVariantCriterionValueSetRef> originalList = predefinedVariant.getPostBuildVariantCriterionValueSetRefs();
            ArrayList<PostBuildVariantCriterionValueSetRefWrapper> wrapperList = (ArrayList<PostBuildVariantCriterionValueSetRefWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantCriterionValueSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwSystemconstantValueSetRefWrapper> getSwSystemconstantValueSetRefs() {
        
        if (CollUtil.isNotEmpty(predefinedVariant.getSwSystemconstantValueSetRefs())) {
            ArrayList<SwSystemconstantValueSetRef> originalList = predefinedVariant.getSwSystemconstantValueSetRefs();
            ArrayList<SwSystemconstantValueSetRefWrapper> wrapperList = (ArrayList<SwSystemconstantValueSetRefWrapper>)originalList.stream()
                .map(item -> new SwSystemconstantValueSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
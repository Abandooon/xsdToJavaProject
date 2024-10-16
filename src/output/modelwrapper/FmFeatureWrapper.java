package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FmFeatureWrapper {

    
    private FmFeature fmFeature;

    public FmFeatureWrapper(FmFeature fmFeature) {
        this.fmFeature = fmFeature;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeature.getS())) {
            
            return fmFeature.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeature.getT())) {
            
            return fmFeature.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeature.getUuid())) {
            
            return fmFeature.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeature.getShortName())) {
            
            return new IdentifierWrapper(fmFeature.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeature.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeature.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeature.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeature.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeature.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeature.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeature.getCategory())) {
            
            return new CategoryStringWrapper(fmFeature.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeature.getAdminData())) {
            
            return new AdminDataWrapper(fmFeature.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeature.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeature.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeature.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeature.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(fmFeature.getVariationPoint())) {
            
            return new VariationPointWrapper(fmFeature.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FmAttributeDefWrapper> getAttributeDefs() {
        
        if (CollUtil.isNotEmpty(fmFeature.getAttributeDefs())) {
            ArrayList<FmAttributeDef> originalList = fmFeature.getAttributeDefs();
            ArrayList<FmAttributeDefWrapper> wrapperList = (ArrayList<FmAttributeDefWrapper>)originalList.stream()
                .map(item -> new FmAttributeDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureDecompositionWrapper> getDecompositions() {
        
        if (CollUtil.isNotEmpty(fmFeature.getDecompositions())) {
            ArrayList<FmFeatureDecomposition> originalList = fmFeature.getDecompositions();
            ArrayList<FmFeatureDecompositionWrapper> wrapperList = (ArrayList<FmFeatureDecompositionWrapper>)originalList.stream()
                .map(item -> new FmFeatureDecompositionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumWrapper getMaximumIntendedBindingTime() {
        
        if (CollUtil.isNotEmpty(fmFeature.getMaximumIntendedBindingTime())) {
            
            return new BindingTimeEnumWrapper(fmFeature.getMaximumIntendedBindingTime());
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumWrapper getMinimumIntendedBindingTime() {
        
        if (CollUtil.isNotEmpty(fmFeature.getMinimumIntendedBindingTime())) {
            
            return new BindingTimeEnumWrapper(fmFeature.getMinimumIntendedBindingTime());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureRelationWrapper> getRelations() {
        
        if (CollUtil.isNotEmpty(fmFeature.getRelations())) {
            ArrayList<FmFeatureRelation> originalList = fmFeature.getRelations();
            ArrayList<FmFeatureRelationWrapper> wrapperList = (ArrayList<FmFeatureRelationWrapper>)originalList.stream()
                .map(item -> new FmFeatureRelationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureRestrictionWrapper> getRestrictions() {
        
        if (CollUtil.isNotEmpty(fmFeature.getRestrictions())) {
            ArrayList<FmFeatureRestriction> originalList = fmFeature.getRestrictions();
            ArrayList<FmFeatureRestrictionWrapper> wrapperList = (ArrayList<FmFeatureRestrictionWrapper>)originalList.stream()
                .map(item -> new FmFeatureRestrictionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
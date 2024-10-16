package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class FmFeatureRestrictionWrapper {

    
    private FmFeatureRestriction fmFeatureRestriction;

    public FmFeatureRestrictionWrapper(FmFeatureRestriction fmFeatureRestriction) {
        this.fmFeatureRestriction = fmFeatureRestriction;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getS())) {
            
            return fmFeatureRestriction.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getT())) {
            
            return fmFeatureRestriction.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getUuid())) {
            
            return fmFeatureRestriction.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureRestriction.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureRestriction.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureRestriction.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureRestriction.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureRestriction.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureRestriction.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureRestriction.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureRestriction.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FmConditionByFeaturesAndAttributesWrapper getRestriction() {
        
        if (CollUtil.isNotEmpty(fmFeatureRestriction.getRestriction())) {
            
            return new FmConditionByFeaturesAndAttributesWrapper(fmFeatureRestriction.getRestriction());
            
        } else {
            return null;
        }
        
    }




    


    
}
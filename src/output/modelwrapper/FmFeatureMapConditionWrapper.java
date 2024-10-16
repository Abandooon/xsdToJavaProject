package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class FmFeatureMapConditionWrapper {

    
    private FmFeatureMapCondition fmFeatureMapCondition;

    public FmFeatureMapConditionWrapper(FmFeatureMapCondition fmFeatureMapCondition) {
        this.fmFeatureMapCondition = fmFeatureMapCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getS())) {
            
            return fmFeatureMapCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getT())) {
            
            return fmFeatureMapCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getUuid())) {
            
            return fmFeatureMapCondition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureMapCondition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureMapCondition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureMapCondition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureMapCondition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureMapCondition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureMapCondition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureMapCondition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureMapCondition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FmConditionByFeaturesAndAttributesWrapper getFmCond() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapCondition.getFmCond())) {
            
            return new FmConditionByFeaturesAndAttributesWrapper(fmFeatureMapCondition.getFmCond());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class FmFeatureMapAssertionWrapper {

    
    private FmFeatureMapAssertion fmFeatureMapAssertion;

    public FmFeatureMapAssertionWrapper(FmFeatureMapAssertion fmFeatureMapAssertion) {
        this.fmFeatureMapAssertion = fmFeatureMapAssertion;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getS())) {
            
            return fmFeatureMapAssertion.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getT())) {
            
            return fmFeatureMapAssertion.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getUuid())) {
            
            return fmFeatureMapAssertion.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureMapAssertion.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureMapAssertion.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureMapAssertion.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureMapAssertion.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureMapAssertion.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureMapAssertion.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureMapAssertion.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureMapAssertion.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FmConditionByFeaturesAndSwSystemconstsWrapper getFmSyscond() {
        
        if (CollUtil.isNotEmpty(fmFeatureMapAssertion.getFmSyscond())) {
            
            return new FmConditionByFeaturesAndSwSystemconstsWrapper(fmFeatureMapAssertion.getFmSyscond());
            
        } else {
            return null;
        }
        
    }




    


    
}
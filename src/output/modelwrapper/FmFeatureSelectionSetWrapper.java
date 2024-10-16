package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class FmFeatureSelectionSetWrapper {

    
    private FmFeatureSelectionSet fmFeatureSelectionSet;

    public FmFeatureSelectionSetWrapper(FmFeatureSelectionSet fmFeatureSelectionSet) {
        this.fmFeatureSelectionSet = fmFeatureSelectionSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getS())) {
            
            return fmFeatureSelectionSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getT())) {
            
            return fmFeatureSelectionSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getUuid())) {
            
            return fmFeatureSelectionSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureSelectionSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureSelectionSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureSelectionSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureSelectionSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureSelectionSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureSelectionSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureSelectionSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureSelectionSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getVariationPoint())) {
            
            return new VariationPointWrapper(fmFeatureSelectionSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FeatureModelRefWrapper> getFeatureModelRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getFeatureModelRefs())) {
            ArrayList<FeatureModelRef> originalList = fmFeatureSelectionSet.getFeatureModelRefs();
            ArrayList<FeatureModelRefWrapper> wrapperList = (ArrayList<FeatureModelRefWrapper>)originalList.stream()
                .map(item -> new FeatureModelRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludeRefWrapper> getIncludeRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getIncludeRefs())) {
            ArrayList<IncludeRef> originalList = fmFeatureSelectionSet.getIncludeRefs();
            ArrayList<IncludeRefWrapper> wrapperList = (ArrayList<IncludeRefWrapper>)originalList.stream()
                .map(item -> new IncludeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureSelectionWrapper> getSelections() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelectionSet.getSelections())) {
            ArrayList<FmFeatureSelection> originalList = fmFeatureSelectionSet.getSelections();
            ArrayList<FmFeatureSelectionWrapper> wrapperList = (ArrayList<FmFeatureSelectionWrapper>)originalList.stream()
                .map(item -> new FmFeatureSelectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
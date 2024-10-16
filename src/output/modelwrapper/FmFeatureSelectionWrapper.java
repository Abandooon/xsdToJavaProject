package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class FmFeatureSelectionWrapper {

    
    private FmFeatureSelection fmFeatureSelection;

    public FmFeatureSelectionWrapper(FmFeatureSelection fmFeatureSelection) {
        this.fmFeatureSelection = fmFeatureSelection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getS())) {
            
            return fmFeatureSelection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getT())) {
            
            return fmFeatureSelection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getUuid())) {
            
            return fmFeatureSelection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureSelection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureSelection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureSelection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureSelection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureSelection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureSelection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureSelection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureSelection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FeatureRefWrapper getFeatureRef() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getFeatureRef())) {
            
            return new FeatureRefWrapper(fmFeatureSelection.getFeatureRef());
            
        } else {
            return null;
        }
        
    }

    public FmFeatureSelectionStateWrapper getState() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getState())) {
            
            return new FmFeatureSelectionStateWrapper(fmFeatureSelection.getState());
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumWrapper getMinimumSelectedBindingTime() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getMinimumSelectedBindingTime())) {
            
            return new BindingTimeEnumWrapper(fmFeatureSelection.getMinimumSelectedBindingTime());
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumWrapper getMaximumSelectedBindingTime() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getMaximumSelectedBindingTime())) {
            
            return new BindingTimeEnumWrapper(fmFeatureSelection.getMaximumSelectedBindingTime());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FmAttributeValueWrapper> getAttributeValues() {
        
        if (CollUtil.isNotEmpty(fmFeatureSelection.getAttributeValues())) {
            ArrayList<FmAttributeValue> originalList = fmFeatureSelection.getAttributeValues();
            ArrayList<FmAttributeValueWrapper> wrapperList = (ArrayList<FmAttributeValueWrapper>)originalList.stream()
                .map(item -> new FmAttributeValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class FmFeatureModelWrapper {

    
    private FmFeatureModel fmFeatureModel;

    public FmFeatureModelWrapper(FmFeatureModel fmFeatureModel) {
        this.fmFeatureModel = fmFeatureModel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getS())) {
            
            return fmFeatureModel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getT())) {
            
            return fmFeatureModel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getUuid())) {
            
            return fmFeatureModel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureModel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureModel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureModel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureModel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureModel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureModel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureModel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureModel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getVariationPoint())) {
            
            return new VariationPointWrapper(fmFeatureModel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FeatureRefWrapper> getFeatureRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getFeatureRefs())) {
            ArrayList<FeatureRef> originalList = fmFeatureModel.getFeatureRefs();
            ArrayList<FeatureRefWrapper> wrapperList = (ArrayList<FeatureRefWrapper>)originalList.stream()
                .map(item -> new FeatureRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RootRefWrapper getRootRef() {
        
        if (CollUtil.isNotEmpty(fmFeatureModel.getRootRef())) {
            
            return new RootRefWrapper(fmFeatureModel.getRootRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
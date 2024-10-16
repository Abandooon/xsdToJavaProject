package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class FmFeatureRelationWrapper {

    
    private FmFeatureRelation fmFeatureRelation;

    public FmFeatureRelationWrapper(FmFeatureRelation fmFeatureRelation) {
        this.fmFeatureRelation = fmFeatureRelation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getS())) {
            
            return fmFeatureRelation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getT())) {
            
            return fmFeatureRelation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getUuid())) {
            
            return fmFeatureRelation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureRelation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureRelation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureRelation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureRelation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureRelation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureRelation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureRelation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureRelation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FeatureRefWrapper> getFeatureRefs() {
        
        if (CollUtil.isNotEmpty(fmFeatureRelation.getFeatureRefs())) {
            ArrayList<FeatureRef> originalList = fmFeatureRelation.getFeatureRefs();
            ArrayList<FeatureRefWrapper> wrapperList = (ArrayList<FeatureRefWrapper>)originalList.stream()
                .map(item -> new FeatureRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
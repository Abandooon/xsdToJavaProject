package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class FmFeatureMapWrapper {

    
    private FmFeatureMap fmFeatureMap;

    public FmFeatureMapWrapper(FmFeatureMap fmFeatureMap) {
        this.fmFeatureMap = fmFeatureMap;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getS())) {
            
            return fmFeatureMap.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getT())) {
            
            return fmFeatureMap.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getUuid())) {
            
            return fmFeatureMap.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getShortName())) {
            
            return new IdentifierWrapper(fmFeatureMap.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = fmFeatureMap.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getLongName())) {
            
            return new MultilanguageLongNameWrapper(fmFeatureMap.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(fmFeatureMap.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getCategory())) {
            
            return new CategoryStringWrapper(fmFeatureMap.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getAdminData())) {
            
            return new AdminDataWrapper(fmFeatureMap.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getIntroduction())) {
            
            return new DocumentationBlockWrapper(fmFeatureMap.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getAnnotations())) {
            ArrayList<Annotation> originalList = fmFeatureMap.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getVariationPoint())) {
            
            return new VariationPointWrapper(fmFeatureMap.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureMapElementWrapper> getMappings() {
        
        if (CollUtil.isNotEmpty(fmFeatureMap.getMappings())) {
            ArrayList<FmFeatureMapElement> originalList = fmFeatureMap.getMappings();
            ArrayList<FmFeatureMapElementWrapper> wrapperList = (ArrayList<FmFeatureMapElementWrapper>)originalList.stream()
                .map(item -> new FmFeatureMapElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
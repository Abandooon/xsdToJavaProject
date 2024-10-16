package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ViewMapSetWrapper {

    
    private ViewMapSet viewMapSet;

    public ViewMapSetWrapper(ViewMapSet viewMapSet) {
        this.viewMapSet = viewMapSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getS())) {
            
            return viewMapSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getT())) {
            
            return viewMapSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getUuid())) {
            
            return viewMapSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getShortName())) {
            
            return new IdentifierWrapper(viewMapSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = viewMapSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(viewMapSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(viewMapSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getCategory())) {
            
            return new CategoryStringWrapper(viewMapSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getAdminData())) {
            
            return new AdminDataWrapper(viewMapSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(viewMapSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getAnnotations())) {
            ArrayList<Annotation> originalList = viewMapSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getVariationPoint())) {
            
            return new VariationPointWrapper(viewMapSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ViewMapWrapper> getViewMaps() {
        
        if (CollUtil.isNotEmpty(viewMapSet.getViewMaps())) {
            ArrayList<ViewMap> originalList = viewMapSet.getViewMaps();
            ArrayList<ViewMapWrapper> wrapperList = (ArrayList<ViewMapWrapper>)originalList.stream()
                .map(item -> new ViewMapWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
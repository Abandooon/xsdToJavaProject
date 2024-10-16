package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class InterpolationRoutineMappingSetWrapper {

    
    private InterpolationRoutineMappingSet interpolationRoutineMappingSet;

    public InterpolationRoutineMappingSetWrapper(InterpolationRoutineMappingSet interpolationRoutineMappingSet) {
        this.interpolationRoutineMappingSet = interpolationRoutineMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getS())) {
            
            return interpolationRoutineMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getT())) {
            
            return interpolationRoutineMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getUuid())) {
            
            return interpolationRoutineMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getShortName())) {
            
            return new IdentifierWrapper(interpolationRoutineMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = interpolationRoutineMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(interpolationRoutineMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(interpolationRoutineMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(interpolationRoutineMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(interpolationRoutineMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(interpolationRoutineMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = interpolationRoutineMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(interpolationRoutineMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<InterpolationRoutineMappingWrapper> getInterpolationRoutineMappings() {
        
        if (CollUtil.isNotEmpty(interpolationRoutineMappingSet.getInterpolationRoutineMappings())) {
            ArrayList<InterpolationRoutineMapping> originalList = interpolationRoutineMappingSet.getInterpolationRoutineMappings();
            ArrayList<InterpolationRoutineMappingWrapper> wrapperList = (ArrayList<InterpolationRoutineMappingWrapper>)originalList.stream()
                .map(item -> new InterpolationRoutineMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
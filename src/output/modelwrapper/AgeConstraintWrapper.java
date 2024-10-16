package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class AgeConstraintWrapper {

    
    private AgeConstraint ageConstraint;

    public AgeConstraintWrapper(AgeConstraint ageConstraint) {
        this.ageConstraint = ageConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getS())) {
            
            return ageConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getT())) {
            
            return ageConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getUuid())) {
            
            return ageConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getShortName())) {
            
            return new IdentifierWrapper(ageConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ageConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ageConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ageConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getCategory())) {
            
            return new CategoryStringWrapper(ageConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getAdminData())) {
            
            return new AdminDataWrapper(ageConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ageConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = ageConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = ageConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(ageConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximum() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getMaximum())) {
            
            return new MultidimensionalTimeWrapper(ageConstraint.getMaximum());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimum() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getMinimum())) {
            
            return new MultidimensionalTimeWrapper(ageConstraint.getMinimum());
            
        } else {
            return null;
        }
        
    }

    public ScopeRefWrapper getScopeRef() {
        
        if (CollUtil.isNotEmpty(ageConstraint.getScopeRef())) {
            
            return new ScopeRefWrapper(ageConstraint.getScopeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
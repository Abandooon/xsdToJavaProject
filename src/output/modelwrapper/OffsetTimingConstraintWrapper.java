package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class OffsetTimingConstraintWrapper {

    
    private OffsetTimingConstraint offsetTimingConstraint;

    public OffsetTimingConstraintWrapper(OffsetTimingConstraint offsetTimingConstraint) {
        this.offsetTimingConstraint = offsetTimingConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getS())) {
            
            return offsetTimingConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getT())) {
            
            return offsetTimingConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getUuid())) {
            
            return offsetTimingConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getShortName())) {
            
            return new IdentifierWrapper(offsetTimingConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = offsetTimingConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(offsetTimingConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(offsetTimingConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getCategory())) {
            
            return new CategoryStringWrapper(offsetTimingConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getAdminData())) {
            
            return new AdminDataWrapper(offsetTimingConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(offsetTimingConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = offsetTimingConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = offsetTimingConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(offsetTimingConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SourceRef_OffsetTimingConstraintWrapper getSourceRef() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getSourceRef())) {
            
            return new SourceRef_OffsetTimingConstraintWrapper(offsetTimingConstraint.getSourceRef());
            
        } else {
            return null;
        }
        
    }

    public TargetRef_OffsetTimingConstraintWrapper getTargetRef() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getTargetRef())) {
            
            return new TargetRef_OffsetTimingConstraintWrapper(offsetTimingConstraint.getTargetRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimum() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getMinimum())) {
            
            return new MultidimensionalTimeWrapper(offsetTimingConstraint.getMinimum());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximum() {
        
        if (CollUtil.isNotEmpty(offsetTimingConstraint.getMaximum())) {
            
            return new MultidimensionalTimeWrapper(offsetTimingConstraint.getMaximum());
            
        } else {
            return null;
        }
        
    }




    


    
}
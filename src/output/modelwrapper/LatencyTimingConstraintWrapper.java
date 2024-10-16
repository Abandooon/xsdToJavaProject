package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LatencyTimingConstraintWrapper {

    
    private LatencyTimingConstraint latencyTimingConstraint;

    public LatencyTimingConstraintWrapper(LatencyTimingConstraint latencyTimingConstraint) {
        this.latencyTimingConstraint = latencyTimingConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getS())) {
            
            return latencyTimingConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getT())) {
            
            return latencyTimingConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getUuid())) {
            
            return latencyTimingConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getShortName())) {
            
            return new IdentifierWrapper(latencyTimingConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = latencyTimingConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(latencyTimingConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(latencyTimingConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getCategory())) {
            
            return new CategoryStringWrapper(latencyTimingConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getAdminData())) {
            
            return new AdminDataWrapper(latencyTimingConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(latencyTimingConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = latencyTimingConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = latencyTimingConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(latencyTimingConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public LatencyConstraintTypeEnumWrapper getLatencyConstraintType() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getLatencyConstraintType())) {
            
            return new LatencyConstraintTypeEnumWrapper(latencyTimingConstraint.getLatencyConstraintType());
            
        } else {
            return null;
        }
        
    }

    public ScopeRef_LatencyTimingConstraintWrapper getScopeRef() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getScopeRef())) {
            
            return new ScopeRef_LatencyTimingConstraintWrapper(latencyTimingConstraint.getScopeRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimum() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getMinimum())) {
            
            return new MultidimensionalTimeWrapper(latencyTimingConstraint.getMinimum());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximum() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getMaximum())) {
            
            return new MultidimensionalTimeWrapper(latencyTimingConstraint.getMaximum());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getNominal() {
        
        if (CollUtil.isNotEmpty(latencyTimingConstraint.getNominal())) {
            
            return new MultidimensionalTimeWrapper(latencyTimingConstraint.getNominal());
            
        } else {
            return null;
        }
        
    }




    


    
}
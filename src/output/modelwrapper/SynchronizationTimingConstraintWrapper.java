package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SynchronizationTimingConstraintWrapper {

    
    private SynchronizationTimingConstraint synchronizationTimingConstraint;

    public SynchronizationTimingConstraintWrapper(SynchronizationTimingConstraint synchronizationTimingConstraint) {
        this.synchronizationTimingConstraint = synchronizationTimingConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getS())) {
            
            return synchronizationTimingConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getT())) {
            
            return synchronizationTimingConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getUuid())) {
            
            return synchronizationTimingConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getShortName())) {
            
            return new IdentifierWrapper(synchronizationTimingConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = synchronizationTimingConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(synchronizationTimingConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(synchronizationTimingConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getCategory())) {
            
            return new CategoryStringWrapper(synchronizationTimingConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getAdminData())) {
            
            return new AdminDataWrapper(synchronizationTimingConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(synchronizationTimingConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = synchronizationTimingConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = synchronizationTimingConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(synchronizationTimingConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventOccurrenceKindEnumWrapper getEventOccurrenceKind() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getEventOccurrenceKind())) {
            
            return new EventOccurrenceKindEnumWrapper(synchronizationTimingConstraint.getEventOccurrenceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ScopeEventRefWrapper> getScopeEventRefs() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getScopeEventRefs())) {
            ArrayList<ScopeEventRef> originalList = synchronizationTimingConstraint.getScopeEventRefs();
            ArrayList<ScopeEventRefWrapper> wrapperList = (ArrayList<ScopeEventRefWrapper>)originalList.stream()
                .map(item -> new ScopeEventRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ScopeRef_LatencyTimingConstraintWrapper> getScopeRefs() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getScopeRefs())) {
            ArrayList<ScopeRef_LatencyTimingConstraint> originalList = synchronizationTimingConstraint.getScopeRefs();
            ArrayList<ScopeRef_LatencyTimingConstraintWrapper> wrapperList = (ArrayList<ScopeRef_LatencyTimingConstraintWrapper>)originalList.stream()
                .map(item -> new ScopeRef_LatencyTimingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SynchronizationTypeEnumWrapper getSynchronizationConstraintType() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getSynchronizationConstraintType())) {
            
            return new SynchronizationTypeEnumWrapper(synchronizationTimingConstraint.getSynchronizationConstraintType());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getTolerance() {
        
        if (CollUtil.isNotEmpty(synchronizationTimingConstraint.getTolerance())) {
            
            return new MultidimensionalTimeWrapper(synchronizationTimingConstraint.getTolerance());
            
        } else {
            return null;
        }
        
    }




    


    
}
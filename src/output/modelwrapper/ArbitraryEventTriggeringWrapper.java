package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ArbitraryEventTriggeringWrapper {

    
    private ArbitraryEventTriggering arbitraryEventTriggering;

    public ArbitraryEventTriggeringWrapper(ArbitraryEventTriggering arbitraryEventTriggering) {
        this.arbitraryEventTriggering = arbitraryEventTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getS())) {
            
            return arbitraryEventTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getT())) {
            
            return arbitraryEventTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getUuid())) {
            
            return arbitraryEventTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getShortName())) {
            
            return new IdentifierWrapper(arbitraryEventTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = arbitraryEventTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(arbitraryEventTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(arbitraryEventTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getCategory())) {
            
            return new CategoryStringWrapper(arbitraryEventTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getAdminData())) {
            
            return new AdminDataWrapper(arbitraryEventTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(arbitraryEventTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = arbitraryEventTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getTraceRefs())) {
            ArrayList<TraceRef> originalList = arbitraryEventTriggering.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(arbitraryEventTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getEventRef())) {
            
            return new EventRefWrapper(arbitraryEventTriggering.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MultidimensionalTimeWrapper> getMinimumDistances() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getMinimumDistances())) {
            ArrayList<MultidimensionalTime> originalList = arbitraryEventTriggering.getMinimumDistances();
            ArrayList<MultidimensionalTimeWrapper> wrapperList = (ArrayList<MultidimensionalTimeWrapper>)originalList.stream()
                .map(item -> new MultidimensionalTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultidimensionalTimeWrapper> getMaximumDistances() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getMaximumDistances())) {
            ArrayList<MultidimensionalTime> originalList = arbitraryEventTriggering.getMaximumDistances();
            ArrayList<MultidimensionalTimeWrapper> wrapperList = (ArrayList<MultidimensionalTimeWrapper>)originalList.stream()
                .map(item -> new MultidimensionalTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConfidenceIntervalWrapper> getConfidenceIntervals() {
        
        if (CollUtil.isNotEmpty(arbitraryEventTriggering.getConfidenceIntervals())) {
            ArrayList<ConfidenceInterval> originalList = arbitraryEventTriggering.getConfidenceIntervals();
            ArrayList<ConfidenceIntervalWrapper> wrapperList = (ArrayList<ConfidenceIntervalWrapper>)originalList.stream()
                .map(item -> new ConfidenceIntervalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BurstPatternEventTriggeringWrapper {

    
    private BurstPatternEventTriggering burstPatternEventTriggering;

    public BurstPatternEventTriggeringWrapper(BurstPatternEventTriggering burstPatternEventTriggering) {
        this.burstPatternEventTriggering = burstPatternEventTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getS())) {
            
            return burstPatternEventTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getT())) {
            
            return burstPatternEventTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getUuid())) {
            
            return burstPatternEventTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getShortName())) {
            
            return new IdentifierWrapper(burstPatternEventTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = burstPatternEventTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(burstPatternEventTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(burstPatternEventTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getCategory())) {
            
            return new CategoryStringWrapper(burstPatternEventTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getAdminData())) {
            
            return new AdminDataWrapper(burstPatternEventTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(burstPatternEventTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = burstPatternEventTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getTraceRefs())) {
            ArrayList<TraceRef> originalList = burstPatternEventTriggering.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(burstPatternEventTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getEventRef())) {
            
            return new EventRefWrapper(burstPatternEventTriggering.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNumberOfOccurrences() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getMaxNumberOfOccurrences())) {
            
            return new PositiveIntegerWrapper(burstPatternEventTriggering.getMaxNumberOfOccurrences());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimumInterArrivalTime() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getMinimumInterArrivalTime())) {
            
            return new MultidimensionalTimeWrapper(burstPatternEventTriggering.getMinimumInterArrivalTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternJitter() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getPatternJitter())) {
            
            return new MultidimensionalTimeWrapper(burstPatternEventTriggering.getPatternJitter());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternLength() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getPatternLength())) {
            
            return new MultidimensionalTimeWrapper(burstPatternEventTriggering.getPatternLength());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternPeriod() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getPatternPeriod())) {
            
            return new MultidimensionalTimeWrapper(burstPatternEventTriggering.getPatternPeriod());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinNumberOfOccurrences() {
        
        if (CollUtil.isNotEmpty(burstPatternEventTriggering.getMinNumberOfOccurrences())) {
            
            return new PositiveIntegerWrapper(burstPatternEventTriggering.getMinNumberOfOccurrences());
            
        } else {
            return null;
        }
        
    }




    


    
}
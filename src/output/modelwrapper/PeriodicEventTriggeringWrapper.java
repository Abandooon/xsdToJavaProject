package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PeriodicEventTriggeringWrapper {

    
    private PeriodicEventTriggering periodicEventTriggering;

    public PeriodicEventTriggeringWrapper(PeriodicEventTriggering periodicEventTriggering) {
        this.periodicEventTriggering = periodicEventTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getS())) {
            
            return periodicEventTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getT())) {
            
            return periodicEventTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getUuid())) {
            
            return periodicEventTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getShortName())) {
            
            return new IdentifierWrapper(periodicEventTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = periodicEventTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(periodicEventTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(periodicEventTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getCategory())) {
            
            return new CategoryStringWrapper(periodicEventTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getAdminData())) {
            
            return new AdminDataWrapper(periodicEventTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(periodicEventTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = periodicEventTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getTraceRefs())) {
            ArrayList<TraceRef> originalList = periodicEventTriggering.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(periodicEventTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getEventRef())) {
            
            return new EventRefWrapper(periodicEventTriggering.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimumInterArrivalTime() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getMinimumInterArrivalTime())) {
            
            return new MultidimensionalTimeWrapper(periodicEventTriggering.getMinimumInterArrivalTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getJitter() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getJitter())) {
            
            return new MultidimensionalTimeWrapper(periodicEventTriggering.getJitter());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(periodicEventTriggering.getPeriod())) {
            
            return new MultidimensionalTimeWrapper(periodicEventTriggering.getPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
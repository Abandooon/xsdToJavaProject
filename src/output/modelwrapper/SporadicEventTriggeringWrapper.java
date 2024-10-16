package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SporadicEventTriggeringWrapper {

    
    private SporadicEventTriggering sporadicEventTriggering;

    public SporadicEventTriggeringWrapper(SporadicEventTriggering sporadicEventTriggering) {
        this.sporadicEventTriggering = sporadicEventTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getS())) {
            
            return sporadicEventTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getT())) {
            
            return sporadicEventTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getUuid())) {
            
            return sporadicEventTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getShortName())) {
            
            return new IdentifierWrapper(sporadicEventTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = sporadicEventTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(sporadicEventTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(sporadicEventTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getCategory())) {
            
            return new CategoryStringWrapper(sporadicEventTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getAdminData())) {
            
            return new AdminDataWrapper(sporadicEventTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(sporadicEventTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = sporadicEventTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getTraceRefs())) {
            ArrayList<TraceRef> originalList = sporadicEventTriggering.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(sporadicEventTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getEventRef())) {
            
            return new EventRefWrapper(sporadicEventTriggering.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimumInterArrivalTime() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getMinimumInterArrivalTime())) {
            
            return new MultidimensionalTimeWrapper(sporadicEventTriggering.getMinimumInterArrivalTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximumInterArrivalTime() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getMaximumInterArrivalTime())) {
            
            return new MultidimensionalTimeWrapper(sporadicEventTriggering.getMaximumInterArrivalTime());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getJitter() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getJitter())) {
            
            return new MultidimensionalTimeWrapper(sporadicEventTriggering.getJitter());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(sporadicEventTriggering.getPeriod())) {
            
            return new MultidimensionalTimeWrapper(sporadicEventTriggering.getPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
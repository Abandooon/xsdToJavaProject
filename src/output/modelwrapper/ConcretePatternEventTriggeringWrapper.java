package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ConcretePatternEventTriggeringWrapper {

    
    private ConcretePatternEventTriggering concretePatternEventTriggering;

    public ConcretePatternEventTriggeringWrapper(ConcretePatternEventTriggering concretePatternEventTriggering) {
        this.concretePatternEventTriggering = concretePatternEventTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getS())) {
            
            return concretePatternEventTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getT())) {
            
            return concretePatternEventTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getUuid())) {
            
            return concretePatternEventTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getShortName())) {
            
            return new IdentifierWrapper(concretePatternEventTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = concretePatternEventTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(concretePatternEventTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(concretePatternEventTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getCategory())) {
            
            return new CategoryStringWrapper(concretePatternEventTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getAdminData())) {
            
            return new AdminDataWrapper(concretePatternEventTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(concretePatternEventTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = concretePatternEventTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getTraceRefs())) {
            ArrayList<TraceRef> originalList = concretePatternEventTriggering.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(concretePatternEventTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventRefWrapper getEventRef() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getEventRef())) {
            
            return new EventRefWrapper(concretePatternEventTriggering.getEventRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternJitter() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getPatternJitter())) {
            
            return new MultidimensionalTimeWrapper(concretePatternEventTriggering.getPatternJitter());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternPeriod() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getPatternPeriod())) {
            
            return new MultidimensionalTimeWrapper(concretePatternEventTriggering.getPatternPeriod());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MultidimensionalTimeWrapper> getOffsets() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getOffsets())) {
            ArrayList<MultidimensionalTime> originalList = concretePatternEventTriggering.getOffsets();
            ArrayList<MultidimensionalTimeWrapper> wrapperList = (ArrayList<MultidimensionalTimeWrapper>)originalList.stream()
                .map(item -> new MultidimensionalTimeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getPatternLength() {
        
        if (CollUtil.isNotEmpty(concretePatternEventTriggering.getPatternLength())) {
            
            return new MultidimensionalTimeWrapper(concretePatternEventTriggering.getPatternLength());
            
        } else {
            return null;
        }
        
    }




    


    
}
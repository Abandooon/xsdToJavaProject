package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    

    
    

    
    

    
    

    
    


public class IoHwAbstractionServerAnnotationWrapper {

    
    private IoHwAbstractionServerAnnotation ioHwAbstractionServerAnnotation;

    public IoHwAbstractionServerAnnotationWrapper(IoHwAbstractionServerAnnotation ioHwAbstractionServerAnnotation) {
        this.ioHwAbstractionServerAnnotation = ioHwAbstractionServerAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getS())) {
            
            return ioHwAbstractionServerAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getT())) {
            
            return ioHwAbstractionServerAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(ioHwAbstractionServerAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(ioHwAbstractionServerAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(ioHwAbstractionServerAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getAge() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getAge())) {
            
            return new MultidimensionalTimeWrapper(ioHwAbstractionServerAnnotation.getAge());
            
        } else {
            return null;
        }
        
    }

    public ArgumentRefWrapper getArgumentRef() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getArgumentRef())) {
            
            return new ArgumentRefWrapper(ioHwAbstractionServerAnnotation.getArgumentRef());
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getBswResolution() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getBswResolution())) {
            
            return new FloatWrapper(ioHwAbstractionServerAnnotation.getBswResolution());
            
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(ioHwAbstractionServerAnnotation.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public FailureMonitoringRefWrapper getFailureMonitoringRef() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getFailureMonitoringRef())) {
            
            return new FailureMonitoringRefWrapper(ioHwAbstractionServerAnnotation.getFailureMonitoringRef());
            
        } else {
            return null;
        }
        
    }

    public FilterDebouncingEnumWrapper getFilteringDebouncing() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getFilteringDebouncing())) {
            
            return new FilterDebouncingEnumWrapper(ioHwAbstractionServerAnnotation.getFilteringDebouncing());
            
        } else {
            return null;
        }
        
    }

    public PulseTestEnumWrapper getPulseTest() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getPulseTest())) {
            
            return new PulseTestEnumWrapper(ioHwAbstractionServerAnnotation.getPulseTest());
            
        } else {
            return null;
        }
        
    }

    public TriggerRefWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(ioHwAbstractionServerAnnotation.getTriggerRef())) {
            
            return new TriggerRefWrapper(ioHwAbstractionServerAnnotation.getTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
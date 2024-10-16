package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class InstantiationTimingEventPropsWrapper {

    
    private InstantiationTimingEventProps instantiationTimingEventProps;

    public InstantiationTimingEventPropsWrapper(InstantiationTimingEventProps instantiationTimingEventProps) {
        this.instantiationTimingEventProps = instantiationTimingEventProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getS())) {
            
            return instantiationTimingEventProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getT())) {
            
            return instantiationTimingEventProps.getT();
            
        } else {
            return null;
        }
        
    }

    public InstanceEventInCompositionInstanceRefWrapper getRefinedEventIref() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getRefinedEventIref())) {
            
            return new InstanceEventInCompositionInstanceRefWrapper(instantiationTimingEventProps.getRefinedEventIref());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getShortLabel())) {
            
            return new IdentifierWrapper(instantiationTimingEventProps.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getVariationPoint())) {
            
            return new VariationPointWrapper(instantiationTimingEventProps.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(instantiationTimingEventProps.getPeriod())) {
            
            return new TimeValueWrapper(instantiationTimingEventProps.getPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}
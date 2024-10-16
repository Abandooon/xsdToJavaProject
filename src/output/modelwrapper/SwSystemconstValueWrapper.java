package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class SwSystemconstValueWrapper {

    
    private SwSystemconstValue swSystemconstValue;

    public SwSystemconstValueWrapper(SwSystemconstValue swSystemconstValue) {
        this.swSystemconstValue = swSystemconstValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swSystemconstValue.getS())) {
            
            return swSystemconstValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swSystemconstValue.getT())) {
            
            return swSystemconstValue.getT();
            
        } else {
            return null;
        }
        
    }

    public SwSystemconstRefWrapper getSwSystemconstRef() {
        
        if (CollUtil.isNotEmpty(swSystemconstValue.getSwSystemconstRef())) {
            
            return new SwSystemconstRefWrapper(swSystemconstValue.getSwSystemconstRef());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(swSystemconstValue.getValue())) {
            
            return new NumericalValueVariationPointWrapper(swSystemconstValue.getValue());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swSystemconstValue.getAnnotations())) {
            ArrayList<Annotation> originalList = swSystemconstValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
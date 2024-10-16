package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class HwAttributeValueWrapper {

    
    private HwAttributeValue hwAttributeValue;

    public HwAttributeValueWrapper(HwAttributeValue hwAttributeValue) {
        this.hwAttributeValue = hwAttributeValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getS())) {
            
            return hwAttributeValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getT())) {
            
            return hwAttributeValue.getT();
            
        } else {
            return null;
        }
        
    }

    public AnnotationWrapper getAnnotation() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getAnnotation())) {
            
            return new AnnotationWrapper(hwAttributeValue.getAnnotation());
            
        } else {
            return null;
        }
        
    }

    public HwAttributeDefRefWrapper getHwAttributeDefRef() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getHwAttributeDefRef())) {
            
            return new HwAttributeDefRefWrapper(hwAttributeValue.getHwAttributeDefRef());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getV() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getV())) {
            
            return new NumericalValueVariationPointWrapper(hwAttributeValue.getV());
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getVt() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getVt())) {
            
            return new VerbatimStringWrapper(hwAttributeValue.getVt());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwAttributeValue.getVariationPoint())) {
            
            return new VariationPointWrapper(hwAttributeValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
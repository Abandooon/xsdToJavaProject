package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class EcucNumericalParamValueWrapper {

    
    private EcucNumericalParamValue ecucNumericalParamValue;

    public EcucNumericalParamValueWrapper(EcucNumericalParamValue ecucNumericalParamValue) {
        this.ecucNumericalParamValue = ecucNumericalParamValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getS())) {
            
            return ecucNumericalParamValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getT())) {
            
            return ecucNumericalParamValue.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucNumericalParamValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucAddInfoParamValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getDefinitionRef())) {
            
            return new DefinitionRef_EcucAddInfoParamValueWrapper(ecucNumericalParamValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucNumericalParamValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsAutoValue() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getIsAutoValue())) {
            
            return new BooleanWrapper(ecucNumericalParamValue.getIsAutoValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucNumericalParamValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(ecucNumericalParamValue.getValue())) {
            
            return new NumericalValueVariationPointWrapper(ecucNumericalParamValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
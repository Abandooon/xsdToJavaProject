package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class EcucTextualParamValueWrapper {

    
    private EcucTextualParamValue ecucTextualParamValue;

    public EcucTextualParamValueWrapper(EcucTextualParamValue ecucTextualParamValue) {
        this.ecucTextualParamValue = ecucTextualParamValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getS())) {
            
            return ecucTextualParamValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getT())) {
            
            return ecucTextualParamValue.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucTextualParamValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucAddInfoParamValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getDefinitionRef())) {
            
            return new DefinitionRef_EcucAddInfoParamValueWrapper(ecucTextualParamValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucTextualParamValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsAutoValue() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getIsAutoValue())) {
            
            return new BooleanWrapper(ecucTextualParamValue.getIsAutoValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucTextualParamValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getValue() {
        
        if (CollUtil.isNotEmpty(ecucTextualParamValue.getValue())) {
            
            return new VerbatimStringWrapper(ecucTextualParamValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
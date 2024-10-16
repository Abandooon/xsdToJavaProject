package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class EcucAddInfoParamValueWrapper {

    
    private EcucAddInfoParamValue ecucAddInfoParamValue;

    public EcucAddInfoParamValueWrapper(EcucAddInfoParamValue ecucAddInfoParamValue) {
        this.ecucAddInfoParamValue = ecucAddInfoParamValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getS())) {
            
            return ecucAddInfoParamValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getT())) {
            
            return ecucAddInfoParamValue.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucAddInfoParamValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucAddInfoParamValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getDefinitionRef())) {
            
            return new DefinitionRef_EcucAddInfoParamValueWrapper(ecucAddInfoParamValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucAddInfoParamValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsAutoValue() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getIsAutoValue())) {
            
            return new BooleanWrapper(ecucAddInfoParamValue.getIsAutoValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucAddInfoParamValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getValue() {
        
        if (CollUtil.isNotEmpty(ecucAddInfoParamValue.getValue())) {
            
            return new DocumentationBlockWrapper(ecucAddInfoParamValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
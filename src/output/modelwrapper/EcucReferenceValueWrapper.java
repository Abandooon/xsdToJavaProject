package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class EcucReferenceValueWrapper {

    
    private EcucReferenceValue ecucReferenceValue;

    public EcucReferenceValueWrapper(EcucReferenceValue ecucReferenceValue) {
        this.ecucReferenceValue = ecucReferenceValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getS())) {
            
            return ecucReferenceValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getT())) {
            
            return ecucReferenceValue.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucReferenceValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucReferenceValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getDefinitionRef())) {
            
            return new DefinitionRef_EcucReferenceValueWrapper(ecucReferenceValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucReferenceValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucReferenceValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ValueRefWrapper getValueRef() {
        
        if (CollUtil.isNotEmpty(ecucReferenceValue.getValueRef())) {
            
            return new ValueRefWrapper(ecucReferenceValue.getValueRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class EcucInstanceReferenceValueWrapper {

    
    private EcucInstanceReferenceValue ecucInstanceReferenceValue;

    public EcucInstanceReferenceValueWrapper(EcucInstanceReferenceValue ecucInstanceReferenceValue) {
        this.ecucInstanceReferenceValue = ecucInstanceReferenceValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getS())) {
            
            return ecucInstanceReferenceValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getT())) {
            
            return ecucInstanceReferenceValue.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getIndex())) {
            
            return new PositiveIntegerWrapper(ecucInstanceReferenceValue.getIndex());
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_EcucReferenceValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getDefinitionRef())) {
            
            return new DefinitionRef_EcucReferenceValueWrapper(ecucInstanceReferenceValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucInstanceReferenceValue.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucInstanceReferenceValue.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AnyInstanceRefWrapper getValueIref() {
        
        if (CollUtil.isNotEmpty(ecucInstanceReferenceValue.getValueIref())) {
            
            return new AnyInstanceRefWrapper(ecucInstanceReferenceValue.getValueIref());
            
        } else {
            return null;
        }
        
    }




    


    
}
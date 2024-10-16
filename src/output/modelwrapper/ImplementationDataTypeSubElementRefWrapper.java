package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ImplementationDataTypeSubElementRefWrapper {

    
    private ImplementationDataTypeSubElementRef implementationDataTypeSubElementRef;

    public ImplementationDataTypeSubElementRefWrapper(ImplementationDataTypeSubElementRef implementationDataTypeSubElementRef) {
        this.implementationDataTypeSubElementRef = implementationDataTypeSubElementRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeSubElementRef.getS())) {
            
            return implementationDataTypeSubElementRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeSubElementRef.getT())) {
            
            return implementationDataTypeSubElementRef.getT();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeSubElementRef.getVariationPoint())) {
            
            return new VariationPointWrapper(implementationDataTypeSubElementRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArVariableInImplementationDataInstanceRefWrapper getImplementationDataTypeElement() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeSubElementRef.getImplementationDataTypeElement())) {
            
            return new ArVariableInImplementationDataInstanceRefWrapper(implementationDataTypeSubElementRef.getImplementationDataTypeElement());
            
        } else {
            return null;
        }
        
    }




    


    
}
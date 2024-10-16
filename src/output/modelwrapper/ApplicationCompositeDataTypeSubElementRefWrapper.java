package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ApplicationCompositeDataTypeSubElementRefWrapper {

    
    private ApplicationCompositeDataTypeSubElementRef applicationCompositeDataTypeSubElementRef;

    public ApplicationCompositeDataTypeSubElementRefWrapper(ApplicationCompositeDataTypeSubElementRef applicationCompositeDataTypeSubElementRef) {
        this.applicationCompositeDataTypeSubElementRef = applicationCompositeDataTypeSubElementRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationCompositeDataTypeSubElementRef.getS())) {
            
            return applicationCompositeDataTypeSubElementRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationCompositeDataTypeSubElementRef.getT())) {
            
            return applicationCompositeDataTypeSubElementRef.getT();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationCompositeDataTypeSubElementRef.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationCompositeDataTypeSubElementRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ApplicationCompositeElementInPortInterfaceInstanceRefWrapper getApplicationCompositeElementIref() {
        
        if (CollUtil.isNotEmpty(applicationCompositeDataTypeSubElementRef.getApplicationCompositeElementIref())) {
            
            return new ApplicationCompositeElementInPortInterfaceInstanceRefWrapper(applicationCompositeDataTypeSubElementRef.getApplicationCompositeElementIref());
            
        } else {
            return null;
        }
        
    }




    


    
}
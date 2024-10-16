package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ReferenceValueSpecificationWrapper {

    
    private ReferenceValueSpecification referenceValueSpecification;

    public ReferenceValueSpecificationWrapper(ReferenceValueSpecification referenceValueSpecification) {
        this.referenceValueSpecification = referenceValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(referenceValueSpecification.getS())) {
            
            return referenceValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(referenceValueSpecification.getT())) {
            
            return referenceValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(referenceValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(referenceValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(referenceValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(referenceValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueRefWrapper getReferenceValueRef() {
        
        if (CollUtil.isNotEmpty(referenceValueSpecification.getReferenceValueRef())) {
            
            return new ReferenceValueRefWrapper(referenceValueSpecification.getReferenceValueRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
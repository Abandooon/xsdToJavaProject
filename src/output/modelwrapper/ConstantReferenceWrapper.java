package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ConstantReferenceWrapper {

    
    private ConstantReference constantReference;

    public ConstantReferenceWrapper(ConstantReference constantReference) {
        this.constantReference = constantReference;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(constantReference.getS())) {
            
            return constantReference.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(constantReference.getT())) {
            
            return constantReference.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(constantReference.getShortLabel())) {
            
            return new IdentifierWrapper(constantReference.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(constantReference.getVariationPoint())) {
            
            return new VariationPointWrapper(constantReference.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ConstantRefWrapper getConstantRef() {
        
        if (CollUtil.isNotEmpty(constantReference.getConstantRef())) {
            
            return new ConstantRefWrapper(constantReference.getConstantRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
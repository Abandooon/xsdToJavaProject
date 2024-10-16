package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ArrayValueSpecificationWrapper {

    
    private ArrayValueSpecification arrayValueSpecification;

    public ArrayValueSpecificationWrapper(ArrayValueSpecification arrayValueSpecification) {
        this.arrayValueSpecification = arrayValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(arrayValueSpecification.getS())) {
            
            return arrayValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(arrayValueSpecification.getT())) {
            
            return arrayValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(arrayValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(arrayValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(arrayValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(arrayValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public Elements_ArrayValueSpecificationWrapper getElements() {
        
        if (CollUtil.isNotEmpty(arrayValueSpecification.getElements())) {
            
            return new Elements_ArrayValueSpecificationWrapper(arrayValueSpecification.getElements());
            
        } else {
            return null;
        }
        
    }




    


    
}
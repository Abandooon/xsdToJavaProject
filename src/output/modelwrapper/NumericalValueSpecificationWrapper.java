package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class NumericalValueSpecificationWrapper {

    
    private NumericalValueSpecification numericalValueSpecification;

    public NumericalValueSpecificationWrapper(NumericalValueSpecification numericalValueSpecification) {
        this.numericalValueSpecification = numericalValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(numericalValueSpecification.getS())) {
            
            return numericalValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(numericalValueSpecification.getT())) {
            
            return numericalValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(numericalValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(numericalValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(numericalValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(numericalValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getValue() {
        
        if (CollUtil.isNotEmpty(numericalValueSpecification.getValue())) {
            
            return new NumericalValueVariationPointWrapper(numericalValueSpecification.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
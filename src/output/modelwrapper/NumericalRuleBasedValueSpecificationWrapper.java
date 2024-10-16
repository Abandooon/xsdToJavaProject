package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class NumericalRuleBasedValueSpecificationWrapper {

    
    private NumericalRuleBasedValueSpecification numericalRuleBasedValueSpecification;

    public NumericalRuleBasedValueSpecificationWrapper(NumericalRuleBasedValueSpecification numericalRuleBasedValueSpecification) {
        this.numericalRuleBasedValueSpecification = numericalRuleBasedValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(numericalRuleBasedValueSpecification.getS())) {
            
            return numericalRuleBasedValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(numericalRuleBasedValueSpecification.getT())) {
            
            return numericalRuleBasedValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(numericalRuleBasedValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(numericalRuleBasedValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(numericalRuleBasedValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(numericalRuleBasedValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public RuleBasedValueSpecificationWrapper getRuleBasedValues() {
        
        if (CollUtil.isNotEmpty(numericalRuleBasedValueSpecification.getRuleBasedValues())) {
            
            return new RuleBasedValueSpecificationWrapper(numericalRuleBasedValueSpecification.getRuleBasedValues());
            
        } else {
            return null;
        }
        
    }




    


    
}
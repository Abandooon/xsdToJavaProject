package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ValueSpecWrapper {

    
    private ValueSpec valueSpec;

    public ValueSpecWrapper(ValueSpec valueSpec) {
        this.valueSpec = valueSpec;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(valueSpec.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(valueSpec.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(valueSpec.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(valueSpec.getConstantReference())) {
            
            return new ConstantReferenceWrapper(valueSpec.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(valueSpec.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(valueSpec.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(valueSpec.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(valueSpec.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(valueSpec.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(valueSpec.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class InvalidValueWrapper {

    
    private InvalidValue invalidValue;

    public InvalidValueWrapper(InvalidValue invalidValue) {
        this.invalidValue = invalidValue;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(invalidValue.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(invalidValue.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(invalidValue.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(invalidValue.getConstantReference())) {
            
            return new ConstantReferenceWrapper(invalidValue.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(invalidValue.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(invalidValue.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(invalidValue.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(invalidValue.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(invalidValue.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(invalidValue.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
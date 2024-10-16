package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ValueWrapper {

    
    private Value value;

    public ValueWrapper(Value value) {
        this.value = value;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(value.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(value.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(value.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(value.getConstantReference())) {
            
            return new ConstantReferenceWrapper(value.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(value.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(value.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(value.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(value.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(value.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(value.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
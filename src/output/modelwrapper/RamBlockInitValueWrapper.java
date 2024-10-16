package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RamBlockInitValueWrapper {

    
    private RamBlockInitValue ramBlockInitValue;

    public RamBlockInitValueWrapper(RamBlockInitValue ramBlockInitValue) {
        this.ramBlockInitValue = ramBlockInitValue;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(ramBlockInitValue.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(ramBlockInitValue.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(ramBlockInitValue.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getConstantReference())) {
            
            return new ConstantReferenceWrapper(ramBlockInitValue.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(ramBlockInitValue.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(ramBlockInitValue.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(ramBlockInitValue.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(ramBlockInitValue.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(ramBlockInitValue.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(ramBlockInitValue.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
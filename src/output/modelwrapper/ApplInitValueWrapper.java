package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ApplInitValueWrapper {

    
    private ApplInitValue applInitValue;

    public ApplInitValueWrapper(ApplInitValue applInitValue) {
        this.applInitValue = applInitValue;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(applInitValue.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(applInitValue.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(applInitValue.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(applInitValue.getConstantReference())) {
            
            return new ConstantReferenceWrapper(applInitValue.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(applInitValue.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(applInitValue.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(applInitValue.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(applInitValue.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(applInitValue.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(applInitValue.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
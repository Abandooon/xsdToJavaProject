package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ImplInitValueWrapper {

    
    private ImplInitValue implInitValue;

    public ImplInitValueWrapper(ImplInitValue implInitValue) {
        this.implInitValue = implInitValue;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(implInitValue.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(implInitValue.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(implInitValue.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(implInitValue.getConstantReference())) {
            
            return new ConstantReferenceWrapper(implInitValue.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(implInitValue.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(implInitValue.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(implInitValue.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(implInitValue.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(implInitValue.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(implInitValue.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
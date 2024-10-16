package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RomBlockInitValueWrapper {

    
    private RomBlockInitValue romBlockInitValue;

    public RomBlockInitValueWrapper(RomBlockInitValue romBlockInitValue) {
        this.romBlockInitValue = romBlockInitValue;
    }

   
    public ApplicationRuleBasedValueSpecificationWrapper getApplicationRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getApplicationRuleBasedValueSpecification())) {
            
            return new ApplicationRuleBasedValueSpecificationWrapper(romBlockInitValue.getApplicationRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ApplicationValueSpecificationWrapper getApplicationValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getApplicationValueSpecification())) {
            
            return new ApplicationValueSpecificationWrapper(romBlockInitValue.getApplicationValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ArrayValueSpecificationWrapper getArrayValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getArrayValueSpecification())) {
            
            return new ArrayValueSpecificationWrapper(romBlockInitValue.getArrayValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ConstantReferenceWrapper getConstantReference() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getConstantReference())) {
            
            return new ConstantReferenceWrapper(romBlockInitValue.getConstantReference());
            
        } else {
            return null;
        }
        
    }

    public NumericalRuleBasedValueSpecificationWrapper getNumericalRuleBasedValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getNumericalRuleBasedValueSpecification())) {
            
            return new NumericalRuleBasedValueSpecificationWrapper(romBlockInitValue.getNumericalRuleBasedValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueSpecificationWrapper getNumericalValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getNumericalValueSpecification())) {
            
            return new NumericalValueSpecificationWrapper(romBlockInitValue.getNumericalValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public RecordValueSpecificationWrapper getRecordValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getRecordValueSpecification())) {
            
            return new RecordValueSpecificationWrapper(romBlockInitValue.getRecordValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public ReferenceValueSpecificationWrapper getReferenceValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getReferenceValueSpecification())) {
            
            return new ReferenceValueSpecificationWrapper(romBlockInitValue.getReferenceValueSpecification());
            
        } else {
            return null;
        }
        
    }

    public TextValueSpecificationWrapper getTextValueSpecification() {
        
        if (CollUtil.isNotEmpty(romBlockInitValue.getTextValueSpecification())) {
            
            return new TextValueSpecificationWrapper(romBlockInitValue.getTextValueSpecification());
            
        } else {
            return null;
        }
        
    }




    


    
}
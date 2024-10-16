package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RuleBasedValueContWrapper {

    
    private RuleBasedValueCont ruleBasedValueCont;

    public RuleBasedValueContWrapper(RuleBasedValueCont ruleBasedValueCont) {
        this.ruleBasedValueCont = ruleBasedValueCont;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueCont.getS())) {
            
            return ruleBasedValueCont.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueCont.getT())) {
            
            return ruleBasedValueCont.getT();
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueCont.getUnitRef())) {
            
            return new UnitRefWrapper(ruleBasedValueCont.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public ValueListWrapper getSwArraysize() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueCont.getSwArraysize())) {
            
            return new ValueListWrapper(ruleBasedValueCont.getSwArraysize());
            
        } else {
            return null;
        }
        
    }

    public RuleBasedValueSpecificationWrapper getRuleBasedValues() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueCont.getRuleBasedValues())) {
            
            return new RuleBasedValueSpecificationWrapper(ruleBasedValueCont.getRuleBasedValues());
            
        } else {
            return null;
        }
        
    }




    


    
}
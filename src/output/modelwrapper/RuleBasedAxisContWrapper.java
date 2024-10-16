package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RuleBasedAxisContWrapper {

    
    private RuleBasedAxisCont ruleBasedAxisCont;

    public RuleBasedAxisContWrapper(RuleBasedAxisCont ruleBasedAxisCont) {
        this.ruleBasedAxisCont = ruleBasedAxisCont;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getS())) {
            
            return ruleBasedAxisCont.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getT())) {
            
            return ruleBasedAxisCont.getT();
            
        } else {
            return null;
        }
        
    }

    public CalprmAxisCategoryEnumWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getCategory())) {
            
            return new CalprmAxisCategoryEnumWrapper(ruleBasedAxisCont.getCategory());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getUnitRef())) {
            
            return new UnitRefWrapper(ruleBasedAxisCont.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public ValueListWrapper getSwArraysize() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getSwArraysize())) {
            
            return new ValueListWrapper(ruleBasedAxisCont.getSwArraysize());
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwAxisIndex() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getSwAxisIndex())) {
            
            return new AxisIndexTypeWrapper(ruleBasedAxisCont.getSwAxisIndex());
            
        } else {
            return null;
        }
        
    }

    public RuleBasedValueSpecificationWrapper getRuleBasedValues() {
        
        if (CollUtil.isNotEmpty(ruleBasedAxisCont.getRuleBasedValues())) {
            
            return new RuleBasedValueSpecificationWrapper(ruleBasedAxisCont.getRuleBasedValues());
            
        } else {
            return null;
        }
        
    }




    


    
}
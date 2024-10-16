package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ValueAccessWrapper {

    
    private ValueAccess valueAccess;

    public ValueAccessWrapper(ValueAccess valueAccess) {
        this.valueAccess = valueAccess;
    }

   
    public BooleanValueVariationPointWrapper getBooleanValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getBooleanValueVariationPoint())) {
            
            return new BooleanValueVariationPointWrapper(valueAccess.getBooleanValueVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public FloatValueVariationPointWrapper getFloatValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getFloatValueVariationPoint())) {
            
            return new FloatValueVariationPointWrapper(valueAccess.getFloatValueVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getIntegerValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getIntegerValueVariationPoint())) {
            
            return new IntegerValueVariationPointWrapper(valueAccess.getIntegerValueVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLimit() {
        
        if (CollUtil.isNotEmpty(valueAccess.getLimit())) {
            
            return new LimitWrapper(valueAccess.getLimit());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getNumericalValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getNumericalValueVariationPoint())) {
            
            return new NumericalValueVariationPointWrapper(valueAccess.getNumericalValueVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getPositiveIntegerValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getPositiveIntegerValueVariationPoint())) {
            
            return new PositiveIntegerValueVariationPointWrapper(valueAccess.getPositiveIntegerValueVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerValueVariationPointWrapper getUnlimitedIntegerValueVariationPoint() {
        
        if (CollUtil.isNotEmpty(valueAccess.getUnlimitedIntegerValueVariationPoint())) {
            
            return new UnlimitedIntegerValueVariationPointWrapper(valueAccess.getUnlimitedIntegerValueVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucStringParamDefConditionalWrapper {

    
    private EcucStringParamDefConditional ecucStringParamDefConditional;

    public EcucStringParamDefConditionalWrapper(EcucStringParamDefConditional ecucStringParamDefConditional) {
        this.ecucStringParamDefConditional = ecucStringParamDefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getS())) {
            
            return ecucStringParamDefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getT())) {
            
            return ecucStringParamDefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getDefaultValue())) {
            
            return new VerbatimStringWrapper(ecucStringParamDefConditional.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxLength() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getMaxLength())) {
            
            return new PositiveIntegerWrapper(ecucStringParamDefConditional.getMaxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinLength() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getMinLength())) {
            
            return new PositiveIntegerWrapper(ecucStringParamDefConditional.getMinLength());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getRegularExpression() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getRegularExpression())) {
            
            return new RegularExpressionWrapper(ecucStringParamDefConditional.getRegularExpression());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucStringParamDefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucStringParamDefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
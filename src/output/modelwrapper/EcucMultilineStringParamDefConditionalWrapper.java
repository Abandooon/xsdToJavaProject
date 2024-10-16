package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucMultilineStringParamDefConditionalWrapper {

    
    private EcucMultilineStringParamDefConditional ecucMultilineStringParamDefConditional;

    public EcucMultilineStringParamDefConditionalWrapper(EcucMultilineStringParamDefConditional ecucMultilineStringParamDefConditional) {
        this.ecucMultilineStringParamDefConditional = ecucMultilineStringParamDefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getS())) {
            
            return ecucMultilineStringParamDefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getT())) {
            
            return ecucMultilineStringParamDefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getDefaultValue())) {
            
            return new VerbatimStringWrapper(ecucMultilineStringParamDefConditional.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxLength() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getMaxLength())) {
            
            return new PositiveIntegerWrapper(ecucMultilineStringParamDefConditional.getMaxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinLength() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getMinLength())) {
            
            return new PositiveIntegerWrapper(ecucMultilineStringParamDefConditional.getMinLength());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getRegularExpression() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getRegularExpression())) {
            
            return new RegularExpressionWrapper(ecucMultilineStringParamDefConditional.getRegularExpression());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucMultilineStringParamDefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucMultilineStringParamDefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
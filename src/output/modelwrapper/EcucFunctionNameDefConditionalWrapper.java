package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucFunctionNameDefConditionalWrapper {

    
    private EcucFunctionNameDefConditional ecucFunctionNameDefConditional;

    public EcucFunctionNameDefConditionalWrapper(EcucFunctionNameDefConditional ecucFunctionNameDefConditional) {
        this.ecucFunctionNameDefConditional = ecucFunctionNameDefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getS())) {
            
            return ecucFunctionNameDefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getT())) {
            
            return ecucFunctionNameDefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getDefaultValue())) {
            
            return new VerbatimStringWrapper(ecucFunctionNameDefConditional.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxLength() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getMaxLength())) {
            
            return new PositiveIntegerWrapper(ecucFunctionNameDefConditional.getMaxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinLength() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getMinLength())) {
            
            return new PositiveIntegerWrapper(ecucFunctionNameDefConditional.getMinLength());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getRegularExpression() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getRegularExpression())) {
            
            return new RegularExpressionWrapper(ecucFunctionNameDefConditional.getRegularExpression());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucFunctionNameDefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucFunctionNameDefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
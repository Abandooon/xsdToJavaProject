package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcucLinkerSymbolDefConditionalWrapper {

    
    private EcucLinkerSymbolDefConditional ecucLinkerSymbolDefConditional;

    public EcucLinkerSymbolDefConditionalWrapper(EcucLinkerSymbolDefConditional ecucLinkerSymbolDefConditional) {
        this.ecucLinkerSymbolDefConditional = ecucLinkerSymbolDefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getS())) {
            
            return ecucLinkerSymbolDefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getT())) {
            
            return ecucLinkerSymbolDefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getDefaultValue())) {
            
            return new VerbatimStringWrapper(ecucLinkerSymbolDefConditional.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxLength() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getMaxLength())) {
            
            return new PositiveIntegerWrapper(ecucLinkerSymbolDefConditional.getMaxLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinLength() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getMinLength())) {
            
            return new PositiveIntegerWrapper(ecucLinkerSymbolDefConditional.getMinLength());
            
        } else {
            return null;
        }
        
    }

    public RegularExpressionWrapper getRegularExpression() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getRegularExpression())) {
            
            return new RegularExpressionWrapper(ecucLinkerSymbolDefConditional.getRegularExpression());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucLinkerSymbolDefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucLinkerSymbolDefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
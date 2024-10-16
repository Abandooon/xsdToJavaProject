package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CompuScaleWrapper {

    
    private CompuScale compuScale;

    public CompuScaleWrapper(CompuScale compuScale) {
        this.compuScale = compuScale;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuScale.getS())) {
            
            return compuScale.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuScale.getT())) {
            
            return compuScale.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(compuScale.getShortLabel())) {
            
            return new IdentifierWrapper(compuScale.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(compuScale.getSymbol())) {
            
            return new CIdentifierWrapper(compuScale.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(compuScale.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(compuScale.getDesc());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMask() {
        
        if (CollUtil.isNotEmpty(compuScale.getMask())) {
            
            return new PositiveIntegerWrapper(compuScale.getMask());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLowerLimit() {
        
        if (CollUtil.isNotEmpty(compuScale.getLowerLimit())) {
            
            return new LimitWrapper(compuScale.getLowerLimit());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getUpperLimit() {
        
        if (CollUtil.isNotEmpty(compuScale.getUpperLimit())) {
            
            return new LimitWrapper(compuScale.getUpperLimit());
            
        } else {
            return null;
        }
        
    }

    public CompuConstWrapper getCompuInverseValue() {
        
        if (CollUtil.isNotEmpty(compuScale.getCompuInverseValue())) {
            
            return new CompuConstWrapper(compuScale.getCompuInverseValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(compuScale.getVariationPoint())) {
            
            return new VariationPointWrapper(compuScale.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CompuConstWrapper getCompuConst() {
        
        if (CollUtil.isNotEmpty(compuScale.getCompuConst())) {
            
            return new CompuConstWrapper(compuScale.getCompuConst());
            
        } else {
            return null;
        }
        
    }




    


    
}
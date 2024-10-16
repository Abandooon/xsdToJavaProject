package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class TextValueSpecificationWrapper {

    
    private TextValueSpecification textValueSpecification;

    public TextValueSpecificationWrapper(TextValueSpecification textValueSpecification) {
        this.textValueSpecification = textValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(textValueSpecification.getS())) {
            
            return textValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(textValueSpecification.getT())) {
            
            return textValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(textValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(textValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(textValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(textValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getValue() {
        
        if (CollUtil.isNotEmpty(textValueSpecification.getValue())) {
            
            return new VerbatimStringWrapper(textValueSpecification.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
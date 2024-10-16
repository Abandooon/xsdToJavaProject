package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TextTableValuePairWrapper {

    
    private TextTableValuePair textTableValuePair;

    public TextTableValuePairWrapper(TextTableValuePair textTableValuePair) {
        this.textTableValuePair = textTableValuePair;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(textTableValuePair.getS())) {
            
            return textTableValuePair.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(textTableValuePair.getT())) {
            
            return textTableValuePair.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getFirstValue() {
        
        if (CollUtil.isNotEmpty(textTableValuePair.getFirstValue())) {
            
            return new NumericalValueVariationPointWrapper(textTableValuePair.getFirstValue());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getSecondValue() {
        
        if (CollUtil.isNotEmpty(textTableValuePair.getSecondValue())) {
            
            return new NumericalValueVariationPointWrapper(textTableValuePair.getSecondValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class FmAttributeValueWrapper {

    
    private FmAttributeValue fmAttributeValue;

    public FmAttributeValueWrapper(FmAttributeValue fmAttributeValue) {
        this.fmAttributeValue = fmAttributeValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmAttributeValue.getS())) {
            
            return fmAttributeValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmAttributeValue.getT())) {
            
            return fmAttributeValue.getT();
            
        } else {
            return null;
        }
        
    }

    public DefinitionRef_FmAttributeValueWrapper getDefinitionRef() {
        
        if (CollUtil.isNotEmpty(fmAttributeValue.getDefinitionRef())) {
            
            return new DefinitionRef_FmAttributeValueWrapper(fmAttributeValue.getDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getValue() {
        
        if (CollUtil.isNotEmpty(fmAttributeValue.getValue())) {
            
            return new NumericalValueWrapper(fmAttributeValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
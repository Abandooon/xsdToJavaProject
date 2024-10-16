package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class TagWithOptionalValueWrapper {

    
    private TagWithOptionalValue tagWithOptionalValue;

    public TagWithOptionalValueWrapper(TagWithOptionalValue tagWithOptionalValue) {
        this.tagWithOptionalValue = tagWithOptionalValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tagWithOptionalValue.getS())) {
            
            return tagWithOptionalValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tagWithOptionalValue.getT())) {
            
            return tagWithOptionalValue.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getKey() {
        
        if (CollUtil.isNotEmpty(tagWithOptionalValue.getKey())) {
            
            return new StringWrapper(tagWithOptionalValue.getKey());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getValue() {
        
        if (CollUtil.isNotEmpty(tagWithOptionalValue.getValue())) {
            
            return new StringWrapper(tagWithOptionalValue.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
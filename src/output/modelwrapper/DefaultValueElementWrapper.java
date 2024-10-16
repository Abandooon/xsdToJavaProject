package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class DefaultValueElementWrapper {

    
    private DefaultValueElement defaultValueElement;

    public DefaultValueElementWrapper(DefaultValueElement defaultValueElement) {
        this.defaultValueElement = defaultValueElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(defaultValueElement.getS())) {
            
            return defaultValueElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(defaultValueElement.getT())) {
            
            return defaultValueElement.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getElementByteValue() {
        
        if (CollUtil.isNotEmpty(defaultValueElement.getElementByteValue())) {
            
            return new IntegerWrapper(defaultValueElement.getElementByteValue());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getElementPosition() {
        
        if (CollUtil.isNotEmpty(defaultValueElement.getElementPosition())) {
            
            return new IntegerWrapper(defaultValueElement.getElementPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}
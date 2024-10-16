package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BindingTimeEnumWrapper {

    
    private BindingTimeEnum bindingTimeEnum;

    public BindingTimeEnumWrapper(BindingTimeEnum bindingTimeEnum) {
        this.bindingTimeEnum = bindingTimeEnum;
    }

   
    public BindingTimeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(bindingTimeEnum.getValue())) {
            
            return bindingTimeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bindingTimeEnum.getS())) {
            
            return bindingTimeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bindingTimeEnum.getT())) {
            
            return bindingTimeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
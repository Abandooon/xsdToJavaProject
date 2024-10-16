package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AdditionalBindingTimeEnumWrapper {

    
    private AdditionalBindingTimeEnum additionalBindingTimeEnum;

    public AdditionalBindingTimeEnumWrapper(AdditionalBindingTimeEnum additionalBindingTimeEnum) {
        this.additionalBindingTimeEnum = additionalBindingTimeEnum;
    }

   
    public AdditionalBindingTimeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(additionalBindingTimeEnum.getValue())) {
            
            return additionalBindingTimeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(additionalBindingTimeEnum.getS())) {
            
            return additionalBindingTimeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(additionalBindingTimeEnum.getT())) {
            
            return additionalBindingTimeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceLongNameEnumWrapper {

    
    private ShowResourceLongNameEnum showResourceLongNameEnum;

    public ShowResourceLongNameEnumWrapper(ShowResourceLongNameEnum showResourceLongNameEnum) {
        this.showResourceLongNameEnum = showResourceLongNameEnum;
    }

   
    public ShowResourceLongNameEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceLongNameEnum.getValue())) {
            
            return showResourceLongNameEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceLongNameEnum.getS())) {
            
            return showResourceLongNameEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceLongNameEnum.getT())) {
            
            return showResourceLongNameEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceTypeEnumWrapper {

    
    private ShowResourceTypeEnum showResourceTypeEnum;

    public ShowResourceTypeEnumWrapper(ShowResourceTypeEnum showResourceTypeEnum) {
        this.showResourceTypeEnum = showResourceTypeEnum;
    }

   
    public ShowResourceTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceTypeEnum.getValue())) {
            
            return showResourceTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceTypeEnum.getS())) {
            
            return showResourceTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceTypeEnum.getT())) {
            
            return showResourceTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
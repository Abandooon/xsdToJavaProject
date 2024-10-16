package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowContentEnumWrapper {

    
    private ShowContentEnum showContentEnum;

    public ShowContentEnumWrapper(ShowContentEnum showContentEnum) {
        this.showContentEnum = showContentEnum;
    }

   
    public ShowContentEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showContentEnum.getValue())) {
            
            return showContentEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showContentEnum.getS())) {
            
            return showContentEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showContentEnum.getT())) {
            
            return showContentEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceCategoryEnumWrapper {

    
    private ShowResourceCategoryEnum showResourceCategoryEnum;

    public ShowResourceCategoryEnumWrapper(ShowResourceCategoryEnum showResourceCategoryEnum) {
        this.showResourceCategoryEnum = showResourceCategoryEnum;
    }

   
    public ShowResourceCategoryEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceCategoryEnum.getValue())) {
            
            return showResourceCategoryEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceCategoryEnum.getS())) {
            
            return showResourceCategoryEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceCategoryEnum.getT())) {
            
            return showResourceCategoryEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
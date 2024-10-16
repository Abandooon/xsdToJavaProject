package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CalprmAxisCategoryEnumWrapper {

    
    private CalprmAxisCategoryEnum calprmAxisCategoryEnum;

    public CalprmAxisCategoryEnumWrapper(CalprmAxisCategoryEnum calprmAxisCategoryEnum) {
        this.calprmAxisCategoryEnum = calprmAxisCategoryEnum;
    }

   
    public CalprmAxisCategoryEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(calprmAxisCategoryEnum.getValue())) {
            
            return calprmAxisCategoryEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(calprmAxisCategoryEnum.getS())) {
            
            return calprmAxisCategoryEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(calprmAxisCategoryEnum.getT())) {
            
            return calprmAxisCategoryEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
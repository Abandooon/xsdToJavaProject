package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CategoryStringWrapper {

    
    private CategoryString categoryString;

    public CategoryStringWrapper(CategoryString categoryString) {
        this.categoryString = categoryString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(categoryString.getValue())) {
            
            return categoryString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(categoryString.getS())) {
            
            return categoryString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(categoryString.getT())) {
            
            return categoryString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
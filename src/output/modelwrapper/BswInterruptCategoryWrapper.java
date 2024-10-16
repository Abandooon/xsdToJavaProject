package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BswInterruptCategoryWrapper {

    
    private BswInterruptCategory bswInterruptCategory;

    public BswInterruptCategoryWrapper(BswInterruptCategory bswInterruptCategory) {
        this.bswInterruptCategory = bswInterruptCategory;
    }

   
    public BswInterruptCategorySimple getValue() {
        
        if (CollUtil.isNotEmpty(bswInterruptCategory.getValue())) {
            
            return bswInterruptCategory.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInterruptCategory.getS())) {
            
            return bswInterruptCategory.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInterruptCategory.getT())) {
            
            return bswInterruptCategory.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
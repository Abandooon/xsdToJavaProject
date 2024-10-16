package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowSeeEnumWrapper {

    
    private ShowSeeEnum showSeeEnum;

    public ShowSeeEnumWrapper(ShowSeeEnum showSeeEnum) {
        this.showSeeEnum = showSeeEnum;
    }

   
    public ShowSeeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showSeeEnum.getValue())) {
            
            return showSeeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showSeeEnum.getS())) {
            
            return showSeeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showSeeEnum.getT())) {
            
            return showSeeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
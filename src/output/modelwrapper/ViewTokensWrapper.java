package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ViewTokensWrapper {

    
    private ViewTokens viewTokens;

    public ViewTokensWrapper(ViewTokens viewTokens) {
        this.viewTokens = viewTokens;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(viewTokens.getValue())) {
            
            return viewTokens.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(viewTokens.getS())) {
            
            return viewTokens.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(viewTokens.getT())) {
            
            return viewTokens.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
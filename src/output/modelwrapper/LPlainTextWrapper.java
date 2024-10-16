package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class LPlainTextWrapper {

    
    private LPlainText lPlainText;

    public LPlainTextWrapper(LPlainText lPlainText) {
        this.lPlainText = lPlainText;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lPlainText.getS())) {
            
            return lPlainText.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lPlainText.getT())) {
            
            return lPlainText.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lPlainText.getL())) {
            
            return lPlainText.getL();
            
        } else {
            return null;
        }
        
    }




    


    
}
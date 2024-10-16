package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DisplayFormatStringWrapper {

    
    private DisplayFormatString displayFormatString;

    public DisplayFormatStringWrapper(DisplayFormatString displayFormatString) {
        this.displayFormatString = displayFormatString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(displayFormatString.getValue())) {
            
            return displayFormatString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(displayFormatString.getS())) {
            
            return displayFormatString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(displayFormatString.getT())) {
            
            return displayFormatString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
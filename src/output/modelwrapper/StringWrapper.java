package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.String;


    
    

    
    

    
    


public class StringWrapper {

    
    private String string1;

    public StringWrapper(String string1) {
        this.string1 = string1;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(string1.getValue())) {
            
            return string1.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(string1.getS())) {
            
            return string1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(string1.getT())) {
            
            return string1.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
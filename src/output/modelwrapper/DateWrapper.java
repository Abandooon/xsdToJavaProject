package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Date;


    
    

    
    

    
    


public class DateWrapper {

    
    private Date date;

    public DateWrapper(Date date) {
        this.date = date;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(date.getValue())) {
            
            return date.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(date.getS())) {
            
            return date.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(date.getT())) {
            
            return date.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
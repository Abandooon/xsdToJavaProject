package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TimeValueWrapper {

    
    private TimeValue timeValue;

    public TimeValueWrapper(TimeValue timeValue) {
        this.timeValue = timeValue;
    }

   
    public java.lang.Double getValue() {
        
        if (CollUtil.isNotEmpty(timeValue.getValue())) {
            
            return timeValue.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeValue.getS())) {
            
            return timeValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeValue.getT())) {
            
            return timeValue.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
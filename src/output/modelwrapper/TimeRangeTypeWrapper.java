package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TimeRangeTypeWrapper {

    
    private TimeRangeType timeRangeType;

    public TimeRangeTypeWrapper(TimeRangeType timeRangeType) {
        this.timeRangeType = timeRangeType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(timeRangeType.getS())) {
            
            return timeRangeType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(timeRangeType.getT())) {
            
            return timeRangeType.getT();
            
        } else {
            return null;
        }
        
    }

    public ToleranceWrapper getTolerance() {
        
        if (CollUtil.isNotEmpty(timeRangeType.getTolerance())) {
            
            return new ToleranceWrapper(timeRangeType.getTolerance());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getValue() {
        
        if (CollUtil.isNotEmpty(timeRangeType.getValue())) {
            
            return new TimeValueWrapper(timeRangeType.getValue());
            
        } else {
            return null;
        }
        
    }




    


    
}
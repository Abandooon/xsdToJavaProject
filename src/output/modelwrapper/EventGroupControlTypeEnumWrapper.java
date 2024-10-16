package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EventGroupControlTypeEnumWrapper {

    
    private EventGroupControlTypeEnum eventGroupControlTypeEnum;

    public EventGroupControlTypeEnumWrapper(EventGroupControlTypeEnum eventGroupControlTypeEnum) {
        this.eventGroupControlTypeEnum = eventGroupControlTypeEnum;
    }

   
    public EventGroupControlTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(eventGroupControlTypeEnum.getValue())) {
            
            return eventGroupControlTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eventGroupControlTypeEnum.getS())) {
            
            return eventGroupControlTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eventGroupControlTypeEnum.getT())) {
            
            return eventGroupControlTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
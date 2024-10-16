package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EventAcceptanceStatusEnumWrapper {

    
    private EventAcceptanceStatusEnum eventAcceptanceStatusEnum;

    public EventAcceptanceStatusEnumWrapper(EventAcceptanceStatusEnum eventAcceptanceStatusEnum) {
        this.eventAcceptanceStatusEnum = eventAcceptanceStatusEnum;
    }

   
    public EventAcceptanceStatusEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(eventAcceptanceStatusEnum.getValue())) {
            
            return eventAcceptanceStatusEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eventAcceptanceStatusEnum.getS())) {
            
            return eventAcceptanceStatusEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eventAcceptanceStatusEnum.getT())) {
            
            return eventAcceptanceStatusEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
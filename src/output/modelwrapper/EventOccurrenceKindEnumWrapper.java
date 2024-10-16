package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EventOccurrenceKindEnumWrapper {

    
    private EventOccurrenceKindEnum eventOccurrenceKindEnum;

    public EventOccurrenceKindEnumWrapper(EventOccurrenceKindEnum eventOccurrenceKindEnum) {
        this.eventOccurrenceKindEnum = eventOccurrenceKindEnum;
    }

   
    public EventOccurrenceKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(eventOccurrenceKindEnum.getValue())) {
            
            return eventOccurrenceKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eventOccurrenceKindEnum.getS())) {
            
            return eventOccurrenceKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eventOccurrenceKindEnum.getT())) {
            
            return eventOccurrenceKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}
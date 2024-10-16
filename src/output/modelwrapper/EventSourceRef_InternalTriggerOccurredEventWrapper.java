package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRef_InternalTriggerOccurredEventWrapper {

    
    
    private EventSourceRef_InternalTriggerOccurredEvent eventSourceRef_InternalTriggerOccurredEvent;

    public EventSourceRef_InternalTriggerOccurredEventWrapper(EventSourceRef_InternalTriggerOccurredEvent eventSourceRef_InternalTriggerOccurredEvent) {
        this.eventSourceRef_InternalTriggerOccurredEvent = eventSourceRef_InternalTriggerOccurredEvent;
    }

   
    public InternalTriggeringPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef_InternalTriggerOccurredEvent.getDest())) {
            
            return eventSourceRef_InternalTriggerOccurredEvent.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRef_InternalTriggerOccurredEventObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef_InternalTriggerOccurredEvent.getValue();
        java.lang.String type = eventSourceRef_InternalTriggerOccurredEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public InternalTriggeringPointWrapper getInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef_InternalTriggerOccurredEvent.getValue();
        java.lang.String type = eventSourceRef_InternalTriggerOccurredEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggeringPoint){
            return new InternalTriggeringPointWrapper((InternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
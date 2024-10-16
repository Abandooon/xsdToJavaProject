package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRef_BswInternalTriggerOccurredEventWrapper {

    
    
    private EventSourceRef_BswInternalTriggerOccurredEvent eventSourceRef_BswInternalTriggerOccurredEvent;

    public EventSourceRef_BswInternalTriggerOccurredEventWrapper(EventSourceRef_BswInternalTriggerOccurredEvent eventSourceRef_BswInternalTriggerOccurredEvent) {
        this.eventSourceRef_BswInternalTriggerOccurredEvent = eventSourceRef_BswInternalTriggerOccurredEvent;
    }

   
    public BswInternalTriggeringPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef_BswInternalTriggerOccurredEvent.getDest())) {
            
            return eventSourceRef_BswInternalTriggerOccurredEvent.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRef_BswInternalTriggerOccurredEventObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef_BswInternalTriggerOccurredEvent.getValue();
        java.lang.String type = eventSourceRef_BswInternalTriggerOccurredEvent.getDest().toString().replace("_", "-");
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

    
    public BswInternalTriggeringPointWrapper getBswInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef_BswInternalTriggerOccurredEvent.getValue();
        java.lang.String type = eventSourceRef_BswInternalTriggerOccurredEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalTriggeringPoint){
            return new BswInternalTriggeringPointWrapper((BswInternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
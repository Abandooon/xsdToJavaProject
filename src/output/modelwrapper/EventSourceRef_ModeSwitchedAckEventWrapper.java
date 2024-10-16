package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRef_ModeSwitchedAckEventWrapper {

    
    
    private EventSourceRef_ModeSwitchedAckEvent eventSourceRef_ModeSwitchedAckEvent;

    public EventSourceRef_ModeSwitchedAckEventWrapper(EventSourceRef_ModeSwitchedAckEvent eventSourceRef_ModeSwitchedAckEvent) {
        this.eventSourceRef_ModeSwitchedAckEvent = eventSourceRef_ModeSwitchedAckEvent;
    }

   
    public ModeSwitchPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef_ModeSwitchedAckEvent.getDest())) {
            
            return eventSourceRef_ModeSwitchedAckEvent.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRef_ModeSwitchedAckEventObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef_ModeSwitchedAckEvent.getValue();
        java.lang.String type = eventSourceRef_ModeSwitchedAckEvent.getDest().toString().replace("_", "-");
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

    
    public ModeSwitchPointWrapper getModeSwitchPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef_ModeSwitchedAckEvent.getValue();
        java.lang.String type = eventSourceRef_ModeSwitchedAckEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchPoint){
            return new ModeSwitchPointWrapper((ModeSwitchPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
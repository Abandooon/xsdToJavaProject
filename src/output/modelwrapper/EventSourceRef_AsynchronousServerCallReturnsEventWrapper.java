package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRef_AsynchronousServerCallReturnsEventWrapper {

    
    
    private EventSourceRef_AsynchronousServerCallReturnsEvent eventSourceRef_AsynchronousServerCallReturnsEvent;

    public EventSourceRef_AsynchronousServerCallReturnsEventWrapper(EventSourceRef_AsynchronousServerCallReturnsEvent eventSourceRef_AsynchronousServerCallReturnsEvent) {
        this.eventSourceRef_AsynchronousServerCallReturnsEvent = eventSourceRef_AsynchronousServerCallReturnsEvent;
    }

   
    public AsynchronousServerCallResultPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef_AsynchronousServerCallReturnsEvent.getDest())) {
            
            return eventSourceRef_AsynchronousServerCallReturnsEvent.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRef_AsynchronousServerCallReturnsEventObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef_AsynchronousServerCallReturnsEvent.getValue();
        java.lang.String type = eventSourceRef_AsynchronousServerCallReturnsEvent.getDest().toString().replace("_", "-");
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

    
    public AsynchronousServerCallResultPointWrapper getAsynchronousServerCallResultPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef_AsynchronousServerCallReturnsEvent.getValue();
        java.lang.String type = eventSourceRef_AsynchronousServerCallReturnsEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallResultPoint){
            return new AsynchronousServerCallResultPointWrapper((AsynchronousServerCallResultPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
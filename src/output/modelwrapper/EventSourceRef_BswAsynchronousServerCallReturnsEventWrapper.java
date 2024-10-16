package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRef_BswAsynchronousServerCallReturnsEventWrapper {

    
    
    private EventSourceRef_BswAsynchronousServerCallReturnsEvent eventSourceRef_BswAsynchronousServerCallReturnsEvent;

    public EventSourceRef_BswAsynchronousServerCallReturnsEventWrapper(EventSourceRef_BswAsynchronousServerCallReturnsEvent eventSourceRef_BswAsynchronousServerCallReturnsEvent) {
        this.eventSourceRef_BswAsynchronousServerCallReturnsEvent = eventSourceRef_BswAsynchronousServerCallReturnsEvent;
    }

   
    public BswAsynchronousServerCallResultPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef_BswAsynchronousServerCallReturnsEvent.getDest())) {
            
            return eventSourceRef_BswAsynchronousServerCallReturnsEvent.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRef_BswAsynchronousServerCallReturnsEventObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef_BswAsynchronousServerCallReturnsEvent.getValue();
        java.lang.String type = eventSourceRef_BswAsynchronousServerCallReturnsEvent.getDest().toString().replace("_", "-");
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

    
    public BswAsynchronousServerCallResultPointWrapper getBswAsynchronousServerCallResultPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef_BswAsynchronousServerCallReturnsEvent.getValue();
        java.lang.String type = eventSourceRef_BswAsynchronousServerCallReturnsEvent.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswAsynchronousServerCallResultPoint){
            return new BswAsynchronousServerCallResultPointWrapper((BswAsynchronousServerCallResultPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
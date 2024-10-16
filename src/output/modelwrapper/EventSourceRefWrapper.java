package stdgui.data.model.modelwrapper;


    
    


     

public class EventSourceRefWrapper {

    
    
    private EventSourceRef eventSourceRef;

    public EventSourceRefWrapper(EventSourceRef eventSourceRef) {
        this.eventSourceRef = eventSourceRef;
    }

   
    public VariableAccessSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(eventSourceRef.getDest())) {
            
            return eventSourceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEventSourceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = eventSourceRef.getValue();
        java.lang.String type = eventSourceRef.getDest().toString().replace("_", "-");
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

    
    public VariableAccessWrapper getVariableAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = eventSourceRef.getValue();
        java.lang.String type = eventSourceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAccess){
            return new VariableAccessWrapper((VariableAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
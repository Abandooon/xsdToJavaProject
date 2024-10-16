package stdgui.data.model.modelwrapper;


    
    


     

public class FirstTriggerRefWrapper {

    
    
    private FirstTriggerRef firstTriggerRef;

    public FirstTriggerRefWrapper(FirstTriggerRef firstTriggerRef) {
        this.firstTriggerRef = firstTriggerRef;
    }

   
    public TriggerSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstTriggerRef.getDest())) {
            
            return firstTriggerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstTriggerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstTriggerRef.getValue();
        java.lang.String type = firstTriggerRef.getDest().toString().replace("_", "-");
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

    
    public TriggerWrapper getTrigger() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = firstTriggerRef.getValue();
        java.lang.String type = firstTriggerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Trigger){
            return new TriggerWrapper((Trigger) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
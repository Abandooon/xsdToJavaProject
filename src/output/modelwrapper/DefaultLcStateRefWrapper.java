package stdgui.data.model.modelwrapper;


    
    


     

public class DefaultLcStateRefWrapper {

    
    
    private DefaultLcStateRef defaultLcStateRef;

    public DefaultLcStateRefWrapper(DefaultLcStateRef defaultLcStateRef) {
        this.defaultLcStateRef = defaultLcStateRef;
    }

   
    public LifeCycleStateSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(defaultLcStateRef.getDest())) {
            
            return defaultLcStateRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefaultLcStateRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = defaultLcStateRef.getValue();
        java.lang.String type = defaultLcStateRef.getDest().toString().replace("_", "-");
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

    
    public LifeCycleStateWrapper getLifeCycleState() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = defaultLcStateRef.getValue();
        java.lang.String type = defaultLcStateRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleState){
            return new LifeCycleStateWrapper((LifeCycleState) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
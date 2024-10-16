package stdgui.data.model.modelwrapper;


    
    


     

public class BehaviorRef_SwcImplementationWrapper {

    
    
    private BehaviorRef_SwcImplementation behaviorRef_SwcImplementation;

    public BehaviorRef_SwcImplementationWrapper(BehaviorRef_SwcImplementation behaviorRef_SwcImplementation) {
        this.behaviorRef_SwcImplementation = behaviorRef_SwcImplementation;
    }

   
    public SwcInternalBehaviorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(behaviorRef_SwcImplementation.getDest())) {
            
            return behaviorRef_SwcImplementation.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBehaviorRef_SwcImplementationObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = behaviorRef_SwcImplementation.getValue();
        java.lang.String type = behaviorRef_SwcImplementation.getDest().toString().replace("_", "-");
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

    
    public SwcInternalBehaviorWrapper getSwcInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = behaviorRef_SwcImplementation.getValue();
        java.lang.String type = behaviorRef_SwcImplementation.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcInternalBehavior){
            return new SwcInternalBehaviorWrapper((SwcInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
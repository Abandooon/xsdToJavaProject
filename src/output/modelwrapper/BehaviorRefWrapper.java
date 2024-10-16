package stdgui.data.model.modelwrapper;


    
    


     

public class BehaviorRefWrapper {

    
    
    private BehaviorRef behaviorRef;

    public BehaviorRefWrapper(BehaviorRef behaviorRef) {
        this.behaviorRef = behaviorRef;
    }

   
    public BswInternalBehaviorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(behaviorRef.getDest())) {
            
            return behaviorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBehaviorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = behaviorRef.getValue();
        java.lang.String type = behaviorRef.getDest().toString().replace("_", "-");
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

    
    public BswInternalBehaviorWrapper getBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = behaviorRef.getValue();
        java.lang.String type = behaviorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalBehavior){
            return new BswInternalBehaviorWrapper((BswInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
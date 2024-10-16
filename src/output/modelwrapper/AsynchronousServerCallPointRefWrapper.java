package stdgui.data.model.modelwrapper;


    
    


     

public class AsynchronousServerCallPointRefWrapper {

    
    
    private AsynchronousServerCallPointRef asynchronousServerCallPointRef;

    public AsynchronousServerCallPointRefWrapper(AsynchronousServerCallPointRef asynchronousServerCallPointRef) {
        this.asynchronousServerCallPointRef = asynchronousServerCallPointRef;
    }

   
    public AsynchronousServerCallPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPointRef.getDest())) {
            
            return asynchronousServerCallPointRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAsynchronousServerCallPointRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = asynchronousServerCallPointRef.getValue();
        java.lang.String type = asynchronousServerCallPointRef.getDest().toString().replace("_", "-");
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

    
    public AsynchronousServerCallPointWrapper getAsynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = asynchronousServerCallPointRef.getValue();
        java.lang.String type = asynchronousServerCallPointRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallPoint){
            return new AsynchronousServerCallPointWrapper((AsynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
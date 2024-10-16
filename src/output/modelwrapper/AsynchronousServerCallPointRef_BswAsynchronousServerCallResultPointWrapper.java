package stdgui.data.model.modelwrapper;


    
    


     

public class AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPointWrapper {

    
    
    private AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint;

    public AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPointWrapper(AsynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint) {
        this.asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint = asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint;
    }

   
    public BswAsynchronousServerCallPointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getDest())) {
            
            return asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAsynchronousServerCallPointRef_BswAsynchronousServerCallResultPointObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getValue();
        java.lang.String type = asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getDest().toString().replace("_", "-");
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

    
    public BswAsynchronousServerCallPointWrapper getBswAsynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getValue();
        java.lang.String type = asynchronousServerCallPointRef_BswAsynchronousServerCallResultPoint.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswAsynchronousServerCallPoint){
            return new BswAsynchronousServerCallPointWrapper((BswAsynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class SwcBehaviorRefWrapper {

    
    
    private SwcBehaviorRef swcBehaviorRef;

    public SwcBehaviorRefWrapper(SwcBehaviorRef swcBehaviorRef) {
        this.swcBehaviorRef = swcBehaviorRef;
    }

   
    public SwcInternalBehaviorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swcBehaviorRef.getDest())) {
            
            return swcBehaviorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwcBehaviorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swcBehaviorRef.getValue();
        java.lang.String type = swcBehaviorRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = swcBehaviorRef.getValue();
        java.lang.String type = swcBehaviorRef.getDest().toString().replace("_", "-");
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
package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class BswEntityRefWrapper {

    
    
    private BswEntityRef bswEntityRef;

    public BswEntityRefWrapper(BswEntityRef bswEntityRef) {
        this.bswEntityRef = bswEntityRef;
    }

   
    public BswModuleEntitySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswEntityRef.getDest())) {
            
            return bswEntityRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswEntityRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswEntityRef.getValue();
        java.lang.String type = bswEntityRef.getDest().toString().replace("_", "-");
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

    
    public BswCalledEntityWrapper getBswCalledEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswEntityRef.getValue();
        java.lang.String type = bswEntityRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswCalledEntity){
            return new BswCalledEntityWrapper((BswCalledEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInterruptEntityWrapper getBswInterruptEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswEntityRef.getValue();
        java.lang.String type = bswEntityRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInterruptEntity){
            return new BswInterruptEntityWrapper((BswInterruptEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswSchedulableEntityWrapper getBswSchedulableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswEntityRef.getValue();
        java.lang.String type = bswEntityRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswSchedulableEntity){
            return new BswSchedulableEntityWrapper((BswSchedulableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
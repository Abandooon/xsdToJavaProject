package stdgui.data.model.modelwrapper;


    
    


     

public class BswModuleInstanceRefWrapper {

    
    
    private BswModuleInstanceRef bswModuleInstanceRef;

    public BswModuleInstanceRefWrapper(BswModuleInstanceRef bswModuleInstanceRef) {
        this.bswModuleInstanceRef = bswModuleInstanceRef;
    }

   
    public BswImplementationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswModuleInstanceRef.getDest())) {
            
            return bswModuleInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswModuleInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswModuleInstanceRef.getValue();
        java.lang.String type = bswModuleInstanceRef.getDest().toString().replace("_", "-");
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

    
    public BswImplementationWrapper getBswImplementation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswModuleInstanceRef.getValue();
        java.lang.String type = bswModuleInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswImplementation){
            return new BswImplementationWrapper((BswImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class BswModuleDescriptionRefWrapper {

    
    
    private BswModuleDescriptionRef bswModuleDescriptionRef;

    public BswModuleDescriptionRefWrapper(BswModuleDescriptionRef bswModuleDescriptionRef) {
        this.bswModuleDescriptionRef = bswModuleDescriptionRef;
    }

   
    public BswModuleDescriptionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(bswModuleDescriptionRef.getDest())) {
            
            return bswModuleDescriptionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBswModuleDescriptionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = bswModuleDescriptionRef.getValue();
        java.lang.String type = bswModuleDescriptionRef.getDest().toString().replace("_", "-");
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

    
    public BswModuleDescriptionWrapper getBswModuleDescription() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = bswModuleDescriptionRef.getValue();
        java.lang.String type = bswModuleDescriptionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleDescription){
            return new BswModuleDescriptionWrapper((BswModuleDescription) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
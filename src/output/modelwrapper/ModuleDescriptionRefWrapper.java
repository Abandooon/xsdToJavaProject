package stdgui.data.model.modelwrapper;


    
    


     

public class ModuleDescriptionRefWrapper {

    
    
    private ModuleDescriptionRef moduleDescriptionRef;

    public ModuleDescriptionRefWrapper(ModuleDescriptionRef moduleDescriptionRef) {
        this.moduleDescriptionRef = moduleDescriptionRef;
    }

   
    public BswImplementationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(moduleDescriptionRef.getDest())) {
            
            return moduleDescriptionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModuleDescriptionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = moduleDescriptionRef.getValue();
        java.lang.String type = moduleDescriptionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = moduleDescriptionRef.getValue();
        java.lang.String type = moduleDescriptionRef.getDest().toString().replace("_", "-");
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
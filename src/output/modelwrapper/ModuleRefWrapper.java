package stdgui.data.model.modelwrapper;


    
    


     

public class ModuleRefWrapper {

    
    
    private ModuleRef moduleRef;

    public ModuleRefWrapper(ModuleRef moduleRef) {
        this.moduleRef = moduleRef;
    }

   
    public EcucModuleDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(moduleRef.getDest())) {
            
            return moduleRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getModuleRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = moduleRef.getValue();
        java.lang.String type = moduleRef.getDest().toString().replace("_", "-");
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

    
    public EcucModuleDefWrapper getEcucModuleDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = moduleRef.getValue();
        java.lang.String type = moduleRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
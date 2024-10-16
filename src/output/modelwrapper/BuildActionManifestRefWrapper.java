package stdgui.data.model.modelwrapper;


    
    


     

public class BuildActionManifestRefWrapper {

    
    
    private BuildActionManifestRef buildActionManifestRef;

    public BuildActionManifestRefWrapper(BuildActionManifestRef buildActionManifestRef) {
        this.buildActionManifestRef = buildActionManifestRef;
    }

   
    public BuildActionManifestSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(buildActionManifestRef.getDest())) {
            
            return buildActionManifestRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBuildActionManifestRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = buildActionManifestRef.getValue();
        java.lang.String type = buildActionManifestRef.getDest().toString().replace("_", "-");
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

    
    public BuildActionManifestWrapper getBuildActionManifest() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = buildActionManifestRef.getValue();
        java.lang.String type = buildActionManifestRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionManifest){
            return new BuildActionManifestWrapper((BuildActionManifest) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
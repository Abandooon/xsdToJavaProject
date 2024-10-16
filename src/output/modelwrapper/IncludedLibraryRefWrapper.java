package stdgui.data.model.modelwrapper;


    
    


     

public class IncludedLibraryRefWrapper {

    
    
    private IncludedLibraryRef includedLibraryRef;

    public IncludedLibraryRefWrapper(IncludedLibraryRef includedLibraryRef) {
        this.includedLibraryRef = includedLibraryRef;
    }

   
    public DependencyOnArtifactSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(includedLibraryRef.getDest())) {
            
            return includedLibraryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getIncludedLibraryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = includedLibraryRef.getValue();
        java.lang.String type = includedLibraryRef.getDest().toString().replace("_", "-");
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

    
    public DependencyOnArtifactWrapper getDependencyOnArtifact() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = includedLibraryRef.getValue();
        java.lang.String type = includedLibraryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DependencyOnArtifact){
            return new DependencyOnArtifactWrapper((DependencyOnArtifact) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
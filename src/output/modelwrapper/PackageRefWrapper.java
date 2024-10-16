package stdgui.data.model.modelwrapper;


    
    


     

public class PackageRefWrapper {

    
    
    private PackageRef packageRef;

    public PackageRefWrapper(PackageRef packageRef) {
        this.packageRef = packageRef;
    }

   
    public ArPackageSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(packageRef.getDest())) {
            
            return packageRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPackageRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = packageRef.getValue();
        java.lang.String type = packageRef.getDest().toString().replace("_", "-");
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

    
    public ArPackageWrapper getArPackage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = packageRef.getValue();
        java.lang.String type = packageRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArPackage){
            return new ArPackageWrapper((ArPackage) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
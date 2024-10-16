package stdgui.data.model.modelwrapper;


    
    


     

public class SyscRefWrapper {

    
    
    private SyscRef syscRef;

    public SyscRefWrapper(SyscRef syscRef) {
        this.syscRef = syscRef;
    }

   
    public SwSystemconstSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(syscRef.getDest())) {
            
            return syscRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSyscRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = syscRef.getValue();
        java.lang.String type = syscRef.getDest().toString().replace("_", "-");
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

    
    public SwSystemconstWrapper getSwSystemconst() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = syscRef.getValue();
        java.lang.String type = syscRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwSystemconst){
            return new SwSystemconstWrapper((SwSystemconst) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
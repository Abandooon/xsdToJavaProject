package stdgui.data.model.modelwrapper;


    
    


     

public class SyscStringRefWrapper {

    
    
    private SyscStringRef syscStringRef;

    public SyscStringRefWrapper(SyscStringRef syscStringRef) {
        this.syscStringRef = syscStringRef;
    }

   
    public SwSystemconstSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(syscStringRef.getDest())) {
            
            return syscStringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSyscStringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = syscStringRef.getValue();
        java.lang.String type = syscStringRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = syscStringRef.getValue();
        java.lang.String type = syscStringRef.getDest().toString().replace("_", "-");
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
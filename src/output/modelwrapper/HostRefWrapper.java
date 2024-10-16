package stdgui.data.model.modelwrapper;


    
    


     

public class HostRefWrapper {

    
    
    private HostRef hostRef;

    public HostRefWrapper(HostRef hostRef) {
        this.hostRef = hostRef;
    }

   
    public EcuInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hostRef.getDest())) {
            
            return hostRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHostRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hostRef.getValue();
        java.lang.String type = hostRef.getDest().toString().replace("_", "-");
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

    
    public EcuInstanceWrapper getEcuInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hostRef.getValue();
        java.lang.String type = hostRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuInstance){
            return new EcuInstanceWrapper((EcuInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
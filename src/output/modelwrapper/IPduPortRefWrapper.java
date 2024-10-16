package stdgui.data.model.modelwrapper;


    
    


     

public class IPduPortRefWrapper {

    
    
    private IPduPortRef iPduPortRef;

    public IPduPortRefWrapper(IPduPortRef iPduPortRef) {
        this.iPduPortRef = iPduPortRef;
    }

   
    public IPduPortSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(iPduPortRef.getDest())) {
            
            return iPduPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getIPduPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = iPduPortRef.getValue();
        java.lang.String type = iPduPortRef.getDest().toString().replace("_", "-");
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

    
    public IPduPortWrapper getIPduPort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = iPduPortRef.getValue();
        java.lang.String type = iPduPortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof IPduPort){
            return new IPduPortWrapper((IPduPort) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
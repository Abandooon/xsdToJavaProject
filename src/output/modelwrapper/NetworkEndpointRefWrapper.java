package stdgui.data.model.modelwrapper;


    
    


     

public class NetworkEndpointRefWrapper {

    
    
    private NetworkEndpointRef networkEndpointRef;

    public NetworkEndpointRefWrapper(NetworkEndpointRef networkEndpointRef) {
        this.networkEndpointRef = networkEndpointRef;
    }

   
    public NetworkEndpointSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(networkEndpointRef.getDest())) {
            
            return networkEndpointRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getNetworkEndpointRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = networkEndpointRef.getValue();
        java.lang.String type = networkEndpointRef.getDest().toString().replace("_", "-");
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

    
    public NetworkEndpointWrapper getNetworkEndpoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = networkEndpointRef.getValue();
        java.lang.String type = networkEndpointRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NetworkEndpoint){
            return new NetworkEndpointWrapper((NetworkEndpoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
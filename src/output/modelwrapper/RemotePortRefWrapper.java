package stdgui.data.model.modelwrapper;


    
    


     
         import stdgui.data.model.orimodel.SocketAddress;
     

public class RemotePortRefWrapper {

    
    
    private RemotePortRef remotePortRef;

    public RemotePortRefWrapper(RemotePortRef remotePortRef) {
        this.remotePortRef = remotePortRef;
    }

   
    public SocketAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(remotePortRef.getDest())) {
            
            return remotePortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRemotePortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = remotePortRef.getValue();
        java.lang.String type = remotePortRef.getDest().toString().replace("_", "-");
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

    
    public SocketAddressWrapper getSocketAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = remotePortRef.getValue();
        java.lang.String type = remotePortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SocketAddress){
            return new SocketAddressWrapper((SocketAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
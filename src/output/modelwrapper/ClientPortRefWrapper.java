package stdgui.data.model.modelwrapper;


    
    


     
         import stdgui.data.model.orimodel.SocketAddress;
     

public class ClientPortRefWrapper {

    
    
    private ClientPortRef clientPortRef;

    public ClientPortRefWrapper(ClientPortRef clientPortRef) {
        this.clientPortRef = clientPortRef;
    }

   
    public SocketAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(clientPortRef.getDest())) {
            
            return clientPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getClientPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = clientPortRef.getValue();
        java.lang.String type = clientPortRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = clientPortRef.getValue();
        java.lang.String type = clientPortRef.getDest().toString().replace("_", "-");
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
package stdgui.data.model.modelwrapper;


    
    


     

public class DoIpSourceAddressRef_SocketConnectionWrapper {

    
    
    private DoIpSourceAddressRef_SocketConnection doIpSourceAddressRef_SocketConnection;

    public DoIpSourceAddressRef_SocketConnectionWrapper(DoIpSourceAddressRef_SocketConnection doIpSourceAddressRef_SocketConnection) {
        this.doIpSourceAddressRef_SocketConnection = doIpSourceAddressRef_SocketConnection;
    }

   
    public LogicAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(doIpSourceAddressRef_SocketConnection.getDest())) {
            
            return doIpSourceAddressRef_SocketConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDoIpSourceAddressRef_SocketConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = doIpSourceAddressRef_SocketConnection.getValue();
        java.lang.String type = doIpSourceAddressRef_SocketConnection.getDest().toString().replace("_", "-");
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

    
    public LogicAddressWrapper getLogicAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = doIpSourceAddressRef_SocketConnection.getValue();
        java.lang.String type = doIpSourceAddressRef_SocketConnection.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LogicAddress){
            return new LogicAddressWrapper((LogicAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
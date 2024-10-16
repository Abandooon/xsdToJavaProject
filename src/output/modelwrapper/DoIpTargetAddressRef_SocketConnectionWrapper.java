package stdgui.data.model.modelwrapper;


    
    


     

public class DoIpTargetAddressRef_SocketConnectionWrapper {

    
    
    private DoIpTargetAddressRef_SocketConnection doIpTargetAddressRef_SocketConnection;

    public DoIpTargetAddressRef_SocketConnectionWrapper(DoIpTargetAddressRef_SocketConnection doIpTargetAddressRef_SocketConnection) {
        this.doIpTargetAddressRef_SocketConnection = doIpTargetAddressRef_SocketConnection;
    }

   
    public LogicAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(doIpTargetAddressRef_SocketConnection.getDest())) {
            
            return doIpTargetAddressRef_SocketConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDoIpTargetAddressRef_SocketConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = doIpTargetAddressRef_SocketConnection.getValue();
        java.lang.String type = doIpTargetAddressRef_SocketConnection.getDest().toString().replace("_", "-");
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
        java.lang.String path = doIpTargetAddressRef_SocketConnection.getValue();
        java.lang.String type = doIpTargetAddressRef_SocketConnection.getDest().toString().replace("_", "-");
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
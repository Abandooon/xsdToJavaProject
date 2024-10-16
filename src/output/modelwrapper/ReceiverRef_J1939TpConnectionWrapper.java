package stdgui.data.model.modelwrapper;


    
    


public class ReceiverRef_J1939TpConnectionWrapper {

    
    
    private ReceiverRef_J1939TpConnection receiverRef_J1939TpConnection;

    public ReceiverRef_J1939TpConnectionWrapper(ReceiverRef_J1939TpConnection receiverRef_J1939TpConnection) {
        this.receiverRef_J1939TpConnection = receiverRef_J1939TpConnection;
    }

   
    public J1939TpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(receiverRef_J1939TpConnection.getDest())) {
            
            return receiverRef_J1939TpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReceiverRef_J1939TpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = receiverRef_J1939TpConnection.getValue();
        java.lang.String type = receiverRef_J1939TpConnection.getDest().toString().replace("_", "-");
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

    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


public class TransmitterRef_J1939TpConnectionWrapper {

    
    
    private TransmitterRef_J1939TpConnection transmitterRef_J1939TpConnection;

    public TransmitterRef_J1939TpConnectionWrapper(TransmitterRef_J1939TpConnection transmitterRef_J1939TpConnection) {
        this.transmitterRef_J1939TpConnection = transmitterRef_J1939TpConnection;
    }

   
    public J1939TpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(transmitterRef_J1939TpConnection.getDest())) {
            
            return transmitterRef_J1939TpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTransmitterRef_J1939TpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = transmitterRef_J1939TpConnection.getValue();
        java.lang.String type = transmitterRef_J1939TpConnection.getDest().toString().replace("_", "-");
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
package stdgui.data.model.modelwrapper;


    
    


     

public class ConnectorRefWrapper {

    
    
    private ConnectorRef connectorRef;

    public ConnectorRefWrapper(ConnectorRef connectorRef) {
        this.connectorRef = connectorRef;
    }

   
    public FlexrayCommunicationConnectorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(connectorRef.getDest())) {
            
            return connectorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConnectorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = connectorRef.getValue();
        java.lang.String type = connectorRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayCommunicationConnectorWrapper getFlexrayCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = connectorRef.getValue();
        java.lang.String type = connectorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCommunicationConnector){
            return new FlexrayCommunicationConnectorWrapper((FlexrayCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
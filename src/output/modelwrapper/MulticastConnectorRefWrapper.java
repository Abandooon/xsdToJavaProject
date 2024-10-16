package stdgui.data.model.modelwrapper;


    
    


     

public class MulticastConnectorRefWrapper {

    
    
    private MulticastConnectorRef multicastConnectorRef;

    public MulticastConnectorRefWrapper(MulticastConnectorRef multicastConnectorRef) {
        this.multicastConnectorRef = multicastConnectorRef;
    }

   
    public EthernetCommunicationConnectorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(multicastConnectorRef.getDest())) {
            
            return multicastConnectorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMulticastConnectorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = multicastConnectorRef.getValue();
        java.lang.String type = multicastConnectorRef.getDest().toString().replace("_", "-");
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

    
    public EthernetCommunicationConnectorWrapper getEthernetCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = multicastConnectorRef.getValue();
        java.lang.String type = multicastConnectorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationConnector){
            return new EthernetCommunicationConnectorWrapper((EthernetCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
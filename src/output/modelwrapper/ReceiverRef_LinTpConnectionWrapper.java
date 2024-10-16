package stdgui.data.model.modelwrapper;


    
    


     

public class ReceiverRef_LinTpConnectionWrapper {

    
    
    private ReceiverRef_LinTpConnection receiverRef_LinTpConnection;

    public ReceiverRef_LinTpConnectionWrapper(ReceiverRef_LinTpConnection receiverRef_LinTpConnection) {
        this.receiverRef_LinTpConnection = receiverRef_LinTpConnection;
    }

   
    public LinTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(receiverRef_LinTpConnection.getDest())) {
            
            return receiverRef_LinTpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReceiverRef_LinTpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = receiverRef_LinTpConnection.getValue();
        java.lang.String type = receiverRef_LinTpConnection.getDest().toString().replace("_", "-");
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

    
    public LinTpNodeWrapper getLinTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = receiverRef_LinTpConnection.getValue();
        java.lang.String type = receiverRef_LinTpConnection.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinTpNode){
            return new LinTpNodeWrapper((LinTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
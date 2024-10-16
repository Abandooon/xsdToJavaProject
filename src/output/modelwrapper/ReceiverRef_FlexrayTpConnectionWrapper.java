package stdgui.data.model.modelwrapper;


    
    


     

public class ReceiverRef_FlexrayTpConnectionWrapper {

    
    
    private ReceiverRef_FlexrayTpConnection receiverRef_FlexrayTpConnection;

    public ReceiverRef_FlexrayTpConnectionWrapper(ReceiverRef_FlexrayTpConnection receiverRef_FlexrayTpConnection) {
        this.receiverRef_FlexrayTpConnection = receiverRef_FlexrayTpConnection;
    }

   
    public FlexrayTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(receiverRef_FlexrayTpConnection.getDest())) {
            
            return receiverRef_FlexrayTpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReceiverRef_FlexrayTpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = receiverRef_FlexrayTpConnection.getValue();
        java.lang.String type = receiverRef_FlexrayTpConnection.getDest().toString().replace("_", "-");
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

    
    public FlexrayTpNodeWrapper getFlexrayTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = receiverRef_FlexrayTpConnection.getValue();
        java.lang.String type = receiverRef_FlexrayTpConnection.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpNode){
            return new FlexrayTpNodeWrapper((FlexrayTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class TransmitterRef_FlexrayTpConnectionWrapper {

    
    
    private TransmitterRef_FlexrayTpConnection transmitterRef_FlexrayTpConnection;

    public TransmitterRef_FlexrayTpConnectionWrapper(TransmitterRef_FlexrayTpConnection transmitterRef_FlexrayTpConnection) {
        this.transmitterRef_FlexrayTpConnection = transmitterRef_FlexrayTpConnection;
    }

   
    public FlexrayTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(transmitterRef_FlexrayTpConnection.getDest())) {
            
            return transmitterRef_FlexrayTpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTransmitterRef_FlexrayTpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = transmitterRef_FlexrayTpConnection.getValue();
        java.lang.String type = transmitterRef_FlexrayTpConnection.getDest().toString().replace("_", "-");
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
        java.lang.String path = transmitterRef_FlexrayTpConnection.getValue();
        java.lang.String type = transmitterRef_FlexrayTpConnection.getDest().toString().replace("_", "-");
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
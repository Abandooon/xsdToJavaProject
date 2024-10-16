package stdgui.data.model.modelwrapper;


    
    


     

public class MulticastRef_CanTpConnectionWrapper {

    
    
    private MulticastRef_CanTpConnection multicastRef_CanTpConnection;

    public MulticastRef_CanTpConnectionWrapper(MulticastRef_CanTpConnection multicastRef_CanTpConnection) {
        this.multicastRef_CanTpConnection = multicastRef_CanTpConnection;
    }

   
    public CanTpAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(multicastRef_CanTpConnection.getDest())) {
            
            return multicastRef_CanTpConnection.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMulticastRef_CanTpConnectionObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = multicastRef_CanTpConnection.getValue();
        java.lang.String type = multicastRef_CanTpConnection.getDest().toString().replace("_", "-");
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

    
    public CanTpAddressWrapper getCanTpAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = multicastRef_CanTpConnection.getValue();
        java.lang.String type = multicastRef_CanTpConnection.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpAddress){
            return new CanTpAddressWrapper((CanTpAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
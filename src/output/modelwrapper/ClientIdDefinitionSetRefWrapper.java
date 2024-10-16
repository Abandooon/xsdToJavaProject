package stdgui.data.model.modelwrapper;


    
    


     

public class ClientIdDefinitionSetRefWrapper {

    
    
    private ClientIdDefinitionSetRef clientIdDefinitionSetRef;

    public ClientIdDefinitionSetRefWrapper(ClientIdDefinitionSetRef clientIdDefinitionSetRef) {
        this.clientIdDefinitionSetRef = clientIdDefinitionSetRef;
    }

   
    public ClientIdDefinitionSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSetRef.getDest())) {
            
            return clientIdDefinitionSetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getClientIdDefinitionSetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = clientIdDefinitionSetRef.getValue();
        java.lang.String type = clientIdDefinitionSetRef.getDest().toString().replace("_", "-");
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

    
    public ClientIdDefinitionSetWrapper getClientIdDefinitionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = clientIdDefinitionSetRef.getValue();
        java.lang.String type = clientIdDefinitionSetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientIdDefinitionSet){
            return new ClientIdDefinitionSetWrapper((ClientIdDefinitionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class EcuConfigurationRefWrapper {

    
    
    private EcuConfigurationRef ecuConfigurationRef;

    public EcuConfigurationRefWrapper(EcuConfigurationRef ecuConfigurationRef) {
        this.ecuConfigurationRef = ecuConfigurationRef;
    }

   
    public EcucValueCollectionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecuConfigurationRef.getDest())) {
            
            return ecuConfigurationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcuConfigurationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecuConfigurationRef.getValue();
        java.lang.String type = ecuConfigurationRef.getDest().toString().replace("_", "-");
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

    
    public EcucValueCollectionWrapper getEcucValueCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecuConfigurationRef.getValue();
        java.lang.String type = ecuConfigurationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucValueCollection){
            return new EcucValueCollectionWrapper((EcucValueCollection) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
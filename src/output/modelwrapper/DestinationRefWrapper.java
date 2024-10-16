package stdgui.data.model.modelwrapper;


    
    


     

     

public class DestinationRefWrapper {

    
    
    private DestinationRef destinationRef;

    public DestinationRefWrapper(DestinationRef destinationRef) {
        this.destinationRef = destinationRef;
    }

   
    public EcucContainerDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(destinationRef.getDest())) {
            
            return destinationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDestinationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = destinationRef.getValue();
        java.lang.String type = destinationRef.getDest().toString().replace("_", "-");
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

    
    public EcucChoiceContainerDefWrapper getEcucChoiceContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = destinationRef.getValue();
        java.lang.String type = destinationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceContainerDef){
            return new EcucChoiceContainerDefWrapper((EcucChoiceContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucParamConfContainerDefWrapper getEcucParamConfContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = destinationRef.getValue();
        java.lang.String type = destinationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucParamConfContainerDef){
            return new EcucParamConfContainerDefWrapper((EcucParamConfContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
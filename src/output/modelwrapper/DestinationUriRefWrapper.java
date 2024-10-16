package stdgui.data.model.modelwrapper;


    
    


     

public class DestinationUriRefWrapper {

    
    
    private DestinationUriRef destinationUriRef;

    public DestinationUriRefWrapper(DestinationUriRef destinationUriRef) {
        this.destinationUriRef = destinationUriRef;
    }

   
    public EcucDestinationUriDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(destinationUriRef.getDest())) {
            
            return destinationUriRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDestinationUriRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = destinationUriRef.getValue();
        java.lang.String type = destinationUriRef.getDest().toString().replace("_", "-");
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

    
    public EcucDestinationUriDefWrapper getEcucDestinationUriDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = destinationUriRef.getValue();
        java.lang.String type = destinationUriRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDestinationUriDef){
            return new EcucDestinationUriDefWrapper((EcucDestinationUriDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
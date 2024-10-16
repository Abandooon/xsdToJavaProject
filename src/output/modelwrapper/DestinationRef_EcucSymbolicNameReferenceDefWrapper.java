package stdgui.data.model.modelwrapper;


    
    


     

public class DestinationRef_EcucSymbolicNameReferenceDefWrapper {

    
    
    private DestinationRef_EcucSymbolicNameReferenceDef destinationRef_EcucSymbolicNameReferenceDef;

    public DestinationRef_EcucSymbolicNameReferenceDefWrapper(DestinationRef_EcucSymbolicNameReferenceDef destinationRef_EcucSymbolicNameReferenceDef) {
        this.destinationRef_EcucSymbolicNameReferenceDef = destinationRef_EcucSymbolicNameReferenceDef;
    }

   
    public EcucParamConfContainerDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(destinationRef_EcucSymbolicNameReferenceDef.getDest())) {
            
            return destinationRef_EcucSymbolicNameReferenceDef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDestinationRef_EcucSymbolicNameReferenceDefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = destinationRef_EcucSymbolicNameReferenceDef.getValue();
        java.lang.String type = destinationRef_EcucSymbolicNameReferenceDef.getDest().toString().replace("_", "-");
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

    
    public EcucParamConfContainerDefWrapper getEcucParamConfContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = destinationRef_EcucSymbolicNameReferenceDef.getValue();
        java.lang.String type = destinationRef_EcucSymbolicNameReferenceDef.getDest().toString().replace("_", "-");
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
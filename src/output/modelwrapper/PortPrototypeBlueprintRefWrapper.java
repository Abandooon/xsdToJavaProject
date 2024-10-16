package stdgui.data.model.modelwrapper;


    
    


     

public class PortPrototypeBlueprintRefWrapper {

    
    
    private PortPrototypeBlueprintRef portPrototypeBlueprintRef;

    public PortPrototypeBlueprintRefWrapper(PortPrototypeBlueprintRef portPrototypeBlueprintRef) {
        this.portPrototypeBlueprintRef = portPrototypeBlueprintRef;
    }

   
    public PortPrototypeBlueprintSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(portPrototypeBlueprintRef.getDest())) {
            
            return portPrototypeBlueprintRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPortPrototypeBlueprintRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = portPrototypeBlueprintRef.getValue();
        java.lang.String type = portPrototypeBlueprintRef.getDest().toString().replace("_", "-");
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

    
    public PortPrototypeBlueprintWrapper getPortPrototypeBlueprint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = portPrototypeBlueprintRef.getValue();
        java.lang.String type = portPrototypeBlueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortPrototypeBlueprint){
            return new PortPrototypeBlueprintWrapper((PortPrototypeBlueprint) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
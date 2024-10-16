package stdgui.data.model.modelwrapper;


    
    


     

public class McDataInstanceRefWrapper {

    
    
    private McDataInstanceRef mcDataInstanceRef;

    public McDataInstanceRefWrapper(McDataInstanceRef mcDataInstanceRef) {
        this.mcDataInstanceRef = mcDataInstanceRef;
    }

   
    public McDataInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(mcDataInstanceRef.getDest())) {
            
            return mcDataInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMcDataInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = mcDataInstanceRef.getValue();
        java.lang.String type = mcDataInstanceRef.getDest().toString().replace("_", "-");
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

    
    public McDataInstanceWrapper getMcDataInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mcDataInstanceRef.getValue();
        java.lang.String type = mcDataInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof McDataInstance){
            return new McDataInstanceWrapper((McDataInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
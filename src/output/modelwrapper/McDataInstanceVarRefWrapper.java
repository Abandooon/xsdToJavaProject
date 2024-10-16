package stdgui.data.model.modelwrapper;


    
    


     

public class McDataInstanceVarRefWrapper {

    
    
    private McDataInstanceVarRef mcDataInstanceVarRef;

    public McDataInstanceVarRefWrapper(McDataInstanceVarRef mcDataInstanceVarRef) {
        this.mcDataInstanceVarRef = mcDataInstanceVarRef;
    }

   
    public McDataInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(mcDataInstanceVarRef.getDest())) {
            
            return mcDataInstanceVarRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMcDataInstanceVarRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = mcDataInstanceVarRef.getValue();
        java.lang.String type = mcDataInstanceVarRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = mcDataInstanceVarRef.getValue();
        java.lang.String type = mcDataInstanceVarRef.getDest().toString().replace("_", "-");
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
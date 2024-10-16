package stdgui.data.model.modelwrapper;


    
    


     

public class VariableAccessedForDebugRefWrapper {

    
    
    private VariableAccessedForDebugRef variableAccessedForDebugRef;

    public VariableAccessedForDebugRefWrapper(VariableAccessedForDebugRef variableAccessedForDebugRef) {
        this.variableAccessedForDebugRef = variableAccessedForDebugRef;
    }

   
    public VariableDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(variableAccessedForDebugRef.getDest())) {
            
            return variableAccessedForDebugRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVariableAccessedForDebugRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = variableAccessedForDebugRef.getValue();
        java.lang.String type = variableAccessedForDebugRef.getDest().toString().replace("_", "-");
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

    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = variableAccessedForDebugRef.getValue();
        java.lang.String type = variableAccessedForDebugRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableDataPrototype){
            return new VariableDataPrototypeWrapper((VariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
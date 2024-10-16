package stdgui.data.model.modelwrapper;


    
    


     

public class VariableAccessRefWrapper {

    
    
    private VariableAccessRef variableAccessRef;

    public VariableAccessRefWrapper(VariableAccessRef variableAccessRef) {
        this.variableAccessRef = variableAccessRef;
    }

   
    public VariableAccessSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(variableAccessRef.getDest())) {
            
            return variableAccessRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVariableAccessRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = variableAccessRef.getValue();
        java.lang.String type = variableAccessRef.getDest().toString().replace("_", "-");
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

    
    public VariableAccessWrapper getVariableAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = variableAccessRef.getValue();
        java.lang.String type = variableAccessRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAccess){
            return new VariableAccessWrapper((VariableAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class CompuMethodRefWrapper {

    
    
    private CompuMethodRef compuMethodRef;

    public CompuMethodRefWrapper(CompuMethodRef compuMethodRef) {
        this.compuMethodRef = compuMethodRef;
    }

   
    public CompuMethodSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(compuMethodRef.getDest())) {
            
            return compuMethodRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCompuMethodRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = compuMethodRef.getValue();
        java.lang.String type = compuMethodRef.getDest().toString().replace("_", "-");
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

    
    public CompuMethodWrapper getCompuMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = compuMethodRef.getValue();
        java.lang.String type = compuMethodRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompuMethod){
            return new CompuMethodWrapper((CompuMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
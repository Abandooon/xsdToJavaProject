package stdgui.data.model.modelwrapper;


    
    


     

public class FirstApplicationErrorRefWrapper {

    
    
    private FirstApplicationErrorRef firstApplicationErrorRef;

    public FirstApplicationErrorRefWrapper(FirstApplicationErrorRef firstApplicationErrorRef) {
        this.firstApplicationErrorRef = firstApplicationErrorRef;
    }

   
    public ApplicationErrorSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(firstApplicationErrorRef.getDest())) {
            
            return firstApplicationErrorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFirstApplicationErrorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = firstApplicationErrorRef.getValue();
        java.lang.String type = firstApplicationErrorRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationErrorWrapper getApplicationError() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = firstApplicationErrorRef.getValue();
        java.lang.String type = firstApplicationErrorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationError){
            return new ApplicationErrorWrapper((ApplicationError) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
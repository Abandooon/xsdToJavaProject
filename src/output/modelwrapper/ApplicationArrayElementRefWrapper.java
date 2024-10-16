package stdgui.data.model.modelwrapper;


    
    


     

public class ApplicationArrayElementRefWrapper {

    
    
    private ApplicationArrayElementRef applicationArrayElementRef;

    public ApplicationArrayElementRefWrapper(ApplicationArrayElementRef applicationArrayElementRef) {
        this.applicationArrayElementRef = applicationArrayElementRef;
    }

   
    public ApplicationArrayElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(applicationArrayElementRef.getDest())) {
            
            return applicationArrayElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getApplicationArrayElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = applicationArrayElementRef.getValue();
        java.lang.String type = applicationArrayElementRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationArrayElementWrapper getApplicationArrayElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = applicationArrayElementRef.getValue();
        java.lang.String type = applicationArrayElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayElement){
            return new ApplicationArrayElementWrapper((ApplicationArrayElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
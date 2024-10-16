package stdgui.data.model.modelwrapper;


    
    


     

public class ImplementationArrayElementRefWrapper {

    
    
    private ImplementationArrayElementRef implementationArrayElementRef;

    public ImplementationArrayElementRefWrapper(ImplementationArrayElementRef implementationArrayElementRef) {
        this.implementationArrayElementRef = implementationArrayElementRef;
    }

   
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(implementationArrayElementRef.getDest())) {
            
            return implementationArrayElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImplementationArrayElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = implementationArrayElementRef.getValue();
        java.lang.String type = implementationArrayElementRef.getDest().toString().replace("_", "-");
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

    
    public ImplementationDataTypeElementWrapper getImplementationDataTypeElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = implementationArrayElementRef.getValue();
        java.lang.String type = implementationArrayElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataTypeElement){
            return new ImplementationDataTypeElementWrapper((ImplementationDataTypeElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
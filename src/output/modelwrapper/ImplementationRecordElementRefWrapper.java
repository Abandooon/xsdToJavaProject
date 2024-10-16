package stdgui.data.model.modelwrapper;


    
    


     

public class ImplementationRecordElementRefWrapper {

    
    
    private ImplementationRecordElementRef implementationRecordElementRef;

    public ImplementationRecordElementRefWrapper(ImplementationRecordElementRef implementationRecordElementRef) {
        this.implementationRecordElementRef = implementationRecordElementRef;
    }

   
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(implementationRecordElementRef.getDest())) {
            
            return implementationRecordElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImplementationRecordElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = implementationRecordElementRef.getValue();
        java.lang.String type = implementationRecordElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = implementationRecordElementRef.getValue();
        java.lang.String type = implementationRecordElementRef.getDest().toString().replace("_", "-");
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
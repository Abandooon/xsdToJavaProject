package stdgui.data.model.modelwrapper;


    
    


     

public class TargetRef_ImplementationElementInParameterInstanceRefWrapper {

    
    
    private TargetRef_ImplementationElementInParameterInstanceRef targetRef_ImplementationElementInParameterInstanceRef;

    public TargetRef_ImplementationElementInParameterInstanceRefWrapper(TargetRef_ImplementationElementInParameterInstanceRef targetRef_ImplementationElementInParameterInstanceRef) {
        this.targetRef_ImplementationElementInParameterInstanceRef = targetRef_ImplementationElementInParameterInstanceRef;
    }

   
    public ImplementationDataTypeElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRef_ImplementationElementInParameterInstanceRef.getDest())) {
            
            return targetRef_ImplementationElementInParameterInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRef_ImplementationElementInParameterInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRef_ImplementationElementInParameterInstanceRef.getValue();
        java.lang.String type = targetRef_ImplementationElementInParameterInstanceRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = targetRef_ImplementationElementInParameterInstanceRef.getValue();
        java.lang.String type = targetRef_ImplementationElementInParameterInstanceRef.getDest().toString().replace("_", "-");
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
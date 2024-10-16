package stdgui.data.model.modelwrapper;


    
    


     

public class ConstantValueMappingRefWrapper {

    
    
    private ConstantValueMappingRef constantValueMappingRef;

    public ConstantValueMappingRefWrapper(ConstantValueMappingRef constantValueMappingRef) {
        this.constantValueMappingRef = constantValueMappingRef;
    }

   
    public ConstantSpecificationMappingSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(constantValueMappingRef.getDest())) {
            
            return constantValueMappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConstantValueMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = constantValueMappingRef.getValue();
        java.lang.String type = constantValueMappingRef.getDest().toString().replace("_", "-");
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

    
    public ConstantSpecificationMappingSetWrapper getConstantSpecificationMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = constantValueMappingRef.getValue();
        java.lang.String type = constantValueMappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConstantSpecificationMappingSet){
            return new ConstantSpecificationMappingSetWrapper((ConstantSpecificationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
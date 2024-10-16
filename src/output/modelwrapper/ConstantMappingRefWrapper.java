package stdgui.data.model.modelwrapper;


    
    


     

public class ConstantMappingRefWrapper {

    
    
    private ConstantMappingRef constantMappingRef;

    public ConstantMappingRefWrapper(ConstantMappingRef constantMappingRef) {
        this.constantMappingRef = constantMappingRef;
    }

   
    public ConstantSpecificationMappingSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(constantMappingRef.getDest())) {
            
            return constantMappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConstantMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = constantMappingRef.getValue();
        java.lang.String type = constantMappingRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = constantMappingRef.getValue();
        java.lang.String type = constantMappingRef.getDest().toString().replace("_", "-");
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
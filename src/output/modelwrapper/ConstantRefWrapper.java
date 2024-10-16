package stdgui.data.model.modelwrapper;


    
    


     

public class ConstantRefWrapper {

    
    
    private ConstantRef constantRef;

    public ConstantRefWrapper(ConstantRef constantRef) {
        this.constantRef = constantRef;
    }

   
    public ConstantSpecificationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(constantRef.getDest())) {
            
            return constantRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getConstantRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = constantRef.getValue();
        java.lang.String type = constantRef.getDest().toString().replace("_", "-");
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

    
    public ConstantSpecificationWrapper getConstantSpecification() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = constantRef.getValue();
        java.lang.String type = constantRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConstantSpecification){
            return new ConstantSpecificationWrapper((ConstantSpecification) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
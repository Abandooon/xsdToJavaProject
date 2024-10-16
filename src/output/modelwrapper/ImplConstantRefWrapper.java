package stdgui.data.model.modelwrapper;


    
    


     

public class ImplConstantRefWrapper {

    
    
    private ImplConstantRef implConstantRef;

    public ImplConstantRefWrapper(ImplConstantRef implConstantRef) {
        this.implConstantRef = implConstantRef;
    }

   
    public ConstantSpecificationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(implConstantRef.getDest())) {
            
            return implConstantRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getImplConstantRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = implConstantRef.getValue();
        java.lang.String type = implConstantRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = implConstantRef.getValue();
        java.lang.String type = implConstantRef.getDest().toString().replace("_", "-");
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
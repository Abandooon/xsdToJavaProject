package stdgui.data.model.modelwrapper;


    
    


     

public class DataElementRef_InvalidationPolicyWrapper {

    
    
    private DataElementRef_InvalidationPolicy dataElementRef_InvalidationPolicy;

    public DataElementRef_InvalidationPolicyWrapper(DataElementRef_InvalidationPolicy dataElementRef_InvalidationPolicy) {
        this.dataElementRef_InvalidationPolicy = dataElementRef_InvalidationPolicy;
    }

   
    public VariableDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataElementRef_InvalidationPolicy.getDest())) {
            
            return dataElementRef_InvalidationPolicy.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataElementRef_InvalidationPolicyObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataElementRef_InvalidationPolicy.getValue();
        java.lang.String type = dataElementRef_InvalidationPolicy.getDest().toString().replace("_", "-");
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

    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataElementRef_InvalidationPolicy.getValue();
        java.lang.String type = dataElementRef_InvalidationPolicy.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableDataPrototype){
            return new VariableDataPrototypeWrapper((VariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
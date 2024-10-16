package stdgui.data.model.modelwrapper;


    
    


     

public class ProviedeDataRefWrapper {

    
    
    private ProviedeDataRef proviedeDataRef;

    public ProviedeDataRefWrapper(ProviedeDataRef proviedeDataRef) {
        this.proviedeDataRef = proviedeDataRef;
    }

   
    public VariableDataPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(proviedeDataRef.getDest())) {
            
            return proviedeDataRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getProviedeDataRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = proviedeDataRef.getValue();
        java.lang.String type = proviedeDataRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = proviedeDataRef.getValue();
        java.lang.String type = proviedeDataRef.getDest().toString().replace("_", "-");
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
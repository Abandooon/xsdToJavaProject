package stdgui.data.model.modelwrapper;


    
    


     

public class DataTypeMappingRefWrapper {

    
    
    private DataTypeMappingRef dataTypeMappingRef;

    public DataTypeMappingRefWrapper(DataTypeMappingRef dataTypeMappingRef) {
        this.dataTypeMappingRef = dataTypeMappingRef;
    }

   
    public DataTypeMappingSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataTypeMappingRef.getDest())) {
            
            return dataTypeMappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataTypeMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataTypeMappingRef.getValue();
        java.lang.String type = dataTypeMappingRef.getDest().toString().replace("_", "-");
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

    
    public DataTypeMappingSetWrapper getDataTypeMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataTypeMappingRef.getValue();
        java.lang.String type = dataTypeMappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTypeMappingSet){
            return new DataTypeMappingSetWrapper((DataTypeMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
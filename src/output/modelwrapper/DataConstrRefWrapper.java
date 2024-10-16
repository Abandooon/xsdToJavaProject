package stdgui.data.model.modelwrapper;


    
    


     

public class DataConstrRefWrapper {

    
    
    private DataConstrRef dataConstrRef;

    public DataConstrRefWrapper(DataConstrRef dataConstrRef) {
        this.dataConstrRef = dataConstrRef;
    }

   
    public DataConstrSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataConstrRef.getDest())) {
            
            return dataConstrRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataConstrRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataConstrRef.getValue();
        java.lang.String type = dataConstrRef.getDest().toString().replace("_", "-");
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

    
    public DataConstrWrapper getDataConstr() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataConstrRef.getValue();
        java.lang.String type = dataConstrRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataConstr){
            return new DataConstrWrapper((DataConstr) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
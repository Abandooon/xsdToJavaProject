package stdgui.data.model.modelwrapper;


    
    


     

public class SwRecordLayoutRefWrapper {

    
    
    private SwRecordLayoutRef swRecordLayoutRef;

    public SwRecordLayoutRefWrapper(SwRecordLayoutRef swRecordLayoutRef) {
        this.swRecordLayoutRef = swRecordLayoutRef;
    }

   
    public SwRecordLayoutSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutRef.getDest())) {
            
            return swRecordLayoutRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwRecordLayoutRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swRecordLayoutRef.getValue();
        java.lang.String type = swRecordLayoutRef.getDest().toString().replace("_", "-");
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

    
    public SwRecordLayoutWrapper getSwRecordLayout() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swRecordLayoutRef.getValue();
        java.lang.String type = swRecordLayoutRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwRecordLayout){
            return new SwRecordLayoutWrapper((SwRecordLayout) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
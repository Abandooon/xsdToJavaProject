package stdgui.data.model.modelwrapper;


    
    


     

public class DataIdentifierRefWrapper {

    
    
    private DataIdentifierRef dataIdentifierRef;

    public DataIdentifierRefWrapper(DataIdentifierRef dataIdentifierRef) {
        this.dataIdentifierRef = dataIdentifierRef;
    }

   
    public DiagnosticDataIdentifierSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataIdentifierRef.getDest())) {
            
            return dataIdentifierRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataIdentifierRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataIdentifierRef.getValue();
        java.lang.String type = dataIdentifierRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDataIdentifierWrapper getDiagnosticDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataIdentifierRef.getValue();
        java.lang.String type = dataIdentifierRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataIdentifier){
            return new DiagnosticDataIdentifierWrapper((DiagnosticDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
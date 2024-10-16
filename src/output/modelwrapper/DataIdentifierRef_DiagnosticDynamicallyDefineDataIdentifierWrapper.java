package stdgui.data.model.modelwrapper;


    
    


     

public class DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifierWrapper {

    
    
    private DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier;

    public DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifierWrapper(DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier) {
        this.dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier = dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier;
    }

   
    public DiagnosticDynamicDataIdentifierSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getDest())) {
            
            return dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifierObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getValue();
        java.lang.String type = dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDynamicDataIdentifierWrapper getDiagnosticDynamicDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getValue();
        java.lang.String type = dataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifier.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicDataIdentifier){
            return new DiagnosticDynamicDataIdentifierWrapper((DiagnosticDynamicDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class DynamicallyDefineDataIdentifierClassRefWrapper {

    
    
    private DynamicallyDefineDataIdentifierClassRef dynamicallyDefineDataIdentifierClassRef;

    public DynamicallyDefineDataIdentifierClassRefWrapper(DynamicallyDefineDataIdentifierClassRef dynamicallyDefineDataIdentifierClassRef) {
        this.dynamicallyDefineDataIdentifierClassRef = dynamicallyDefineDataIdentifierClassRef;
    }

   
    public DiagnosticDynamicallyDefineDataIdentifierClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dynamicallyDefineDataIdentifierClassRef.getDest())) {
            
            return dynamicallyDefineDataIdentifierClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDynamicallyDefineDataIdentifierClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dynamicallyDefineDataIdentifierClassRef.getValue();
        java.lang.String type = dynamicallyDefineDataIdentifierClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDynamicallyDefineDataIdentifierClassWrapper getDiagnosticDynamicallyDefineDataIdentifierClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dynamicallyDefineDataIdentifierClassRef.getValue();
        java.lang.String type = dynamicallyDefineDataIdentifierClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicallyDefineDataIdentifierClass){
            return new DiagnosticDynamicallyDefineDataIdentifierClassWrapper((DiagnosticDynamicallyDefineDataIdentifierClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
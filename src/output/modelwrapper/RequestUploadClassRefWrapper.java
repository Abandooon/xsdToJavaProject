package stdgui.data.model.modelwrapper;


    
    


     

public class RequestUploadClassRefWrapper {

    
    
    private RequestUploadClassRef requestUploadClassRef;

    public RequestUploadClassRefWrapper(RequestUploadClassRef requestUploadClassRef) {
        this.requestUploadClassRef = requestUploadClassRef;
    }

   
    public DiagnosticRequestUploadClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requestUploadClassRef.getDest())) {
            
            return requestUploadClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequestUploadClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requestUploadClassRef.getValue();
        java.lang.String type = requestUploadClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticRequestUploadClassWrapper getDiagnosticRequestUploadClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requestUploadClassRef.getValue();
        java.lang.String type = requestUploadClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestUploadClass){
            return new DiagnosticRequestUploadClassWrapper((DiagnosticRequestUploadClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
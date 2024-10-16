package stdgui.data.model.modelwrapper;


    
    


     

public class RequestDownloadClassRefWrapper {

    
    
    private RequestDownloadClassRef requestDownloadClassRef;

    public RequestDownloadClassRefWrapper(RequestDownloadClassRef requestDownloadClassRef) {
        this.requestDownloadClassRef = requestDownloadClassRef;
    }

   
    public DiagnosticRequestDownloadClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requestDownloadClassRef.getDest())) {
            
            return requestDownloadClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequestDownloadClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requestDownloadClassRef.getValue();
        java.lang.String type = requestDownloadClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticRequestDownloadClassWrapper getDiagnosticRequestDownloadClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requestDownloadClassRef.getValue();
        java.lang.String type = requestDownloadClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestDownloadClass){
            return new DiagnosticRequestDownloadClassWrapper((DiagnosticRequestDownloadClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
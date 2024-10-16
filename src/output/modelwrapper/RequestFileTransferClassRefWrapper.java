package stdgui.data.model.modelwrapper;


    
    


     

public class RequestFileTransferClassRefWrapper {

    
    
    private RequestFileTransferClassRef requestFileTransferClassRef;

    public RequestFileTransferClassRefWrapper(RequestFileTransferClassRef requestFileTransferClassRef) {
        this.requestFileTransferClassRef = requestFileTransferClassRef;
    }

   
    public DiagnosticRequestFileTransferClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(requestFileTransferClassRef.getDest())) {
            
            return requestFileTransferClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRequestFileTransferClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = requestFileTransferClassRef.getValue();
        java.lang.String type = requestFileTransferClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticRequestFileTransferClassWrapper getDiagnosticRequestFileTransferClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = requestFileTransferClassRef.getValue();
        java.lang.String type = requestFileTransferClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestFileTransferClass){
            return new DiagnosticRequestFileTransferClassWrapper((DiagnosticRequestFileTransferClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
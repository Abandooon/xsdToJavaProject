package stdgui.data.model.modelwrapper;


    
    


     

public class SessionControlClassRefWrapper {

    
    
    private SessionControlClassRef sessionControlClassRef;

    public SessionControlClassRefWrapper(SessionControlClassRef sessionControlClassRef) {
        this.sessionControlClassRef = sessionControlClassRef;
    }

   
    public DiagnosticSessionControlClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sessionControlClassRef.getDest())) {
            
            return sessionControlClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSessionControlClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sessionControlClassRef.getValue();
        java.lang.String type = sessionControlClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticSessionControlClassWrapper getDiagnosticSessionControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sessionControlClassRef.getValue();
        java.lang.String type = sessionControlClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSessionControlClass){
            return new DiagnosticSessionControlClassWrapper((DiagnosticSessionControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
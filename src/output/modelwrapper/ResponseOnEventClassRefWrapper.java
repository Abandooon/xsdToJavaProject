package stdgui.data.model.modelwrapper;


    
    


     

public class ResponseOnEventClassRefWrapper {

    
    
    private ResponseOnEventClassRef responseOnEventClassRef;

    public ResponseOnEventClassRefWrapper(ResponseOnEventClassRef responseOnEventClassRef) {
        this.responseOnEventClassRef = responseOnEventClassRef;
    }

   
    public DiagnosticResponseOnEventClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(responseOnEventClassRef.getDest())) {
            
            return responseOnEventClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getResponseOnEventClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = responseOnEventClassRef.getValue();
        java.lang.String type = responseOnEventClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticResponseOnEventClassWrapper getDiagnosticResponseOnEventClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseOnEventClassRef.getValue();
        java.lang.String type = responseOnEventClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticResponseOnEventClass){
            return new DiagnosticResponseOnEventClassWrapper((DiagnosticResponseOnEventClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
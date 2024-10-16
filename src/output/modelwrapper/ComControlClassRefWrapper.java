package stdgui.data.model.modelwrapper;


    
    


     

public class ComControlClassRefWrapper {

    
    
    private ComControlClassRef comControlClassRef;

    public ComControlClassRefWrapper(ComControlClassRef comControlClassRef) {
        this.comControlClassRef = comControlClassRef;
    }

   
    public DiagnosticComControlClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(comControlClassRef.getDest())) {
            
            return comControlClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getComControlClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = comControlClassRef.getValue();
        java.lang.String type = comControlClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticComControlClassWrapper getDiagnosticComControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = comControlClassRef.getValue();
        java.lang.String type = comControlClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControlClass){
            return new DiagnosticComControlClassWrapper((DiagnosticComControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
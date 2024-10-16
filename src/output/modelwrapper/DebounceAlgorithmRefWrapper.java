package stdgui.data.model.modelwrapper;


    
    


     

public class DebounceAlgorithmRefWrapper {

    
    
    private DebounceAlgorithmRef debounceAlgorithmRef;

    public DebounceAlgorithmRefWrapper(DebounceAlgorithmRef debounceAlgorithmRef) {
        this.debounceAlgorithmRef = debounceAlgorithmRef;
    }

   
    public DiagnosticDebounceAlgorithmPropsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(debounceAlgorithmRef.getDest())) {
            
            return debounceAlgorithmRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDebounceAlgorithmRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = debounceAlgorithmRef.getValue();
        java.lang.String type = debounceAlgorithmRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticDebounceAlgorithmPropsWrapper getDiagnosticDebounceAlgorithmProps() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = debounceAlgorithmRef.getValue();
        java.lang.String type = debounceAlgorithmRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDebounceAlgorithmProps){
            return new DiagnosticDebounceAlgorithmPropsWrapper((DiagnosticDebounceAlgorithmProps) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
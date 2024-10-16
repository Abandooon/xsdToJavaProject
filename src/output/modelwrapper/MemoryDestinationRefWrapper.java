package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class MemoryDestinationRefWrapper {

    
    
    private MemoryDestinationRef memoryDestinationRef;

    public MemoryDestinationRefWrapper(MemoryDestinationRef memoryDestinationRef) {
        this.memoryDestinationRef = memoryDestinationRef;
    }

   
    public DiagnosticMemoryDestinationSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(memoryDestinationRef.getDest())) {
            
            return memoryDestinationRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMemoryDestinationRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = memoryDestinationRef.getValue();
        java.lang.String type = memoryDestinationRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticMemoryDestinationMirrorWrapper getDiagnosticMemoryDestinationMirror() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = memoryDestinationRef.getValue();
        java.lang.String type = memoryDestinationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationMirror){
            return new DiagnosticMemoryDestinationMirrorWrapper((DiagnosticMemoryDestinationMirror) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationPrimaryWrapper getDiagnosticMemoryDestinationPrimary() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = memoryDestinationRef.getValue();
        java.lang.String type = memoryDestinationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationPrimary){
            return new DiagnosticMemoryDestinationPrimaryWrapper((DiagnosticMemoryDestinationPrimary) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationUserDefinedWrapper getDiagnosticMemoryDestinationUserDefined() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = memoryDestinationRef.getValue();
        java.lang.String type = memoryDestinationRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationUserDefined){
            return new DiagnosticMemoryDestinationUserDefinedWrapper((DiagnosticMemoryDestinationUserDefined) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
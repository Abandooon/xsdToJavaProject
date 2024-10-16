package stdgui.data.model.modelwrapper;


    
    


     

public class MemoryRangeRefWrapper {

    
    
    private MemoryRangeRef memoryRangeRef;

    public MemoryRangeRefWrapper(MemoryRangeRef memoryRangeRef) {
        this.memoryRangeRef = memoryRangeRef;
    }

   
    public DiagnosticMemoryIdentifierSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(memoryRangeRef.getDest())) {
            
            return memoryRangeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMemoryRangeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = memoryRangeRef.getValue();
        java.lang.String type = memoryRangeRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticMemoryIdentifierWrapper getDiagnosticMemoryIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = memoryRangeRef.getValue();
        java.lang.String type = memoryRangeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryIdentifier){
            return new DiagnosticMemoryIdentifierWrapper((DiagnosticMemoryIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
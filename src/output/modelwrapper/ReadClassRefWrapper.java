package stdgui.data.model.modelwrapper;


    
    


     

public class ReadClassRefWrapper {

    
    
    private ReadClassRef readClassRef;

    public ReadClassRefWrapper(ReadClassRef readClassRef) {
        this.readClassRef = readClassRef;
    }

   
    public DiagnosticReadMemoryByAddressClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(readClassRef.getDest())) {
            
            return readClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReadClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = readClassRef.getValue();
        java.lang.String type = readClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticReadMemoryByAddressClassWrapper getDiagnosticReadMemoryByAddressClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = readClassRef.getValue();
        java.lang.String type = readClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadMemoryByAddressClass){
            return new DiagnosticReadMemoryByAddressClassWrapper((DiagnosticReadMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
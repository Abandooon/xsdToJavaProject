package stdgui.data.model.modelwrapper;


    
    


     

public class ReadDataClassRefWrapper {

    
    
    private ReadDataClassRef readDataClassRef;

    public ReadDataClassRefWrapper(ReadDataClassRef readDataClassRef) {
        this.readDataClassRef = readDataClassRef;
    }

   
    public DiagnosticReadDataByPeriodicIdClassSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(readDataClassRef.getDest())) {
            
            return readDataClassRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReadDataClassRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = readDataClassRef.getValue();
        java.lang.String type = readDataClassRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticReadDataByPeriodicIdClassWrapper getDiagnosticReadDataByPeriodicIdClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = readDataClassRef.getValue();
        java.lang.String type = readDataClassRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByPeriodicIdClass){
            return new DiagnosticReadDataByPeriodicIdClassWrapper((DiagnosticReadDataByPeriodicIdClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
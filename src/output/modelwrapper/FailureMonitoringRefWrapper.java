package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class FailureMonitoringRefWrapper {

    
    
    private FailureMonitoringRef failureMonitoringRef;

    public FailureMonitoringRefWrapper(FailureMonitoringRef failureMonitoringRef) {
        this.failureMonitoringRef = failureMonitoringRef;
    }

   
    public PortPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(failureMonitoringRef.getDest())) {
            
            return failureMonitoringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFailureMonitoringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = failureMonitoringRef.getValue();
        java.lang.String type = failureMonitoringRef.getDest().toString().replace("_", "-");
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

    
    public PPortPrototypeWrapper getPPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = failureMonitoringRef.getValue();
        java.lang.String type = failureMonitoringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PPortPrototype){
            return new PPortPrototypeWrapper((PPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PrPortPrototypeWrapper getPrPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = failureMonitoringRef.getValue();
        java.lang.String type = failureMonitoringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PrPortPrototype){
            return new PrPortPrototypeWrapper((PrPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RPortPrototypeWrapper getRPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = failureMonitoringRef.getValue();
        java.lang.String type = failureMonitoringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RPortPrototype){
            return new RPortPrototypeWrapper((RPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
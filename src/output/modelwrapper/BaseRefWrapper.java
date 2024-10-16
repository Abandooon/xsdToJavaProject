package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

public class BaseRefWrapper {

    
    
    private BaseRef baseRef;

    public BaseRefWrapper(BaseRef baseRef) {
        this.baseRef = baseRef;
    }

   
    public SwComponentTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(baseRef.getDest())) {
            
            return baseRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBaseRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationSwComponentTypeWrapper getApplicationSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationSwComponentType){
            return new ApplicationSwComponentTypeWrapper((ApplicationSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComplexDeviceDriverSwComponentTypeWrapper getComplexDeviceDriverSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ComplexDeviceDriverSwComponentType){
            return new ComplexDeviceDriverSwComponentTypeWrapper((ComplexDeviceDriverSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CompositionSwComponentTypeWrapper getCompositionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompositionSwComponentType){
            return new CompositionSwComponentTypeWrapper((CompositionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuAbstractionSwComponentTypeWrapper getEcuAbstractionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuAbstractionSwComponentType){
            return new EcuAbstractionSwComponentTypeWrapper((EcuAbstractionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockSwComponentTypeWrapper getNvBlockSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockSwComponentType){
            return new NvBlockSwComponentTypeWrapper((NvBlockSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterSwComponentTypeWrapper getParameterSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterSwComponentType){
            return new ParameterSwComponentTypeWrapper((ParameterSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SensorActuatorSwComponentTypeWrapper getSensorActuatorSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SensorActuatorSwComponentType){
            return new SensorActuatorSwComponentTypeWrapper((SensorActuatorSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ServiceProxySwComponentTypeWrapper getServiceProxySwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceProxySwComponentType){
            return new ServiceProxySwComponentTypeWrapper((ServiceProxySwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ServiceSwComponentTypeWrapper getServiceSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseRef.getValue();
        java.lang.String type = baseRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceSwComponentType){
            return new ServiceSwComponentTypeWrapper((ServiceSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
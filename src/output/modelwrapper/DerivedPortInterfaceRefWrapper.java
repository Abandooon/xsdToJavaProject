package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

public class DerivedPortInterfaceRefWrapper {

    
    
    private DerivedPortInterfaceRef derivedPortInterfaceRef;

    public DerivedPortInterfaceRefWrapper(DerivedPortInterfaceRef derivedPortInterfaceRef) {
        this.derivedPortInterfaceRef = derivedPortInterfaceRef;
    }

   
    public PortInterfaceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(derivedPortInterfaceRef.getDest())) {
            
            return derivedPortInterfaceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDerivedPortInterfaceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
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

    
    public ClientServerInterfaceWrapper getClientServerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterface){
            return new ClientServerInterfaceWrapper((ClientServerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchInterfaceWrapper getModeSwitchInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchInterface){
            return new ModeSwitchInterfaceWrapper((ModeSwitchInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvDataInterfaceWrapper getNvDataInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvDataInterface){
            return new NvDataInterfaceWrapper((NvDataInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterInterfaceWrapper getParameterInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterInterface){
            return new ParameterInterfaceWrapper((ParameterInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SenderReceiverInterfaceWrapper getSenderReceiverInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SenderReceiverInterface){
            return new SenderReceiverInterfaceWrapper((SenderReceiverInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceWrapper getTriggerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = derivedPortInterfaceRef.getValue();
        java.lang.String type = derivedPortInterfaceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterface){
            return new TriggerInterfaceWrapper((TriggerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
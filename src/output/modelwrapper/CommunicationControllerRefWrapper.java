package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

public class CommunicationControllerRefWrapper {

    
    
    private CommunicationControllerRef communicationControllerRef;

    public CommunicationControllerRefWrapper(CommunicationControllerRef communicationControllerRef) {
        this.communicationControllerRef = communicationControllerRef;
    }

   
    public CommunicationControllerSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(communicationControllerRef.getDest())) {
            
            return communicationControllerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCommunicationControllerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
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

    
    public CanCommunicationControllerWrapper getCanCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCommunicationController){
            return new CanCommunicationControllerWrapper((CanCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetCommunicationControllerWrapper getEthernetCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationController){
            return new EthernetCommunicationControllerWrapper((EthernetCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayCommunicationControllerWrapper getFlexrayCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCommunicationController){
            return new FlexrayCommunicationControllerWrapper((FlexrayCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinMasterWrapper getLinMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinMaster){
            return new LinMasterWrapper((LinMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSlaveWrapper getLinSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSlave){
            return new LinSlaveWrapper((LinSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanCommunicationControllerWrapper getTtcanCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCommunicationController){
            return new TtcanCommunicationControllerWrapper((TtcanCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedCommunicationControllerWrapper getUserDefinedCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationControllerRef.getValue();
        java.lang.String type = communicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCommunicationController){
            return new UserDefinedCommunicationControllerWrapper((UserDefinedCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
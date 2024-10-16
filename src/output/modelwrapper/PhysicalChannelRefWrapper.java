package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

public class PhysicalChannelRefWrapper {

    
    
    private PhysicalChannelRef physicalChannelRef;

    public PhysicalChannelRefWrapper(PhysicalChannelRef physicalChannelRef) {
        this.physicalChannelRef = physicalChannelRef;
    }

   
    public PhysicalChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(physicalChannelRef.getDest())) {
            
            return physicalChannelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPhysicalChannelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
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

    
    public CanPhysicalChannelWrapper getCanPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanPhysicalChannel){
            return new CanPhysicalChannelWrapper((CanPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetPhysicalChannelWrapper getEthernetPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetPhysicalChannel){
            return new EthernetPhysicalChannelWrapper((EthernetPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayPhysicalChannelWrapper getFlexrayPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayPhysicalChannel){
            return new FlexrayPhysicalChannelWrapper((FlexrayPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinPhysicalChannelWrapper getLinPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinPhysicalChannel){
            return new LinPhysicalChannelWrapper((LinPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanPhysicalChannelWrapper getTtcanPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanPhysicalChannel){
            return new TtcanPhysicalChannelWrapper((TtcanPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedPhysicalChannelWrapper getUserDefinedPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalChannelRef.getValue();
        java.lang.String type = physicalChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedPhysicalChannel){
            return new UserDefinedPhysicalChannelWrapper((UserDefinedPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
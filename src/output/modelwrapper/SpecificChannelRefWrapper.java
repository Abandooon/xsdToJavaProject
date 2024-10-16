package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

public class SpecificChannelRefWrapper {

    
    
    private SpecificChannelRef specificChannelRef;

    public SpecificChannelRefWrapper(SpecificChannelRef specificChannelRef) {
        this.specificChannelRef = specificChannelRef;
    }

   
    public CommunicationClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(specificChannelRef.getDest())) {
            
            return specificChannelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSpecificChannelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
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

    
    public CanClusterWrapper getCanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCluster){
            return new CanClusterWrapper((CanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetClusterWrapper getEthernetCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCluster){
            return new EthernetClusterWrapper((EthernetCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayClusterWrapper getFlexrayCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCluster){
            return new FlexrayClusterWrapper((FlexrayCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939ClusterWrapper getJ1939Cluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939Cluster){
            return new J1939ClusterWrapper((J1939Cluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinClusterWrapper getLinCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCluster){
            return new LinClusterWrapper((LinCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanClusterWrapper getTtcanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCluster){
            return new TtcanClusterWrapper((TtcanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedClusterWrapper getUserDefinedCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = specificChannelRef.getValue();
        java.lang.String type = specificChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCluster){
            return new UserDefinedClusterWrapper((UserDefinedCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
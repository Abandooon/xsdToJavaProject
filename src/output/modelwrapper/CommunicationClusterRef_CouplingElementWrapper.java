package stdgui.data.model.modelwrapper;


    
    


     

public class CommunicationClusterRef_CouplingElementWrapper {

    
    
    private CommunicationClusterRef_CouplingElement communicationClusterRef_CouplingElement;

    public CommunicationClusterRef_CouplingElementWrapper(CommunicationClusterRef_CouplingElement communicationClusterRef_CouplingElement) {
        this.communicationClusterRef_CouplingElement = communicationClusterRef_CouplingElement;
    }

   
    public EthernetClusterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(communicationClusterRef_CouplingElement.getDest())) {
            
            return communicationClusterRef_CouplingElement.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCommunicationClusterRef_CouplingElementObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = communicationClusterRef_CouplingElement.getValue();
        java.lang.String type = communicationClusterRef_CouplingElement.getDest().toString().replace("_", "-");
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

    
    public EthernetClusterWrapper getEthernetCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = communicationClusterRef_CouplingElement.getValue();
        java.lang.String type = communicationClusterRef_CouplingElement.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCluster){
            return new EthernetClusterWrapper((EthernetCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
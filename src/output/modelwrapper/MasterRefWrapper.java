package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class MasterRefWrapper {

    
    
    private MasterRef masterRef;

    public MasterRefWrapper(MasterRef masterRef) {
        this.masterRef = masterRef;
    }

   
    public GlobalTimeMasterSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(masterRef.getDest())) {
            
            return masterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMasterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = masterRef.getValue();
        java.lang.String type = masterRef.getDest().toString().replace("_", "-");
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

    
    public GlobalTimeCanMasterWrapper getGlobalTimeCanMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = masterRef.getValue();
        java.lang.String type = masterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeCanMaster){
            return new GlobalTimeCanMasterWrapper((GlobalTimeCanMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeEthMasterWrapper getGlobalTimeEthMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = masterRef.getValue();
        java.lang.String type = masterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeEthMaster){
            return new GlobalTimeEthMasterWrapper((GlobalTimeEthMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeFrMasterWrapper getGlobalTimeFrMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = masterRef.getValue();
        java.lang.String type = masterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeFrMaster){
            return new GlobalTimeFrMasterWrapper((GlobalTimeFrMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class ReplicaPdusRefWrapper {

    
    
    private ReplicaPdusRef replicaPdusRef;

    public ReplicaPdusRefWrapper(ReplicaPdusRef replicaPdusRef) {
        this.replicaPdusRef = replicaPdusRef;
    }

   
    public ISignalIPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(replicaPdusRef.getDest())) {
            
            return replicaPdusRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReplicaPdusRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = replicaPdusRef.getValue();
        java.lang.String type = replicaPdusRef.getDest().toString().replace("_", "-");
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

    
    public ISignalIPduWrapper getISignalIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = replicaPdusRef.getValue();
        java.lang.String type = replicaPdusRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPdu){
            return new ISignalIPduWrapper((ISignalIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
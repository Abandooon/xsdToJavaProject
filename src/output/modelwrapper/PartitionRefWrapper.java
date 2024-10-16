package stdgui.data.model.modelwrapper;


    
    


     

public class PartitionRefWrapper {

    
    
    private PartitionRef partitionRef;

    public PartitionRefWrapper(PartitionRef partitionRef) {
        this.partitionRef = partitionRef;
    }

   
    public EcuPartitionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(partitionRef.getDest())) {
            
            return partitionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPartitionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = partitionRef.getValue();
        java.lang.String type = partitionRef.getDest().toString().replace("_", "-");
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

    
    public EcuPartitionWrapper getEcuPartition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = partitionRef.getValue();
        java.lang.String type = partitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuPartition){
            return new EcuPartitionWrapper((EcuPartition) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class LastEgressSchedulerRefWrapper {

    
    
    private LastEgressSchedulerRef lastEgressSchedulerRef;

    public LastEgressSchedulerRefWrapper(LastEgressSchedulerRef lastEgressSchedulerRef) {
        this.lastEgressSchedulerRef = lastEgressSchedulerRef;
    }

   
    public CouplingPortSchedulerSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(lastEgressSchedulerRef.getDest())) {
            
            return lastEgressSchedulerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getLastEgressSchedulerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = lastEgressSchedulerRef.getValue();
        java.lang.String type = lastEgressSchedulerRef.getDest().toString().replace("_", "-");
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

    
    public CouplingPortSchedulerWrapper getCouplingPortScheduler() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = lastEgressSchedulerRef.getValue();
        java.lang.String type = lastEgressSchedulerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortScheduler){
            return new CouplingPortSchedulerWrapper((CouplingPortScheduler) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
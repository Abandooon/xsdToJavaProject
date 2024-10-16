package stdgui.data.model.modelwrapper;


    
    


     

public class SchedulerNamePrefixRefWrapper {

    
    
    private SchedulerNamePrefixRef schedulerNamePrefixRef;

    public SchedulerNamePrefixRefWrapper(SchedulerNamePrefixRef schedulerNamePrefixRef) {
        this.schedulerNamePrefixRef = schedulerNamePrefixRef;
    }

   
    public BswSchedulerNamePrefixSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(schedulerNamePrefixRef.getDest())) {
            
            return schedulerNamePrefixRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSchedulerNamePrefixRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = schedulerNamePrefixRef.getValue();
        java.lang.String type = schedulerNamePrefixRef.getDest().toString().replace("_", "-");
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

    
    public BswSchedulerNamePrefixWrapper getBswSchedulerNamePrefix() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = schedulerNamePrefixRef.getValue();
        java.lang.String type = schedulerNamePrefixRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswSchedulerNamePrefix){
            return new BswSchedulerNamePrefixWrapper((BswSchedulerNamePrefix) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
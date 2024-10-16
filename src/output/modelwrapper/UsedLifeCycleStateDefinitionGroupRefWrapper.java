package stdgui.data.model.modelwrapper;


    
    


     

public class UsedLifeCycleStateDefinitionGroupRefWrapper {

    
    
    private UsedLifeCycleStateDefinitionGroupRef usedLifeCycleStateDefinitionGroupRef;

    public UsedLifeCycleStateDefinitionGroupRefWrapper(UsedLifeCycleStateDefinitionGroupRef usedLifeCycleStateDefinitionGroupRef) {
        this.usedLifeCycleStateDefinitionGroupRef = usedLifeCycleStateDefinitionGroupRef;
    }

   
    public LifeCycleStateDefinitionGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(usedLifeCycleStateDefinitionGroupRef.getDest())) {
            
            return usedLifeCycleStateDefinitionGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUsedLifeCycleStateDefinitionGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = usedLifeCycleStateDefinitionGroupRef.getValue();
        java.lang.String type = usedLifeCycleStateDefinitionGroupRef.getDest().toString().replace("_", "-");
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

    
    public LifeCycleStateDefinitionGroupWrapper getLifeCycleStateDefinitionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = usedLifeCycleStateDefinitionGroupRef.getValue();
        java.lang.String type = usedLifeCycleStateDefinitionGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleStateDefinitionGroup){
            return new LifeCycleStateDefinitionGroupWrapper((LifeCycleStateDefinitionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
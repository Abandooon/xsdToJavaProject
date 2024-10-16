package stdgui.data.model.modelwrapper;


    
    


     

public class TargetRunnableEntityGroupRefWrapper {

    
    
    private TargetRunnableEntityGroupRef targetRunnableEntityGroupRef;

    public TargetRunnableEntityGroupRefWrapper(TargetRunnableEntityGroupRef targetRunnableEntityGroupRef) {
        this.targetRunnableEntityGroupRef = targetRunnableEntityGroupRef;
    }

   
    public RunnableEntityGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetRunnableEntityGroupRef.getDest())) {
            
            return targetRunnableEntityGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetRunnableEntityGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetRunnableEntityGroupRef.getValue();
        java.lang.String type = targetRunnableEntityGroupRef.getDest().toString().replace("_", "-");
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

    
    public RunnableEntityGroupWrapper getRunnableEntityGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetRunnableEntityGroupRef.getValue();
        java.lang.String type = targetRunnableEntityGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntityGroup){
            return new RunnableEntityGroupWrapper((RunnableEntityGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
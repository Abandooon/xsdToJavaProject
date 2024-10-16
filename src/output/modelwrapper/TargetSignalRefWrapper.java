package stdgui.data.model.modelwrapper;


    
    


     

public class TargetSignalRefWrapper {

    
    
    private TargetSignalRef targetSignalRef;

    public TargetSignalRefWrapper(TargetSignalRef targetSignalRef) {
        this.targetSignalRef = targetSignalRef;
    }

   
    public ISignalTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetSignalRef.getDest())) {
            
            return targetSignalRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetSignalRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetSignalRef.getValue();
        java.lang.String type = targetSignalRef.getDest().toString().replace("_", "-");
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

    
    public ISignalTriggeringWrapper getISignalTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetSignalRef.getValue();
        java.lang.String type = targetSignalRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalTriggering){
            return new ISignalTriggeringWrapper((ISignalTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
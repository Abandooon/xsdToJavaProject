package stdgui.data.model.modelwrapper;


    
    


     

public class FrameTriggeringRefWrapper {

    
    
    private FrameTriggeringRef frameTriggeringRef;

    public FrameTriggeringRefWrapper(FrameTriggeringRef frameTriggeringRef) {
        this.frameTriggeringRef = frameTriggeringRef;
    }

   
    public LinFrameTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(frameTriggeringRef.getDest())) {
            
            return frameTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFrameTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = frameTriggeringRef.getValue();
        java.lang.String type = frameTriggeringRef.getDest().toString().replace("_", "-");
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

    
    public LinFrameTriggeringWrapper getLinFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = frameTriggeringRef.getValue();
        java.lang.String type = frameTriggeringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinFrameTriggering){
            return new LinFrameTriggeringWrapper((LinFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
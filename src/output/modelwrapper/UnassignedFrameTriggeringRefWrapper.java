package stdgui.data.model.modelwrapper;


    
    


     

public class UnassignedFrameTriggeringRefWrapper {

    
    
    private UnassignedFrameTriggeringRef unassignedFrameTriggeringRef;

    public UnassignedFrameTriggeringRefWrapper(UnassignedFrameTriggeringRef unassignedFrameTriggeringRef) {
        this.unassignedFrameTriggeringRef = unassignedFrameTriggeringRef;
    }

   
    public LinFrameTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(unassignedFrameTriggeringRef.getDest())) {
            
            return unassignedFrameTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUnassignedFrameTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = unassignedFrameTriggeringRef.getValue();
        java.lang.String type = unassignedFrameTriggeringRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = unassignedFrameTriggeringRef.getValue();
        java.lang.String type = unassignedFrameTriggeringRef.getDest().toString().replace("_", "-");
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
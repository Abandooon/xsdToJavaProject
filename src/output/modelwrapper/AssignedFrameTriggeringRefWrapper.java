package stdgui.data.model.modelwrapper;


    
    


     

public class AssignedFrameTriggeringRefWrapper {

    
    
    private AssignedFrameTriggeringRef assignedFrameTriggeringRef;

    public AssignedFrameTriggeringRefWrapper(AssignedFrameTriggeringRef assignedFrameTriggeringRef) {
        this.assignedFrameTriggeringRef = assignedFrameTriggeringRef;
    }

   
    public LinFrameTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(assignedFrameTriggeringRef.getDest())) {
            
            return assignedFrameTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAssignedFrameTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = assignedFrameTriggeringRef.getValue();
        java.lang.String type = assignedFrameTriggeringRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = assignedFrameTriggeringRef.getValue();
        java.lang.String type = assignedFrameTriggeringRef.getDest().toString().replace("_", "-");
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
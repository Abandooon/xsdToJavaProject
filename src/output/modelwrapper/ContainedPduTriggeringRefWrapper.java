package stdgui.data.model.modelwrapper;


    
    


     

public class ContainedPduTriggeringRefWrapper {

    
    
    private ContainedPduTriggeringRef containedPduTriggeringRef;

    public ContainedPduTriggeringRefWrapper(ContainedPduTriggeringRef containedPduTriggeringRef) {
        this.containedPduTriggeringRef = containedPduTriggeringRef;
    }

   
    public PduTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(containedPduTriggeringRef.getDest())) {
            
            return containedPduTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContainedPduTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = containedPduTriggeringRef.getValue();
        java.lang.String type = containedPduTriggeringRef.getDest().toString().replace("_", "-");
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

    
    public PduTriggeringWrapper getPduTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = containedPduTriggeringRef.getValue();
        java.lang.String type = containedPduTriggeringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PduTriggering){
            return new PduTriggeringWrapper((PduTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
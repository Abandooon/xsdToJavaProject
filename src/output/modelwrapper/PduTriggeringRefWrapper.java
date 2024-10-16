package stdgui.data.model.modelwrapper;


    
    


     

public class PduTriggeringRefWrapper {

    
    
    private PduTriggeringRef pduTriggeringRef;

    public PduTriggeringRefWrapper(PduTriggeringRef pduTriggeringRef) {
        this.pduTriggeringRef = pduTriggeringRef;
    }

   
    public PduTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(pduTriggeringRef.getDest())) {
            
            return pduTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPduTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = pduTriggeringRef.getValue();
        java.lang.String type = pduTriggeringRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = pduTriggeringRef.getValue();
        java.lang.String type = pduTriggeringRef.getDest().toString().replace("_", "-");
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
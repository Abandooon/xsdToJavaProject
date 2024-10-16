package stdgui.data.model.modelwrapper;


    
    


     

public class PeriodicResponseUudtRefWrapper {

    
    
    private PeriodicResponseUudtRef periodicResponseUudtRef;

    public PeriodicResponseUudtRefWrapper(PeriodicResponseUudtRef periodicResponseUudtRef) {
        this.periodicResponseUudtRef = periodicResponseUudtRef;
    }

   
    public PduTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(periodicResponseUudtRef.getDest())) {
            
            return periodicResponseUudtRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPeriodicResponseUudtRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = periodicResponseUudtRef.getValue();
        java.lang.String type = periodicResponseUudtRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = periodicResponseUudtRef.getValue();
        java.lang.String type = periodicResponseUudtRef.getDest().toString().replace("_", "-");
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
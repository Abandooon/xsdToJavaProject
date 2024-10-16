package stdgui.data.model.modelwrapper;


    
    


     

public class SourceIPduRefWrapper {

    
    
    private SourceIPduRef sourceIPduRef;

    public SourceIPduRefWrapper(SourceIPduRef sourceIPduRef) {
        this.sourceIPduRef = sourceIPduRef;
    }

   
    public PduTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sourceIPduRef.getDest())) {
            
            return sourceIPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSourceIPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sourceIPduRef.getValue();
        java.lang.String type = sourceIPduRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = sourceIPduRef.getValue();
        java.lang.String type = sourceIPduRef.getDest().toString().replace("_", "-");
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
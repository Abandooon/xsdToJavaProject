package stdgui.data.model.modelwrapper;


    
    


     

public class TpSduRefWrapper {

    
    
    private TpSduRef tpSduRef;

    public TpSduRefWrapper(TpSduRef tpSduRef) {
        this.tpSduRef = tpSduRef;
    }

   
    public PduTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(tpSduRef.getDest())) {
            
            return tpSduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTpSduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = tpSduRef.getValue();
        java.lang.String type = tpSduRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = tpSduRef.getValue();
        java.lang.String type = tpSduRef.getDest().toString().replace("_", "-");
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
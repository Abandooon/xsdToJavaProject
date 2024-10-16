package stdgui.data.model.modelwrapper;


    
    


     

public class CanTpChannelRefWrapper {

    
    
    private CanTpChannelRef canTpChannelRef;

    public CanTpChannelRefWrapper(CanTpChannelRef canTpChannelRef) {
        this.canTpChannelRef = canTpChannelRef;
    }

   
    public CanTpChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(canTpChannelRef.getDest())) {
            
            return canTpChannelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCanTpChannelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = canTpChannelRef.getValue();
        java.lang.String type = canTpChannelRef.getDest().toString().replace("_", "-");
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

    
    public CanTpChannelWrapper getCanTpChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = canTpChannelRef.getValue();
        java.lang.String type = canTpChannelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpChannel){
            return new CanTpChannelWrapper((CanTpChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class ChannelRefWrapper {

    
    
    private ChannelRef channelRef;

    public ChannelRefWrapper(ChannelRef channelRef) {
        this.channelRef = channelRef;
    }

   
    public FlexrayPhysicalChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(channelRef.getDest())) {
            
            return channelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getChannelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = channelRef.getValue();
        java.lang.String type = channelRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayPhysicalChannelWrapper getFlexrayPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = channelRef.getValue();
        java.lang.String type = channelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayPhysicalChannel){
            return new FlexrayPhysicalChannelWrapper((FlexrayPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
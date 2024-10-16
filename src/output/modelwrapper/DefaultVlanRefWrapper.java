package stdgui.data.model.modelwrapper;


    
    


     

public class DefaultVlanRefWrapper {

    
    
    private DefaultVlanRef defaultVlanRef;

    public DefaultVlanRefWrapper(DefaultVlanRef defaultVlanRef) {
        this.defaultVlanRef = defaultVlanRef;
    }

   
    public EthernetPhysicalChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(defaultVlanRef.getDest())) {
            
            return defaultVlanRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefaultVlanRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = defaultVlanRef.getValue();
        java.lang.String type = defaultVlanRef.getDest().toString().replace("_", "-");
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

    
    public EthernetPhysicalChannelWrapper getEthernetPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = defaultVlanRef.getValue();
        java.lang.String type = defaultVlanRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetPhysicalChannel){
            return new EthernetPhysicalChannelWrapper((EthernetPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
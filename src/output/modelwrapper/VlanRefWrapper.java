package stdgui.data.model.modelwrapper;


    
    


     

public class VlanRefWrapper {

    
    
    private VlanRef vlanRef;

    public VlanRefWrapper(VlanRef vlanRef) {
        this.vlanRef = vlanRef;
    }

   
    public EthernetPhysicalChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(vlanRef.getDest())) {
            
            return vlanRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVlanRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = vlanRef.getValue();
        java.lang.String type = vlanRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = vlanRef.getValue();
        java.lang.String type = vlanRef.getDest().toString().replace("_", "-");
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
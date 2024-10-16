package stdgui.data.model.modelwrapper;


    
    


     

public class VlanModifierRefWrapper {

    
    
    private VlanModifierRef vlanModifierRef;

    public VlanModifierRefWrapper(VlanModifierRef vlanModifierRef) {
        this.vlanModifierRef = vlanModifierRef;
    }

   
    public EthernetPhysicalChannelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(vlanModifierRef.getDest())) {
            
            return vlanModifierRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVlanModifierRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = vlanModifierRef.getValue();
        java.lang.String type = vlanModifierRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = vlanModifierRef.getValue();
        java.lang.String type = vlanModifierRef.getDest().toString().replace("_", "-");
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
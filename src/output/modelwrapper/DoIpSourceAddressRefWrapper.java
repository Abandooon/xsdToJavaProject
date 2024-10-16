package stdgui.data.model.modelwrapper;


    
    


     

public class DoIpSourceAddressRefWrapper {

    
    
    private DoIpSourceAddressRef doIpSourceAddressRef;

    public DoIpSourceAddressRefWrapper(DoIpSourceAddressRef doIpSourceAddressRef) {
        this.doIpSourceAddressRef = doIpSourceAddressRef;
    }

   
    public DoIpLogicAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(doIpSourceAddressRef.getDest())) {
            
            return doIpSourceAddressRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDoIpSourceAddressRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = doIpSourceAddressRef.getValue();
        java.lang.String type = doIpSourceAddressRef.getDest().toString().replace("_", "-");
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

    
    public DoIpLogicAddressWrapper getDoIpLogicAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = doIpSourceAddressRef.getValue();
        java.lang.String type = doIpSourceAddressRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpLogicAddress){
            return new DoIpLogicAddressWrapper((DoIpLogicAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
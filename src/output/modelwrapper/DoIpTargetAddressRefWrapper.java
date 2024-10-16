package stdgui.data.model.modelwrapper;


    
    


     

public class DoIpTargetAddressRefWrapper {

    
    
    private DoIpTargetAddressRef doIpTargetAddressRef;

    public DoIpTargetAddressRefWrapper(DoIpTargetAddressRef doIpTargetAddressRef) {
        this.doIpTargetAddressRef = doIpTargetAddressRef;
    }

   
    public DoIpLogicAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(doIpTargetAddressRef.getDest())) {
            
            return doIpTargetAddressRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDoIpTargetAddressRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = doIpTargetAddressRef.getValue();
        java.lang.String type = doIpTargetAddressRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = doIpTargetAddressRef.getValue();
        java.lang.String type = doIpTargetAddressRef.getDest().toString().replace("_", "-");
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
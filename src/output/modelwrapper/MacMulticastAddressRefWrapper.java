package stdgui.data.model.modelwrapper;


    
    


     

public class MacMulticastAddressRefWrapper {

    
    
    private MacMulticastAddressRef macMulticastAddressRef;

    public MacMulticastAddressRefWrapper(MacMulticastAddressRef macMulticastAddressRef) {
        this.macMulticastAddressRef = macMulticastAddressRef;
    }

   
    public MacMulticastGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(macMulticastAddressRef.getDest())) {
            
            return macMulticastAddressRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMacMulticastAddressRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = macMulticastAddressRef.getValue();
        java.lang.String type = macMulticastAddressRef.getDest().toString().replace("_", "-");
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

    
    public MacMulticastGroupWrapper getMacMulticastGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = macMulticastAddressRef.getValue();
        java.lang.String type = macMulticastAddressRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MacMulticastGroup){
            return new MacMulticastGroupWrapper((MacMulticastGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
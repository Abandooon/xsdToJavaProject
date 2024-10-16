package stdgui.data.model.modelwrapper;


    
    


     

public class HwCommunicationPortRefWrapper {

    
    
    private HwCommunicationPortRef hwCommunicationPortRef;

    public HwCommunicationPortRefWrapper(HwCommunicationPortRef hwCommunicationPortRef) {
        this.hwCommunicationPortRef = hwCommunicationPortRef;
    }

   
    public HwPinGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwCommunicationPortRef.getDest())) {
            
            return hwCommunicationPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwCommunicationPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwCommunicationPortRef.getValue();
        java.lang.String type = hwCommunicationPortRef.getDest().toString().replace("_", "-");
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

    
    public HwPinGroupWrapper getHwPinGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwCommunicationPortRef.getValue();
        java.lang.String type = hwCommunicationPortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPinGroup){
            return new HwPinGroupWrapper((HwPinGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
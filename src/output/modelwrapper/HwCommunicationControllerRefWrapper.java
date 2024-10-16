package stdgui.data.model.modelwrapper;


    
    


     

public class HwCommunicationControllerRefWrapper {

    
    
    private HwCommunicationControllerRef hwCommunicationControllerRef;

    public HwCommunicationControllerRefWrapper(HwCommunicationControllerRef hwCommunicationControllerRef) {
        this.hwCommunicationControllerRef = hwCommunicationControllerRef;
    }

   
    public HwElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwCommunicationControllerRef.getDest())) {
            
            return hwCommunicationControllerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwCommunicationControllerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwCommunicationControllerRef.getValue();
        java.lang.String type = hwCommunicationControllerRef.getDest().toString().replace("_", "-");
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

    
    public HwElementWrapper getHwElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwCommunicationControllerRef.getValue();
        java.lang.String type = hwCommunicationControllerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
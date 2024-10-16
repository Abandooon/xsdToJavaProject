package stdgui.data.model.modelwrapper;


    
    


     

public class HwPinRefWrapper {

    
    
    private HwPinRef hwPinRef;

    public HwPinRefWrapper(HwPinRef hwPinRef) {
        this.hwPinRef = hwPinRef;
    }

   
    public HwPinSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwPinRef.getDest())) {
            
            return hwPinRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwPinRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwPinRef.getValue();
        java.lang.String type = hwPinRef.getDest().toString().replace("_", "-");
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

    
    public HwPinWrapper getHwPin() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwPinRef.getValue();
        java.lang.String type = hwPinRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPin){
            return new HwPinWrapper((HwPin) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
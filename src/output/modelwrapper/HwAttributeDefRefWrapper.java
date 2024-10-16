package stdgui.data.model.modelwrapper;


    
    


     

public class HwAttributeDefRefWrapper {

    
    
    private HwAttributeDefRef hwAttributeDefRef;

    public HwAttributeDefRefWrapper(HwAttributeDefRef hwAttributeDefRef) {
        this.hwAttributeDefRef = hwAttributeDefRef;
    }

   
    public HwAttributeDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwAttributeDefRef.getDest())) {
            
            return hwAttributeDefRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwAttributeDefRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwAttributeDefRef.getValue();
        java.lang.String type = hwAttributeDefRef.getDest().toString().replace("_", "-");
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

    
    public HwAttributeDefWrapper getHwAttributeDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwAttributeDefRef.getValue();
        java.lang.String type = hwAttributeDefRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwAttributeDef){
            return new HwAttributeDefWrapper((HwAttributeDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
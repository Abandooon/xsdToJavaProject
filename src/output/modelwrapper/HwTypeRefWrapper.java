package stdgui.data.model.modelwrapper;


    
    


     

public class HwTypeRefWrapper {

    
    
    private HwTypeRef hwTypeRef;

    public HwTypeRefWrapper(HwTypeRef hwTypeRef) {
        this.hwTypeRef = hwTypeRef;
    }

   
    public HwTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwTypeRef.getDest())) {
            
            return hwTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwTypeRef.getValue();
        java.lang.String type = hwTypeRef.getDest().toString().replace("_", "-");
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

    
    public HwTypeWrapper getHwType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwTypeRef.getValue();
        java.lang.String type = hwTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwType){
            return new HwTypeWrapper((HwType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
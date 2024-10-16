package stdgui.data.model.modelwrapper;


    
    


     

public class HwCategoryRefWrapper {

    
    
    private HwCategoryRef hwCategoryRef;

    public HwCategoryRefWrapper(HwCategoryRef hwCategoryRef) {
        this.hwCategoryRef = hwCategoryRef;
    }

   
    public HwCategorySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(hwCategoryRef.getDest())) {
            
            return hwCategoryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getHwCategoryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = hwCategoryRef.getValue();
        java.lang.String type = hwCategoryRef.getDest().toString().replace("_", "-");
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

    
    public HwCategoryWrapper getHwCategory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = hwCategoryRef.getValue();
        java.lang.String type = hwCategoryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwCategory){
            return new HwCategoryWrapper((HwCategory) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
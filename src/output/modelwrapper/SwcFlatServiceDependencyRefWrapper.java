package stdgui.data.model.modelwrapper;


    
    


     

public class SwcFlatServiceDependencyRefWrapper {

    
    
    private SwcFlatServiceDependencyRef swcFlatServiceDependencyRef;

    public SwcFlatServiceDependencyRefWrapper(SwcFlatServiceDependencyRef swcFlatServiceDependencyRef) {
        this.swcFlatServiceDependencyRef = swcFlatServiceDependencyRef;
    }

   
    public SwcServiceDependencySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swcFlatServiceDependencyRef.getDest())) {
            
            return swcFlatServiceDependencyRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwcFlatServiceDependencyRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swcFlatServiceDependencyRef.getValue();
        java.lang.String type = swcFlatServiceDependencyRef.getDest().toString().replace("_", "-");
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

    
    public SwcServiceDependencyWrapper getSwcServiceDependency() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swcFlatServiceDependencyRef.getValue();
        java.lang.String type = swcFlatServiceDependencyRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcServiceDependency){
            return new SwcServiceDependencyWrapper((SwcServiceDependency) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
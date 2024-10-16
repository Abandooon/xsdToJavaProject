package stdgui.data.model.modelwrapper;


    
    


     

public class SwCompToEcuMappingRefWrapper {

    
    
    private SwCompToEcuMappingRef swCompToEcuMappingRef;

    public SwCompToEcuMappingRefWrapper(SwCompToEcuMappingRef swCompToEcuMappingRef) {
        this.swCompToEcuMappingRef = swCompToEcuMappingRef;
    }

   
    public SwcToEcuMappingSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swCompToEcuMappingRef.getDest())) {
            
            return swCompToEcuMappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwCompToEcuMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swCompToEcuMappingRef.getValue();
        java.lang.String type = swCompToEcuMappingRef.getDest().toString().replace("_", "-");
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

    
    public SwcToEcuMappingWrapper getSwcToEcuMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swCompToEcuMappingRef.getValue();
        java.lang.String type = swCompToEcuMappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcToEcuMapping){
            return new SwcToEcuMappingWrapper((SwcToEcuMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
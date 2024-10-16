package stdgui.data.model.modelwrapper;


    
    


     

public class SwcBswMappingRefWrapper {

    
    
    private SwcBswMappingRef swcBswMappingRef;

    public SwcBswMappingRefWrapper(SwcBswMappingRef swcBswMappingRef) {
        this.swcBswMappingRef = swcBswMappingRef;
    }

   
    public SwcBswMappingSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swcBswMappingRef.getDest())) {
            
            return swcBswMappingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwcBswMappingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swcBswMappingRef.getValue();
        java.lang.String type = swcBswMappingRef.getDest().toString().replace("_", "-");
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

    
    public SwcBswMappingWrapper getSwcBswMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swcBswMappingRef.getValue();
        java.lang.String type = swcBswMappingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcBswMapping){
            return new SwcBswMappingWrapper((SwcBswMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
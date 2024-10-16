package stdgui.data.model.modelwrapper;


    
    


     

public class SwAxisTypeRefWrapper {

    
    
    private SwAxisTypeRef swAxisTypeRef;

    public SwAxisTypeRefWrapper(SwAxisTypeRef swAxisTypeRef) {
        this.swAxisTypeRef = swAxisTypeRef;
    }

   
    public SwAxisTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swAxisTypeRef.getDest())) {
            
            return swAxisTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwAxisTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swAxisTypeRef.getValue();
        java.lang.String type = swAxisTypeRef.getDest().toString().replace("_", "-");
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

    
    public SwAxisTypeWrapper getSwAxisType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swAxisTypeRef.getValue();
        java.lang.String type = swAxisTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwAxisType){
            return new SwAxisTypeWrapper((SwAxisType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
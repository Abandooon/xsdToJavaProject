package stdgui.data.model.modelwrapper;


    
    


     

public class SwGenericAxisParamTypeRefWrapper {

    
    
    private SwGenericAxisParamTypeRef swGenericAxisParamTypeRef;

    public SwGenericAxisParamTypeRefWrapper(SwGenericAxisParamTypeRef swGenericAxisParamTypeRef) {
        this.swGenericAxisParamTypeRef = swGenericAxisParamTypeRef;
    }

   
    public SwGenericAxisParamTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParamTypeRef.getDest())) {
            
            return swGenericAxisParamTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwGenericAxisParamTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swGenericAxisParamTypeRef.getValue();
        java.lang.String type = swGenericAxisParamTypeRef.getDest().toString().replace("_", "-");
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

    
    public SwGenericAxisParamTypeWrapper getSwGenericAxisParamType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swGenericAxisParamTypeRef.getValue();
        java.lang.String type = swGenericAxisParamTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwGenericAxisParamType){
            return new SwGenericAxisParamTypeWrapper((SwGenericAxisParamType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
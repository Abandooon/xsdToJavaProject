package stdgui.data.model.modelwrapper;


    
    


     

public class SwSystemconstantValueSetRefWrapper {

    
    
    private SwSystemconstantValueSetRef swSystemconstantValueSetRef;

    public SwSystemconstantValueSetRefWrapper(SwSystemconstantValueSetRef swSystemconstantValueSetRef) {
        this.swSystemconstantValueSetRef = swSystemconstantValueSetRef;
    }

   
    public SwSystemconstantValueSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSetRef.getDest())) {
            
            return swSystemconstantValueSetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwSystemconstantValueSetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swSystemconstantValueSetRef.getValue();
        java.lang.String type = swSystemconstantValueSetRef.getDest().toString().replace("_", "-");
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

    
    public SwSystemconstantValueSetWrapper getSwSystemconstantValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swSystemconstantValueSetRef.getValue();
        java.lang.String type = swSystemconstantValueSetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwSystemconstantValueSet){
            return new SwSystemconstantValueSetWrapper((SwSystemconstantValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
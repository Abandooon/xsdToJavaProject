package stdgui.data.model.modelwrapper;


    
    


     

public class SwAddrmethodRefWrapper {

    
    
    private SwAddrmethodRef swAddrmethodRef;

    public SwAddrmethodRefWrapper(SwAddrmethodRef swAddrmethodRef) {
        this.swAddrmethodRef = swAddrmethodRef;
    }

   
    public SwAddrMethodSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(swAddrmethodRef.getDest())) {
            
            return swAddrmethodRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSwAddrmethodRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = swAddrmethodRef.getValue();
        java.lang.String type = swAddrmethodRef.getDest().toString().replace("_", "-");
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

    
    public SwAddrMethodWrapper getSwAddrMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = swAddrmethodRef.getValue();
        java.lang.String type = swAddrmethodRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwAddrMethod){
            return new SwAddrMethodWrapper((SwAddrMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
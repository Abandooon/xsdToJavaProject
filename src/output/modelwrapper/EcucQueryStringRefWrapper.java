package stdgui.data.model.modelwrapper;


    
    


     

public class EcucQueryStringRefWrapper {

    
    
    private EcucQueryStringRef ecucQueryStringRef;

    public EcucQueryStringRefWrapper(EcucQueryStringRef ecucQueryStringRef) {
        this.ecucQueryStringRef = ecucQueryStringRef;
    }

   
    public EcucQuerySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecucQueryStringRef.getDest())) {
            
            return ecucQueryStringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcucQueryStringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecucQueryStringRef.getValue();
        java.lang.String type = ecucQueryStringRef.getDest().toString().replace("_", "-");
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

    
    public EcucQueryWrapper getEcucQuery() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucQueryStringRef.getValue();
        java.lang.String type = ecucQueryStringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucQuery){
            return new EcucQueryWrapper((EcucQuery) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
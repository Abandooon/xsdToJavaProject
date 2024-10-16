package stdgui.data.model.modelwrapper;


    
    


     

public class EcuInstanceRefWrapper {

    
    
    private EcuInstanceRef ecuInstanceRef;

    public EcuInstanceRefWrapper(EcuInstanceRef ecuInstanceRef) {
        this.ecuInstanceRef = ecuInstanceRef;
    }

   
    public EcuInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecuInstanceRef.getDest())) {
            
            return ecuInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcuInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecuInstanceRef.getValue();
        java.lang.String type = ecuInstanceRef.getDest().toString().replace("_", "-");
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

    
    public EcuInstanceWrapper getEcuInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecuInstanceRef.getValue();
        java.lang.String type = ecuInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuInstance){
            return new EcuInstanceWrapper((EcuInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
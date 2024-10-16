package stdgui.data.model.modelwrapper;


    
    


     

public class EcuRef_EcuMappingWrapper {

    
    
    private EcuRef_EcuMapping ecuRef_EcuMapping;

    public EcuRef_EcuMappingWrapper(EcuRef_EcuMapping ecuRef_EcuMapping) {
        this.ecuRef_EcuMapping = ecuRef_EcuMapping;
    }

   
    public HwElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecuRef_EcuMapping.getDest())) {
            
            return ecuRef_EcuMapping.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcuRef_EcuMappingObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecuRef_EcuMapping.getValue();
        java.lang.String type = ecuRef_EcuMapping.getDest().toString().replace("_", "-");
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

    
    public HwElementWrapper getHwElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecuRef_EcuMapping.getValue();
        java.lang.String type = ecuRef_EcuMapping.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
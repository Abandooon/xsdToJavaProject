package stdgui.data.model.modelwrapper;


    
    


     

public class EcucModuleConfigurationValuesRefWrapper {

    
    
    private EcucModuleConfigurationValuesRef ecucModuleConfigurationValuesRef;

    public EcucModuleConfigurationValuesRefWrapper(EcucModuleConfigurationValuesRef ecucModuleConfigurationValuesRef) {
        this.ecucModuleConfigurationValuesRef = ecucModuleConfigurationValuesRef;
    }

   
    public EcucModuleConfigurationValuesSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecucModuleConfigurationValuesRef.getDest())) {
            
            return ecucModuleConfigurationValuesRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcucModuleConfigurationValuesRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecucModuleConfigurationValuesRef.getValue();
        java.lang.String type = ecucModuleConfigurationValuesRef.getDest().toString().replace("_", "-");
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

    
    public EcucModuleConfigurationValuesWrapper getEcucModuleConfigurationValues() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucModuleConfigurationValuesRef.getValue();
        java.lang.String type = ecucModuleConfigurationValuesRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleConfigurationValues){
            return new EcucModuleConfigurationValuesWrapper((EcucModuleConfigurationValues) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
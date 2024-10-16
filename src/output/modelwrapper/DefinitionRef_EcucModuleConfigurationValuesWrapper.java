package stdgui.data.model.modelwrapper;


    
    


     

public class DefinitionRef_EcucModuleConfigurationValuesWrapper {

    
    
    private DefinitionRef_EcucModuleConfigurationValues definitionRef_EcucModuleConfigurationValues;

    public DefinitionRef_EcucModuleConfigurationValuesWrapper(DefinitionRef_EcucModuleConfigurationValues definitionRef_EcucModuleConfigurationValues) {
        this.definitionRef_EcucModuleConfigurationValues = definitionRef_EcucModuleConfigurationValues;
    }

   
    public EcucModuleDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(definitionRef_EcucModuleConfigurationValues.getDest())) {
            
            return definitionRef_EcucModuleConfigurationValues.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefinitionRef_EcucModuleConfigurationValuesObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = definitionRef_EcucModuleConfigurationValues.getValue();
        java.lang.String type = definitionRef_EcucModuleConfigurationValues.getDest().toString().replace("_", "-");
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

    
    public EcucModuleDefWrapper getEcucModuleDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucModuleConfigurationValues.getValue();
        java.lang.String type = definitionRef_EcucModuleConfigurationValues.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
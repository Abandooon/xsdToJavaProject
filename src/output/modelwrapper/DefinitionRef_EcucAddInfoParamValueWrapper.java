package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

public class DefinitionRef_EcucAddInfoParamValueWrapper {

    
    
    private DefinitionRef_EcucAddInfoParamValue definitionRef_EcucAddInfoParamValue;

    public DefinitionRef_EcucAddInfoParamValueWrapper(DefinitionRef_EcucAddInfoParamValue definitionRef_EcucAddInfoParamValue) {
        this.definitionRef_EcucAddInfoParamValue = definitionRef_EcucAddInfoParamValue;
    }

   
    public EcucParameterDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(definitionRef_EcucAddInfoParamValue.getDest())) {
            
            return definitionRef_EcucAddInfoParamValue.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefinitionRef_EcucAddInfoParamValueObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
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

    
    public EcucAddInfoParamDefWrapper getEcucAddInfoParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucAddInfoParamDef){
            return new EcucAddInfoParamDefWrapper((EcucAddInfoParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucBooleanParamDefWrapper getEcucBooleanParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucBooleanParamDef){
            return new EcucBooleanParamDefWrapper((EcucBooleanParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucEnumerationParamDefWrapper getEcucEnumerationParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucEnumerationParamDef){
            return new EcucEnumerationParamDefWrapper((EcucEnumerationParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucFloatParamDefWrapper getEcucFloatParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFloatParamDef){
            return new EcucFloatParamDefWrapper((EcucFloatParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucFunctionNameDefWrapper getEcucFunctionNameDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFunctionNameDef){
            return new EcucFunctionNameDefWrapper((EcucFunctionNameDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucIntegerParamDefWrapper getEcucIntegerParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucIntegerParamDef){
            return new EcucIntegerParamDefWrapper((EcucIntegerParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucLinkerSymbolDefWrapper getEcucLinkerSymbolDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucLinkerSymbolDef){
            return new EcucLinkerSymbolDefWrapper((EcucLinkerSymbolDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucMultilineStringParamDefWrapper getEcucMultilineStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucMultilineStringParamDef){
            return new EcucMultilineStringParamDefWrapper((EcucMultilineStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucStringParamDefWrapper getEcucStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucAddInfoParamValue.getValue();
        java.lang.String type = definitionRef_EcucAddInfoParamValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucStringParamDef){
            return new EcucStringParamDefWrapper((EcucStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
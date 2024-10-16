package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class EcucDefinitionRefWrapper {

    
    
    private EcucDefinitionRef ecucDefinitionRef;

    public EcucDefinitionRefWrapper(EcucDefinitionRef ecucDefinitionRef) {
        this.ecucDefinitionRef = ecucDefinitionRef;
    }

   
    public EcucDefinitionElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecucDefinitionRef.getDest())) {
            
            return ecucDefinitionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcucDefinitionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucBooleanParamDef){
            return new EcucBooleanParamDefWrapper((EcucBooleanParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucChoiceContainerDefWrapper getEcucChoiceContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceContainerDef){
            return new EcucChoiceContainerDefWrapper((EcucChoiceContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucChoiceReferenceDefWrapper getEcucChoiceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceReferenceDef){
            return new EcucChoiceReferenceDefWrapper((EcucChoiceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucEnumerationParamDefWrapper getEcucEnumerationParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFloatParamDef){
            return new EcucFloatParamDefWrapper((EcucFloatParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucForeignReferenceDefWrapper getEcucForeignReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucForeignReferenceDef){
            return new EcucForeignReferenceDefWrapper((EcucForeignReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucFunctionNameDefWrapper getEcucFunctionNameDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFunctionNameDef){
            return new EcucFunctionNameDefWrapper((EcucFunctionNameDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucInstanceReferenceDefWrapper getEcucInstanceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucInstanceReferenceDef){
            return new EcucInstanceReferenceDefWrapper((EcucInstanceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucIntegerParamDefWrapper getEcucIntegerParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucLinkerSymbolDef){
            return new EcucLinkerSymbolDefWrapper((EcucLinkerSymbolDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucModuleDefWrapper getEcucModuleDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucMultilineStringParamDefWrapper getEcucMultilineStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucMultilineStringParamDef){
            return new EcucMultilineStringParamDefWrapper((EcucMultilineStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucParamConfContainerDefWrapper getEcucParamConfContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucParamConfContainerDef){
            return new EcucParamConfContainerDefWrapper((EcucParamConfContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucReferenceDefWrapper getEcucReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucReferenceDef){
            return new EcucReferenceDefWrapper((EcucReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucStringParamDefWrapper getEcucStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucStringParamDef){
            return new EcucStringParamDefWrapper((EcucStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucSymbolicNameReferenceDefWrapper getEcucSymbolicNameReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucSymbolicNameReferenceDef){
            return new EcucSymbolicNameReferenceDefWrapper((EcucSymbolicNameReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucUriReferenceDefWrapper getEcucUriReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecucDefinitionRef.getValue();
        java.lang.String type = ecucDefinitionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucUriReferenceDef){
            return new EcucUriReferenceDefWrapper((EcucUriReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
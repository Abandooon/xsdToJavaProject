package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

public class DefinitionRef_EcucReferenceValueWrapper {

    
    
    private DefinitionRef_EcucReferenceValue definitionRef_EcucReferenceValue;

    public DefinitionRef_EcucReferenceValueWrapper(DefinitionRef_EcucReferenceValue definitionRef_EcucReferenceValue) {
        this.definitionRef_EcucReferenceValue = definitionRef_EcucReferenceValue;
    }

   
    public EcucAbstractReferenceDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(definitionRef_EcucReferenceValue.getDest())) {
            
            return definitionRef_EcucReferenceValue.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefinitionRef_EcucReferenceValueObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
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

    
    public EcucChoiceReferenceDefWrapper getEcucChoiceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceReferenceDef){
            return new EcucChoiceReferenceDefWrapper((EcucChoiceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucForeignReferenceDefWrapper getEcucForeignReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucForeignReferenceDef){
            return new EcucForeignReferenceDefWrapper((EcucForeignReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucInstanceReferenceDefWrapper getEcucInstanceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucInstanceReferenceDef){
            return new EcucInstanceReferenceDefWrapper((EcucInstanceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucReferenceDefWrapper getEcucReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucReferenceDef){
            return new EcucReferenceDefWrapper((EcucReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucSymbolicNameReferenceDefWrapper getEcucSymbolicNameReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
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
        java.lang.String path = definitionRef_EcucReferenceValue.getValue();
        java.lang.String type = definitionRef_EcucReferenceValue.getDest().toString().replace("_", "-");
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
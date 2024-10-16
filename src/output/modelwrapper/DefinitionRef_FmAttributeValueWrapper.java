package stdgui.data.model.modelwrapper;


    
    


     

public class DefinitionRef_FmAttributeValueWrapper {

    
    
    private DefinitionRef_FmAttributeValue definitionRef_FmAttributeValue;

    public DefinitionRef_FmAttributeValueWrapper(DefinitionRef_FmAttributeValue definitionRef_FmAttributeValue) {
        this.definitionRef_FmAttributeValue = definitionRef_FmAttributeValue;
    }

   
    public FmAttributeDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(definitionRef_FmAttributeValue.getDest())) {
            
            return definitionRef_FmAttributeValue.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDefinitionRef_FmAttributeValueObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = definitionRef_FmAttributeValue.getValue();
        java.lang.String type = definitionRef_FmAttributeValue.getDest().toString().replace("_", "-");
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

    
    public FmAttributeDefWrapper getFmAttributeDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = definitionRef_FmAttributeValue.getValue();
        java.lang.String type = definitionRef_FmAttributeValue.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmAttributeDef){
            return new FmAttributeDefWrapper((FmAttributeDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
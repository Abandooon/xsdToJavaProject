package stdgui.data.model.modelwrapper;


    
    


     

public class AttributeRefWrapper {

    
    
    private AttributeRef attributeRef;

    public AttributeRefWrapper(AttributeRef attributeRef) {
        this.attributeRef = attributeRef;
    }

   
    public FmAttributeDefSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(attributeRef.getDest())) {
            
            return attributeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAttributeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = attributeRef.getValue();
        java.lang.String type = attributeRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = attributeRef.getValue();
        java.lang.String type = attributeRef.getDest().toString().replace("_", "-");
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
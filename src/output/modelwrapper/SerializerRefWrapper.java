package stdgui.data.model.modelwrapper;


    
    


     

public class SerializerRefWrapper {

    
    
    private SerializerRef serializerRef;

    public SerializerRefWrapper(SerializerRef serializerRef) {
        this.serializerRef = serializerRef;
    }

   
    public SerializationTechnologySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(serializerRef.getDest())) {
            
            return serializerRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSerializerRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = serializerRef.getValue();
        java.lang.String type = serializerRef.getDest().toString().replace("_", "-");
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

    
    public SerializationTechnologyWrapper getSerializationTechnology() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serializerRef.getValue();
        java.lang.String type = serializerRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SerializationTechnology){
            return new SerializationTechnologyWrapper((SerializationTechnology) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class BaseTypeRefWrapper {

    
    
    private BaseTypeRef baseTypeRef;

    public BaseTypeRefWrapper(BaseTypeRef baseTypeRef) {
        this.baseTypeRef = baseTypeRef;
    }

   
    public SwBaseTypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(baseTypeRef.getDest())) {
            
            return baseTypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBaseTypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = baseTypeRef.getValue();
        java.lang.String type = baseTypeRef.getDest().toString().replace("_", "-");
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

    
    public SwBaseTypeWrapper getSwBaseType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = baseTypeRef.getValue();
        java.lang.String type = baseTypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwBaseType){
            return new SwBaseTypeWrapper((SwBaseType) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
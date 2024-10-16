package stdgui.data.model.modelwrapper;


    
    


     

public class PrefixRefWrapper {

    
    
    private PrefixRef prefixRef;

    public PrefixRefWrapper(PrefixRef prefixRef) {
        this.prefixRef = prefixRef;
    }

   
    public SectionNamePrefixSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(prefixRef.getDest())) {
            
            return prefixRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPrefixRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = prefixRef.getValue();
        java.lang.String type = prefixRef.getDest().toString().replace("_", "-");
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

    
    public SectionNamePrefixWrapper getSectionNamePrefix() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = prefixRef.getValue();
        java.lang.String type = prefixRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SectionNamePrefix){
            return new SectionNamePrefixWrapper((SectionNamePrefix) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
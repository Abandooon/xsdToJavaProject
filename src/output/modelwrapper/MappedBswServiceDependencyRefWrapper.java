package stdgui.data.model.modelwrapper;


    
    


     

public class MappedBswServiceDependencyRefWrapper {

    
    
    private MappedBswServiceDependencyRef mappedBswServiceDependencyRef;

    public MappedBswServiceDependencyRefWrapper(MappedBswServiceDependencyRef mappedBswServiceDependencyRef) {
        this.mappedBswServiceDependencyRef = mappedBswServiceDependencyRef;
    }

   
    public BswServiceDependencyIdentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(mappedBswServiceDependencyRef.getDest())) {
            
            return mappedBswServiceDependencyRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMappedBswServiceDependencyRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = mappedBswServiceDependencyRef.getValue();
        java.lang.String type = mappedBswServiceDependencyRef.getDest().toString().replace("_", "-");
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

    
    public BswServiceDependencyIdentWrapper getBswServiceDependencyIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = mappedBswServiceDependencyRef.getValue();
        java.lang.String type = mappedBswServiceDependencyRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswServiceDependencyIdent){
            return new BswServiceDependencyIdentWrapper((BswServiceDependencyIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
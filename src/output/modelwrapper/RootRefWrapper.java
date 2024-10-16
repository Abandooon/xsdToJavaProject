package stdgui.data.model.modelwrapper;


    
    


     

public class RootRefWrapper {

    
    
    private RootRef rootRef;

    public RootRefWrapper(RootRef rootRef) {
        this.rootRef = rootRef;
    }

   
    public FmFeatureSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(rootRef.getDest())) {
            
            return rootRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRootRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = rootRef.getValue();
        java.lang.String type = rootRef.getDest().toString().replace("_", "-");
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

    
    public FmFeatureWrapper getFmFeature() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = rootRef.getValue();
        java.lang.String type = rootRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeature){
            return new FmFeatureWrapper((FmFeature) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
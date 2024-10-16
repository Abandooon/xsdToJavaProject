package stdgui.data.model.modelwrapper;


    
    


     

public class TearDownActionRefWrapper {

    
    
    private TearDownActionRef tearDownActionRef;

    public TearDownActionRefWrapper(TearDownActionRef tearDownActionRef) {
        this.tearDownActionRef = tearDownActionRef;
    }

   
    public BuildActionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(tearDownActionRef.getDest())) {
            
            return tearDownActionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTearDownActionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = tearDownActionRef.getValue();
        java.lang.String type = tearDownActionRef.getDest().toString().replace("_", "-");
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

    
    public BuildActionWrapper getBuildAction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = tearDownActionRef.getValue();
        java.lang.String type = tearDownActionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildAction){
            return new BuildActionWrapper((BuildAction) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
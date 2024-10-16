package stdgui.data.model.modelwrapper;


    
    


     

public class FeatureModelRefWrapper {

    
    
    private FeatureModelRef featureModelRef;

    public FeatureModelRefWrapper(FeatureModelRef featureModelRef) {
        this.featureModelRef = featureModelRef;
    }

   
    public FmFeatureModelSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(featureModelRef.getDest())) {
            
            return featureModelRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getFeatureModelRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = featureModelRef.getValue();
        java.lang.String type = featureModelRef.getDest().toString().replace("_", "-");
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

    
    public FmFeatureModelWrapper getFmFeatureModel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = featureModelRef.getValue();
        java.lang.String type = featureModelRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureModel){
            return new FmFeatureModelWrapper((FmFeatureModel) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
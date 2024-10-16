package stdgui.data.model.modelwrapper;


    
    


     

public class PostBuildVariantCriterionValueSetRefWrapper {

    
    
    private PostBuildVariantCriterionValueSetRef postBuildVariantCriterionValueSetRef;

    public PostBuildVariantCriterionValueSetRefWrapper(PostBuildVariantCriterionValueSetRef postBuildVariantCriterionValueSetRef) {
        this.postBuildVariantCriterionValueSetRef = postBuildVariantCriterionValueSetRef;
    }

   
    public PostBuildVariantCriterionValueSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(postBuildVariantCriterionValueSetRef.getDest())) {
            
            return postBuildVariantCriterionValueSetRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPostBuildVariantCriterionValueSetRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = postBuildVariantCriterionValueSetRef.getValue();
        java.lang.String type = postBuildVariantCriterionValueSetRef.getDest().toString().replace("_", "-");
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

    
    public PostBuildVariantCriterionValueSetWrapper getPostBuildVariantCriterionValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = postBuildVariantCriterionValueSetRef.getValue();
        java.lang.String type = postBuildVariantCriterionValueSetRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PostBuildVariantCriterionValueSet){
            return new PostBuildVariantCriterionValueSetWrapper((PostBuildVariantCriterionValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
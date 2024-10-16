package stdgui.data.model.modelwrapper;


    
    


     

public class VariantCriterionRefWrapper {

    
    
    private VariantCriterionRef variantCriterionRef;

    public VariantCriterionRefWrapper(VariantCriterionRef variantCriterionRef) {
        this.variantCriterionRef = variantCriterionRef;
    }

   
    public PostBuildVariantCriterionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(variantCriterionRef.getDest())) {
            
            return variantCriterionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getVariantCriterionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = variantCriterionRef.getValue();
        java.lang.String type = variantCriterionRef.getDest().toString().replace("_", "-");
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

    
    public PostBuildVariantCriterionWrapper getPostBuildVariantCriterion() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = variantCriterionRef.getValue();
        java.lang.String type = variantCriterionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PostBuildVariantCriterion){
            return new PostBuildVariantCriterionWrapper((PostBuildVariantCriterion) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
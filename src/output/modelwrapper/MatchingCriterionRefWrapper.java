package stdgui.data.model.modelwrapper;


    
    


     

public class MatchingCriterionRefWrapper {

    
    
    private MatchingCriterionRef matchingCriterionRef;

    public MatchingCriterionRefWrapper(MatchingCriterionRef matchingCriterionRef) {
        this.matchingCriterionRef = matchingCriterionRef;
    }

   
    public PostBuildVariantCriterionSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(matchingCriterionRef.getDest())) {
            
            return matchingCriterionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMatchingCriterionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = matchingCriterionRef.getValue();
        java.lang.String type = matchingCriterionRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = matchingCriterionRef.getValue();
        java.lang.String type = matchingCriterionRef.getDest().toString().replace("_", "-");
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
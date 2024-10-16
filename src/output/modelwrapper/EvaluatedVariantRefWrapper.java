package stdgui.data.model.modelwrapper;


    
    


     

public class EvaluatedVariantRefWrapper {

    
    
    private EvaluatedVariantRef evaluatedVariantRef;

    public EvaluatedVariantRefWrapper(EvaluatedVariantRef evaluatedVariantRef) {
        this.evaluatedVariantRef = evaluatedVariantRef;
    }

   
    public PredefinedVariantSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantRef.getDest())) {
            
            return evaluatedVariantRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEvaluatedVariantRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = evaluatedVariantRef.getValue();
        java.lang.String type = evaluatedVariantRef.getDest().toString().replace("_", "-");
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

    
    public PredefinedVariantWrapper getPredefinedVariant() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedVariantRef.getValue();
        java.lang.String type = evaluatedVariantRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PredefinedVariant){
            return new PredefinedVariantWrapper((PredefinedVariant) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
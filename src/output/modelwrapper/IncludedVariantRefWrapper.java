package stdgui.data.model.modelwrapper;


    
    


     

public class IncludedVariantRefWrapper {

    
    
    private IncludedVariantRef includedVariantRef;

    public IncludedVariantRefWrapper(IncludedVariantRef includedVariantRef) {
        this.includedVariantRef = includedVariantRef;
    }

   
    public PredefinedVariantSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(includedVariantRef.getDest())) {
            
            return includedVariantRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getIncludedVariantRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = includedVariantRef.getValue();
        java.lang.String type = includedVariantRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = includedVariantRef.getValue();
        java.lang.String type = includedVariantRef.getDest().toString().replace("_", "-");
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
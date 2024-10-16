package stdgui.data.model.modelwrapper;


    
    


     

public class IncludeRefWrapper {

    
    
    private IncludeRef includeRef;

    public IncludeRefWrapper(IncludeRef includeRef) {
        this.includeRef = includeRef;
    }

   
    public FmFeatureSelectionSetSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(includeRef.getDest())) {
            
            return includeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getIncludeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = includeRef.getValue();
        java.lang.String type = includeRef.getDest().toString().replace("_", "-");
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

    
    public FmFeatureSelectionSetWrapper getFmFeatureSelectionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = includeRef.getValue();
        java.lang.String type = includeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureSelectionSet){
            return new FmFeatureSelectionSetWrapper((FmFeatureSelectionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
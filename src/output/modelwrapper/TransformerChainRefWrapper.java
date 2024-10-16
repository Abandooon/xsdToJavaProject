package stdgui.data.model.modelwrapper;


    
    


     

public class TransformerChainRefWrapper {

    
    
    private TransformerChainRef transformerChainRef;

    public TransformerChainRefWrapper(TransformerChainRef transformerChainRef) {
        this.transformerChainRef = transformerChainRef;
    }

   
    public TransformationTechnologySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(transformerChainRef.getDest())) {
            
            return transformerChainRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTransformerChainRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = transformerChainRef.getValue();
        java.lang.String type = transformerChainRef.getDest().toString().replace("_", "-");
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

    
    public TransformationTechnologyWrapper getTransformationTechnology() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = transformerChainRef.getValue();
        java.lang.String type = transformerChainRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TransformationTechnology){
            return new TransformationTechnologyWrapper((TransformationTechnology) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
package stdgui.data.model.modelwrapper;


    
    


     

public class ContextRootCompositionRefWrapper {

    
    
    private ContextRootCompositionRef contextRootCompositionRef;

    public ContextRootCompositionRefWrapper(ContextRootCompositionRef contextRootCompositionRef) {
        this.contextRootCompositionRef = contextRootCompositionRef;
    }

   
    public RootSwCompositionPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextRootCompositionRef.getDest())) {
            
            return contextRootCompositionRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextRootCompositionRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextRootCompositionRef.getValue();
        java.lang.String type = contextRootCompositionRef.getDest().toString().replace("_", "-");
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

    
    public RootSwCompositionPrototypeWrapper getRootSwCompositionPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextRootCompositionRef.getValue();
        java.lang.String type = contextRootCompositionRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RootSwCompositionPrototype){
            return new RootSwCompositionPrototypeWrapper((RootSwCompositionPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
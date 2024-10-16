package stdgui.data.model.modelwrapper;


    
    


     

public class ContextAtomicComponentRefWrapper {

    
    
    private ContextAtomicComponentRef contextAtomicComponentRef;

    public ContextAtomicComponentRefWrapper(ContextAtomicComponentRef contextAtomicComponentRef) {
        this.contextAtomicComponentRef = contextAtomicComponentRef;
    }

   
    public SwComponentPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextAtomicComponentRef.getDest())) {
            
            return contextAtomicComponentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextAtomicComponentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextAtomicComponentRef.getValue();
        java.lang.String type = contextAtomicComponentRef.getDest().toString().replace("_", "-");
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

    
    public SwComponentPrototypeWrapper getSwComponentPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextAtomicComponentRef.getValue();
        java.lang.String type = contextAtomicComponentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwComponentPrototype){
            return new SwComponentPrototypeWrapper((SwComponentPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
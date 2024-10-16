package stdgui.data.model.modelwrapper;


    
    


     

     

public class ContextPortRef_RModeInAtomicSwcInstanceRefWrapper {

    
    
    private ContextPortRef_RModeInAtomicSwcInstanceRef contextPortRef_RModeInAtomicSwcInstanceRef;

    public ContextPortRef_RModeInAtomicSwcInstanceRefWrapper(ContextPortRef_RModeInAtomicSwcInstanceRef contextPortRef_RModeInAtomicSwcInstanceRef) {
        this.contextPortRef_RModeInAtomicSwcInstanceRef = contextPortRef_RModeInAtomicSwcInstanceRef;
    }

   
    public AbstractRequiredPortPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextPortRef_RModeInAtomicSwcInstanceRef.getDest())) {
            
            return contextPortRef_RModeInAtomicSwcInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextPortRef_RModeInAtomicSwcInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextPortRef_RModeInAtomicSwcInstanceRef.getValue();
        java.lang.String type = contextPortRef_RModeInAtomicSwcInstanceRef.getDest().toString().replace("_", "-");
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

    
    public PrPortPrototypeWrapper getPrPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextPortRef_RModeInAtomicSwcInstanceRef.getValue();
        java.lang.String type = contextPortRef_RModeInAtomicSwcInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PrPortPrototype){
            return new PrPortPrototypeWrapper((PrPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RPortPrototypeWrapper getRPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextPortRef_RModeInAtomicSwcInstanceRef.getValue();
        java.lang.String type = contextPortRef_RModeInAtomicSwcInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RPortPrototype){
            return new RPortPrototypeWrapper((RPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
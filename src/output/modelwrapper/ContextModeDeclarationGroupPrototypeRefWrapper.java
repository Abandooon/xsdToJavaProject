package stdgui.data.model.modelwrapper;


    
    


     

public class ContextModeDeclarationGroupPrototypeRefWrapper {

    
    
    private ContextModeDeclarationGroupPrototypeRef contextModeDeclarationGroupPrototypeRef;

    public ContextModeDeclarationGroupPrototypeRefWrapper(ContextModeDeclarationGroupPrototypeRef contextModeDeclarationGroupPrototypeRef) {
        this.contextModeDeclarationGroupPrototypeRef = contextModeDeclarationGroupPrototypeRef;
    }

   
    public ModeDeclarationGroupPrototypeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(contextModeDeclarationGroupPrototypeRef.getDest())) {
            
            return contextModeDeclarationGroupPrototypeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContextModeDeclarationGroupPrototypeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = contextModeDeclarationGroupPrototypeRef.getValue();
        java.lang.String type = contextModeDeclarationGroupPrototypeRef.getDest().toString().replace("_", "-");
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

    
    public ModeDeclarationGroupPrototypeWrapper getModeDeclarationGroupPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = contextModeDeclarationGroupPrototypeRef.getValue();
        java.lang.String type = contextModeDeclarationGroupPrototypeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroupPrototype){
            return new ModeDeclarationGroupPrototypeWrapper((ModeDeclarationGroupPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
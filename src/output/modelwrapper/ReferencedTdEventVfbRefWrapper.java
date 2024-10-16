package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

public class ReferencedTdEventVfbRefWrapper {

    
    
    private ReferencedTdEventVfbRef referencedTdEventVfbRef;

    public ReferencedTdEventVfbRefWrapper(ReferencedTdEventVfbRef referencedTdEventVfbRef) {
        this.referencedTdEventVfbRef = referencedTdEventVfbRef;
    }

   
    public TdEventVfbSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(referencedTdEventVfbRef.getDest())) {
            
            return referencedTdEventVfbRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReferencedTdEventVfbRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
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

    
    public TdEventModeDeclarationWrapper getTdEventModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventModeDeclaration){
            return new TdEventModeDeclarationWrapper((TdEventModeDeclaration) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventOperationWrapper getTdEventOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventOperation){
            return new TdEventOperationWrapper((TdEventOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventTriggerWrapper getTdEventTrigger() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventTrigger){
            return new TdEventTriggerWrapper((TdEventTrigger) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventVariableDataPrototypeWrapper getTdEventVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventVariableDataPrototype){
            return new TdEventVariableDataPrototypeWrapper((TdEventVariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventVfbReferenceWrapper getTdEventVfbReference() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = referencedTdEventVfbRef.getValue();
        java.lang.String type = referencedTdEventVfbRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventVfbReference){
            return new TdEventVfbReferenceWrapper((TdEventVfbReference) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
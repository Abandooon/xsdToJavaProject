package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class ResponseRef_TimingDescriptionEventChainWrapper {

    
    
    private ResponseRef_TimingDescriptionEventChain responseRef_TimingDescriptionEventChain;

    public ResponseRef_TimingDescriptionEventChainWrapper(ResponseRef_TimingDescriptionEventChain responseRef_TimingDescriptionEventChain) {
        this.responseRef_TimingDescriptionEventChain = responseRef_TimingDescriptionEventChain;
    }

   
    public TimingDescriptionEventSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(responseRef_TimingDescriptionEventChain.getDest())) {
            
            return responseRef_TimingDescriptionEventChain.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getResponseRef_TimingDescriptionEventChainObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
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

    
    public TdEventBswInternalBehaviorWrapper getTdEventBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventBswInternalBehavior){
            return new TdEventBswInternalBehaviorWrapper((TdEventBswInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventBswModeDeclarationWrapper getTdEventBswModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventBswModeDeclaration){
            return new TdEventBswModeDeclarationWrapper((TdEventBswModeDeclaration) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventBswModuleWrapper getTdEventBswModule() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventBswModule){
            return new TdEventBswModuleWrapper((TdEventBswModule) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventComplexWrapper getTdEventComplex() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventComplex){
            return new TdEventComplexWrapper((TdEventComplex) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventFrClusterCycleStartWrapper getTdEventFrClusterCycleStart() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventFrClusterCycleStart){
            return new TdEventFrClusterCycleStartWrapper((TdEventFrClusterCycleStart) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventFrameWrapper getTdEventFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventFrame){
            return new TdEventFrameWrapper((TdEventFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventIPduWrapper getTdEventIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventIPdu){
            return new TdEventIPduWrapper((TdEventIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventISignalWrapper getTdEventISignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventISignal){
            return new TdEventISignalWrapper((TdEventISignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventModeDeclarationWrapper getTdEventModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
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
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventOperation){
            return new TdEventOperationWrapper((TdEventOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventSwcInternalBehaviorWrapper getTdEventSwcInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventSwcInternalBehavior){
            return new TdEventSwcInternalBehaviorWrapper((TdEventSwcInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventSwcInternalBehaviorReferenceWrapper getTdEventSwcInternalBehaviorReference() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventSwcInternalBehaviorReference){
            return new TdEventSwcInternalBehaviorReferenceWrapper((TdEventSwcInternalBehaviorReference) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventTtCanCycleStartWrapper getTdEventTtCanCycleStart() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventTtCanCycleStart){
            return new TdEventTtCanCycleStartWrapper((TdEventTtCanCycleStart) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventTriggerWrapper getTdEventTrigger() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
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
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
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
        java.lang.String path = responseRef_TimingDescriptionEventChain.getValue();
        java.lang.String type = responseRef_TimingDescriptionEventChain.getDest().toString().replace("_", "-");
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
package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.Collection;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.Documentation;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.Linker;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.SocketAddress;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.System;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class ElementRefWrapper {

    
    
    private ElementRef elementRef;

    public ElementRefWrapper(ElementRef elementRef) {
        this.elementRef = elementRef;
    }

   
    public IdentifiableSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(elementRef.getDest())) {
            
            return elementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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

    
    public ArPackageWrapper getArPackage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArPackage){
            return new ArPackageWrapper((ArPackage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AclObjectSetWrapper getAclObjectSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclObjectSet){
            return new AclObjectSetWrapper((AclObjectSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AclOperationWrapper getAclOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclOperation){
            return new AclOperationWrapper((AclOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AclPermissionWrapper getAclPermission() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclPermission){
            return new AclPermissionWrapper((AclPermission) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AclRoleWrapper getAclRole() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclRole){
            return new AclRoleWrapper((AclRole) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AgeConstraintWrapper getAgeConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AgeConstraint){
            return new AgeConstraintWrapper((AgeConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AliasNameSetWrapper getAliasNameSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AliasNameSet){
            return new AliasNameSetWrapper((AliasNameSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AnalyzedExecutionTimeWrapper getAnalyzedExecutionTime() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AnalyzedExecutionTime){
            return new AnalyzedExecutionTimeWrapper((AnalyzedExecutionTime) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationArrayDataTypeWrapper getApplicationArrayDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayDataType){
            return new ApplicationArrayDataTypeWrapper((ApplicationArrayDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationArrayElementWrapper getApplicationArrayElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayElement){
            return new ApplicationArrayElementWrapper((ApplicationArrayElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationEndpointWrapper getApplicationEndpoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationEndpoint){
            return new ApplicationEndpointWrapper((ApplicationEndpoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationErrorWrapper getApplicationError() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationError){
            return new ApplicationErrorWrapper((ApplicationError) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationPrimitiveDataTypeWrapper getApplicationPrimitiveDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationPrimitiveDataType){
            return new ApplicationPrimitiveDataTypeWrapper((ApplicationPrimitiveDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationRecordDataTypeWrapper getApplicationRecordDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordDataType){
            return new ApplicationRecordDataTypeWrapper((ApplicationRecordDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationRecordElementWrapper getApplicationRecordElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordElement){
            return new ApplicationRecordElementWrapper((ApplicationRecordElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationSwComponentTypeWrapper getApplicationSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationSwComponentType){
            return new ApplicationSwComponentTypeWrapper((ApplicationSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ArbitraryEventTriggeringWrapper getArbitraryEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArbitraryEventTriggering){
            return new ArbitraryEventTriggeringWrapper((ArbitraryEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ArgumentDataPrototypeWrapper getArgumentDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArgumentDataPrototype){
            return new ArgumentDataPrototypeWrapper((ArgumentDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AssemblySwConnectorWrapper getAssemblySwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AssemblySwConnector){
            return new AssemblySwConnectorWrapper((AssemblySwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallPointWrapper getAsynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallPoint){
            return new AsynchronousServerCallPointWrapper((AsynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallResultPointWrapper getAsynchronousServerCallResultPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallResultPoint){
            return new AsynchronousServerCallResultPointWrapper((AsynchronousServerCallResultPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AsynchronousServerCallReturnsEventWrapper getAsynchronousServerCallReturnsEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AsynchronousServerCallReturnsEvent){
            return new AsynchronousServerCallReturnsEventWrapper((AsynchronousServerCallReturnsEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AutosarOperationArgumentInstanceWrapper getAutosarOperationArgumentInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AutosarOperationArgumentInstance){
            return new AutosarOperationArgumentInstanceWrapper((AutosarOperationArgumentInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AutosarVariableInstanceWrapper getAutosarVariableInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AutosarVariableInstance){
            return new AutosarVariableInstanceWrapper((AutosarVariableInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BackgroundEventWrapper getBackgroundEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BackgroundEvent){
            return new BackgroundEventWrapper((BackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BlueprintMappingSetWrapper getBlueprintMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BlueprintMappingSet){
            return new BlueprintMappingSetWrapper((BlueprintMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswAsynchronousServerCallReturnsEventWrapper getBswAsynchronousServerCallReturnsEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswAsynchronousServerCallReturnsEvent){
            return new BswAsynchronousServerCallReturnsEventWrapper((BswAsynchronousServerCallReturnsEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswBackgroundEventWrapper getBswBackgroundEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswBackgroundEvent){
            return new BswBackgroundEventWrapper((BswBackgroundEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswCalledEntityWrapper getBswCalledEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswCalledEntity){
            return new BswCalledEntityWrapper((BswCalledEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswDataReceivedEventWrapper getBswDataReceivedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswDataReceivedEvent){
            return new BswDataReceivedEventWrapper((BswDataReceivedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswDebugInfoWrapper getBswDebugInfo() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswDebugInfo){
            return new BswDebugInfoWrapper((BswDebugInfo) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswExternalTriggerOccurredEventWrapper getBswExternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswExternalTriggerOccurredEvent){
            return new BswExternalTriggerOccurredEventWrapper((BswExternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswImplementationWrapper getBswImplementation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswImplementation){
            return new BswImplementationWrapper((BswImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInternalBehaviorWrapper getBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalBehavior){
            return new BswInternalBehaviorWrapper((BswInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInternalTriggerOccurredEventWrapper getBswInternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalTriggerOccurredEvent){
            return new BswInternalTriggerOccurredEventWrapper((BswInternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInternalTriggeringPointWrapper getBswInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInternalTriggeringPoint){
            return new BswInternalTriggeringPointWrapper((BswInternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswInterruptEntityWrapper getBswInterruptEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswInterruptEntity){
            return new BswInterruptEntityWrapper((BswInterruptEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswMgrNeedsWrapper getBswMgrNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswMgrNeeds){
            return new BswMgrNeedsWrapper((BswMgrNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeManagerErrorEventWrapper getBswModeManagerErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeManagerErrorEvent){
            return new BswModeManagerErrorEventWrapper((BswModeManagerErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeSwitchEventWrapper getBswModeSwitchEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeSwitchEvent){
            return new BswModeSwitchEventWrapper((BswModeSwitchEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModeSwitchedAckEventWrapper getBswModeSwitchedAckEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModeSwitchedAckEvent){
            return new BswModeSwitchedAckEventWrapper((BswModeSwitchedAckEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleDependencyWrapper getBswModuleDependency() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleDependency){
            return new BswModuleDependencyWrapper((BswModuleDependency) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleDescriptionWrapper getBswModuleDescription() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleDescription){
            return new BswModuleDescriptionWrapper((BswModuleDescription) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleEntryWrapper getBswModuleEntry() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleEntry){
            return new BswModuleEntryWrapper((BswModuleEntry) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleTimingWrapper getBswModuleTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleTiming){
            return new BswModuleTimingWrapper((BswModuleTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswOperationInvokedEventWrapper getBswOperationInvokedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswOperationInvokedEvent){
            return new BswOperationInvokedEventWrapper((BswOperationInvokedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswSchedulableEntityWrapper getBswSchedulableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswSchedulableEntity){
            return new BswSchedulableEntityWrapper((BswSchedulableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswServiceDependencyIdentWrapper getBswServiceDependencyIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswServiceDependencyIdent){
            return new BswServiceDependencyIdentWrapper((BswServiceDependencyIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswTimingEventWrapper getBswTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswTimingEvent){
            return new BswTimingEventWrapper((BswTimingEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BuildActionWrapper getBuildAction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildAction){
            return new BuildActionWrapper((BuildAction) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BuildActionEnvironmentWrapper getBuildActionEnvironment() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionEnvironment){
            return new BuildActionEnvironmentWrapper((BuildActionEnvironment) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BuildActionManifestWrapper getBuildActionManifest() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionManifest){
            return new BuildActionManifestWrapper((BuildActionManifest) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BurstPatternEventTriggeringWrapper getBurstPatternEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BurstPatternEventTriggering){
            return new BurstPatternEventTriggeringWrapper((BurstPatternEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CalibrationParameterValueSetWrapper getCalibrationParameterValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CalibrationParameterValueSet){
            return new CalibrationParameterValueSetWrapper((CalibrationParameterValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanClusterWrapper getCanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCluster){
            return new CanClusterWrapper((CanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanCommunicationConnectorWrapper getCanCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCommunicationConnector){
            return new CanCommunicationConnectorWrapper((CanCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanCommunicationControllerWrapper getCanCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCommunicationController){
            return new CanCommunicationControllerWrapper((CanCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanFrameWrapper getCanFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrame){
            return new CanFrameWrapper((CanFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanFrameTriggeringWrapper getCanFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrameTriggering){
            return new CanFrameTriggeringWrapper((CanFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanNmClusterWrapper getCanNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanNmCluster){
            return new CanNmClusterWrapper((CanNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanNmNodeWrapper getCanNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanNmNode){
            return new CanNmNodeWrapper((CanNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanPhysicalChannelWrapper getCanPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanPhysicalChannel){
            return new CanPhysicalChannelWrapper((CanPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpAddressWrapper getCanTpAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpAddress){
            return new CanTpAddressWrapper((CanTpAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpChannelWrapper getCanTpChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpChannel){
            return new CanTpChannelWrapper((CanTpChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpConfigWrapper getCanTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpConfig){
            return new CanTpConfigWrapper((CanTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpNodeWrapper getCanTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpNode){
            return new CanTpNodeWrapper((CanTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ChapterWrapper getChapter() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Chapter){
            return new ChapterWrapper((Chapter) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientIdDefinitionWrapper getClientIdDefinition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientIdDefinition){
            return new ClientIdDefinitionWrapper((ClientIdDefinition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientIdDefinitionSetWrapper getClientIdDefinitionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientIdDefinitionSet){
            return new ClientIdDefinitionSetWrapper((ClientIdDefinitionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientServerInterfaceWrapper getClientServerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterface){
            return new ClientServerInterfaceWrapper((ClientServerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientServerInterfaceMappingWrapper getClientServerInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterfaceMapping){
            return new ClientServerInterfaceMappingWrapper((ClientServerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientServerOperationWrapper getClientServerOperation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerOperation){
            return new ClientServerOperationWrapper((ClientServerOperation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CodeWrapper getCode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Code){
            return new CodeWrapper((Code) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CollectionWrapper getCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Collection){
            return new CollectionWrapper((Collection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComMgrUserNeedsWrapper getComMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ComMgrUserNeeds){
            return new ComMgrUserNeedsWrapper((ComMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CompilerWrapper getCompiler() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Compiler){
            return new CompilerWrapper((Compiler) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComplexDeviceDriverSwComponentTypeWrapper getComplexDeviceDriverSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ComplexDeviceDriverSwComponentType){
            return new ComplexDeviceDriverSwComponentTypeWrapper((ComplexDeviceDriverSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CompositionSwComponentTypeWrapper getCompositionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompositionSwComponentType){
            return new CompositionSwComponentTypeWrapper((CompositionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CompuMethodWrapper getCompuMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompuMethod){
            return new CompuMethodWrapper((CompuMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConcretePatternEventTriggeringWrapper getConcretePatternEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConcretePatternEventTriggering){
            return new ConcretePatternEventTriggeringWrapper((ConcretePatternEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsistencyNeedsWrapper getConsistencyNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsistencyNeeds){
            return new ConsistencyNeedsWrapper((ConsistencyNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsistencyNeedsBlueprintSetWrapper getConsistencyNeedsBlueprintSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsistencyNeedsBlueprintSet){
            return new ConsistencyNeedsBlueprintSetWrapper((ConsistencyNeedsBlueprintSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConstantSpecificationWrapper getConstantSpecification() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConstantSpecification){
            return new ConstantSpecificationWrapper((ConstantSpecification) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConstantSpecificationMappingSetWrapper getConstantSpecificationMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConstantSpecificationMappingSet){
            return new ConstantSpecificationMappingSetWrapper((ConstantSpecificationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsumedEventGroupWrapper getConsumedEventGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsumedEventGroup){
            return new ConsumedEventGroupWrapper((ConsumedEventGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsumedServiceInstanceWrapper getConsumedServiceInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsumedServiceInstance){
            return new ConsumedServiceInstanceWrapper((ConsumedServiceInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ContainerIPduWrapper getContainerIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ContainerIPdu){
            return new ContainerIPduWrapper((ContainerIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingElementWrapper getCouplingElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingElement){
            return new CouplingElementWrapper((CouplingElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortWrapper getCouplingPort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPort){
            return new CouplingPortWrapper((CouplingPort) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortFifoWrapper getCouplingPortFifo() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortFifo){
            return new CouplingPortFifoWrapper((CouplingPortFifo) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortSchedulerWrapper getCouplingPortScheduler() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortScheduler){
            return new CouplingPortSchedulerWrapper((CouplingPortScheduler) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortShaperWrapper getCouplingPortShaper() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortShaper){
            return new CouplingPortShaperWrapper((CouplingPortShaper) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CryptoServiceNeedsWrapper getCryptoServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CryptoServiceNeeds){
            return new CryptoServiceNeedsWrapper((CryptoServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataConstrWrapper getDataConstr() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataConstr){
            return new DataConstrWrapper((DataConstr) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataPrototypeGroupWrapper getDataPrototypeGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataPrototypeGroup){
            return new DataPrototypeGroupWrapper((DataPrototypeGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceiveErrorEventWrapper getDataReceiveErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataReceiveErrorEvent){
            return new DataReceiveErrorEventWrapper((DataReceiveErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataReceivedEventWrapper getDataReceivedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataReceivedEvent){
            return new DataReceivedEventWrapper((DataReceivedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataSendCompletedEventWrapper getDataSendCompletedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataSendCompletedEvent){
            return new DataSendCompletedEventWrapper((DataSendCompletedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataTransformationWrapper getDataTransformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTransformation){
            return new DataTransformationWrapper((DataTransformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataTransformationSetWrapper getDataTransformationSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTransformationSet){
            return new DataTransformationSetWrapper((DataTransformationSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataTypeMappingSetWrapper getDataTypeMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTypeMappingSet){
            return new DataTypeMappingSetWrapper((DataTypeMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataWriteCompletedEventWrapper getDataWriteCompletedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataWriteCompletedEvent){
            return new DataWriteCompletedEventWrapper((DataWriteCompletedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DcmIPduWrapper getDcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DcmIPdu){
            return new DcmIPduWrapper((DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DelegationSwConnectorWrapper getDelegationSwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DelegationSwConnector){
            return new DelegationSwConnectorWrapper((DelegationSwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DependencyOnArtifactWrapper getDependencyOnArtifact() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DependencyOnArtifact){
            return new DependencyOnArtifactWrapper((DependencyOnArtifact) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagEventDebounceCounterBasedWrapper getDiagEventDebounceCounterBased() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagEventDebounceCounterBased){
            return new DiagEventDebounceCounterBasedWrapper((DiagEventDebounceCounterBased) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagEventDebounceMonitorInternalWrapper getDiagEventDebounceMonitorInternal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagEventDebounceMonitorInternal){
            return new DiagEventDebounceMonitorInternalWrapper((DiagEventDebounceMonitorInternal) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagEventDebounceTimeBasedWrapper getDiagEventDebounceTimeBased() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagEventDebounceTimeBased){
            return new DiagEventDebounceTimeBasedWrapper((DiagEventDebounceTimeBased) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticAccessPermissionWrapper getDiagnosticAccessPermission() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticAccessPermission){
            return new DiagnosticAccessPermissionWrapper((DiagnosticAccessPermission) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticAgingWrapper getDiagnosticAging() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticAging){
            return new DiagnosticAgingWrapper((DiagnosticAging) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticClearDiagnosticInformationWrapper getDiagnosticClearDiagnosticInformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticClearDiagnosticInformation){
            return new DiagnosticClearDiagnosticInformationWrapper((DiagnosticClearDiagnosticInformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticClearDiagnosticInformationClassWrapper getDiagnosticClearDiagnosticInformationClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticClearDiagnosticInformationClass){
            return new DiagnosticClearDiagnosticInformationClassWrapper((DiagnosticClearDiagnosticInformationClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticComControlWrapper getDiagnosticComControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControl){
            return new DiagnosticComControlWrapper((DiagnosticComControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticComControlClassWrapper getDiagnosticComControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControlClass){
            return new DiagnosticComControlClassWrapper((DiagnosticComControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticCommunicationManagerNeedsWrapper getDiagnosticCommunicationManagerNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticCommunicationManagerNeeds){
            return new DiagnosticCommunicationManagerNeedsWrapper((DiagnosticCommunicationManagerNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticConnectedIndicatorWrapper getDiagnosticConnectedIndicator() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticConnectedIndicator){
            return new DiagnosticConnectedIndicatorWrapper((DiagnosticConnectedIndicator) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticConnectionWrapper getDiagnosticConnection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticConnection){
            return new DiagnosticConnectionWrapper((DiagnosticConnection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticContributionSetWrapper getDiagnosticContributionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticContributionSet){
            return new DiagnosticContributionSetWrapper((DiagnosticContributionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticControlDtcSettingWrapper getDiagnosticControlDtcSetting() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticControlDtcSetting){
            return new DiagnosticControlDtcSettingWrapper((DiagnosticControlDtcSetting) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticControlDtcSettingClassWrapper getDiagnosticControlDtcSettingClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticControlDtcSettingClass){
            return new DiagnosticControlDtcSettingClassWrapper((DiagnosticControlDtcSettingClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticCustomServiceClassWrapper getDiagnosticCustomServiceClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticCustomServiceClass){
            return new DiagnosticCustomServiceClassWrapper((DiagnosticCustomServiceClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataElementWrapper getDiagnosticDataElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataElement){
            return new DiagnosticDataElementWrapper((DiagnosticDataElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataIdentifierWrapper getDiagnosticDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataIdentifier){
            return new DiagnosticDataIdentifierWrapper((DiagnosticDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataIdentifierSetWrapper getDiagnosticDataIdentifierSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataIdentifierSet){
            return new DiagnosticDataIdentifierSetWrapper((DiagnosticDataIdentifierSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataTransferWrapper getDiagnosticDataTransfer() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataTransfer){
            return new DiagnosticDataTransferWrapper((DiagnosticDataTransfer) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataTransferClassWrapper getDiagnosticDataTransferClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDataTransferClass){
            return new DiagnosticDataTransferClassWrapper((DiagnosticDataTransferClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDemProvidedDataMappingWrapper getDiagnosticDemProvidedDataMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDemProvidedDataMapping){
            return new DiagnosticDemProvidedDataMappingWrapper((DiagnosticDemProvidedDataMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDynamicDataIdentifierWrapper getDiagnosticDynamicDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicDataIdentifier){
            return new DiagnosticDynamicDataIdentifierWrapper((DiagnosticDynamicDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDynamicallyDefineDataIdentifierWrapper getDiagnosticDynamicallyDefineDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicallyDefineDataIdentifier){
            return new DiagnosticDynamicallyDefineDataIdentifierWrapper((DiagnosticDynamicallyDefineDataIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDynamicallyDefineDataIdentifierClassWrapper getDiagnosticDynamicallyDefineDataIdentifierClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticDynamicallyDefineDataIdentifierClass){
            return new DiagnosticDynamicallyDefineDataIdentifierClassWrapper((DiagnosticDynamicallyDefineDataIdentifierClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEcuResetWrapper getDiagnosticEcuReset() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEcuReset){
            return new DiagnosticEcuResetWrapper((DiagnosticEcuReset) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEcuResetClassWrapper getDiagnosticEcuResetClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEcuResetClass){
            return new DiagnosticEcuResetClassWrapper((DiagnosticEcuResetClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionWrapper getDiagnosticEnableCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableCondition){
            return new DiagnosticEnableConditionWrapper((DiagnosticEnableCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionGroupWrapper getDiagnosticEnableConditionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionGroup){
            return new DiagnosticEnableConditionGroupWrapper((DiagnosticEnableConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionNeedsWrapper getDiagnosticEnableConditionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionNeeds){
            return new DiagnosticEnableConditionNeedsWrapper((DiagnosticEnableConditionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionPortMappingWrapper getDiagnosticEnableConditionPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionPortMapping){
            return new DiagnosticEnableConditionPortMappingWrapper((DiagnosticEnableConditionPortMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventWrapper getDiagnosticEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEvent){
            return new DiagnosticEventWrapper((DiagnosticEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventInfoNeedsWrapper getDiagnosticEventInfoNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventInfoNeeds){
            return new DiagnosticEventInfoNeedsWrapper((DiagnosticEventInfoNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventManagerNeedsWrapper getDiagnosticEventManagerNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventManagerNeeds){
            return new DiagnosticEventManagerNeedsWrapper((DiagnosticEventManagerNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventNeedsWrapper getDiagnosticEventNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventNeeds){
            return new DiagnosticEventNeedsWrapper((DiagnosticEventNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventPortMappingWrapper getDiagnosticEventPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventPortMapping){
            return new DiagnosticEventPortMappingWrapper((DiagnosticEventPortMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventToDebounceAlgorithmMappingWrapper getDiagnosticEventToDebounceAlgorithmMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventToDebounceAlgorithmMapping){
            return new DiagnosticEventToDebounceAlgorithmMappingWrapper((DiagnosticEventToDebounceAlgorithmMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventToEnableConditionGroupMappingWrapper getDiagnosticEventToEnableConditionGroupMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventToEnableConditionGroupMapping){
            return new DiagnosticEventToEnableConditionGroupMappingWrapper((DiagnosticEventToEnableConditionGroupMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventToOperationCycleMappingWrapper getDiagnosticEventToOperationCycleMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventToOperationCycleMapping){
            return new DiagnosticEventToOperationCycleMappingWrapper((DiagnosticEventToOperationCycleMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventToStorageConditionGroupMappingWrapper getDiagnosticEventToStorageConditionGroupMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventToStorageConditionGroupMapping){
            return new DiagnosticEventToStorageConditionGroupMappingWrapper((DiagnosticEventToStorageConditionGroupMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventToTroubleCodeUdsMappingWrapper getDiagnosticEventToTroubleCodeUdsMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventToTroubleCodeUdsMapping){
            return new DiagnosticEventToTroubleCodeUdsMappingWrapper((DiagnosticEventToTroubleCodeUdsMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticExtendedDataRecordWrapper getDiagnosticExtendedDataRecord() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticExtendedDataRecord){
            return new DiagnosticExtendedDataRecordWrapper((DiagnosticExtendedDataRecord) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticFreezeFrameWrapper getDiagnosticFreezeFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticFreezeFrame){
            return new DiagnosticFreezeFrameWrapper((DiagnosticFreezeFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIoControlWrapper getDiagnosticIoControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControl){
            return new DiagnosticIoControlWrapper((DiagnosticIoControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIndicatorWrapper getDiagnosticIndicator() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIndicator){
            return new DiagnosticIndicatorWrapper((DiagnosticIndicator) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIoControlClassWrapper getDiagnosticIoControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControlClass){
            return new DiagnosticIoControlClassWrapper((DiagnosticIoControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticIoControlNeedsWrapper getDiagnosticIoControlNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControlNeeds){
            return new DiagnosticIoControlNeedsWrapper((DiagnosticIoControlNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationMirrorWrapper getDiagnosticMemoryDestinationMirror() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationMirror){
            return new DiagnosticMemoryDestinationMirrorWrapper((DiagnosticMemoryDestinationMirror) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationPrimaryWrapper getDiagnosticMemoryDestinationPrimary() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationPrimary){
            return new DiagnosticMemoryDestinationPrimaryWrapper((DiagnosticMemoryDestinationPrimary) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationUserDefinedWrapper getDiagnosticMemoryDestinationUserDefined() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryDestinationUserDefined){
            return new DiagnosticMemoryDestinationUserDefinedWrapper((DiagnosticMemoryDestinationUserDefined) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryIdentifierWrapper getDiagnosticMemoryIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticMemoryIdentifier){
            return new DiagnosticMemoryIdentifierWrapper((DiagnosticMemoryIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticOperationCycleWrapper getDiagnosticOperationCycle() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCycle){
            return new DiagnosticOperationCycleWrapper((DiagnosticOperationCycle) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticOperationCycleNeedsWrapper getDiagnosticOperationCycleNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCycleNeeds){
            return new DiagnosticOperationCycleNeedsWrapper((DiagnosticOperationCycleNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticOperationCyclePortMappingWrapper getDiagnosticOperationCyclePortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCyclePortMapping){
            return new DiagnosticOperationCyclePortMappingWrapper((DiagnosticOperationCyclePortMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDtcInformationWrapper getDiagnosticReadDtcInformation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDtcInformation){
            return new DiagnosticReadDtcInformationWrapper((DiagnosticReadDtcInformation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDtcInformationClassWrapper getDiagnosticReadDtcInformationClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDtcInformationClass){
            return new DiagnosticReadDtcInformationClassWrapper((DiagnosticReadDtcInformationClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByIdentifierWrapper getDiagnosticReadDataByIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByIdentifier){
            return new DiagnosticReadDataByIdentifierWrapper((DiagnosticReadDataByIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByIdentifierClassWrapper getDiagnosticReadDataByIdentifierClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByIdentifierClass){
            return new DiagnosticReadDataByIdentifierClassWrapper((DiagnosticReadDataByIdentifierClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByPeriodicIdWrapper getDiagnosticReadDataByPeriodicId() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByPeriodicId){
            return new DiagnosticReadDataByPeriodicIdWrapper((DiagnosticReadDataByPeriodicId) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadDataByPeriodicIdClassWrapper getDiagnosticReadDataByPeriodicIdClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadDataByPeriodicIdClass){
            return new DiagnosticReadDataByPeriodicIdClassWrapper((DiagnosticReadDataByPeriodicIdClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadMemoryByAddressWrapper getDiagnosticReadMemoryByAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadMemoryByAddress){
            return new DiagnosticReadMemoryByAddressWrapper((DiagnosticReadMemoryByAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticReadMemoryByAddressClassWrapper getDiagnosticReadMemoryByAddressClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticReadMemoryByAddressClass){
            return new DiagnosticReadMemoryByAddressClassWrapper((DiagnosticReadMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestDownloadWrapper getDiagnosticRequestDownload() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestDownload){
            return new DiagnosticRequestDownloadWrapper((DiagnosticRequestDownload) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestDownloadClassWrapper getDiagnosticRequestDownloadClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestDownloadClass){
            return new DiagnosticRequestDownloadClassWrapper((DiagnosticRequestDownloadClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestFileTransferWrapper getDiagnosticRequestFileTransfer() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestFileTransfer){
            return new DiagnosticRequestFileTransferWrapper((DiagnosticRequestFileTransfer) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestFileTransferClassWrapper getDiagnosticRequestFileTransferClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestFileTransferClass){
            return new DiagnosticRequestFileTransferClassWrapper((DiagnosticRequestFileTransferClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestRoutineResultsWrapper getDiagnosticRequestRoutineResults() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestRoutineResults){
            return new DiagnosticRequestRoutineResultsWrapper((DiagnosticRequestRoutineResults) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestUploadWrapper getDiagnosticRequestUpload() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestUpload){
            return new DiagnosticRequestUploadWrapper((DiagnosticRequestUpload) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestUploadClassWrapper getDiagnosticRequestUploadClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestUploadClass){
            return new DiagnosticRequestUploadClassWrapper((DiagnosticRequestUploadClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticResponseOnEventWrapper getDiagnosticResponseOnEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticResponseOnEvent){
            return new DiagnosticResponseOnEventWrapper((DiagnosticResponseOnEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticResponseOnEventClassWrapper getDiagnosticResponseOnEventClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticResponseOnEventClass){
            return new DiagnosticResponseOnEventClassWrapper((DiagnosticResponseOnEventClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineWrapper getDiagnosticRoutine() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutine){
            return new DiagnosticRoutineWrapper((DiagnosticRoutine) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineControlWrapper getDiagnosticRoutineControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineControl){
            return new DiagnosticRoutineControlWrapper((DiagnosticRoutineControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineControlClassWrapper getDiagnosticRoutineControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineControlClass){
            return new DiagnosticRoutineControlClassWrapper((DiagnosticRoutineControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRoutineNeedsWrapper getDiagnosticRoutineNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineNeeds){
            return new DiagnosticRoutineNeedsWrapper((DiagnosticRoutineNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSecurityAccessWrapper getDiagnosticSecurityAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityAccess){
            return new DiagnosticSecurityAccessWrapper((DiagnosticSecurityAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSecurityAccessClassWrapper getDiagnosticSecurityAccessClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityAccessClass){
            return new DiagnosticSecurityAccessClassWrapper((DiagnosticSecurityAccessClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSecurityLevelWrapper getDiagnosticSecurityLevel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSecurityLevel){
            return new DiagnosticSecurityLevelWrapper((DiagnosticSecurityLevel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticServiceDataMappingWrapper getDiagnosticServiceDataMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticServiceDataMapping){
            return new DiagnosticServiceDataMappingWrapper((DiagnosticServiceDataMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticServiceSwMappingWrapper getDiagnosticServiceSwMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticServiceSwMapping){
            return new DiagnosticServiceSwMappingWrapper((DiagnosticServiceSwMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticServiceTableWrapper getDiagnosticServiceTable() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticServiceTable){
            return new DiagnosticServiceTableWrapper((DiagnosticServiceTable) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSessionWrapper getDiagnosticSession() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSession){
            return new DiagnosticSessionWrapper((DiagnosticSession) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSessionControlWrapper getDiagnosticSessionControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSessionControl){
            return new DiagnosticSessionControlWrapper((DiagnosticSessionControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSessionControlClassWrapper getDiagnosticSessionControlClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSessionControlClass){
            return new DiagnosticSessionControlClassWrapper((DiagnosticSessionControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStartRoutineWrapper getDiagnosticStartRoutine() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStartRoutine){
            return new DiagnosticStartRoutineWrapper((DiagnosticStartRoutine) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStopRoutineWrapper getDiagnosticStopRoutine() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStopRoutine){
            return new DiagnosticStopRoutineWrapper((DiagnosticStopRoutine) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionWrapper getDiagnosticStorageCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageCondition){
            return new DiagnosticStorageConditionWrapper((DiagnosticStorageCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionGroupWrapper getDiagnosticStorageConditionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionGroup){
            return new DiagnosticStorageConditionGroupWrapper((DiagnosticStorageConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionNeedsWrapper getDiagnosticStorageConditionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionNeeds){
            return new DiagnosticStorageConditionNeedsWrapper((DiagnosticStorageConditionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionPortMappingWrapper getDiagnosticStorageConditionPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionPortMapping){
            return new DiagnosticStorageConditionPortMappingWrapper((DiagnosticStorageConditionPortMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTransferExitWrapper getDiagnosticTransferExit() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTransferExit){
            return new DiagnosticTransferExitWrapper((DiagnosticTransferExit) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTransferExitClassWrapper getDiagnosticTransferExitClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTransferExitClass){
            return new DiagnosticTransferExitClassWrapper((DiagnosticTransferExitClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeGroupWrapper getDiagnosticTroubleCodeGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeGroup){
            return new DiagnosticTroubleCodeGroupWrapper((DiagnosticTroubleCodeGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeJ1939Wrapper getDiagnosticTroubleCodeJ1939() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeJ1939){
            return new DiagnosticTroubleCodeJ1939Wrapper((DiagnosticTroubleCodeJ1939) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeObdWrapper getDiagnosticTroubleCodeObd() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeObd){
            return new DiagnosticTroubleCodeObdWrapper((DiagnosticTroubleCodeObd) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodePropsWrapper getDiagnosticTroubleCodeProps() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeProps){
            return new DiagnosticTroubleCodePropsWrapper((DiagnosticTroubleCodeProps) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticTroubleCodeUdsWrapper getDiagnosticTroubleCodeUds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeUds){
            return new DiagnosticTroubleCodeUdsWrapper((DiagnosticTroubleCodeUds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticValueNeedsWrapper getDiagnosticValueNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticValueNeeds){
            return new DiagnosticValueNeedsWrapper((DiagnosticValueNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteDataByIdentifierWrapper getDiagnosticWriteDataByIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteDataByIdentifier){
            return new DiagnosticWriteDataByIdentifierWrapper((DiagnosticWriteDataByIdentifier) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteDataByIdentifierClassWrapper getDiagnosticWriteDataByIdentifierClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteDataByIdentifierClass){
            return new DiagnosticWriteDataByIdentifierClassWrapper((DiagnosticWriteDataByIdentifierClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteMemoryByAddressWrapper getDiagnosticWriteMemoryByAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddress){
            return new DiagnosticWriteMemoryByAddressWrapper((DiagnosticWriteMemoryByAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteMemoryByAddressClassWrapper getDiagnosticWriteMemoryByAddressClass() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddressClass){
            return new DiagnosticWriteMemoryByAddressClassWrapper((DiagnosticWriteMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticsCommunicationSecurityNeedsWrapper getDiagnosticsCommunicationSecurityNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticsCommunicationSecurityNeeds){
            return new DiagnosticsCommunicationSecurityNeedsWrapper((DiagnosticsCommunicationSecurityNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DltUserNeedsWrapper getDltUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DltUserNeeds){
            return new DltUserNeedsWrapper((DltUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpActivationLineNeedsWrapper getDoIpActivationLineNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpActivationLineNeeds){
            return new DoIpActivationLineNeedsWrapper((DoIpActivationLineNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpGidNeedsWrapper getDoIpGidNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpGidNeeds){
            return new DoIpGidNeedsWrapper((DoIpGidNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpGidSynchronizationNeedsWrapper getDoIpGidSynchronizationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpGidSynchronizationNeeds){
            return new DoIpGidSynchronizationNeedsWrapper((DoIpGidSynchronizationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpLogicAddressWrapper getDoIpLogicAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpLogicAddress){
            return new DoIpLogicAddressWrapper((DoIpLogicAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpPowerModeStatusNeedsWrapper getDoIpPowerModeStatusNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpPowerModeStatusNeeds){
            return new DoIpPowerModeStatusNeedsWrapper((DoIpPowerModeStatusNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpRoutingActivationAuthenticationNeedsWrapper getDoIpRoutingActivationAuthenticationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpRoutingActivationAuthenticationNeeds){
            return new DoIpRoutingActivationAuthenticationNeedsWrapper((DoIpRoutingActivationAuthenticationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpRoutingActivationConfirmationNeedsWrapper getDoIpRoutingActivationConfirmationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpRoutingActivationConfirmationNeeds){
            return new DoIpRoutingActivationConfirmationNeedsWrapper((DoIpRoutingActivationConfirmationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpTpConfigWrapper getDoIpTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DoIpTpConfig){
            return new DoIpTpConfigWrapper((DoIpTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DocumentationWrapper getDocumentation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Documentation){
            return new DocumentationWrapper((Documentation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DtcStatusChangeNotificationNeedsWrapper getDtcStatusChangeNotificationNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DtcStatusChangeNotificationNeeds){
            return new DtcStatusChangeNotificationNeedsWrapper((DtcStatusChangeNotificationNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuMappingWrapper getEcuMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuMapping){
            return new EcuMappingWrapper((EcuMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocEventRefWrapper getEocEventRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocEventRef){
            return new EocEventRefWrapper((EocEventRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefWrapper getEocExecutableEntityRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRef){
            return new EocExecutableEntityRefWrapper((EocExecutableEntityRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefGroupWrapper getEocExecutableEntityRefGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRefGroup){
            return new EocExecutableEntityRefGroupWrapper((EocExecutableEntityRefGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuAbstractionSwComponentTypeWrapper getEcuAbstractionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuAbstractionSwComponentType){
            return new EcuAbstractionSwComponentTypeWrapper((EcuAbstractionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuInstanceWrapper getEcuInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuInstance){
            return new EcuInstanceWrapper((EcuInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuPartitionWrapper getEcuPartition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuPartition){
            return new EcuPartitionWrapper((EcuPartition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuStateMgrUserNeedsWrapper getEcuStateMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuStateMgrUserNeeds){
            return new EcuStateMgrUserNeedsWrapper((EcuStateMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuTimingWrapper getEcuTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuTiming){
            return new EcuTimingWrapper((EcuTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucAddInfoParamDefWrapper getEcucAddInfoParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucAddInfoParamDef){
            return new EcucAddInfoParamDefWrapper((EcucAddInfoParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucBooleanParamDefWrapper getEcucBooleanParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucBooleanParamDef){
            return new EcucBooleanParamDefWrapper((EcucBooleanParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucChoiceContainerDefWrapper getEcucChoiceContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceContainerDef){
            return new EcucChoiceContainerDefWrapper((EcucChoiceContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucChoiceReferenceDefWrapper getEcucChoiceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucChoiceReferenceDef){
            return new EcucChoiceReferenceDefWrapper((EcucChoiceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucContainerValueWrapper getEcucContainerValue() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucContainerValue){
            return new EcucContainerValueWrapper((EcucContainerValue) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDefinitionCollectionWrapper getEcucDefinitionCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDefinitionCollection){
            return new EcucDefinitionCollectionWrapper((EcucDefinitionCollection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDestinationUriDefWrapper getEcucDestinationUriDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDestinationUriDef){
            return new EcucDestinationUriDefWrapper((EcucDestinationUriDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDestinationUriDefSetWrapper getEcucDestinationUriDefSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDestinationUriDefSet){
            return new EcucDestinationUriDefSetWrapper((EcucDestinationUriDefSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucEnumerationLiteralDefWrapper getEcucEnumerationLiteralDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucEnumerationLiteralDef){
            return new EcucEnumerationLiteralDefWrapper((EcucEnumerationLiteralDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucEnumerationParamDefWrapper getEcucEnumerationParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucEnumerationParamDef){
            return new EcucEnumerationParamDefWrapper((EcucEnumerationParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucFloatParamDefWrapper getEcucFloatParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFloatParamDef){
            return new EcucFloatParamDefWrapper((EcucFloatParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucForeignReferenceDefWrapper getEcucForeignReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucForeignReferenceDef){
            return new EcucForeignReferenceDefWrapper((EcucForeignReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucFunctionNameDefWrapper getEcucFunctionNameDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucFunctionNameDef){
            return new EcucFunctionNameDefWrapper((EcucFunctionNameDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucInstanceReferenceDefWrapper getEcucInstanceReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucInstanceReferenceDef){
            return new EcucInstanceReferenceDefWrapper((EcucInstanceReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucIntegerParamDefWrapper getEcucIntegerParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucIntegerParamDef){
            return new EcucIntegerParamDefWrapper((EcucIntegerParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucLinkerSymbolDefWrapper getEcucLinkerSymbolDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucLinkerSymbolDef){
            return new EcucLinkerSymbolDefWrapper((EcucLinkerSymbolDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucModuleConfigurationValuesWrapper getEcucModuleConfigurationValues() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleConfigurationValues){
            return new EcucModuleConfigurationValuesWrapper((EcucModuleConfigurationValues) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucModuleDefWrapper getEcucModuleDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucMultilineStringParamDefWrapper getEcucMultilineStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucMultilineStringParamDef){
            return new EcucMultilineStringParamDefWrapper((EcucMultilineStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucParamConfContainerDefWrapper getEcucParamConfContainerDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucParamConfContainerDef){
            return new EcucParamConfContainerDefWrapper((EcucParamConfContainerDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucQueryWrapper getEcucQuery() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucQuery){
            return new EcucQueryWrapper((EcucQuery) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucReferenceDefWrapper getEcucReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucReferenceDef){
            return new EcucReferenceDefWrapper((EcucReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucStringParamDefWrapper getEcucStringParamDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucStringParamDef){
            return new EcucStringParamDefWrapper((EcucStringParamDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucSymbolicNameReferenceDefWrapper getEcucSymbolicNameReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucSymbolicNameReferenceDef){
            return new EcucSymbolicNameReferenceDefWrapper((EcucSymbolicNameReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucUriReferenceDefWrapper getEcucUriReferenceDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucUriReferenceDef){
            return new EcucUriReferenceDefWrapper((EcucUriReferenceDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucValidationConditionWrapper getEcucValidationCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucValidationCondition){
            return new EcucValidationConditionWrapper((EcucValidationCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucValueCollectionWrapper getEcucValueCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucValueCollection){
            return new EcucValueCollectionWrapper((EcucValueCollection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EndToEndProtectionWrapper getEndToEndProtection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EndToEndProtection){
            return new EndToEndProtectionWrapper((EndToEndProtection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EndToEndProtectionSetWrapper getEndToEndProtectionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EndToEndProtectionSet){
            return new EndToEndProtectionSetWrapper((EndToEndProtectionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetClusterWrapper getEthernetCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCluster){
            return new EthernetClusterWrapper((EthernetCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetCommunicationConnectorWrapper getEthernetCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationConnector){
            return new EthernetCommunicationConnectorWrapper((EthernetCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetCommunicationControllerWrapper getEthernetCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCommunicationController){
            return new EthernetCommunicationControllerWrapper((EthernetCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameWrapper getEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrame){
            return new EthernetFrameWrapper((EthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameTriggeringWrapper getEthernetFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrameTriggering){
            return new EthernetFrameTriggeringWrapper((EthernetFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetPhysicalChannelWrapper getEthernetPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetPhysicalChannel){
            return new EthernetPhysicalChannelWrapper((EthernetPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EvaluatedVariantSetWrapper getEvaluatedVariantSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EvaluatedVariantSet){
            return new EvaluatedVariantSetWrapper((EvaluatedVariantSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExclusiveAreaWrapper getExclusiveArea() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExclusiveArea){
            return new ExclusiveAreaWrapper((ExclusiveArea) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExecutionOrderConstraintWrapper getExecutionOrderConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExecutionOrderConstraint){
            return new ExecutionOrderConstraintWrapper((ExecutionOrderConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExecutionTimeConstraintWrapper getExecutionTimeConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExecutionTimeConstraint){
            return new ExecutionTimeConstraintWrapper((ExecutionTimeConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExternalTriggerOccurredEventWrapper getExternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExternalTriggerOccurredEvent){
            return new ExternalTriggerOccurredEventWrapper((ExternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExternalTriggeringPointIdentWrapper getExternalTriggeringPointIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExternalTriggeringPointIdent){
            return new ExternalTriggeringPointIdentWrapper((ExternalTriggeringPointIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmAttributeDefWrapper getFmAttributeDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmAttributeDef){
            return new FmAttributeDefWrapper((FmAttributeDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureWrapper getFmFeature() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeature){
            return new FmFeatureWrapper((FmFeature) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureMapWrapper getFmFeatureMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureMap){
            return new FmFeatureMapWrapper((FmFeatureMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureMapAssertionWrapper getFmFeatureMapAssertion() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureMapAssertion){
            return new FmFeatureMapAssertionWrapper((FmFeatureMapAssertion) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureMapConditionWrapper getFmFeatureMapCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureMapCondition){
            return new FmFeatureMapConditionWrapper((FmFeatureMapCondition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureMapElementWrapper getFmFeatureMapElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureMapElement){
            return new FmFeatureMapElementWrapper((FmFeatureMapElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureModelWrapper getFmFeatureModel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureModel){
            return new FmFeatureModelWrapper((FmFeatureModel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureRelationWrapper getFmFeatureRelation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureRelation){
            return new FmFeatureRelationWrapper((FmFeatureRelation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureRestrictionWrapper getFmFeatureRestriction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureRestriction){
            return new FmFeatureRestrictionWrapper((FmFeatureRestriction) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureSelectionWrapper getFmFeatureSelection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureSelection){
            return new FmFeatureSelectionWrapper((FmFeatureSelection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureSelectionSetWrapper getFmFeatureSelectionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureSelectionSet){
            return new FmFeatureSelectionSetWrapper((FmFeatureSelectionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlatInstanceDescriptorWrapper getFlatInstanceDescriptor() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatInstanceDescriptor){
            return new FlatInstanceDescriptorWrapper((FlatInstanceDescriptor) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlatMapWrapper getFlatMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatMap){
            return new FlatMapWrapper((FlatMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayArTpConfigWrapper getFlexrayArTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpConfig){
            return new FlexrayArTpConfigWrapper((FlexrayArTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayArTpNodeWrapper getFlexrayArTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpNode){
            return new FlexrayArTpNodeWrapper((FlexrayArTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayClusterWrapper getFlexrayCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCluster){
            return new FlexrayClusterWrapper((FlexrayCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayCommunicationConnectorWrapper getFlexrayCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCommunicationConnector){
            return new FlexrayCommunicationConnectorWrapper((FlexrayCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayCommunicationControllerWrapper getFlexrayCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCommunicationController){
            return new FlexrayCommunicationControllerWrapper((FlexrayCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameWrapper getFlexrayFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrame){
            return new FlexrayFrameWrapper((FlexrayFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameTriggeringWrapper getFlexrayFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrameTriggering){
            return new FlexrayFrameTriggeringWrapper((FlexrayFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayNmClusterWrapper getFlexrayNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayNmCluster){
            return new FlexrayNmClusterWrapper((FlexrayNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayNmNodeWrapper getFlexrayNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayNmNode){
            return new FlexrayNmNodeWrapper((FlexrayNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayPhysicalChannelWrapper getFlexrayPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayPhysicalChannel){
            return new FlexrayPhysicalChannelWrapper((FlexrayPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpConfigWrapper getFlexrayTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpConfig){
            return new FlexrayTpConfigWrapper((FlexrayTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpConnectionControlWrapper getFlexrayTpConnectionControl() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpConnectionControl){
            return new FlexrayTpConnectionControlWrapper((FlexrayTpConnectionControl) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpNodeWrapper getFlexrayTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpNode){
            return new FlexrayTpNodeWrapper((FlexrayTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpPduPoolWrapper getFlexrayTpPduPool() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpPduPool){
            return new FlexrayTpPduPoolWrapper((FlexrayTpPduPool) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FramePortWrapper getFramePort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FramePort){
            return new FramePortWrapper((FramePort) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FunctionInhibitionNeedsWrapper getFunctionInhibitionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FunctionInhibitionNeeds){
            return new FunctionInhibitionNeedsWrapper((FunctionInhibitionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GatewayWrapper getGateway() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Gateway){
            return new GatewayWrapper((Gateway) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralParameterWrapper getGeneralParameter() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralParameter){
            return new GeneralParameterWrapper((GeneralParameter) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposeIPduWrapper getGeneralPurposeIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposeIPdu){
            return new GeneralPurposeIPduWrapper((GeneralPurposeIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposePduWrapper getGeneralPurposePdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposePdu){
            return new GeneralPurposePduWrapper((GeneralPurposePdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GenericEthernetFrameWrapper getGenericEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GenericEthernetFrame){
            return new GenericEthernetFrameWrapper((GenericEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeCanMasterWrapper getGlobalTimeCanMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeCanMaster){
            return new GlobalTimeCanMasterWrapper((GlobalTimeCanMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeCanSlaveWrapper getGlobalTimeCanSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeCanSlave){
            return new GlobalTimeCanSlaveWrapper((GlobalTimeCanSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeDomainWrapper getGlobalTimeDomain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeDomain){
            return new GlobalTimeDomainWrapper((GlobalTimeDomain) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeEthMasterWrapper getGlobalTimeEthMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeEthMaster){
            return new GlobalTimeEthMasterWrapper((GlobalTimeEthMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeEthSlaveWrapper getGlobalTimeEthSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeEthSlave){
            return new GlobalTimeEthSlaveWrapper((GlobalTimeEthSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeFrMasterWrapper getGlobalTimeFrMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeFrMaster){
            return new GlobalTimeFrMasterWrapper((GlobalTimeFrMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeFrSlaveWrapper getGlobalTimeFrSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeFrSlave){
            return new GlobalTimeFrSlaveWrapper((GlobalTimeFrSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeGatewayWrapper getGlobalTimeGateway() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeGateway){
            return new GlobalTimeGatewayWrapper((GlobalTimeGateway) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwAttributeDefWrapper getHwAttributeDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwAttributeDef){
            return new HwAttributeDefWrapper((HwAttributeDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwAttributeLiteralDefWrapper getHwAttributeLiteralDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwAttributeLiteralDef){
            return new HwAttributeLiteralDefWrapper((HwAttributeLiteralDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwCategoryWrapper getHwCategory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwCategory){
            return new HwCategoryWrapper((HwCategory) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwElementWrapper getHwElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwPinWrapper getHwPin() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPin){
            return new HwPinWrapper((HwPin) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwPinGroupWrapper getHwPinGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwPinGroup){
            return new HwPinGroupWrapper((HwPinGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwTypeWrapper getHwType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwType){
            return new HwTypeWrapper((HwType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public IPduPortWrapper getIPduPort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof IPduPort){
            return new IPduPortWrapper((IPduPort) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalWrapper getISignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignal){
            return new ISignalWrapper((ISignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalGroupWrapper getISignalGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalGroup){
            return new ISignalGroupWrapper((ISignalGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalIPduWrapper getISignalIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPdu){
            return new ISignalIPduWrapper((ISignalIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalIPduGroupWrapper getISignalIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPduGroup){
            return new ISignalIPduGroupWrapper((ISignalIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalPortWrapper getISignalPort() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalPort){
            return new ISignalPortWrapper((ISignalPort) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalToIPduMappingWrapper getISignalToIPduMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalToIPduMapping){
            return new ISignalToIPduMappingWrapper((ISignalToIPduMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalTriggeringWrapper getISignalTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalTriggering){
            return new ISignalTriggeringWrapper((ISignalTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public Ieee1722TpEthernetFrameWrapper getIeee1722TpEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Ieee1722TpEthernetFrame){
            return new Ieee1722TpEthernetFrameWrapper((Ieee1722TpEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ImplementationDataTypeWrapper getImplementationDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataType){
            return new ImplementationDataTypeWrapper((ImplementationDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ImplementationDataTypeElementWrapper getImplementationDataTypeElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataTypeElement){
            return new ImplementationDataTypeElementWrapper((ImplementationDataTypeElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InitEventWrapper getInitEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InitEvent){
            return new InitEventWrapper((InitEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InternalTriggerOccurredEventWrapper getInternalTriggerOccurredEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggerOccurredEvent){
            return new InternalTriggerOccurredEventWrapper((InternalTriggerOccurredEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InternalTriggeringPointWrapper getInternalTriggeringPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InternalTriggeringPoint){
            return new InternalTriggeringPointWrapper((InternalTriggeringPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InterpolationRoutineMappingSetWrapper getInterpolationRoutineMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof InterpolationRoutineMappingSet){
            return new InterpolationRoutineMappingSetWrapper((InterpolationRoutineMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939ClusterWrapper getJ1939Cluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939Cluster){
            return new J1939ClusterWrapper((J1939Cluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939DcmIPduWrapper getJ1939DcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939DcmIPdu){
            return new J1939DcmIPduWrapper((J1939DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939NmClusterWrapper getJ1939NmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939NmCluster){
            return new J1939NmClusterWrapper((J1939NmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939NmNodeWrapper getJ1939NmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939NmNode){
            return new J1939NmNodeWrapper((J1939NmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939TpConfigWrapper getJ1939TpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939TpConfig){
            return new J1939TpConfigWrapper((J1939TpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939TpNodeWrapper getJ1939TpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939TpNode){
            return new J1939TpNodeWrapper((J1939TpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public KeywordWrapper getKeyword() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Keyword){
            return new KeywordWrapper((Keyword) queryObject);
        }else{
            return null;
        }
        
    }
    
    public KeywordSetWrapper getKeywordSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof KeywordSet){
            return new KeywordSetWrapper((KeywordSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LatencyTimingConstraintWrapper getLatencyTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LatencyTimingConstraint){
            return new LatencyTimingConstraintWrapper((LatencyTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleInfoSetWrapper getLifeCycleInfoSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleInfoSet){
            return new LifeCycleInfoSetWrapper((LifeCycleInfoSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleStateWrapper getLifeCycleState() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleState){
            return new LifeCycleStateWrapper((LifeCycleState) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleStateDefinitionGroupWrapper getLifeCycleStateDefinitionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleStateDefinitionGroup){
            return new LifeCycleStateDefinitionGroupWrapper((LifeCycleStateDefinitionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinClusterWrapper getLinCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCluster){
            return new LinClusterWrapper((LinCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinCommunicationConnectorWrapper getLinCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCommunicationConnector){
            return new LinCommunicationConnectorWrapper((LinCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinEventTriggeredFrameWrapper getLinEventTriggeredFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinEventTriggeredFrame){
            return new LinEventTriggeredFrameWrapper((LinEventTriggeredFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinFrameTriggeringWrapper getLinFrameTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinFrameTriggering){
            return new LinFrameTriggeringWrapper((LinFrameTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinMasterWrapper getLinMaster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinMaster){
            return new LinMasterWrapper((LinMaster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinPhysicalChannelWrapper getLinPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinPhysicalChannel){
            return new LinPhysicalChannelWrapper((LinPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinScheduleTableWrapper getLinScheduleTable() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinScheduleTable){
            return new LinScheduleTableWrapper((LinScheduleTable) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSlaveWrapper getLinSlave() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSlave){
            return new LinSlaveWrapper((LinSlave) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSporadicFrameWrapper getLinSporadicFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSporadicFrame){
            return new LinSporadicFrameWrapper((LinSporadicFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinTpConfigWrapper getLinTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinTpConfig){
            return new LinTpConfigWrapper((LinTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinTpNodeWrapper getLinTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinTpNode){
            return new LinTpNodeWrapper((LinTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinUnconditionalFrame){
            return new LinUnconditionalFrameWrapper((LinUnconditionalFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinkerWrapper getLinker() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Linker){
            return new LinkerWrapper((Linker) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LogicAddressWrapper getLogicAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LogicAddress){
            return new LogicAddressWrapper((LogicAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MacMulticastGroupWrapper getMacMulticastGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MacMulticastGroup){
            return new MacMulticastGroupWrapper((MacMulticastGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public McDataInstanceWrapper getMcDataInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof McDataInstance){
            return new McDataInstanceWrapper((McDataInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public McFunctionWrapper getMcFunction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof McFunction){
            return new McFunctionWrapper((McFunction) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MeasuredExecutionTimeWrapper getMeasuredExecutionTime() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MeasuredExecutionTime){
            return new MeasuredExecutionTimeWrapper((MeasuredExecutionTime) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MeasuredHeapUsageWrapper getMeasuredHeapUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MeasuredHeapUsage){
            return new MeasuredHeapUsageWrapper((MeasuredHeapUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MeasuredStackUsageWrapper getMeasuredStackUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MeasuredStackUsage){
            return new MeasuredStackUsageWrapper((MeasuredStackUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MemorySectionWrapper getMemorySection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MemorySection){
            return new MemorySectionWrapper((MemorySection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeAccessPointIdentWrapper getModeAccessPointIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeAccessPointIdent){
            return new ModeAccessPointIdentWrapper((ModeAccessPointIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationWrapper getModeDeclaration() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclaration){
            return new ModeDeclarationWrapper((ModeDeclaration) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationGroupWrapper getModeDeclarationGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroup){
            return new ModeDeclarationGroupWrapper((ModeDeclarationGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationGroupPrototypeWrapper getModeDeclarationGroupPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroupPrototype){
            return new ModeDeclarationGroupPrototypeWrapper((ModeDeclarationGroupPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationMappingWrapper getModeDeclarationMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationMapping){
            return new ModeDeclarationMappingWrapper((ModeDeclarationMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationMappingSetWrapper getModeDeclarationMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationMappingSet){
            return new ModeDeclarationMappingSetWrapper((ModeDeclarationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeInterfaceMappingWrapper getModeInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeInterfaceMapping){
            return new ModeInterfaceMappingWrapper((ModeInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchInterfaceWrapper getModeSwitchInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchInterface){
            return new ModeSwitchInterfaceWrapper((ModeSwitchInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchPointWrapper getModeSwitchPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchPoint){
            return new ModeSwitchPointWrapper((ModeSwitchPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchedAckEventWrapper getModeSwitchedAckEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchedAckEvent){
            return new ModeSwitchedAckEventWrapper((ModeSwitchedAckEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeTransitionWrapper getModeTransition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeTransition){
            return new ModeTransitionWrapper((ModeTransition) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MultiplexedIPduWrapper getMultiplexedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof MultiplexedIPdu){
            return new MultiplexedIPduWrapper((MultiplexedIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NPduWrapper getNPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NPdu){
            return new NPduWrapper((NPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NetworkEndpointWrapper getNetworkEndpoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NetworkEndpoint){
            return new NetworkEndpointWrapper((NetworkEndpoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmConfigWrapper getNmConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmConfig){
            return new NmConfigWrapper((NmConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmEcuWrapper getNmEcu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmEcu){
            return new NmEcuWrapper((NmEcu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockDescriptorWrapper getNvBlockDescriptor() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockDescriptor){
            return new NvBlockDescriptorWrapper((NvBlockDescriptor) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockNeedsWrapper getNvBlockNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockNeeds){
            return new NvBlockNeedsWrapper((NvBlockNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockSwComponentTypeWrapper getNvBlockSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvBlockSwComponentType){
            return new NvBlockSwComponentTypeWrapper((NvBlockSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvDataInterfaceWrapper getNvDataInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvDataInterface){
            return new NvDataInterfaceWrapper((NvDataInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdControlServiceNeedsWrapper getObdControlServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdControlServiceNeeds){
            return new ObdControlServiceNeedsWrapper((ObdControlServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdInfoServiceNeedsWrapper getObdInfoServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdInfoServiceNeeds){
            return new ObdInfoServiceNeedsWrapper((ObdInfoServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdMonitorServiceNeedsWrapper getObdMonitorServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdMonitorServiceNeeds){
            return new ObdMonitorServiceNeedsWrapper((ObdMonitorServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdPidServiceNeedsWrapper getObdPidServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdPidServiceNeeds){
            return new ObdPidServiceNeedsWrapper((ObdPidServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ObdRatioServiceNeedsWrapper getObdRatioServiceNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ObdRatioServiceNeeds){
            return new ObdRatioServiceNeedsWrapper((ObdRatioServiceNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public OffsetTimingConstraintWrapper getOffsetTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof OffsetTimingConstraint){
            return new OffsetTimingConstraintWrapper((OffsetTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public OperationInvokedEventWrapper getOperationInvokedEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof OperationInvokedEvent){
            return new OperationInvokedEventWrapper((OperationInvokedEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PPortPrototypeWrapper getPPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PPortPrototype){
            return new PPortPrototypeWrapper((PPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PrPortPrototypeWrapper getPrPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PrPortPrototype){
            return new PrPortPrototypeWrapper((PrPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterAccessWrapper getParameterAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterAccess){
            return new ParameterAccessWrapper((ParameterAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterDataPrototypeWrapper getParameterDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterDataPrototype){
            return new ParameterDataPrototypeWrapper((ParameterDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterInterfaceWrapper getParameterInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterInterface){
            return new ParameterInterfaceWrapper((ParameterInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterSwComponentTypeWrapper getParameterSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterSwComponentType){
            return new ParameterSwComponentTypeWrapper((ParameterSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PassThroughSwConnectorWrapper getPassThroughSwConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PassThroughSwConnector){
            return new PassThroughSwConnectorWrapper((PassThroughSwConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PduToFrameMappingWrapper getPduToFrameMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PduToFrameMapping){
            return new PduToFrameMappingWrapper((PduToFrameMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PduTriggeringWrapper getPduTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PduTriggering){
            return new PduTriggeringWrapper((PduTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PdurIPduGroupWrapper getPdurIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PdurIPduGroup){
            return new PdurIPduGroupWrapper((PdurIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PerInstanceMemoryWrapper getPerInstanceMemory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PerInstanceMemory){
            return new PerInstanceMemoryWrapper((PerInstanceMemory) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PeriodicEventTriggeringWrapper getPeriodicEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PeriodicEventTriggering){
            return new PeriodicEventTriggeringWrapper((PeriodicEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PhysicalDimensionWrapper getPhysicalDimension() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PhysicalDimension){
            return new PhysicalDimensionWrapper((PhysicalDimension) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PhysicalDimensionMappingSetWrapper getPhysicalDimensionMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PhysicalDimensionMappingSet){
            return new PhysicalDimensionMappingSetWrapper((PhysicalDimensionMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortGroupWrapper getPortGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortGroup){
            return new PortGroupWrapper((PortGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortInterfaceMappingSetWrapper getPortInterfaceMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortInterfaceMappingSet){
            return new PortInterfaceMappingSetWrapper((PortInterfaceMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortPrototypeBlueprintWrapper getPortPrototypeBlueprint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortPrototypeBlueprint){
            return new PortPrototypeBlueprintWrapper((PortPrototypeBlueprint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PostBuildVariantCriterionWrapper getPostBuildVariantCriterion() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PostBuildVariantCriterion){
            return new PostBuildVariantCriterionWrapper((PostBuildVariantCriterion) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PostBuildVariantCriterionValueSetWrapper getPostBuildVariantCriterionValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PostBuildVariantCriterionValueSet){
            return new PostBuildVariantCriterionValueSetWrapper((PostBuildVariantCriterionValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PredefinedVariantWrapper getPredefinedVariant() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PredefinedVariant){
            return new PredefinedVariantWrapper((PredefinedVariant) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ProvidedServiceInstanceWrapper getProvidedServiceInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ProvidedServiceInstance){
            return new ProvidedServiceInstanceWrapper((ProvidedServiceInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RPortPrototypeWrapper getRPortPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RPortPrototype){
            return new RPortPrototypeWrapper((RPortPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RapidPrototypingScenarioWrapper getRapidPrototypingScenario() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RapidPrototypingScenario){
            return new RapidPrototypingScenarioWrapper((RapidPrototypingScenario) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ResourceConsumptionWrapper getResourceConsumption() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ResourceConsumption){
            return new ResourceConsumptionWrapper((ResourceConsumption) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RootSwCompositionPrototypeWrapper getRootSwCompositionPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RootSwCompositionPrototype){
            return new RootSwCompositionPrototypeWrapper((RootSwCompositionPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RoughEstimateHeapUsageWrapper getRoughEstimateHeapUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RoughEstimateHeapUsage){
            return new RoughEstimateHeapUsageWrapper((RoughEstimateHeapUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RoughEstimateOfExecutionTimeWrapper getRoughEstimateOfExecutionTime() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RoughEstimateOfExecutionTime){
            return new RoughEstimateOfExecutionTimeWrapper((RoughEstimateOfExecutionTime) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RoughEstimateStackUsageWrapper getRoughEstimateStackUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RoughEstimateStackUsage){
            return new RoughEstimateStackUsageWrapper((RoughEstimateStackUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RptContainerWrapper getRptContainer() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RptContainer){
            return new RptContainerWrapper((RptContainer) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RunnableEntityWrapper getRunnableEntity() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntity){
            return new RunnableEntityWrapper((RunnableEntity) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RunnableEntityGroupWrapper getRunnableEntityGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RunnableEntityGroup){
            return new RunnableEntityGroupWrapper((RunnableEntityGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SecuredIPduWrapper getSecuredIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SecuredIPdu){
            return new SecuredIPduWrapper((SecuredIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SenderReceiverInterfaceWrapper getSenderReceiverInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SenderReceiverInterface){
            return new SenderReceiverInterfaceWrapper((SenderReceiverInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SensorActuatorSwComponentTypeWrapper getSensorActuatorSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SensorActuatorSwComponentType){
            return new SensorActuatorSwComponentTypeWrapper((SensorActuatorSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SerializationTechnologyWrapper getSerializationTechnology() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SerializationTechnology){
            return new SerializationTechnologyWrapper((SerializationTechnology) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ServiceProxySwComponentTypeWrapper getServiceProxySwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceProxySwComponentType){
            return new ServiceProxySwComponentTypeWrapper((ServiceProxySwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ServiceSwComponentTypeWrapper getServiceSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceSwComponentType){
            return new ServiceSwComponentTypeWrapper((ServiceSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SimulatedExecutionTimeWrapper getSimulatedExecutionTime() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SimulatedExecutionTime){
            return new SimulatedExecutionTimeWrapper((SimulatedExecutionTime) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SoAdRoutingGroupWrapper getSoAdRoutingGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SoAdRoutingGroup){
            return new SoAdRoutingGroupWrapper((SoAdRoutingGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SocketAddressWrapper getSocketAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SocketAddress){
            return new SocketAddressWrapper((SocketAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SporadicEventTriggeringWrapper getSporadicEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SporadicEventTriggering){
            return new SporadicEventTriggeringWrapper((SporadicEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public StructuredReqWrapper getStructuredReq() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof StructuredReq){
            return new StructuredReqWrapper((StructuredReq) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SupervisedEntityNeedsWrapper getSupervisedEntityNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SupervisedEntityNeeds){
            return new SupervisedEntityNeedsWrapper((SupervisedEntityNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwAddrMethodWrapper getSwAddrMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwAddrMethod){
            return new SwAddrMethodWrapper((SwAddrMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwAxisTypeWrapper getSwAxisType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwAxisType){
            return new SwAxisTypeWrapper((SwAxisType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwBaseTypeWrapper getSwBaseType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwBaseType){
            return new SwBaseTypeWrapper((SwBaseType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwComponentPrototypeWrapper getSwComponentPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwComponentPrototype){
            return new SwComponentPrototypeWrapper((SwComponentPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwGenericAxisParamTypeWrapper getSwGenericAxisParamType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwGenericAxisParamType){
            return new SwGenericAxisParamTypeWrapper((SwGenericAxisParamType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwRecordLayoutWrapper getSwRecordLayout() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwRecordLayout){
            return new SwRecordLayoutWrapper((SwRecordLayout) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwServiceArgWrapper getSwServiceArg() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwServiceArg){
            return new SwServiceArgWrapper((SwServiceArg) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwSystemconstWrapper getSwSystemconst() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwSystemconst){
            return new SwSystemconstWrapper((SwSystemconst) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwSystemconstantValueSetWrapper getSwSystemconstantValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwSystemconstantValueSet){
            return new SwSystemconstantValueSetWrapper((SwSystemconstantValueSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcBswMappingWrapper getSwcBswMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcBswMapping){
            return new SwcBswMappingWrapper((SwcBswMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcImplementationWrapper getSwcImplementation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcImplementation){
            return new SwcImplementationWrapper((SwcImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcInternalBehaviorWrapper getSwcInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcInternalBehavior){
            return new SwcInternalBehaviorWrapper((SwcInternalBehavior) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcModeManagerErrorEventWrapper getSwcModeManagerErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcModeManagerErrorEvent){
            return new SwcModeManagerErrorEventWrapper((SwcModeManagerErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcModeSwitchEventWrapper getSwcModeSwitchEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcModeSwitchEvent){
            return new SwcModeSwitchEventWrapper((SwcModeSwitchEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcServiceDependencyWrapper getSwcServiceDependency() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcServiceDependency){
            return new SwcServiceDependencyWrapper((SwcServiceDependency) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcTimingWrapper getSwcTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcTiming){
            return new SwcTimingWrapper((SwcTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcToEcuMappingWrapper getSwcToEcuMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcToEcuMapping){
            return new SwcToEcuMappingWrapper((SwcToEcuMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcToImplMappingWrapper getSwcToImplMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcToImplMapping){
            return new SwcToImplMappingWrapper((SwcToImplMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SyncTimeBaseMgrUserNeedsWrapper getSyncTimeBaseMgrUserNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SyncTimeBaseMgrUserNeeds){
            return new SyncTimeBaseMgrUserNeedsWrapper((SyncTimeBaseMgrUserNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SynchronizationTimingConstraintWrapper getSynchronizationTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SynchronizationTimingConstraint){
            return new SynchronizationTimingConstraintWrapper((SynchronizationTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SynchronousServerCallPointWrapper getSynchronousServerCallPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SynchronousServerCallPoint){
            return new SynchronousServerCallPointWrapper((SynchronousServerCallPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemWrapper getSystem() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof System){
            return new SystemWrapper((System) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemMappingWrapper getSystemMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemMapping){
            return new SystemMappingWrapper((SystemMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemSignalWrapper getSystemSignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignal){
            return new SystemSignalWrapper((SystemSignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemSignalGroupWrapper getSystemSignalGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemSignalGroup){
            return new SystemSignalGroupWrapper((SystemSignalGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemTimingWrapper getSystemTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemTiming){
            return new SystemTimingWrapper((SystemTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TdEventBswInternalBehaviorWrapper getTdEventBswInternalBehavior() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TdEventVfbReference){
            return new TdEventVfbReferenceWrapper((TdEventVfbReference) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TimingDescriptionEventChainWrapper getTimingDescriptionEventChain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingDescriptionEventChain){
            return new TimingDescriptionEventChainWrapper((TimingDescriptionEventChain) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TimingEventWrapper getTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingEvent){
            return new TimingEventWrapper((TimingEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public Topic1Wrapper getTopic1() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Topic1){
            return new Topic1Wrapper((Topic1) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TpAddressWrapper getTpAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TpAddress){
            return new TpAddressWrapper((TpAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TraceableTextWrapper getTraceableText() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TraceableText){
            return new TraceableTextWrapper((TraceableText) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TransformationTechnologyWrapper getTransformationTechnology() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TransformationTechnology){
            return new TransformationTechnologyWrapper((TransformationTechnology) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TransformerHardErrorEventWrapper getTransformerHardErrorEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TransformerHardErrorEvent){
            return new TransformerHardErrorEventWrapper((TransformerHardErrorEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerWrapper getTrigger() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Trigger){
            return new TriggerWrapper((Trigger) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceWrapper getTriggerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterface){
            return new TriggerInterfaceWrapper((TriggerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceMappingWrapper getTriggerInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterfaceMapping){
            return new TriggerInterfaceMappingWrapper((TriggerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanClusterWrapper getTtcanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCluster){
            return new TtcanClusterWrapper((TtcanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanCommunicationConnectorWrapper getTtcanCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCommunicationConnector){
            return new TtcanCommunicationConnectorWrapper((TtcanCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanCommunicationControllerWrapper getTtcanCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCommunicationController){
            return new TtcanCommunicationControllerWrapper((TtcanCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanPhysicalChannelWrapper getTtcanPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanPhysicalChannel){
            return new TtcanPhysicalChannelWrapper((TtcanPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UdpNmClusterWrapper getUdpNmCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UdpNmCluster){
            return new UdpNmClusterWrapper((UdpNmCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UdpNmNodeWrapper getUdpNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UdpNmNode){
            return new UdpNmNodeWrapper((UdpNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UnitWrapper getUnit() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Unit){
            return new UnitWrapper((Unit) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UnitGroupWrapper getUnitGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UnitGroup){
            return new UnitGroupWrapper((UnitGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedClusterWrapper getUserDefinedCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCluster){
            return new UserDefinedClusterWrapper((UserDefinedCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedCommunicationConnectorWrapper getUserDefinedCommunicationConnector() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCommunicationConnector){
            return new UserDefinedCommunicationConnectorWrapper((UserDefinedCommunicationConnector) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedCommunicationControllerWrapper getUserDefinedCommunicationController() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCommunicationController){
            return new UserDefinedCommunicationControllerWrapper((UserDefinedCommunicationController) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedEthernetFrameWrapper getUserDefinedEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedEthernetFrame){
            return new UserDefinedEthernetFrameWrapper((UserDefinedEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedIPduWrapper getUserDefinedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedIPdu){
            return new UserDefinedIPduWrapper((UserDefinedIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedPduWrapper getUserDefinedPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedPdu){
            return new UserDefinedPduWrapper((UserDefinedPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedPhysicalChannelWrapper getUserDefinedPhysicalChannel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedPhysicalChannel){
            return new UserDefinedPhysicalChannelWrapper((UserDefinedPhysicalChannel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableAccessWrapper getVariableAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAccess){
            return new VariableAccessWrapper((VariableAccess) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableAndParameterInterfaceMappingWrapper getVariableAndParameterInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAndParameterInterfaceMapping){
            return new VariableAndParameterInterfaceMappingWrapper((VariableAndParameterInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableDataPrototypeWrapper getVariableDataPrototype() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableDataPrototype){
            return new VariableDataPrototypeWrapper((VariableDataPrototype) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariationPointProxyWrapper getVariationPointProxy() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariationPointProxy){
            return new VariationPointProxyWrapper((VariationPointProxy) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VfbTimingWrapper getVfbTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VfbTiming){
            return new VfbTimingWrapper((VfbTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ViewMapWrapper getViewMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ViewMap){
            return new ViewMapWrapper((ViewMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ViewMapSetWrapper getViewMapSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ViewMapSet){
            return new ViewMapSetWrapper((ViewMapSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VlanConfigWrapper getVlanConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VlanConfig){
            return new VlanConfigWrapper((VlanConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public WaitPointWrapper getWaitPoint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof WaitPoint){
            return new WaitPointWrapper((WaitPoint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public WarningIndicatorRequestedBitNeedsWrapper getWarningIndicatorRequestedBitNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof WarningIndicatorRequestedBitNeeds){
            return new WarningIndicatorRequestedBitNeedsWrapper((WarningIndicatorRequestedBitNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public WorstCaseHeapUsageWrapper getWorstCaseHeapUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof WorstCaseHeapUsage){
            return new WorstCaseHeapUsageWrapper((WorstCaseHeapUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public WorstCaseStackUsageWrapper getWorstCaseStackUsage() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof WorstCaseStackUsage){
            return new WorstCaseStackUsageWrapper((WorstCaseStackUsage) queryObject);
        }else{
            return null;
        }
        
    }
    
    public XcpPduWrapper getXcpPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = elementRef.getValue();
        java.lang.String type = elementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof XcpPdu){
            return new XcpPduWrapper((XcpPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
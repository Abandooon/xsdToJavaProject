package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.Collection;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.Documentation;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     
         import stdgui.data.model.orimodel.System;
     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class EvaluatedElementRefWrapper {

    
    
    private EvaluatedElementRef evaluatedElementRef;

    public EvaluatedElementRefWrapper(EvaluatedElementRef evaluatedElementRef) {
        this.evaluatedElementRef = evaluatedElementRef;
    }

   
    public CollectableElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(evaluatedElementRef.getDest())) {
            
            return evaluatedElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEvaluatedElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AclRole){
            return new AclRoleWrapper((AclRole) queryObject);
        }else{
            return null;
        }
        
    }
    
    public AliasNameSetWrapper getAliasNameSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AliasNameSet){
            return new AliasNameSetWrapper((AliasNameSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationArrayDataTypeWrapper getApplicationArrayDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationArrayDataType){
            return new ApplicationArrayDataTypeWrapper((ApplicationArrayDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationPrimitiveDataTypeWrapper getApplicationPrimitiveDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordDataType){
            return new ApplicationRecordDataTypeWrapper((ApplicationRecordDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ApplicationSwComponentTypeWrapper getApplicationSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationSwComponentType){
            return new ApplicationSwComponentTypeWrapper((ApplicationSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BlueprintMappingSetWrapper getBlueprintMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BlueprintMappingSet){
            return new BlueprintMappingSetWrapper((BlueprintMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswImplementationWrapper getBswImplementation() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswImplementation){
            return new BswImplementationWrapper((BswImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleDescriptionWrapper getBswModuleDescription() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleTiming){
            return new BswModuleTimingWrapper((BswModuleTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BuildActionManifestWrapper getBuildActionManifest() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionManifest){
            return new BuildActionManifestWrapper((BuildActionManifest) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CalibrationParameterValueSetWrapper getCalibrationParameterValueSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanCluster){
            return new CanClusterWrapper((CanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanFrameWrapper getCanFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanFrame){
            return new CanFrameWrapper((CanFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CanTpConfigWrapper getCanTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpConfig){
            return new CanTpConfigWrapper((CanTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientIdDefinitionSetWrapper getClientIdDefinitionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterface){
            return new ClientServerInterfaceWrapper((ClientServerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CollectionWrapper getCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Collection){
            return new CollectionWrapper((Collection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComplexDeviceDriverSwComponentTypeWrapper getComplexDeviceDriverSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompuMethod){
            return new CompuMethodWrapper((CompuMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsistencyNeedsBlueprintSetWrapper getConsistencyNeedsBlueprintSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConstantSpecificationMappingSet){
            return new ConstantSpecificationMappingSetWrapper((ConstantSpecificationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ContainerIPduWrapper getContainerIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingElement){
            return new CouplingElementWrapper((CouplingElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataConstrWrapper getDataConstr() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataConstr){
            return new DataConstrWrapper((DataConstr) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataTransformationSetWrapper getDataTransformationSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTypeMappingSet){
            return new DataTypeMappingSetWrapper((DataTypeMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DcmIPduWrapper getDcmIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DcmIPdu){
            return new DcmIPduWrapper((DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticAccessPermissionWrapper getDiagnosticAccessPermission() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControlClass){
            return new DiagnosticComControlClassWrapper((DiagnosticComControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticConnectionWrapper getDiagnosticConnection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticCustomServiceClass){
            return new DiagnosticCustomServiceClassWrapper((DiagnosticCustomServiceClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticDataIdentifierWrapper getDiagnosticDataIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionGroup){
            return new DiagnosticEnableConditionGroupWrapper((DiagnosticEnableConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEnableConditionPortMappingWrapper getDiagnosticEnableConditionPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEvent){
            return new DiagnosticEventWrapper((DiagnosticEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticEventPortMappingWrapper getDiagnosticEventPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticIoControlClass){
            return new DiagnosticIoControlClassWrapper((DiagnosticIoControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticMemoryDestinationMirrorWrapper getDiagnosticMemoryDestinationMirror() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticOperationCycle){
            return new DiagnosticOperationCycleWrapper((DiagnosticOperationCycle) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticOperationCyclePortMappingWrapper getDiagnosticOperationCyclePortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRequestFileTransferClass){
            return new DiagnosticRequestFileTransferClassWrapper((DiagnosticRequestFileTransferClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticRequestUploadWrapper getDiagnosticRequestUpload() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutineControlClass){
            return new DiagnosticRoutineControlClassWrapper((DiagnosticRoutineControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticSecurityAccessWrapper getDiagnosticSecurityAccess() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticSessionControlClass){
            return new DiagnosticSessionControlClassWrapper((DiagnosticSessionControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionWrapper getDiagnosticStorageCondition() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticStorageConditionGroup){
            return new DiagnosticStorageConditionGroupWrapper((DiagnosticStorageConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticStorageConditionPortMappingWrapper getDiagnosticStorageConditionPortMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticTroubleCodeUds){
            return new DiagnosticTroubleCodeUdsWrapper((DiagnosticTroubleCodeUds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticWriteDataByIdentifierWrapper getDiagnosticWriteDataByIdentifier() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddressClass){
            return new DiagnosticWriteMemoryByAddressClassWrapper((DiagnosticWriteMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DoIpTpConfigWrapper getDoIpTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Documentation){
            return new DocumentationWrapper((Documentation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuAbstractionSwComponentTypeWrapper getEcuAbstractionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuInstance){
            return new EcuInstanceWrapper((EcuInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuTimingWrapper getEcuTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuTiming){
            return new EcuTimingWrapper((EcuTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDefinitionCollectionWrapper getEcucDefinitionCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDefinitionCollection){
            return new EcucDefinitionCollectionWrapper((EcucDefinitionCollection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDestinationUriDefSetWrapper getEcucDestinationUriDefSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDestinationUriDefSet){
            return new EcucDestinationUriDefSetWrapper((EcucDestinationUriDefSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucModuleConfigurationValuesWrapper getEcucModuleConfigurationValues() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucValueCollectionWrapper getEcucValueCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucValueCollection){
            return new EcucValueCollectionWrapper((EcucValueCollection) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EndToEndProtectionSetWrapper getEndToEndProtectionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetCluster){
            return new EthernetClusterWrapper((EthernetCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EthernetFrameWrapper getEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EthernetFrame){
            return new EthernetFrameWrapper((EthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EvaluatedVariantSetWrapper getEvaluatedVariantSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EvaluatedVariantSet){
            return new EvaluatedVariantSetWrapper((EvaluatedVariantSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureWrapper getFmFeature() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureMap){
            return new FmFeatureMapWrapper((FmFeatureMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureModelWrapper getFmFeatureModel() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureModel){
            return new FmFeatureModelWrapper((FmFeatureModel) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FmFeatureSelectionSetWrapper getFmFeatureSelectionSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FmFeatureSelectionSet){
            return new FmFeatureSelectionSetWrapper((FmFeatureSelectionSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlatMapWrapper getFlatMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpConfig){
            return new FlexrayArTpConfigWrapper((FlexrayArTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayClusterWrapper getFlexrayCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayCluster){
            return new FlexrayClusterWrapper((FlexrayCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayFrameWrapper getFlexrayFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayFrame){
            return new FlexrayFrameWrapper((FlexrayFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayTpConfigWrapper getFlexrayTpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpConfig){
            return new FlexrayTpConfigWrapper((FlexrayTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GatewayWrapper getGateway() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof Gateway){
            return new GatewayWrapper((Gateway) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GeneralPurposeIPduWrapper getGeneralPurposeIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GenericEthernetFrame){
            return new GenericEthernetFrameWrapper((GenericEthernetFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public GlobalTimeDomainWrapper getGlobalTimeDomain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GlobalTimeDomain){
            return new GlobalTimeDomainWrapper((GlobalTimeDomain) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwCategoryWrapper getHwCategory() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    public HwTypeWrapper getHwType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwType){
            return new HwTypeWrapper((HwType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ISignalWrapper getISignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPduGroup){
            return new ISignalIPduGroupWrapper((ISignalIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public Ieee1722TpEthernetFrameWrapper getIeee1722TpEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataType){
            return new ImplementationDataTypeWrapper((ImplementationDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public InterpolationRoutineMappingSetWrapper getInterpolationRoutineMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939DcmIPdu){
            return new J1939DcmIPduWrapper((J1939DcmIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939TpConfigWrapper getJ1939TpConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939TpConfig){
            return new J1939TpConfigWrapper((J1939TpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public KeywordSetWrapper getKeywordSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof KeywordSet){
            return new KeywordSetWrapper((KeywordSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleInfoSetWrapper getLifeCycleInfoSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleInfoSet){
            return new LifeCycleInfoSetWrapper((LifeCycleInfoSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleStateDefinitionGroupWrapper getLifeCycleStateDefinitionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinCluster){
            return new LinClusterWrapper((LinCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinEventTriggeredFrameWrapper getLinEventTriggeredFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinEventTriggeredFrame){
            return new LinEventTriggeredFrameWrapper((LinEventTriggeredFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinSporadicFrameWrapper getLinSporadicFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinTpConfig){
            return new LinTpConfigWrapper((LinTpConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LinUnconditionalFrameWrapper getLinUnconditionalFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinUnconditionalFrame){
            return new LinUnconditionalFrameWrapper((LinUnconditionalFrame) queryObject);
        }else{
            return null;
        }
        
    }
    
    public McFunctionWrapper getMcFunction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof McFunction){
            return new McFunctionWrapper((McFunction) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationGroupWrapper getModeDeclarationGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroup){
            return new ModeDeclarationGroupWrapper((ModeDeclarationGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationMappingSetWrapper getModeDeclarationMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationMappingSet){
            return new ModeDeclarationMappingSetWrapper((ModeDeclarationMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeSwitchInterfaceWrapper getModeSwitchInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchInterface){
            return new ModeSwitchInterfaceWrapper((ModeSwitchInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public MultiplexedIPduWrapper getMultiplexedIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NPdu){
            return new NPduWrapper((NPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmConfigWrapper getNmConfig() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmConfig){
            return new NmConfigWrapper((NmConfig) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockSwComponentTypeWrapper getNvBlockSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NvDataInterface){
            return new NvDataInterfaceWrapper((NvDataInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ParameterInterfaceWrapper getParameterInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterSwComponentType){
            return new ParameterSwComponentTypeWrapper((ParameterSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PdurIPduGroupWrapper getPdurIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PdurIPduGroup){
            return new PdurIPduGroupWrapper((PdurIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PhysicalDimensionWrapper getPhysicalDimension() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PhysicalDimensionMappingSet){
            return new PhysicalDimensionMappingSetWrapper((PhysicalDimensionMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortInterfaceMappingSetWrapper getPortInterfaceMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PredefinedVariant){
            return new PredefinedVariantWrapper((PredefinedVariant) queryObject);
        }else{
            return null;
        }
        
    }
    
    public RapidPrototypingScenarioWrapper getRapidPrototypingScenario() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof RapidPrototypingScenario){
            return new RapidPrototypingScenarioWrapper((RapidPrototypingScenario) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SecuredIPduWrapper getSecuredIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceSwComponentType){
            return new ServiceSwComponentTypeWrapper((ServiceSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SoAdRoutingGroupWrapper getSoAdRoutingGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SoAdRoutingGroup){
            return new SoAdRoutingGroupWrapper((SoAdRoutingGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwAddrMethodWrapper getSwAddrMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwBaseType){
            return new SwBaseTypeWrapper((SwBaseType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwRecordLayoutWrapper getSwRecordLayout() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwRecordLayout){
            return new SwRecordLayoutWrapper((SwRecordLayout) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwSystemconstWrapper getSwSystemconst() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcImplementation){
            return new SwcImplementationWrapper((SwcImplementation) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwcTimingWrapper getSwcTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwcTiming){
            return new SwcTimingWrapper((SwcTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemWrapper getSystem() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof System){
            return new SystemWrapper((System) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SystemSignalWrapper getSystemSignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SystemTiming){
            return new SystemTimingWrapper((SystemTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceWrapper getTriggerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterface){
            return new TriggerInterfaceWrapper((TriggerInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TtcanClusterWrapper getTtcanCluster() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TtcanCluster){
            return new TtcanClusterWrapper((TtcanCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UnitWrapper getUnit() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedCluster){
            return new UserDefinedClusterWrapper((UserDefinedCluster) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UserDefinedEthernetFrameWrapper getUserDefinedEthernetFrame() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UserDefinedPdu){
            return new UserDefinedPduWrapper((UserDefinedPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VfbTimingWrapper getVfbTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VfbTiming){
            return new VfbTimingWrapper((VfbTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ViewMapSetWrapper getViewMapSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ViewMapSet){
            return new ViewMapSetWrapper((ViewMapSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public XcpPduWrapper getXcpPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = evaluatedElementRef.getValue();
        java.lang.String type = evaluatedElementRef.getDest().toString().replace("_", "-");
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
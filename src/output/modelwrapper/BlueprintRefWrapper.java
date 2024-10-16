package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class BlueprintRefWrapper {

    
    
    private BlueprintRef blueprintRef;

    public BlueprintRefWrapper(BlueprintRef blueprintRef) {
        this.blueprintRef = blueprintRef;
    }

   
    public AtpBlueprintSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(blueprintRef.getDest())) {
            
            return blueprintRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getBlueprintRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationSwComponentType){
            return new ApplicationSwComponentTypeWrapper((ApplicationSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BswModuleDescriptionWrapper getBswModuleDescription() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleEntry){
            return new BswModuleEntryWrapper((BswModuleEntry) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BuildActionWrapper getBuildAction() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BuildActionManifest){
            return new BuildActionManifestWrapper((BuildActionManifest) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ClientServerInterfaceWrapper getClientServerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ClientServerInterfaceMapping){
            return new ClientServerInterfaceMappingWrapper((ClientServerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ComplexDeviceDriverSwComponentTypeWrapper getComplexDeviceDriverSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CompuMethod){
            return new CompuMethodWrapper((CompuMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConsistencyNeedsWrapper getConsistencyNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsistencyNeeds){
            return new ConsistencyNeedsWrapper((ConsistencyNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataConstrWrapper getDataConstr() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataConstr){
            return new DataConstrWrapper((DataConstr) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DataTypeMappingSetWrapper getDataTypeMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataTypeMappingSet){
            return new DataTypeMappingSetWrapper((DataTypeMappingSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcuAbstractionSwComponentTypeWrapper getEcuAbstractionSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcuAbstractionSwComponentType){
            return new EcuAbstractionSwComponentTypeWrapper((EcuAbstractionSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucDefinitionCollectionWrapper getEcucDefinitionCollection() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucDestinationUriDefSet){
            return new EcucDestinationUriDefSetWrapper((EcucDestinationUriDefSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EcucModuleDefWrapper getEcucModuleDef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EcucModuleDef){
            return new EcucModuleDefWrapper((EcucModuleDef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlatMapWrapper getFlatMap() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlatMap){
            return new FlatMapWrapper((FlatMap) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ImplementationDataTypeWrapper getImplementationDataType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ImplementationDataType){
            return new ImplementationDataTypeWrapper((ImplementationDataType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public KeywordSetWrapper getKeywordSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof KeywordSet){
            return new KeywordSetWrapper((KeywordSet) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LifeCycleStateWrapper getLifeCycleState() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LifeCycleStateDefinitionGroup){
            return new LifeCycleStateDefinitionGroupWrapper((LifeCycleStateDefinitionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeDeclarationGroupWrapper getModeDeclarationGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeDeclarationGroup){
            return new ModeDeclarationGroupWrapper((ModeDeclarationGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ModeInterfaceMappingWrapper getModeInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ModeSwitchInterface){
            return new ModeSwitchInterfaceWrapper((ModeSwitchInterface) queryObject);
        }else{
            return null;
        }
        
    }
    
    public NvBlockSwComponentTypeWrapper getNvBlockSwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ParameterSwComponentType){
            return new ParameterSwComponentTypeWrapper((ParameterSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PortInterfaceMappingSetWrapper getPortInterfaceMappingSet() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PortPrototypeBlueprint){
            return new PortPrototypeBlueprintWrapper((PortPrototypeBlueprint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SenderReceiverInterfaceWrapper getSenderReceiverInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SensorActuatorSwComponentType){
            return new SensorActuatorSwComponentTypeWrapper((SensorActuatorSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ServiceProxySwComponentTypeWrapper getServiceProxySwComponentType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ServiceSwComponentType){
            return new ServiceSwComponentTypeWrapper((ServiceSwComponentType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwAddrMethodWrapper getSwAddrMethod() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwAddrMethod){
            return new SwAddrMethodWrapper((SwAddrMethod) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SwBaseTypeWrapper getSwBaseType() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SwBaseType){
            return new SwBaseTypeWrapper((SwBaseType) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TriggerInterfaceWrapper getTriggerInterface() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TriggerInterfaceMapping){
            return new TriggerInterfaceMappingWrapper((TriggerInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VariableAndParameterInterfaceMappingWrapper getVariableAndParameterInterfaceMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VariableAndParameterInterfaceMapping){
            return new VariableAndParameterInterfaceMappingWrapper((VariableAndParameterInterfaceMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    public VfbTimingWrapper getVfbTiming() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = blueprintRef.getValue();
        java.lang.String type = blueprintRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof VfbTiming){
            return new VfbTimingWrapper((VfbTiming) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
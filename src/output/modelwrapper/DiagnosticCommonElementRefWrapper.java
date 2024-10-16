package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

     

public class DiagnosticCommonElementRefWrapper {

    
    
    private DiagnosticCommonElementRef diagnosticCommonElementRef;

    public DiagnosticCommonElementRefWrapper(DiagnosticCommonElementRef diagnosticCommonElementRef) {
        this.diagnosticCommonElementRef = diagnosticCommonElementRef;
    }

   
    public DiagnosticCommonElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonElementRef.getDest())) {
            
            return diagnosticCommonElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDiagnosticCommonElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticAccessPermissionWrapper getDiagnosticAccessPermission() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticComControlClass){
            return new DiagnosticComControlClassWrapper((DiagnosticComControlClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    public DiagnosticControlDtcSettingWrapper getDiagnosticControlDtcSetting() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = diagnosticCommonElementRef.getValue();
        java.lang.String type = diagnosticCommonElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticWriteMemoryByAddressClass){
            return new DiagnosticWriteMemoryByAddressClassWrapper((DiagnosticWriteMemoryByAddressClass) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}
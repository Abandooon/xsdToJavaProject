package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Elements;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Collection;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Documentation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.System;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ElementsWrapper {

    
    private Elements elements;

    public ElementsWrapper(Elements elements) {
        this.elements = elements;
    }

   
    public ArrayList<AclObjectSetWrapper> getAclObjectSet() {
        
        if (CollUtil.isNotEmpty(elements.getAclObjectSet())) {
            ArrayList<AclObjectSet> originalList = elements.getAclObjectSet();
            ArrayList<AclObjectSetWrapper> wrapperList = (ArrayList<AclObjectSetWrapper>)originalList.stream()
                .map(item -> new AclObjectSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclOperationWrapper> getAclOperation() {
        
        if (CollUtil.isNotEmpty(elements.getAclOperation())) {
            ArrayList<AclOperation> originalList = elements.getAclOperation();
            ArrayList<AclOperationWrapper> wrapperList = (ArrayList<AclOperationWrapper>)originalList.stream()
                .map(item -> new AclOperationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclPermissionWrapper> getAclPermission() {
        
        if (CollUtil.isNotEmpty(elements.getAclPermission())) {
            ArrayList<AclPermission> originalList = elements.getAclPermission();
            ArrayList<AclPermissionWrapper> wrapperList = (ArrayList<AclPermissionWrapper>)originalList.stream()
                .map(item -> new AclPermissionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AclRoleWrapper> getAclRole() {
        
        if (CollUtil.isNotEmpty(elements.getAclRole())) {
            ArrayList<AclRole> originalList = elements.getAclRole();
            ArrayList<AclRoleWrapper> wrapperList = (ArrayList<AclRoleWrapper>)originalList.stream()
                .map(item -> new AclRoleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AliasNameSetWrapper> getAliasNameSet() {
        
        if (CollUtil.isNotEmpty(elements.getAliasNameSet())) {
            ArrayList<AliasNameSet> originalList = elements.getAliasNameSet();
            ArrayList<AliasNameSetWrapper> wrapperList = (ArrayList<AliasNameSetWrapper>)originalList.stream()
                .map(item -> new AliasNameSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationArrayDataTypeWrapper> getApplicationArrayDataType() {
        
        if (CollUtil.isNotEmpty(elements.getApplicationArrayDataType())) {
            ArrayList<ApplicationArrayDataType> originalList = elements.getApplicationArrayDataType();
            ArrayList<ApplicationArrayDataTypeWrapper> wrapperList = (ArrayList<ApplicationArrayDataTypeWrapper>)originalList.stream()
                .map(item -> new ApplicationArrayDataTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationPrimitiveDataTypeWrapper> getApplicationPrimitiveDataType() {
        
        if (CollUtil.isNotEmpty(elements.getApplicationPrimitiveDataType())) {
            ArrayList<ApplicationPrimitiveDataType> originalList = elements.getApplicationPrimitiveDataType();
            ArrayList<ApplicationPrimitiveDataTypeWrapper> wrapperList = (ArrayList<ApplicationPrimitiveDataTypeWrapper>)originalList.stream()
                .map(item -> new ApplicationPrimitiveDataTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationRecordDataTypeWrapper> getApplicationRecordDataType() {
        
        if (CollUtil.isNotEmpty(elements.getApplicationRecordDataType())) {
            ArrayList<ApplicationRecordDataType> originalList = elements.getApplicationRecordDataType();
            ArrayList<ApplicationRecordDataTypeWrapper> wrapperList = (ArrayList<ApplicationRecordDataTypeWrapper>)originalList.stream()
                .map(item -> new ApplicationRecordDataTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationSwComponentTypeWrapper> getApplicationSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getApplicationSwComponentType())) {
            ArrayList<ApplicationSwComponentType> originalList = elements.getApplicationSwComponentType();
            ArrayList<ApplicationSwComponentTypeWrapper> wrapperList = (ArrayList<ApplicationSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new ApplicationSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BlueprintMappingSetWrapper> getBlueprintMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getBlueprintMappingSet())) {
            ArrayList<BlueprintMappingSet> originalList = elements.getBlueprintMappingSet();
            ArrayList<BlueprintMappingSetWrapper> wrapperList = (ArrayList<BlueprintMappingSetWrapper>)originalList.stream()
                .map(item -> new BlueprintMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswImplementationWrapper> getBswImplementation() {
        
        if (CollUtil.isNotEmpty(elements.getBswImplementation())) {
            ArrayList<BswImplementation> originalList = elements.getBswImplementation();
            ArrayList<BswImplementationWrapper> wrapperList = (ArrayList<BswImplementationWrapper>)originalList.stream()
                .map(item -> new BswImplementationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleDescriptionWrapper> getBswModuleDescription() {
        
        if (CollUtil.isNotEmpty(elements.getBswModuleDescription())) {
            ArrayList<BswModuleDescription> originalList = elements.getBswModuleDescription();
            ArrayList<BswModuleDescriptionWrapper> wrapperList = (ArrayList<BswModuleDescriptionWrapper>)originalList.stream()
                .map(item -> new BswModuleDescriptionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryWrapper> getBswModuleEntry() {
        
        if (CollUtil.isNotEmpty(elements.getBswModuleEntry())) {
            ArrayList<BswModuleEntry> originalList = elements.getBswModuleEntry();
            ArrayList<BswModuleEntryWrapper> wrapperList = (ArrayList<BswModuleEntryWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleTimingWrapper> getBswModuleTiming() {
        
        if (CollUtil.isNotEmpty(elements.getBswModuleTiming())) {
            ArrayList<BswModuleTiming> originalList = elements.getBswModuleTiming();
            ArrayList<BswModuleTimingWrapper> wrapperList = (ArrayList<BswModuleTimingWrapper>)originalList.stream()
                .map(item -> new BswModuleTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BuildActionManifestWrapper> getBuildActionManifest() {
        
        if (CollUtil.isNotEmpty(elements.getBuildActionManifest())) {
            ArrayList<BuildActionManifest> originalList = elements.getBuildActionManifest();
            ArrayList<BuildActionManifestWrapper> wrapperList = (ArrayList<BuildActionManifestWrapper>)originalList.stream()
                .map(item -> new BuildActionManifestWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CalibrationParameterValueSetWrapper> getCalibrationParameterValueSet() {
        
        if (CollUtil.isNotEmpty(elements.getCalibrationParameterValueSet())) {
            ArrayList<CalibrationParameterValueSet> originalList = elements.getCalibrationParameterValueSet();
            ArrayList<CalibrationParameterValueSetWrapper> wrapperList = (ArrayList<CalibrationParameterValueSetWrapper>)originalList.stream()
                .map(item -> new CalibrationParameterValueSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanClusterWrapper> getCanCluster() {
        
        if (CollUtil.isNotEmpty(elements.getCanCluster())) {
            ArrayList<CanCluster> originalList = elements.getCanCluster();
            ArrayList<CanClusterWrapper> wrapperList = (ArrayList<CanClusterWrapper>)originalList.stream()
                .map(item -> new CanClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanFrameWrapper> getCanFrame() {
        
        if (CollUtil.isNotEmpty(elements.getCanFrame())) {
            ArrayList<CanFrame> originalList = elements.getCanFrame();
            ArrayList<CanFrameWrapper> wrapperList = (ArrayList<CanFrameWrapper>)originalList.stream()
                .map(item -> new CanFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpConfigWrapper> getCanTpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getCanTpConfig())) {
            ArrayList<CanTpConfig> originalList = elements.getCanTpConfig();
            ArrayList<CanTpConfigWrapper> wrapperList = (ArrayList<CanTpConfigWrapper>)originalList.stream()
                .map(item -> new CanTpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientIdDefinitionSetWrapper> getClientIdDefinitionSet() {
        
        if (CollUtil.isNotEmpty(elements.getClientIdDefinitionSet())) {
            ArrayList<ClientIdDefinitionSet> originalList = elements.getClientIdDefinitionSet();
            ArrayList<ClientIdDefinitionSetWrapper> wrapperList = (ArrayList<ClientIdDefinitionSetWrapper>)originalList.stream()
                .map(item -> new ClientIdDefinitionSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerInterfaceWrapper> getClientServerInterface() {
        
        if (CollUtil.isNotEmpty(elements.getClientServerInterface())) {
            ArrayList<ClientServerInterface> originalList = elements.getClientServerInterface();
            ArrayList<ClientServerInterfaceWrapper> wrapperList = (ArrayList<ClientServerInterfaceWrapper>)originalList.stream()
                .map(item -> new ClientServerInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CollectionWrapper> getCollection() {
        
        if (CollUtil.isNotEmpty(elements.getCollection())) {
            ArrayList<Collection> originalList = elements.getCollection();
            ArrayList<CollectionWrapper> wrapperList = (ArrayList<CollectionWrapper>)originalList.stream()
                .map(item -> new CollectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ComplexDeviceDriverSwComponentTypeWrapper> getComplexDeviceDriverSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getComplexDeviceDriverSwComponentType())) {
            ArrayList<ComplexDeviceDriverSwComponentType> originalList = elements.getComplexDeviceDriverSwComponentType();
            ArrayList<ComplexDeviceDriverSwComponentTypeWrapper> wrapperList = (ArrayList<ComplexDeviceDriverSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new ComplexDeviceDriverSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CompositionSwComponentTypeWrapper> getCompositionSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getCompositionSwComponentType())) {
            ArrayList<CompositionSwComponentType> originalList = elements.getCompositionSwComponentType();
            ArrayList<CompositionSwComponentTypeWrapper> wrapperList = (ArrayList<CompositionSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new CompositionSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CompuMethodWrapper> getCompuMethod() {
        
        if (CollUtil.isNotEmpty(elements.getCompuMethod())) {
            ArrayList<CompuMethod> originalList = elements.getCompuMethod();
            ArrayList<CompuMethodWrapper> wrapperList = (ArrayList<CompuMethodWrapper>)originalList.stream()
                .map(item -> new CompuMethodWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsBlueprintSetWrapper> getConsistencyNeedsBlueprintSet() {
        
        if (CollUtil.isNotEmpty(elements.getConsistencyNeedsBlueprintSet())) {
            ArrayList<ConsistencyNeedsBlueprintSet> originalList = elements.getConsistencyNeedsBlueprintSet();
            ArrayList<ConsistencyNeedsBlueprintSetWrapper> wrapperList = (ArrayList<ConsistencyNeedsBlueprintSetWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsBlueprintSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantSpecificationWrapper> getConstantSpecification() {
        
        if (CollUtil.isNotEmpty(elements.getConstantSpecification())) {
            ArrayList<ConstantSpecification> originalList = elements.getConstantSpecification();
            ArrayList<ConstantSpecificationWrapper> wrapperList = (ArrayList<ConstantSpecificationWrapper>)originalList.stream()
                .map(item -> new ConstantSpecificationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantSpecificationMappingSetWrapper> getConstantSpecificationMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getConstantSpecificationMappingSet())) {
            ArrayList<ConstantSpecificationMappingSet> originalList = elements.getConstantSpecificationMappingSet();
            ArrayList<ConstantSpecificationMappingSetWrapper> wrapperList = (ArrayList<ConstantSpecificationMappingSetWrapper>)originalList.stream()
                .map(item -> new ConstantSpecificationMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ContainerIPduWrapper> getContainerIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getContainerIPdu())) {
            ArrayList<ContainerIPdu> originalList = elements.getContainerIPdu();
            ArrayList<ContainerIPduWrapper> wrapperList = (ArrayList<ContainerIPduWrapper>)originalList.stream()
                .map(item -> new ContainerIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingElementWrapper> getCouplingElement() {
        
        if (CollUtil.isNotEmpty(elements.getCouplingElement())) {
            ArrayList<CouplingElement> originalList = elements.getCouplingElement();
            ArrayList<CouplingElementWrapper> wrapperList = (ArrayList<CouplingElementWrapper>)originalList.stream()
                .map(item -> new CouplingElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataConstrWrapper> getDataConstr() {
        
        if (CollUtil.isNotEmpty(elements.getDataConstr())) {
            ArrayList<DataConstr> originalList = elements.getDataConstr();
            ArrayList<DataConstrWrapper> wrapperList = (ArrayList<DataConstrWrapper>)originalList.stream()
                .map(item -> new DataConstrWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTransformationSetWrapper> getDataTransformationSet() {
        
        if (CollUtil.isNotEmpty(elements.getDataTransformationSet())) {
            ArrayList<DataTransformationSet> originalList = elements.getDataTransformationSet();
            ArrayList<DataTransformationSetWrapper> wrapperList = (ArrayList<DataTransformationSetWrapper>)originalList.stream()
                .map(item -> new DataTransformationSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingSetWrapper> getDataTypeMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getDataTypeMappingSet())) {
            ArrayList<DataTypeMappingSet> originalList = elements.getDataTypeMappingSet();
            ArrayList<DataTypeMappingSetWrapper> wrapperList = (ArrayList<DataTypeMappingSetWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DcmIPduWrapper> getDcmIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getDcmIPdu())) {
            ArrayList<DcmIPdu> originalList = elements.getDcmIPdu();
            ArrayList<DcmIPduWrapper> wrapperList = (ArrayList<DcmIPduWrapper>)originalList.stream()
                .map(item -> new DcmIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAccessPermissionWrapper> getDiagnosticAccessPermission() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticAccessPermission())) {
            ArrayList<DiagnosticAccessPermission> originalList = elements.getDiagnosticAccessPermission();
            ArrayList<DiagnosticAccessPermissionWrapper> wrapperList = (ArrayList<DiagnosticAccessPermissionWrapper>)originalList.stream()
                .map(item -> new DiagnosticAccessPermissionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAgingWrapper> getDiagnosticAging() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticAging())) {
            ArrayList<DiagnosticAging> originalList = elements.getDiagnosticAging();
            ArrayList<DiagnosticAgingWrapper> wrapperList = (ArrayList<DiagnosticAgingWrapper>)originalList.stream()
                .map(item -> new DiagnosticAgingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticClearDiagnosticInformationWrapper> getDiagnosticClearDiagnosticInformation() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticClearDiagnosticInformation())) {
            ArrayList<DiagnosticClearDiagnosticInformation> originalList = elements.getDiagnosticClearDiagnosticInformation();
            ArrayList<DiagnosticClearDiagnosticInformationWrapper> wrapperList = (ArrayList<DiagnosticClearDiagnosticInformationWrapper>)originalList.stream()
                .map(item -> new DiagnosticClearDiagnosticInformationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticClearDiagnosticInformationClassWrapper> getDiagnosticClearDiagnosticInformationClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticClearDiagnosticInformationClass())) {
            ArrayList<DiagnosticClearDiagnosticInformationClass> originalList = elements.getDiagnosticClearDiagnosticInformationClass();
            ArrayList<DiagnosticClearDiagnosticInformationClassWrapper> wrapperList = (ArrayList<DiagnosticClearDiagnosticInformationClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticClearDiagnosticInformationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticComControlWrapper> getDiagnosticComControl() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticComControl())) {
            ArrayList<DiagnosticComControl> originalList = elements.getDiagnosticComControl();
            ArrayList<DiagnosticComControlWrapper> wrapperList = (ArrayList<DiagnosticComControlWrapper>)originalList.stream()
                .map(item -> new DiagnosticComControlWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticComControlClassWrapper> getDiagnosticComControlClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticComControlClass())) {
            ArrayList<DiagnosticComControlClass> originalList = elements.getDiagnosticComControlClass();
            ArrayList<DiagnosticComControlClassWrapper> wrapperList = (ArrayList<DiagnosticComControlClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticComControlClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticConnectionWrapper> getDiagnosticConnection() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticConnection())) {
            ArrayList<DiagnosticConnection> originalList = elements.getDiagnosticConnection();
            ArrayList<DiagnosticConnectionWrapper> wrapperList = (ArrayList<DiagnosticConnectionWrapper>)originalList.stream()
                .map(item -> new DiagnosticConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticContributionSetWrapper> getDiagnosticContributionSet() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticContributionSet())) {
            ArrayList<DiagnosticContributionSet> originalList = elements.getDiagnosticContributionSet();
            ArrayList<DiagnosticContributionSetWrapper> wrapperList = (ArrayList<DiagnosticContributionSetWrapper>)originalList.stream()
                .map(item -> new DiagnosticContributionSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticControlDtcSettingWrapper> getDiagnosticControlDtcSetting() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticControlDtcSetting())) {
            ArrayList<DiagnosticControlDtcSetting> originalList = elements.getDiagnosticControlDtcSetting();
            ArrayList<DiagnosticControlDtcSettingWrapper> wrapperList = (ArrayList<DiagnosticControlDtcSettingWrapper>)originalList.stream()
                .map(item -> new DiagnosticControlDtcSettingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticControlDtcSettingClassWrapper> getDiagnosticControlDtcSettingClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticControlDtcSettingClass())) {
            ArrayList<DiagnosticControlDtcSettingClass> originalList = elements.getDiagnosticControlDtcSettingClass();
            ArrayList<DiagnosticControlDtcSettingClassWrapper> wrapperList = (ArrayList<DiagnosticControlDtcSettingClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticControlDtcSettingClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticCustomServiceClassWrapper> getDiagnosticCustomServiceClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticCustomServiceClass())) {
            ArrayList<DiagnosticCustomServiceClass> originalList = elements.getDiagnosticCustomServiceClass();
            ArrayList<DiagnosticCustomServiceClassWrapper> wrapperList = (ArrayList<DiagnosticCustomServiceClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticCustomServiceClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDataIdentifierWrapper> getDiagnosticDataIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDataIdentifier())) {
            ArrayList<DiagnosticDataIdentifier> originalList = elements.getDiagnosticDataIdentifier();
            ArrayList<DiagnosticDataIdentifierWrapper> wrapperList = (ArrayList<DiagnosticDataIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDataIdentifierSetWrapper> getDiagnosticDataIdentifierSet() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDataIdentifierSet())) {
            ArrayList<DiagnosticDataIdentifierSet> originalList = elements.getDiagnosticDataIdentifierSet();
            ArrayList<DiagnosticDataIdentifierSetWrapper> wrapperList = (ArrayList<DiagnosticDataIdentifierSetWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataIdentifierSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDataTransferWrapper> getDiagnosticDataTransfer() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDataTransfer())) {
            ArrayList<DiagnosticDataTransfer> originalList = elements.getDiagnosticDataTransfer();
            ArrayList<DiagnosticDataTransferWrapper> wrapperList = (ArrayList<DiagnosticDataTransferWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataTransferWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDataTransferClassWrapper> getDiagnosticDataTransferClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDataTransferClass())) {
            ArrayList<DiagnosticDataTransferClass> originalList = elements.getDiagnosticDataTransferClass();
            ArrayList<DiagnosticDataTransferClassWrapper> wrapperList = (ArrayList<DiagnosticDataTransferClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticDataTransferClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDemProvidedDataMappingWrapper> getDiagnosticDemProvidedDataMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDemProvidedDataMapping())) {
            ArrayList<DiagnosticDemProvidedDataMapping> originalList = elements.getDiagnosticDemProvidedDataMapping();
            ArrayList<DiagnosticDemProvidedDataMappingWrapper> wrapperList = (ArrayList<DiagnosticDemProvidedDataMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticDemProvidedDataMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDynamicDataIdentifierWrapper> getDiagnosticDynamicDataIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDynamicDataIdentifier())) {
            ArrayList<DiagnosticDynamicDataIdentifier> originalList = elements.getDiagnosticDynamicDataIdentifier();
            ArrayList<DiagnosticDynamicDataIdentifierWrapper> wrapperList = (ArrayList<DiagnosticDynamicDataIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticDynamicDataIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDynamicallyDefineDataIdentifierWrapper> getDiagnosticDynamicallyDefineDataIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDynamicallyDefineDataIdentifier())) {
            ArrayList<DiagnosticDynamicallyDefineDataIdentifier> originalList = elements.getDiagnosticDynamicallyDefineDataIdentifier();
            ArrayList<DiagnosticDynamicallyDefineDataIdentifierWrapper> wrapperList = (ArrayList<DiagnosticDynamicallyDefineDataIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticDynamicallyDefineDataIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDynamicallyDefineDataIdentifierClassWrapper> getDiagnosticDynamicallyDefineDataIdentifierClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticDynamicallyDefineDataIdentifierClass())) {
            ArrayList<DiagnosticDynamicallyDefineDataIdentifierClass> originalList = elements.getDiagnosticDynamicallyDefineDataIdentifierClass();
            ArrayList<DiagnosticDynamicallyDefineDataIdentifierClassWrapper> wrapperList = (ArrayList<DiagnosticDynamicallyDefineDataIdentifierClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticDynamicallyDefineDataIdentifierClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEcuResetWrapper> getDiagnosticEcuReset() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEcuReset())) {
            ArrayList<DiagnosticEcuReset> originalList = elements.getDiagnosticEcuReset();
            ArrayList<DiagnosticEcuResetWrapper> wrapperList = (ArrayList<DiagnosticEcuResetWrapper>)originalList.stream()
                .map(item -> new DiagnosticEcuResetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEcuResetClassWrapper> getDiagnosticEcuResetClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEcuResetClass())) {
            ArrayList<DiagnosticEcuResetClass> originalList = elements.getDiagnosticEcuResetClass();
            ArrayList<DiagnosticEcuResetClassWrapper> wrapperList = (ArrayList<DiagnosticEcuResetClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticEcuResetClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEnableConditionWrapper> getDiagnosticEnableCondition() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEnableCondition())) {
            ArrayList<DiagnosticEnableCondition> originalList = elements.getDiagnosticEnableCondition();
            ArrayList<DiagnosticEnableConditionWrapper> wrapperList = (ArrayList<DiagnosticEnableConditionWrapper>)originalList.stream()
                .map(item -> new DiagnosticEnableConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEnableConditionGroupWrapper> getDiagnosticEnableConditionGroup() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEnableConditionGroup())) {
            ArrayList<DiagnosticEnableConditionGroup> originalList = elements.getDiagnosticEnableConditionGroup();
            ArrayList<DiagnosticEnableConditionGroupWrapper> wrapperList = (ArrayList<DiagnosticEnableConditionGroupWrapper>)originalList.stream()
                .map(item -> new DiagnosticEnableConditionGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEnableConditionPortMappingWrapper> getDiagnosticEnableConditionPortMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEnableConditionPortMapping())) {
            ArrayList<DiagnosticEnableConditionPortMapping> originalList = elements.getDiagnosticEnableConditionPortMapping();
            ArrayList<DiagnosticEnableConditionPortMappingWrapper> wrapperList = (ArrayList<DiagnosticEnableConditionPortMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEnableConditionPortMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventWrapper> getDiagnosticEvent() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEvent())) {
            ArrayList<DiagnosticEvent> originalList = elements.getDiagnosticEvent();
            ArrayList<DiagnosticEventWrapper> wrapperList = (ArrayList<DiagnosticEventWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventPortMappingWrapper> getDiagnosticEventPortMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventPortMapping())) {
            ArrayList<DiagnosticEventPortMapping> originalList = elements.getDiagnosticEventPortMapping();
            ArrayList<DiagnosticEventPortMappingWrapper> wrapperList = (ArrayList<DiagnosticEventPortMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventPortMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventToDebounceAlgorithmMappingWrapper> getDiagnosticEventToDebounceAlgorithmMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventToDebounceAlgorithmMapping())) {
            ArrayList<DiagnosticEventToDebounceAlgorithmMapping> originalList = elements.getDiagnosticEventToDebounceAlgorithmMapping();
            ArrayList<DiagnosticEventToDebounceAlgorithmMappingWrapper> wrapperList = (ArrayList<DiagnosticEventToDebounceAlgorithmMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventToDebounceAlgorithmMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventToEnableConditionGroupMappingWrapper> getDiagnosticEventToEnableConditionGroupMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventToEnableConditionGroupMapping())) {
            ArrayList<DiagnosticEventToEnableConditionGroupMapping> originalList = elements.getDiagnosticEventToEnableConditionGroupMapping();
            ArrayList<DiagnosticEventToEnableConditionGroupMappingWrapper> wrapperList = (ArrayList<DiagnosticEventToEnableConditionGroupMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventToEnableConditionGroupMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventToOperationCycleMappingWrapper> getDiagnosticEventToOperationCycleMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventToOperationCycleMapping())) {
            ArrayList<DiagnosticEventToOperationCycleMapping> originalList = elements.getDiagnosticEventToOperationCycleMapping();
            ArrayList<DiagnosticEventToOperationCycleMappingWrapper> wrapperList = (ArrayList<DiagnosticEventToOperationCycleMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventToOperationCycleMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventToStorageConditionGroupMappingWrapper> getDiagnosticEventToStorageConditionGroupMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventToStorageConditionGroupMapping())) {
            ArrayList<DiagnosticEventToStorageConditionGroupMapping> originalList = elements.getDiagnosticEventToStorageConditionGroupMapping();
            ArrayList<DiagnosticEventToStorageConditionGroupMappingWrapper> wrapperList = (ArrayList<DiagnosticEventToStorageConditionGroupMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventToStorageConditionGroupMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventToTroubleCodeUdsMappingWrapper> getDiagnosticEventToTroubleCodeUdsMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticEventToTroubleCodeUdsMapping())) {
            ArrayList<DiagnosticEventToTroubleCodeUdsMapping> originalList = elements.getDiagnosticEventToTroubleCodeUdsMapping();
            ArrayList<DiagnosticEventToTroubleCodeUdsMappingWrapper> wrapperList = (ArrayList<DiagnosticEventToTroubleCodeUdsMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventToTroubleCodeUdsMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticExtendedDataRecordWrapper> getDiagnosticExtendedDataRecord() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticExtendedDataRecord())) {
            ArrayList<DiagnosticExtendedDataRecord> originalList = elements.getDiagnosticExtendedDataRecord();
            ArrayList<DiagnosticExtendedDataRecordWrapper> wrapperList = (ArrayList<DiagnosticExtendedDataRecordWrapper>)originalList.stream()
                .map(item -> new DiagnosticExtendedDataRecordWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticFreezeFrameWrapper> getDiagnosticFreezeFrame() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticFreezeFrame())) {
            ArrayList<DiagnosticFreezeFrame> originalList = elements.getDiagnosticFreezeFrame();
            ArrayList<DiagnosticFreezeFrameWrapper> wrapperList = (ArrayList<DiagnosticFreezeFrameWrapper>)originalList.stream()
                .map(item -> new DiagnosticFreezeFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticIoControlWrapper> getDiagnosticIoControl() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticIoControl())) {
            ArrayList<DiagnosticIoControl> originalList = elements.getDiagnosticIoControl();
            ArrayList<DiagnosticIoControlWrapper> wrapperList = (ArrayList<DiagnosticIoControlWrapper>)originalList.stream()
                .map(item -> new DiagnosticIoControlWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticIndicatorWrapper> getDiagnosticIndicator() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticIndicator())) {
            ArrayList<DiagnosticIndicator> originalList = elements.getDiagnosticIndicator();
            ArrayList<DiagnosticIndicatorWrapper> wrapperList = (ArrayList<DiagnosticIndicatorWrapper>)originalList.stream()
                .map(item -> new DiagnosticIndicatorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticIoControlClassWrapper> getDiagnosticIoControlClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticIoControlClass())) {
            ArrayList<DiagnosticIoControlClass> originalList = elements.getDiagnosticIoControlClass();
            ArrayList<DiagnosticIoControlClassWrapper> wrapperList = (ArrayList<DiagnosticIoControlClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticIoControlClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticMemoryDestinationMirrorWrapper> getDiagnosticMemoryDestinationMirror() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticMemoryDestinationMirror())) {
            ArrayList<DiagnosticMemoryDestinationMirror> originalList = elements.getDiagnosticMemoryDestinationMirror();
            ArrayList<DiagnosticMemoryDestinationMirrorWrapper> wrapperList = (ArrayList<DiagnosticMemoryDestinationMirrorWrapper>)originalList.stream()
                .map(item -> new DiagnosticMemoryDestinationMirrorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticMemoryDestinationPrimaryWrapper> getDiagnosticMemoryDestinationPrimary() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticMemoryDestinationPrimary())) {
            ArrayList<DiagnosticMemoryDestinationPrimary> originalList = elements.getDiagnosticMemoryDestinationPrimary();
            ArrayList<DiagnosticMemoryDestinationPrimaryWrapper> wrapperList = (ArrayList<DiagnosticMemoryDestinationPrimaryWrapper>)originalList.stream()
                .map(item -> new DiagnosticMemoryDestinationPrimaryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticMemoryDestinationUserDefinedWrapper> getDiagnosticMemoryDestinationUserDefined() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticMemoryDestinationUserDefined())) {
            ArrayList<DiagnosticMemoryDestinationUserDefined> originalList = elements.getDiagnosticMemoryDestinationUserDefined();
            ArrayList<DiagnosticMemoryDestinationUserDefinedWrapper> wrapperList = (ArrayList<DiagnosticMemoryDestinationUserDefinedWrapper>)originalList.stream()
                .map(item -> new DiagnosticMemoryDestinationUserDefinedWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticMemoryIdentifierWrapper> getDiagnosticMemoryIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticMemoryIdentifier())) {
            ArrayList<DiagnosticMemoryIdentifier> originalList = elements.getDiagnosticMemoryIdentifier();
            ArrayList<DiagnosticMemoryIdentifierWrapper> wrapperList = (ArrayList<DiagnosticMemoryIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticMemoryIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticOperationCycleWrapper> getDiagnosticOperationCycle() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticOperationCycle())) {
            ArrayList<DiagnosticOperationCycle> originalList = elements.getDiagnosticOperationCycle();
            ArrayList<DiagnosticOperationCycleWrapper> wrapperList = (ArrayList<DiagnosticOperationCycleWrapper>)originalList.stream()
                .map(item -> new DiagnosticOperationCycleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticOperationCyclePortMappingWrapper> getDiagnosticOperationCyclePortMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticOperationCyclePortMapping())) {
            ArrayList<DiagnosticOperationCyclePortMapping> originalList = elements.getDiagnosticOperationCyclePortMapping();
            ArrayList<DiagnosticOperationCyclePortMappingWrapper> wrapperList = (ArrayList<DiagnosticOperationCyclePortMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticOperationCyclePortMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDtcInformationWrapper> getDiagnosticReadDtcInformation() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDtcInformation())) {
            ArrayList<DiagnosticReadDtcInformation> originalList = elements.getDiagnosticReadDtcInformation();
            ArrayList<DiagnosticReadDtcInformationWrapper> wrapperList = (ArrayList<DiagnosticReadDtcInformationWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDtcInformationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDtcInformationClassWrapper> getDiagnosticReadDtcInformationClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDtcInformationClass())) {
            ArrayList<DiagnosticReadDtcInformationClass> originalList = elements.getDiagnosticReadDtcInformationClass();
            ArrayList<DiagnosticReadDtcInformationClassWrapper> wrapperList = (ArrayList<DiagnosticReadDtcInformationClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDtcInformationClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDataByIdentifierWrapper> getDiagnosticReadDataByIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDataByIdentifier())) {
            ArrayList<DiagnosticReadDataByIdentifier> originalList = elements.getDiagnosticReadDataByIdentifier();
            ArrayList<DiagnosticReadDataByIdentifierWrapper> wrapperList = (ArrayList<DiagnosticReadDataByIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDataByIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDataByIdentifierClassWrapper> getDiagnosticReadDataByIdentifierClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDataByIdentifierClass())) {
            ArrayList<DiagnosticReadDataByIdentifierClass> originalList = elements.getDiagnosticReadDataByIdentifierClass();
            ArrayList<DiagnosticReadDataByIdentifierClassWrapper> wrapperList = (ArrayList<DiagnosticReadDataByIdentifierClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDataByIdentifierClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDataByPeriodicIdWrapper> getDiagnosticReadDataByPeriodicId() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDataByPeriodicId())) {
            ArrayList<DiagnosticReadDataByPeriodicId> originalList = elements.getDiagnosticReadDataByPeriodicId();
            ArrayList<DiagnosticReadDataByPeriodicIdWrapper> wrapperList = (ArrayList<DiagnosticReadDataByPeriodicIdWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDataByPeriodicIdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadDataByPeriodicIdClassWrapper> getDiagnosticReadDataByPeriodicIdClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadDataByPeriodicIdClass())) {
            ArrayList<DiagnosticReadDataByPeriodicIdClass> originalList = elements.getDiagnosticReadDataByPeriodicIdClass();
            ArrayList<DiagnosticReadDataByPeriodicIdClassWrapper> wrapperList = (ArrayList<DiagnosticReadDataByPeriodicIdClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadDataByPeriodicIdClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadMemoryByAddressWrapper> getDiagnosticReadMemoryByAddress() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadMemoryByAddress())) {
            ArrayList<DiagnosticReadMemoryByAddress> originalList = elements.getDiagnosticReadMemoryByAddress();
            ArrayList<DiagnosticReadMemoryByAddressWrapper> wrapperList = (ArrayList<DiagnosticReadMemoryByAddressWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadMemoryByAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticReadMemoryByAddressClassWrapper> getDiagnosticReadMemoryByAddressClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticReadMemoryByAddressClass())) {
            ArrayList<DiagnosticReadMemoryByAddressClass> originalList = elements.getDiagnosticReadMemoryByAddressClass();
            ArrayList<DiagnosticReadMemoryByAddressClassWrapper> wrapperList = (ArrayList<DiagnosticReadMemoryByAddressClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticReadMemoryByAddressClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestDownloadWrapper> getDiagnosticRequestDownload() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestDownload())) {
            ArrayList<DiagnosticRequestDownload> originalList = elements.getDiagnosticRequestDownload();
            ArrayList<DiagnosticRequestDownloadWrapper> wrapperList = (ArrayList<DiagnosticRequestDownloadWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestDownloadWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestDownloadClassWrapper> getDiagnosticRequestDownloadClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestDownloadClass())) {
            ArrayList<DiagnosticRequestDownloadClass> originalList = elements.getDiagnosticRequestDownloadClass();
            ArrayList<DiagnosticRequestDownloadClassWrapper> wrapperList = (ArrayList<DiagnosticRequestDownloadClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestDownloadClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestFileTransferWrapper> getDiagnosticRequestFileTransfer() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestFileTransfer())) {
            ArrayList<DiagnosticRequestFileTransfer> originalList = elements.getDiagnosticRequestFileTransfer();
            ArrayList<DiagnosticRequestFileTransferWrapper> wrapperList = (ArrayList<DiagnosticRequestFileTransferWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestFileTransferWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestFileTransferClassWrapper> getDiagnosticRequestFileTransferClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestFileTransferClass())) {
            ArrayList<DiagnosticRequestFileTransferClass> originalList = elements.getDiagnosticRequestFileTransferClass();
            ArrayList<DiagnosticRequestFileTransferClassWrapper> wrapperList = (ArrayList<DiagnosticRequestFileTransferClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestFileTransferClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestUploadWrapper> getDiagnosticRequestUpload() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestUpload())) {
            ArrayList<DiagnosticRequestUpload> originalList = elements.getDiagnosticRequestUpload();
            ArrayList<DiagnosticRequestUploadWrapper> wrapperList = (ArrayList<DiagnosticRequestUploadWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestUploadWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRequestUploadClassWrapper> getDiagnosticRequestUploadClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRequestUploadClass())) {
            ArrayList<DiagnosticRequestUploadClass> originalList = elements.getDiagnosticRequestUploadClass();
            ArrayList<DiagnosticRequestUploadClassWrapper> wrapperList = (ArrayList<DiagnosticRequestUploadClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticRequestUploadClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticResponseOnEventWrapper> getDiagnosticResponseOnEvent() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticResponseOnEvent())) {
            ArrayList<DiagnosticResponseOnEvent> originalList = elements.getDiagnosticResponseOnEvent();
            ArrayList<DiagnosticResponseOnEventWrapper> wrapperList = (ArrayList<DiagnosticResponseOnEventWrapper>)originalList.stream()
                .map(item -> new DiagnosticResponseOnEventWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticResponseOnEventClassWrapper> getDiagnosticResponseOnEventClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticResponseOnEventClass())) {
            ArrayList<DiagnosticResponseOnEventClass> originalList = elements.getDiagnosticResponseOnEventClass();
            ArrayList<DiagnosticResponseOnEventClassWrapper> wrapperList = (ArrayList<DiagnosticResponseOnEventClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticResponseOnEventClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRoutineWrapper> getDiagnosticRoutine() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRoutine())) {
            ArrayList<DiagnosticRoutine> originalList = elements.getDiagnosticRoutine();
            ArrayList<DiagnosticRoutineWrapper> wrapperList = (ArrayList<DiagnosticRoutineWrapper>)originalList.stream()
                .map(item -> new DiagnosticRoutineWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRoutineControlWrapper> getDiagnosticRoutineControl() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRoutineControl())) {
            ArrayList<DiagnosticRoutineControl> originalList = elements.getDiagnosticRoutineControl();
            ArrayList<DiagnosticRoutineControlWrapper> wrapperList = (ArrayList<DiagnosticRoutineControlWrapper>)originalList.stream()
                .map(item -> new DiagnosticRoutineControlWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRoutineControlClassWrapper> getDiagnosticRoutineControlClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticRoutineControlClass())) {
            ArrayList<DiagnosticRoutineControlClass> originalList = elements.getDiagnosticRoutineControlClass();
            ArrayList<DiagnosticRoutineControlClassWrapper> wrapperList = (ArrayList<DiagnosticRoutineControlClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticRoutineControlClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSecurityAccessWrapper> getDiagnosticSecurityAccess() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSecurityAccess())) {
            ArrayList<DiagnosticSecurityAccess> originalList = elements.getDiagnosticSecurityAccess();
            ArrayList<DiagnosticSecurityAccessWrapper> wrapperList = (ArrayList<DiagnosticSecurityAccessWrapper>)originalList.stream()
                .map(item -> new DiagnosticSecurityAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSecurityAccessClassWrapper> getDiagnosticSecurityAccessClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSecurityAccessClass())) {
            ArrayList<DiagnosticSecurityAccessClass> originalList = elements.getDiagnosticSecurityAccessClass();
            ArrayList<DiagnosticSecurityAccessClassWrapper> wrapperList = (ArrayList<DiagnosticSecurityAccessClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticSecurityAccessClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSecurityLevelWrapper> getDiagnosticSecurityLevel() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSecurityLevel())) {
            ArrayList<DiagnosticSecurityLevel> originalList = elements.getDiagnosticSecurityLevel();
            ArrayList<DiagnosticSecurityLevelWrapper> wrapperList = (ArrayList<DiagnosticSecurityLevelWrapper>)originalList.stream()
                .map(item -> new DiagnosticSecurityLevelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticServiceDataMappingWrapper> getDiagnosticServiceDataMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticServiceDataMapping())) {
            ArrayList<DiagnosticServiceDataMapping> originalList = elements.getDiagnosticServiceDataMapping();
            ArrayList<DiagnosticServiceDataMappingWrapper> wrapperList = (ArrayList<DiagnosticServiceDataMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticServiceDataMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticServiceSwMappingWrapper> getDiagnosticServiceSwMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticServiceSwMapping())) {
            ArrayList<DiagnosticServiceSwMapping> originalList = elements.getDiagnosticServiceSwMapping();
            ArrayList<DiagnosticServiceSwMappingWrapper> wrapperList = (ArrayList<DiagnosticServiceSwMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticServiceSwMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticServiceTableWrapper> getDiagnosticServiceTable() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticServiceTable())) {
            ArrayList<DiagnosticServiceTable> originalList = elements.getDiagnosticServiceTable();
            ArrayList<DiagnosticServiceTableWrapper> wrapperList = (ArrayList<DiagnosticServiceTableWrapper>)originalList.stream()
                .map(item -> new DiagnosticServiceTableWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSessionWrapper> getDiagnosticSession() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSession())) {
            ArrayList<DiagnosticSession> originalList = elements.getDiagnosticSession();
            ArrayList<DiagnosticSessionWrapper> wrapperList = (ArrayList<DiagnosticSessionWrapper>)originalList.stream()
                .map(item -> new DiagnosticSessionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSessionControlWrapper> getDiagnosticSessionControl() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSessionControl())) {
            ArrayList<DiagnosticSessionControl> originalList = elements.getDiagnosticSessionControl();
            ArrayList<DiagnosticSessionControlWrapper> wrapperList = (ArrayList<DiagnosticSessionControlWrapper>)originalList.stream()
                .map(item -> new DiagnosticSessionControlWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSessionControlClassWrapper> getDiagnosticSessionControlClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticSessionControlClass())) {
            ArrayList<DiagnosticSessionControlClass> originalList = elements.getDiagnosticSessionControlClass();
            ArrayList<DiagnosticSessionControlClassWrapper> wrapperList = (ArrayList<DiagnosticSessionControlClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticSessionControlClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticStorageConditionWrapper> getDiagnosticStorageCondition() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticStorageCondition())) {
            ArrayList<DiagnosticStorageCondition> originalList = elements.getDiagnosticStorageCondition();
            ArrayList<DiagnosticStorageConditionWrapper> wrapperList = (ArrayList<DiagnosticStorageConditionWrapper>)originalList.stream()
                .map(item -> new DiagnosticStorageConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticStorageConditionGroupWrapper> getDiagnosticStorageConditionGroup() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticStorageConditionGroup())) {
            ArrayList<DiagnosticStorageConditionGroup> originalList = elements.getDiagnosticStorageConditionGroup();
            ArrayList<DiagnosticStorageConditionGroupWrapper> wrapperList = (ArrayList<DiagnosticStorageConditionGroupWrapper>)originalList.stream()
                .map(item -> new DiagnosticStorageConditionGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticStorageConditionPortMappingWrapper> getDiagnosticStorageConditionPortMapping() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticStorageConditionPortMapping())) {
            ArrayList<DiagnosticStorageConditionPortMapping> originalList = elements.getDiagnosticStorageConditionPortMapping();
            ArrayList<DiagnosticStorageConditionPortMappingWrapper> wrapperList = (ArrayList<DiagnosticStorageConditionPortMappingWrapper>)originalList.stream()
                .map(item -> new DiagnosticStorageConditionPortMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTransferExitWrapper> getDiagnosticTransferExit() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTransferExit())) {
            ArrayList<DiagnosticTransferExit> originalList = elements.getDiagnosticTransferExit();
            ArrayList<DiagnosticTransferExitWrapper> wrapperList = (ArrayList<DiagnosticTransferExitWrapper>)originalList.stream()
                .map(item -> new DiagnosticTransferExitWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTransferExitClassWrapper> getDiagnosticTransferExitClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTransferExitClass())) {
            ArrayList<DiagnosticTransferExitClass> originalList = elements.getDiagnosticTransferExitClass();
            ArrayList<DiagnosticTransferExitClassWrapper> wrapperList = (ArrayList<DiagnosticTransferExitClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticTransferExitClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodeGroupWrapper> getDiagnosticTroubleCodeGroup() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTroubleCodeGroup())) {
            ArrayList<DiagnosticTroubleCodeGroup> originalList = elements.getDiagnosticTroubleCodeGroup();
            ArrayList<DiagnosticTroubleCodeGroupWrapper> wrapperList = (ArrayList<DiagnosticTroubleCodeGroupWrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodeGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodeJ1939Wrapper> getDiagnosticTroubleCodeJ1939() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTroubleCodeJ1939())) {
            ArrayList<DiagnosticTroubleCodeJ1939> originalList = elements.getDiagnosticTroubleCodeJ1939();
            ArrayList<DiagnosticTroubleCodeJ1939Wrapper> wrapperList = (ArrayList<DiagnosticTroubleCodeJ1939Wrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodeJ1939Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodeObdWrapper> getDiagnosticTroubleCodeObd() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTroubleCodeObd())) {
            ArrayList<DiagnosticTroubleCodeObd> originalList = elements.getDiagnosticTroubleCodeObd();
            ArrayList<DiagnosticTroubleCodeObdWrapper> wrapperList = (ArrayList<DiagnosticTroubleCodeObdWrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodeObdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodePropsWrapper> getDiagnosticTroubleCodeProps() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTroubleCodeProps())) {
            ArrayList<DiagnosticTroubleCodeProps> originalList = elements.getDiagnosticTroubleCodeProps();
            ArrayList<DiagnosticTroubleCodePropsWrapper> wrapperList = (ArrayList<DiagnosticTroubleCodePropsWrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodePropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodeUdsWrapper> getDiagnosticTroubleCodeUds() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticTroubleCodeUds())) {
            ArrayList<DiagnosticTroubleCodeUds> originalList = elements.getDiagnosticTroubleCodeUds();
            ArrayList<DiagnosticTroubleCodeUdsWrapper> wrapperList = (ArrayList<DiagnosticTroubleCodeUdsWrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodeUdsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticWriteDataByIdentifierWrapper> getDiagnosticWriteDataByIdentifier() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticWriteDataByIdentifier())) {
            ArrayList<DiagnosticWriteDataByIdentifier> originalList = elements.getDiagnosticWriteDataByIdentifier();
            ArrayList<DiagnosticWriteDataByIdentifierWrapper> wrapperList = (ArrayList<DiagnosticWriteDataByIdentifierWrapper>)originalList.stream()
                .map(item -> new DiagnosticWriteDataByIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticWriteDataByIdentifierClassWrapper> getDiagnosticWriteDataByIdentifierClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticWriteDataByIdentifierClass())) {
            ArrayList<DiagnosticWriteDataByIdentifierClass> originalList = elements.getDiagnosticWriteDataByIdentifierClass();
            ArrayList<DiagnosticWriteDataByIdentifierClassWrapper> wrapperList = (ArrayList<DiagnosticWriteDataByIdentifierClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticWriteDataByIdentifierClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticWriteMemoryByAddressWrapper> getDiagnosticWriteMemoryByAddress() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticWriteMemoryByAddress())) {
            ArrayList<DiagnosticWriteMemoryByAddress> originalList = elements.getDiagnosticWriteMemoryByAddress();
            ArrayList<DiagnosticWriteMemoryByAddressWrapper> wrapperList = (ArrayList<DiagnosticWriteMemoryByAddressWrapper>)originalList.stream()
                .map(item -> new DiagnosticWriteMemoryByAddressWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticWriteMemoryByAddressClassWrapper> getDiagnosticWriteMemoryByAddressClass() {
        
        if (CollUtil.isNotEmpty(elements.getDiagnosticWriteMemoryByAddressClass())) {
            ArrayList<DiagnosticWriteMemoryByAddressClass> originalList = elements.getDiagnosticWriteMemoryByAddressClass();
            ArrayList<DiagnosticWriteMemoryByAddressClassWrapper> wrapperList = (ArrayList<DiagnosticWriteMemoryByAddressClassWrapper>)originalList.stream()
                .map(item -> new DiagnosticWriteMemoryByAddressClassWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpTpConfigWrapper> getDoIpTpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getDoIpTpConfig())) {
            ArrayList<DoIpTpConfig> originalList = elements.getDoIpTpConfig();
            ArrayList<DoIpTpConfigWrapper> wrapperList = (ArrayList<DoIpTpConfigWrapper>)originalList.stream()
                .map(item -> new DoIpTpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DocumentationWrapper> getDocumentation() {
        
        if (CollUtil.isNotEmpty(elements.getDocumentation())) {
            ArrayList<Documentation> originalList = elements.getDocumentation();
            ArrayList<DocumentationWrapper> wrapperList = (ArrayList<DocumentationWrapper>)originalList.stream()
                .map(item -> new DocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuAbstractionSwComponentTypeWrapper> getEcuAbstractionSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getEcuAbstractionSwComponentType())) {
            ArrayList<EcuAbstractionSwComponentType> originalList = elements.getEcuAbstractionSwComponentType();
            ArrayList<EcuAbstractionSwComponentTypeWrapper> wrapperList = (ArrayList<EcuAbstractionSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new EcuAbstractionSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuInstanceWrapper> getEcuInstance() {
        
        if (CollUtil.isNotEmpty(elements.getEcuInstance())) {
            ArrayList<EcuInstance> originalList = elements.getEcuInstance();
            ArrayList<EcuInstanceWrapper> wrapperList = (ArrayList<EcuInstanceWrapper>)originalList.stream()
                .map(item -> new EcuInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuTimingWrapper> getEcuTiming() {
        
        if (CollUtil.isNotEmpty(elements.getEcuTiming())) {
            ArrayList<EcuTiming> originalList = elements.getEcuTiming();
            ArrayList<EcuTimingWrapper> wrapperList = (ArrayList<EcuTimingWrapper>)originalList.stream()
                .map(item -> new EcuTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucDefinitionCollectionWrapper> getEcucDefinitionCollection() {
        
        if (CollUtil.isNotEmpty(elements.getEcucDefinitionCollection())) {
            ArrayList<EcucDefinitionCollection> originalList = elements.getEcucDefinitionCollection();
            ArrayList<EcucDefinitionCollectionWrapper> wrapperList = (ArrayList<EcucDefinitionCollectionWrapper>)originalList.stream()
                .map(item -> new EcucDefinitionCollectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucDestinationUriDefSetWrapper> getEcucDestinationUriDefSet() {
        
        if (CollUtil.isNotEmpty(elements.getEcucDestinationUriDefSet())) {
            ArrayList<EcucDestinationUriDefSet> originalList = elements.getEcucDestinationUriDefSet();
            ArrayList<EcucDestinationUriDefSetWrapper> wrapperList = (ArrayList<EcucDestinationUriDefSetWrapper>)originalList.stream()
                .map(item -> new EcucDestinationUriDefSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucModuleConfigurationValuesWrapper> getEcucModuleConfigurationValues() {
        
        if (CollUtil.isNotEmpty(elements.getEcucModuleConfigurationValues())) {
            ArrayList<EcucModuleConfigurationValues> originalList = elements.getEcucModuleConfigurationValues();
            ArrayList<EcucModuleConfigurationValuesWrapper> wrapperList = (ArrayList<EcucModuleConfigurationValuesWrapper>)originalList.stream()
                .map(item -> new EcucModuleConfigurationValuesWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucModuleDefWrapper> getEcucModuleDef() {
        
        if (CollUtil.isNotEmpty(elements.getEcucModuleDef())) {
            ArrayList<EcucModuleDef> originalList = elements.getEcucModuleDef();
            ArrayList<EcucModuleDefWrapper> wrapperList = (ArrayList<EcucModuleDefWrapper>)originalList.stream()
                .map(item -> new EcucModuleDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucValueCollectionWrapper> getEcucValueCollection() {
        
        if (CollUtil.isNotEmpty(elements.getEcucValueCollection())) {
            ArrayList<EcucValueCollection> originalList = elements.getEcucValueCollection();
            ArrayList<EcucValueCollectionWrapper> wrapperList = (ArrayList<EcucValueCollectionWrapper>)originalList.stream()
                .map(item -> new EcucValueCollectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EndToEndProtectionSetWrapper> getEndToEndProtectionSet() {
        
        if (CollUtil.isNotEmpty(elements.getEndToEndProtectionSet())) {
            ArrayList<EndToEndProtectionSet> originalList = elements.getEndToEndProtectionSet();
            ArrayList<EndToEndProtectionSetWrapper> wrapperList = (ArrayList<EndToEndProtectionSetWrapper>)originalList.stream()
                .map(item -> new EndToEndProtectionSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetClusterWrapper> getEthernetCluster() {
        
        if (CollUtil.isNotEmpty(elements.getEthernetCluster())) {
            ArrayList<EthernetCluster> originalList = elements.getEthernetCluster();
            ArrayList<EthernetClusterWrapper> wrapperList = (ArrayList<EthernetClusterWrapper>)originalList.stream()
                .map(item -> new EthernetClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetFrameWrapper> getEthernetFrame() {
        
        if (CollUtil.isNotEmpty(elements.getEthernetFrame())) {
            ArrayList<EthernetFrame> originalList = elements.getEthernetFrame();
            ArrayList<EthernetFrameWrapper> wrapperList = (ArrayList<EthernetFrameWrapper>)originalList.stream()
                .map(item -> new EthernetFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EvaluatedVariantSetWrapper> getEvaluatedVariantSet() {
        
        if (CollUtil.isNotEmpty(elements.getEvaluatedVariantSet())) {
            ArrayList<EvaluatedVariantSet> originalList = elements.getEvaluatedVariantSet();
            ArrayList<EvaluatedVariantSetWrapper> wrapperList = (ArrayList<EvaluatedVariantSetWrapper>)originalList.stream()
                .map(item -> new EvaluatedVariantSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureWrapper> getFmFeature() {
        
        if (CollUtil.isNotEmpty(elements.getFmFeature())) {
            ArrayList<FmFeature> originalList = elements.getFmFeature();
            ArrayList<FmFeatureWrapper> wrapperList = (ArrayList<FmFeatureWrapper>)originalList.stream()
                .map(item -> new FmFeatureWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureMapWrapper> getFmFeatureMap() {
        
        if (CollUtil.isNotEmpty(elements.getFmFeatureMap())) {
            ArrayList<FmFeatureMap> originalList = elements.getFmFeatureMap();
            ArrayList<FmFeatureMapWrapper> wrapperList = (ArrayList<FmFeatureMapWrapper>)originalList.stream()
                .map(item -> new FmFeatureMapWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureModelWrapper> getFmFeatureModel() {
        
        if (CollUtil.isNotEmpty(elements.getFmFeatureModel())) {
            ArrayList<FmFeatureModel> originalList = elements.getFmFeatureModel();
            ArrayList<FmFeatureModelWrapper> wrapperList = (ArrayList<FmFeatureModelWrapper>)originalList.stream()
                .map(item -> new FmFeatureModelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FmFeatureSelectionSetWrapper> getFmFeatureSelectionSet() {
        
        if (CollUtil.isNotEmpty(elements.getFmFeatureSelectionSet())) {
            ArrayList<FmFeatureSelectionSet> originalList = elements.getFmFeatureSelectionSet();
            ArrayList<FmFeatureSelectionSetWrapper> wrapperList = (ArrayList<FmFeatureSelectionSetWrapper>)originalList.stream()
                .map(item -> new FmFeatureSelectionSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlatMapWrapper> getFlatMap() {
        
        if (CollUtil.isNotEmpty(elements.getFlatMap())) {
            ArrayList<FlatMap> originalList = elements.getFlatMap();
            ArrayList<FlatMapWrapper> wrapperList = (ArrayList<FlatMapWrapper>)originalList.stream()
                .map(item -> new FlatMapWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayArTpConfigWrapper> getFlexrayArTpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getFlexrayArTpConfig())) {
            ArrayList<FlexrayArTpConfig> originalList = elements.getFlexrayArTpConfig();
            ArrayList<FlexrayArTpConfigWrapper> wrapperList = (ArrayList<FlexrayArTpConfigWrapper>)originalList.stream()
                .map(item -> new FlexrayArTpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayClusterWrapper> getFlexrayCluster() {
        
        if (CollUtil.isNotEmpty(elements.getFlexrayCluster())) {
            ArrayList<FlexrayCluster> originalList = elements.getFlexrayCluster();
            ArrayList<FlexrayClusterWrapper> wrapperList = (ArrayList<FlexrayClusterWrapper>)originalList.stream()
                .map(item -> new FlexrayClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayFrameWrapper> getFlexrayFrame() {
        
        if (CollUtil.isNotEmpty(elements.getFlexrayFrame())) {
            ArrayList<FlexrayFrame> originalList = elements.getFlexrayFrame();
            ArrayList<FlexrayFrameWrapper> wrapperList = (ArrayList<FlexrayFrameWrapper>)originalList.stream()
                .map(item -> new FlexrayFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayTpConfigWrapper> getFlexrayTpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getFlexrayTpConfig())) {
            ArrayList<FlexrayTpConfig> originalList = elements.getFlexrayTpConfig();
            ArrayList<FlexrayTpConfigWrapper> wrapperList = (ArrayList<FlexrayTpConfigWrapper>)originalList.stream()
                .map(item -> new FlexrayTpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GatewayWrapper> getGateway() {
        
        if (CollUtil.isNotEmpty(elements.getGateway())) {
            ArrayList<Gateway> originalList = elements.getGateway();
            ArrayList<GatewayWrapper> wrapperList = (ArrayList<GatewayWrapper>)originalList.stream()
                .map(item -> new GatewayWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GeneralPurposeIPduWrapper> getGeneralPurposeIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getGeneralPurposeIPdu())) {
            ArrayList<GeneralPurposeIPdu> originalList = elements.getGeneralPurposeIPdu();
            ArrayList<GeneralPurposeIPduWrapper> wrapperList = (ArrayList<GeneralPurposeIPduWrapper>)originalList.stream()
                .map(item -> new GeneralPurposeIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GeneralPurposePduWrapper> getGeneralPurposePdu() {
        
        if (CollUtil.isNotEmpty(elements.getGeneralPurposePdu())) {
            ArrayList<GeneralPurposePdu> originalList = elements.getGeneralPurposePdu();
            ArrayList<GeneralPurposePduWrapper> wrapperList = (ArrayList<GeneralPurposePduWrapper>)originalList.stream()
                .map(item -> new GeneralPurposePduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GenericEthernetFrameWrapper> getGenericEthernetFrame() {
        
        if (CollUtil.isNotEmpty(elements.getGenericEthernetFrame())) {
            ArrayList<GenericEthernetFrame> originalList = elements.getGenericEthernetFrame();
            ArrayList<GenericEthernetFrameWrapper> wrapperList = (ArrayList<GenericEthernetFrameWrapper>)originalList.stream()
                .map(item -> new GenericEthernetFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<GlobalTimeDomainWrapper> getGlobalTimeDomain() {
        
        if (CollUtil.isNotEmpty(elements.getGlobalTimeDomain())) {
            ArrayList<GlobalTimeDomain> originalList = elements.getGlobalTimeDomain();
            ArrayList<GlobalTimeDomainWrapper> wrapperList = (ArrayList<GlobalTimeDomainWrapper>)originalList.stream()
                .map(item -> new GlobalTimeDomainWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwCategoryWrapper> getHwCategory() {
        
        if (CollUtil.isNotEmpty(elements.getHwCategory())) {
            ArrayList<HwCategory> originalList = elements.getHwCategory();
            ArrayList<HwCategoryWrapper> wrapperList = (ArrayList<HwCategoryWrapper>)originalList.stream()
                .map(item -> new HwCategoryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementWrapper> getHwElement() {
        
        if (CollUtil.isNotEmpty(elements.getHwElement())) {
            ArrayList<HwElement> originalList = elements.getHwElement();
            ArrayList<HwElementWrapper> wrapperList = (ArrayList<HwElementWrapper>)originalList.stream()
                .map(item -> new HwElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwTypeWrapper> getHwType() {
        
        if (CollUtil.isNotEmpty(elements.getHwType())) {
            ArrayList<HwType> originalList = elements.getHwType();
            ArrayList<HwTypeWrapper> wrapperList = (ArrayList<HwTypeWrapper>)originalList.stream()
                .map(item -> new HwTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalWrapper> getISignal() {
        
        if (CollUtil.isNotEmpty(elements.getISignal())) {
            ArrayList<ISignal> originalList = elements.getISignal();
            ArrayList<ISignalWrapper> wrapperList = (ArrayList<ISignalWrapper>)originalList.stream()
                .map(item -> new ISignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalGroupWrapper> getISignalGroup() {
        
        if (CollUtil.isNotEmpty(elements.getISignalGroup())) {
            ArrayList<ISignalGroup> originalList = elements.getISignalGroup();
            ArrayList<ISignalGroupWrapper> wrapperList = (ArrayList<ISignalGroupWrapper>)originalList.stream()
                .map(item -> new ISignalGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalIPduWrapper> getISignalIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getISignalIPdu())) {
            ArrayList<ISignalIPdu> originalList = elements.getISignalIPdu();
            ArrayList<ISignalIPduWrapper> wrapperList = (ArrayList<ISignalIPduWrapper>)originalList.stream()
                .map(item -> new ISignalIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalIPduGroupWrapper> getISignalIPduGroup() {
        
        if (CollUtil.isNotEmpty(elements.getISignalIPduGroup())) {
            ArrayList<ISignalIPduGroup> originalList = elements.getISignalIPduGroup();
            ArrayList<ISignalIPduGroupWrapper> wrapperList = (ArrayList<ISignalIPduGroupWrapper>)originalList.stream()
                .map(item -> new ISignalIPduGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<Ieee1722TpEthernetFrameWrapper> getIeee1722TpEthernetFrame() {
        
        if (CollUtil.isNotEmpty(elements.getIeee1722TpEthernetFrame())) {
            ArrayList<Ieee1722TpEthernetFrame> originalList = elements.getIeee1722TpEthernetFrame();
            ArrayList<Ieee1722TpEthernetFrameWrapper> wrapperList = (ArrayList<Ieee1722TpEthernetFrameWrapper>)originalList.stream()
                .map(item -> new Ieee1722TpEthernetFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeWrapper> getImplementationDataType() {
        
        if (CollUtil.isNotEmpty(elements.getImplementationDataType())) {
            ArrayList<ImplementationDataType> originalList = elements.getImplementationDataType();
            ArrayList<ImplementationDataTypeWrapper> wrapperList = (ArrayList<ImplementationDataTypeWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InterpolationRoutineMappingSetWrapper> getInterpolationRoutineMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getInterpolationRoutineMappingSet())) {
            ArrayList<InterpolationRoutineMappingSet> originalList = elements.getInterpolationRoutineMappingSet();
            ArrayList<InterpolationRoutineMappingSetWrapper> wrapperList = (ArrayList<InterpolationRoutineMappingSetWrapper>)originalList.stream()
                .map(item -> new InterpolationRoutineMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939ClusterWrapper> getJ1939Cluster() {
        
        if (CollUtil.isNotEmpty(elements.getJ1939Cluster())) {
            ArrayList<J1939Cluster> originalList = elements.getJ1939Cluster();
            ArrayList<J1939ClusterWrapper> wrapperList = (ArrayList<J1939ClusterWrapper>)originalList.stream()
                .map(item -> new J1939ClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939DcmIPduWrapper> getJ1939DcmIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getJ1939DcmIPdu())) {
            ArrayList<J1939DcmIPdu> originalList = elements.getJ1939DcmIPdu();
            ArrayList<J1939DcmIPduWrapper> wrapperList = (ArrayList<J1939DcmIPduWrapper>)originalList.stream()
                .map(item -> new J1939DcmIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939TpConfigWrapper> getJ1939TpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getJ1939TpConfig())) {
            ArrayList<J1939TpConfig> originalList = elements.getJ1939TpConfig();
            ArrayList<J1939TpConfigWrapper> wrapperList = (ArrayList<J1939TpConfigWrapper>)originalList.stream()
                .map(item -> new J1939TpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<KeywordSetWrapper> getKeywordSet() {
        
        if (CollUtil.isNotEmpty(elements.getKeywordSet())) {
            ArrayList<KeywordSet> originalList = elements.getKeywordSet();
            ArrayList<KeywordSetWrapper> wrapperList = (ArrayList<KeywordSetWrapper>)originalList.stream()
                .map(item -> new KeywordSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LifeCycleInfoSetWrapper> getLifeCycleInfoSet() {
        
        if (CollUtil.isNotEmpty(elements.getLifeCycleInfoSet())) {
            ArrayList<LifeCycleInfoSet> originalList = elements.getLifeCycleInfoSet();
            ArrayList<LifeCycleInfoSetWrapper> wrapperList = (ArrayList<LifeCycleInfoSetWrapper>)originalList.stream()
                .map(item -> new LifeCycleInfoSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LifeCycleStateDefinitionGroupWrapper> getLifeCycleStateDefinitionGroup() {
        
        if (CollUtil.isNotEmpty(elements.getLifeCycleStateDefinitionGroup())) {
            ArrayList<LifeCycleStateDefinitionGroup> originalList = elements.getLifeCycleStateDefinitionGroup();
            ArrayList<LifeCycleStateDefinitionGroupWrapper> wrapperList = (ArrayList<LifeCycleStateDefinitionGroupWrapper>)originalList.stream()
                .map(item -> new LifeCycleStateDefinitionGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinClusterWrapper> getLinCluster() {
        
        if (CollUtil.isNotEmpty(elements.getLinCluster())) {
            ArrayList<LinCluster> originalList = elements.getLinCluster();
            ArrayList<LinClusterWrapper> wrapperList = (ArrayList<LinClusterWrapper>)originalList.stream()
                .map(item -> new LinClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinEventTriggeredFrameWrapper> getLinEventTriggeredFrame() {
        
        if (CollUtil.isNotEmpty(elements.getLinEventTriggeredFrame())) {
            ArrayList<LinEventTriggeredFrame> originalList = elements.getLinEventTriggeredFrame();
            ArrayList<LinEventTriggeredFrameWrapper> wrapperList = (ArrayList<LinEventTriggeredFrameWrapper>)originalList.stream()
                .map(item -> new LinEventTriggeredFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinSporadicFrameWrapper> getLinSporadicFrame() {
        
        if (CollUtil.isNotEmpty(elements.getLinSporadicFrame())) {
            ArrayList<LinSporadicFrame> originalList = elements.getLinSporadicFrame();
            ArrayList<LinSporadicFrameWrapper> wrapperList = (ArrayList<LinSporadicFrameWrapper>)originalList.stream()
                .map(item -> new LinSporadicFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinTpConfigWrapper> getLinTpConfig() {
        
        if (CollUtil.isNotEmpty(elements.getLinTpConfig())) {
            ArrayList<LinTpConfig> originalList = elements.getLinTpConfig();
            ArrayList<LinTpConfigWrapper> wrapperList = (ArrayList<LinTpConfigWrapper>)originalList.stream()
                .map(item -> new LinTpConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinUnconditionalFrameWrapper> getLinUnconditionalFrame() {
        
        if (CollUtil.isNotEmpty(elements.getLinUnconditionalFrame())) {
            ArrayList<LinUnconditionalFrame> originalList = elements.getLinUnconditionalFrame();
            ArrayList<LinUnconditionalFrameWrapper> wrapperList = (ArrayList<LinUnconditionalFrameWrapper>)originalList.stream()
                .map(item -> new LinUnconditionalFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McFunctionWrapper> getMcFunction() {
        
        if (CollUtil.isNotEmpty(elements.getMcFunction())) {
            ArrayList<McFunction> originalList = elements.getMcFunction();
            ArrayList<McFunctionWrapper> wrapperList = (ArrayList<McFunctionWrapper>)originalList.stream()
                .map(item -> new McFunctionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupWrapper> getModeDeclarationGroup() {
        
        if (CollUtil.isNotEmpty(elements.getModeDeclarationGroup())) {
            ArrayList<ModeDeclarationGroup> originalList = elements.getModeDeclarationGroup();
            ArrayList<ModeDeclarationGroupWrapper> wrapperList = (ArrayList<ModeDeclarationGroupWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationMappingSetWrapper> getModeDeclarationMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getModeDeclarationMappingSet())) {
            ArrayList<ModeDeclarationMappingSet> originalList = elements.getModeDeclarationMappingSet();
            ArrayList<ModeDeclarationMappingSetWrapper> wrapperList = (ArrayList<ModeDeclarationMappingSetWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeSwitchInterfaceWrapper> getModeSwitchInterface() {
        
        if (CollUtil.isNotEmpty(elements.getModeSwitchInterface())) {
            ArrayList<ModeSwitchInterface> originalList = elements.getModeSwitchInterface();
            ArrayList<ModeSwitchInterfaceWrapper> wrapperList = (ArrayList<ModeSwitchInterfaceWrapper>)originalList.stream()
                .map(item -> new ModeSwitchInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MultiplexedIPduWrapper> getMultiplexedIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getMultiplexedIPdu())) {
            ArrayList<MultiplexedIPdu> originalList = elements.getMultiplexedIPdu();
            ArrayList<MultiplexedIPduWrapper> wrapperList = (ArrayList<MultiplexedIPduWrapper>)originalList.stream()
                .map(item -> new MultiplexedIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NPduWrapper> getNPdu() {
        
        if (CollUtil.isNotEmpty(elements.getNPdu())) {
            ArrayList<NPdu> originalList = elements.getNPdu();
            ArrayList<NPduWrapper> wrapperList = (ArrayList<NPduWrapper>)originalList.stream()
                .map(item -> new NPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NmConfigWrapper> getNmConfig() {
        
        if (CollUtil.isNotEmpty(elements.getNmConfig())) {
            ArrayList<NmConfig> originalList = elements.getNmConfig();
            ArrayList<NmConfigWrapper> wrapperList = (ArrayList<NmConfigWrapper>)originalList.stream()
                .map(item -> new NmConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NmPduWrapper> getNmPdu() {
        
        if (CollUtil.isNotEmpty(elements.getNmPdu())) {
            ArrayList<NmPdu> originalList = elements.getNmPdu();
            ArrayList<NmPduWrapper> wrapperList = (ArrayList<NmPduWrapper>)originalList.stream()
                .map(item -> new NmPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvBlockSwComponentTypeWrapper> getNvBlockSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getNvBlockSwComponentType())) {
            ArrayList<NvBlockSwComponentType> originalList = elements.getNvBlockSwComponentType();
            ArrayList<NvBlockSwComponentTypeWrapper> wrapperList = (ArrayList<NvBlockSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new NvBlockSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvDataInterfaceWrapper> getNvDataInterface() {
        
        if (CollUtil.isNotEmpty(elements.getNvDataInterface())) {
            ArrayList<NvDataInterface> originalList = elements.getNvDataInterface();
            ArrayList<NvDataInterfaceWrapper> wrapperList = (ArrayList<NvDataInterfaceWrapper>)originalList.stream()
                .map(item -> new NvDataInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterInterfaceWrapper> getParameterInterface() {
        
        if (CollUtil.isNotEmpty(elements.getParameterInterface())) {
            ArrayList<ParameterInterface> originalList = elements.getParameterInterface();
            ArrayList<ParameterInterfaceWrapper> wrapperList = (ArrayList<ParameterInterfaceWrapper>)originalList.stream()
                .map(item -> new ParameterInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterSwComponentTypeWrapper> getParameterSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getParameterSwComponentType())) {
            ArrayList<ParameterSwComponentType> originalList = elements.getParameterSwComponentType();
            ArrayList<ParameterSwComponentTypeWrapper> wrapperList = (ArrayList<ParameterSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new ParameterSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PdurIPduGroupWrapper> getPdurIPduGroup() {
        
        if (CollUtil.isNotEmpty(elements.getPdurIPduGroup())) {
            ArrayList<PdurIPduGroup> originalList = elements.getPdurIPduGroup();
            ArrayList<PdurIPduGroupWrapper> wrapperList = (ArrayList<PdurIPduGroupWrapper>)originalList.stream()
                .map(item -> new PdurIPduGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PhysicalDimensionWrapper> getPhysicalDimension() {
        
        if (CollUtil.isNotEmpty(elements.getPhysicalDimension())) {
            ArrayList<PhysicalDimension> originalList = elements.getPhysicalDimension();
            ArrayList<PhysicalDimensionWrapper> wrapperList = (ArrayList<PhysicalDimensionWrapper>)originalList.stream()
                .map(item -> new PhysicalDimensionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PhysicalDimensionMappingSetWrapper> getPhysicalDimensionMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getPhysicalDimensionMappingSet())) {
            ArrayList<PhysicalDimensionMappingSet> originalList = elements.getPhysicalDimensionMappingSet();
            ArrayList<PhysicalDimensionMappingSetWrapper> wrapperList = (ArrayList<PhysicalDimensionMappingSetWrapper>)originalList.stream()
                .map(item -> new PhysicalDimensionMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortInterfaceMappingSetWrapper> getPortInterfaceMappingSet() {
        
        if (CollUtil.isNotEmpty(elements.getPortInterfaceMappingSet())) {
            ArrayList<PortInterfaceMappingSet> originalList = elements.getPortInterfaceMappingSet();
            ArrayList<PortInterfaceMappingSetWrapper> wrapperList = (ArrayList<PortInterfaceMappingSetWrapper>)originalList.stream()
                .map(item -> new PortInterfaceMappingSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortPrototypeBlueprintWrapper> getPortPrototypeBlueprint() {
        
        if (CollUtil.isNotEmpty(elements.getPortPrototypeBlueprint())) {
            ArrayList<PortPrototypeBlueprint> originalList = elements.getPortPrototypeBlueprint();
            ArrayList<PortPrototypeBlueprintWrapper> wrapperList = (ArrayList<PortPrototypeBlueprintWrapper>)originalList.stream()
                .map(item -> new PortPrototypeBlueprintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantCriterionWrapper> getPostBuildVariantCriterion() {
        
        if (CollUtil.isNotEmpty(elements.getPostBuildVariantCriterion())) {
            ArrayList<PostBuildVariantCriterion> originalList = elements.getPostBuildVariantCriterion();
            ArrayList<PostBuildVariantCriterionWrapper> wrapperList = (ArrayList<PostBuildVariantCriterionWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantCriterionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantCriterionValueSetWrapper> getPostBuildVariantCriterionValueSet() {
        
        if (CollUtil.isNotEmpty(elements.getPostBuildVariantCriterionValueSet())) {
            ArrayList<PostBuildVariantCriterionValueSet> originalList = elements.getPostBuildVariantCriterionValueSet();
            ArrayList<PostBuildVariantCriterionValueSetWrapper> wrapperList = (ArrayList<PostBuildVariantCriterionValueSetWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantCriterionValueSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PredefinedVariantWrapper> getPredefinedVariant() {
        
        if (CollUtil.isNotEmpty(elements.getPredefinedVariant())) {
            ArrayList<PredefinedVariant> originalList = elements.getPredefinedVariant();
            ArrayList<PredefinedVariantWrapper> wrapperList = (ArrayList<PredefinedVariantWrapper>)originalList.stream()
                .map(item -> new PredefinedVariantWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RapidPrototypingScenarioWrapper> getRapidPrototypingScenario() {
        
        if (CollUtil.isNotEmpty(elements.getRapidPrototypingScenario())) {
            ArrayList<RapidPrototypingScenario> originalList = elements.getRapidPrototypingScenario();
            ArrayList<RapidPrototypingScenarioWrapper> wrapperList = (ArrayList<RapidPrototypingScenarioWrapper>)originalList.stream()
                .map(item -> new RapidPrototypingScenarioWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SecuredIPduWrapper> getSecuredIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getSecuredIPdu())) {
            ArrayList<SecuredIPdu> originalList = elements.getSecuredIPdu();
            ArrayList<SecuredIPduWrapper> wrapperList = (ArrayList<SecuredIPduWrapper>)originalList.stream()
                .map(item -> new SecuredIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SenderReceiverInterfaceWrapper> getSenderReceiverInterface() {
        
        if (CollUtil.isNotEmpty(elements.getSenderReceiverInterface())) {
            ArrayList<SenderReceiverInterface> originalList = elements.getSenderReceiverInterface();
            ArrayList<SenderReceiverInterfaceWrapper> wrapperList = (ArrayList<SenderReceiverInterfaceWrapper>)originalList.stream()
                .map(item -> new SenderReceiverInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SensorActuatorSwComponentTypeWrapper> getSensorActuatorSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getSensorActuatorSwComponentType())) {
            ArrayList<SensorActuatorSwComponentType> originalList = elements.getSensorActuatorSwComponentType();
            ArrayList<SensorActuatorSwComponentTypeWrapper> wrapperList = (ArrayList<SensorActuatorSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new SensorActuatorSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SerializationTechnologyWrapper> getSerializationTechnology() {
        
        if (CollUtil.isNotEmpty(elements.getSerializationTechnology())) {
            ArrayList<SerializationTechnology> originalList = elements.getSerializationTechnology();
            ArrayList<SerializationTechnologyWrapper> wrapperList = (ArrayList<SerializationTechnologyWrapper>)originalList.stream()
                .map(item -> new SerializationTechnologyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceProxySwComponentTypeWrapper> getServiceProxySwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getServiceProxySwComponentType())) {
            ArrayList<ServiceProxySwComponentType> originalList = elements.getServiceProxySwComponentType();
            ArrayList<ServiceProxySwComponentTypeWrapper> wrapperList = (ArrayList<ServiceProxySwComponentTypeWrapper>)originalList.stream()
                .map(item -> new ServiceProxySwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceSwComponentTypeWrapper> getServiceSwComponentType() {
        
        if (CollUtil.isNotEmpty(elements.getServiceSwComponentType())) {
            ArrayList<ServiceSwComponentType> originalList = elements.getServiceSwComponentType();
            ArrayList<ServiceSwComponentTypeWrapper> wrapperList = (ArrayList<ServiceSwComponentTypeWrapper>)originalList.stream()
                .map(item -> new ServiceSwComponentTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SoAdRoutingGroupWrapper> getSoAdRoutingGroup() {
        
        if (CollUtil.isNotEmpty(elements.getSoAdRoutingGroup())) {
            ArrayList<SoAdRoutingGroup> originalList = elements.getSoAdRoutingGroup();
            ArrayList<SoAdRoutingGroupWrapper> wrapperList = (ArrayList<SoAdRoutingGroupWrapper>)originalList.stream()
                .map(item -> new SoAdRoutingGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwAddrMethodWrapper> getSwAddrMethod() {
        
        if (CollUtil.isNotEmpty(elements.getSwAddrMethod())) {
            ArrayList<SwAddrMethod> originalList = elements.getSwAddrMethod();
            ArrayList<SwAddrMethodWrapper> wrapperList = (ArrayList<SwAddrMethodWrapper>)originalList.stream()
                .map(item -> new SwAddrMethodWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwAxisTypeWrapper> getSwAxisType() {
        
        if (CollUtil.isNotEmpty(elements.getSwAxisType())) {
            ArrayList<SwAxisType> originalList = elements.getSwAxisType();
            ArrayList<SwAxisTypeWrapper> wrapperList = (ArrayList<SwAxisTypeWrapper>)originalList.stream()
                .map(item -> new SwAxisTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwBaseTypeWrapper> getSwBaseType() {
        
        if (CollUtil.isNotEmpty(elements.getSwBaseType())) {
            ArrayList<SwBaseType> originalList = elements.getSwBaseType();
            ArrayList<SwBaseTypeWrapper> wrapperList = (ArrayList<SwBaseTypeWrapper>)originalList.stream()
                .map(item -> new SwBaseTypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutWrapper> getSwRecordLayout() {
        
        if (CollUtil.isNotEmpty(elements.getSwRecordLayout())) {
            ArrayList<SwRecordLayout> originalList = elements.getSwRecordLayout();
            ArrayList<SwRecordLayoutWrapper> wrapperList = (ArrayList<SwRecordLayoutWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwSystemconstWrapper> getSwSystemconst() {
        
        if (CollUtil.isNotEmpty(elements.getSwSystemconst())) {
            ArrayList<SwSystemconst> originalList = elements.getSwSystemconst();
            ArrayList<SwSystemconstWrapper> wrapperList = (ArrayList<SwSystemconstWrapper>)originalList.stream()
                .map(item -> new SwSystemconstWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwSystemconstantValueSetWrapper> getSwSystemconstantValueSet() {
        
        if (CollUtil.isNotEmpty(elements.getSwSystemconstantValueSet())) {
            ArrayList<SwSystemconstantValueSet> originalList = elements.getSwSystemconstantValueSet();
            ArrayList<SwSystemconstantValueSetWrapper> wrapperList = (ArrayList<SwSystemconstantValueSetWrapper>)originalList.stream()
                .map(item -> new SwSystemconstantValueSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcBswMappingWrapper> getSwcBswMapping() {
        
        if (CollUtil.isNotEmpty(elements.getSwcBswMapping())) {
            ArrayList<SwcBswMapping> originalList = elements.getSwcBswMapping();
            ArrayList<SwcBswMappingWrapper> wrapperList = (ArrayList<SwcBswMappingWrapper>)originalList.stream()
                .map(item -> new SwcBswMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcImplementationWrapper> getSwcImplementation() {
        
        if (CollUtil.isNotEmpty(elements.getSwcImplementation())) {
            ArrayList<SwcImplementation> originalList = elements.getSwcImplementation();
            ArrayList<SwcImplementationWrapper> wrapperList = (ArrayList<SwcImplementationWrapper>)originalList.stream()
                .map(item -> new SwcImplementationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcTimingWrapper> getSwcTiming() {
        
        if (CollUtil.isNotEmpty(elements.getSwcTiming())) {
            ArrayList<SwcTiming> originalList = elements.getSwcTiming();
            ArrayList<SwcTimingWrapper> wrapperList = (ArrayList<SwcTimingWrapper>)originalList.stream()
                .map(item -> new SwcTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemWrapper> getSystem() {
        
        if (CollUtil.isNotEmpty(elements.getSystem())) {
            ArrayList<System> originalList = elements.getSystem();
            ArrayList<SystemWrapper> wrapperList = (ArrayList<SystemWrapper>)originalList.stream()
                .map(item -> new SystemWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemSignalWrapper> getSystemSignal() {
        
        if (CollUtil.isNotEmpty(elements.getSystemSignal())) {
            ArrayList<SystemSignal> originalList = elements.getSystemSignal();
            ArrayList<SystemSignalWrapper> wrapperList = (ArrayList<SystemSignalWrapper>)originalList.stream()
                .map(item -> new SystemSignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemSignalGroupWrapper> getSystemSignalGroup() {
        
        if (CollUtil.isNotEmpty(elements.getSystemSignalGroup())) {
            ArrayList<SystemSignalGroup> originalList = elements.getSystemSignalGroup();
            ArrayList<SystemSignalGroupWrapper> wrapperList = (ArrayList<SystemSignalGroupWrapper>)originalList.stream()
                .map(item -> new SystemSignalGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemTimingWrapper> getSystemTiming() {
        
        if (CollUtil.isNotEmpty(elements.getSystemTiming())) {
            ArrayList<SystemTiming> originalList = elements.getSystemTiming();
            ArrayList<SystemTimingWrapper> wrapperList = (ArrayList<SystemTimingWrapper>)originalList.stream()
                .map(item -> new SystemTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerInterfaceWrapper> getTriggerInterface() {
        
        if (CollUtil.isNotEmpty(elements.getTriggerInterface())) {
            ArrayList<TriggerInterface> originalList = elements.getTriggerInterface();
            ArrayList<TriggerInterfaceWrapper> wrapperList = (ArrayList<TriggerInterfaceWrapper>)originalList.stream()
                .map(item -> new TriggerInterfaceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanClusterWrapper> getTtcanCluster() {
        
        if (CollUtil.isNotEmpty(elements.getTtcanCluster())) {
            ArrayList<TtcanCluster> originalList = elements.getTtcanCluster();
            ArrayList<TtcanClusterWrapper> wrapperList = (ArrayList<TtcanClusterWrapper>)originalList.stream()
                .map(item -> new TtcanClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitWrapper> getUnit() {
        
        if (CollUtil.isNotEmpty(elements.getUnit())) {
            ArrayList<Unit> originalList = elements.getUnit();
            ArrayList<UnitWrapper> wrapperList = (ArrayList<UnitWrapper>)originalList.stream()
                .map(item -> new UnitWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnitGroupWrapper> getUnitGroup() {
        
        if (CollUtil.isNotEmpty(elements.getUnitGroup())) {
            ArrayList<UnitGroup> originalList = elements.getUnitGroup();
            ArrayList<UnitGroupWrapper> wrapperList = (ArrayList<UnitGroupWrapper>)originalList.stream()
                .map(item -> new UnitGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedClusterWrapper> getUserDefinedCluster() {
        
        if (CollUtil.isNotEmpty(elements.getUserDefinedCluster())) {
            ArrayList<UserDefinedCluster> originalList = elements.getUserDefinedCluster();
            ArrayList<UserDefinedClusterWrapper> wrapperList = (ArrayList<UserDefinedClusterWrapper>)originalList.stream()
                .map(item -> new UserDefinedClusterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedEthernetFrameWrapper> getUserDefinedEthernetFrame() {
        
        if (CollUtil.isNotEmpty(elements.getUserDefinedEthernetFrame())) {
            ArrayList<UserDefinedEthernetFrame> originalList = elements.getUserDefinedEthernetFrame();
            ArrayList<UserDefinedEthernetFrameWrapper> wrapperList = (ArrayList<UserDefinedEthernetFrameWrapper>)originalList.stream()
                .map(item -> new UserDefinedEthernetFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedIPduWrapper> getUserDefinedIPdu() {
        
        if (CollUtil.isNotEmpty(elements.getUserDefinedIPdu())) {
            ArrayList<UserDefinedIPdu> originalList = elements.getUserDefinedIPdu();
            ArrayList<UserDefinedIPduWrapper> wrapperList = (ArrayList<UserDefinedIPduWrapper>)originalList.stream()
                .map(item -> new UserDefinedIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedPduWrapper> getUserDefinedPdu() {
        
        if (CollUtil.isNotEmpty(elements.getUserDefinedPdu())) {
            ArrayList<UserDefinedPdu> originalList = elements.getUserDefinedPdu();
            ArrayList<UserDefinedPduWrapper> wrapperList = (ArrayList<UserDefinedPduWrapper>)originalList.stream()
                .map(item -> new UserDefinedPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VfbTimingWrapper> getVfbTiming() {
        
        if (CollUtil.isNotEmpty(elements.getVfbTiming())) {
            ArrayList<VfbTiming> originalList = elements.getVfbTiming();
            ArrayList<VfbTimingWrapper> wrapperList = (ArrayList<VfbTimingWrapper>)originalList.stream()
                .map(item -> new VfbTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ViewMapSetWrapper> getViewMapSet() {
        
        if (CollUtil.isNotEmpty(elements.getViewMapSet())) {
            ArrayList<ViewMapSet> originalList = elements.getViewMapSet();
            ArrayList<ViewMapSetWrapper> wrapperList = (ArrayList<ViewMapSetWrapper>)originalList.stream()
                .map(item -> new ViewMapSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<XcpPduWrapper> getXcpPdu() {
        
        if (CollUtil.isNotEmpty(elements.getXcpPdu())) {
            ArrayList<XcpPdu> originalList = elements.getXcpPdu();
            ArrayList<XcpPduWrapper> wrapperList = (ArrayList<XcpPduWrapper>)originalList.stream()
                .map(item -> new XcpPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
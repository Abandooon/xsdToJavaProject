package stdgui.data.entity.schema;

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRegistry
@XmlRootElement(name = "OBJECT-FACTORY")
public class ObjectFactory {
	private static final QName _Autosar_QNAME = new QName("http://autosar.org/schema/r4.0", "AUTOSAR");
	private static final QName _UnlimitedIntegerValueVariationPointSyscStringRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "SYSC-STRING-REF");
	private static final QName _UnlimitedIntegerValueVariationPointSyscRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "SYSC-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaArgumentRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "ARGUMENT-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaEventRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "EVENT-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaVariableRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "VARIABLE-REF");
	private static final QName _SingleLanguageUnitNamesSup_QNAME = new QName("http://autosar.org/schema/r4.0", "SUP");
	private static final QName _SingleLanguageUnitNamesSub_QNAME = new QName("http://autosar.org/schema/r4.0", "SUB");
	private static final QName _SingleLanguageLongNameTt_QNAME = new QName("http://autosar.org/schema/r4.0", "TT");
	private static final QName _SingleLanguageLongNameE_QNAME = new QName("http://autosar.org/schema/r4.0", "E");
	private static final QName _SingleLanguageLongNameIe_QNAME = new QName("http://autosar.org/schema/r4.0", "IE");
	private static final QName _LVerbatimXref_QNAME = new QName("http://autosar.org/schema/r4.0", "XREF");
	private static final QName _LVerbatimBr_QNAME = new QName("http://autosar.org/schema/r4.0", "BR");
	private static final QName _LParagraphFt_QNAME = new QName("http://autosar.org/schema/r4.0", "FT");
	private static final QName _LParagraphTraceRef_QNAME = new QName("http://autosar.org/schema/r4.0", "TRACE-REF");
	private static final QName _LParagraphXrefTarget_QNAME = new QName("http://autosar.org/schema/r4.0", "XREF-TARGET");
	private static final QName _LParagraphStd_QNAME = new QName("http://autosar.org/schema/r4.0", "STD");
	private static final QName _LParagraphXdoc_QNAME = new QName("http://autosar.org/schema/r4.0", "XDOC");
	private static final QName _LParagraphXfile_QNAME = new QName("http://autosar.org/schema/r4.0", "XFILE");
	private static final QName _FmConditionByFeaturesAndSwSystemconstsFeatureRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "FEATURE-REF");
	private static final QName _FmConditionByFeaturesAndAttributesAttributeRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "ATTRIBUTE-REF");
	private static final QName _EcucQueryExpressionConfigElementDefGlobalRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "CONFIG-ELEMENT-DEF-GLOBAL-REF");
	private static final QName _EcucQueryExpressionConfigElementDefLocalRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "CONFIG-ELEMENT-DEF-LOCAL-REF");
	private static final QName _EcucParameterDerivationFormulaEcucQueryRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "ECUC-QUERY-REF");
	private static final QName _EcucParameterDerivationFormulaEcucQueryStringRef_QNAME = new QName(
			"http://autosar.org/schema/r4.0", "ECUC-QUERY-STRING-REF");
	private static final QName _BlueprintFormulaEcucRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ECUC-REF");
	private static final QName _BlueprintFormulaVerbatim_QNAME = new QName("http://autosar.org/schema/r4.0",
			"VERBATIM");

	public ObjectFactory() {
	}

	public XrefTarget createXrefTarget() {
		return new XrefTarget();
	}

	public Xref createXref() {
		return new Xref();
	}

	public XcpPdu createXcpPdu() {
		return new XcpPdu();
	}

	public WorstCaseStackUsage createWorstCaseStackUsage() {
		return new WorstCaseStackUsage();
	}

	public WorstCaseHeapUsage createWorstCaseHeapUsage() {
		return new WorstCaseHeapUsage();
	}

	public WarningIndicatorRequestedBitNeeds createWarningIndicatorRequestedBitNeeds() {
		return new WarningIndicatorRequestedBitNeeds();
	}

	public WaitPoint createWaitPoint() {
		return new WaitPoint();
	}

	public VlanMembership createVlanMembership() {
		return new VlanMembership();
	}

	public ViewMapSet createViewMapSet() {
		return new ViewMapSet();
	}

	public ViewMap createViewMap() {
		return new ViewMap();
	}

	public SecondElementRefs createViewMapSecondElementRefs() {
		return new SecondElementRefs();
	}

	public FirstElementRefs createViewMapFirstElementRefs() {
		return new FirstElementRefs();
	}

	public VfbTiming createVfbTiming() {
		return new VfbTiming();
	}

	public VariationPointProxy createVariationPointProxy() {
		return new VariationPointProxy();
	}

	public VariationPoint createVariationPoint() {
		return new VariationPoint();
	}

	public VariableInComponentInstanceRef createVariableInComponentInstanceRef() {
		return new VariableInComponentInstanceRef();
	}

	public VariableInAtomicSwcTypeInstanceRef createVariableInAtomicSwcTypeInstanceRef() {
		return new VariableInAtomicSwcTypeInstanceRef();
	}

	public VariableDataPrototypeInSystemInstanceRef createVariableDataPrototypeInSystemInstanceRef() {
		return new VariableDataPrototypeInSystemInstanceRef();
	}

	public VariableDataPrototypeInCompositionInstanceRef createVariableDataPrototypeInCompositionInstanceRef() {
		return new VariableDataPrototypeInCompositionInstanceRef();
	}

	public VariableDataPrototype createVariableDataPrototype() {
		return new VariableDataPrototype();
	}

	public VariableAndParameterInterfaceMapping createVariableAndParameterInterfaceMapping() {
		return new VariableAndParameterInterfaceMapping();
	}

	public VariableAccessInEcuInstanceRef createVariableAccessInEcuInstanceRef() {
		return new VariableAccessInEcuInstanceRef();
	}

	public UserDefinedTransformationISignalPropsConditional createUserDefinedTransformationISignalPropsConditional() {
		return new UserDefinedTransformationISignalPropsConditional();
	}

	public UserDefinedTransformationISignalProps createUserDefinedTransformationISignalProps() {
		return new UserDefinedTransformationISignalProps();
	}

	public UserDefinedPhysicalChannel createUserDefinedPhysicalChannel() {
		return new UserDefinedPhysicalChannel();
	}

	public UserDefinedEthernetFrame createUserDefinedEthernetFrame() {
		return new UserDefinedEthernetFrame();
	}

	public UserDefinedCommunicationController createUserDefinedCommunicationController() {
		return new UserDefinedCommunicationController();
	}

	public UserDefinedCommunicationConnector createUserDefinedCommunicationConnector() {
		return new UserDefinedCommunicationConnector();
	}

	public UserDefinedClusterConditional createUserDefinedClusterConditional() {
		return new UserDefinedClusterConditional();
	}

	public UserDefinedCluster createUserDefinedCluster() {
		return new UserDefinedCluster();
	}

	public UnlimitedIntegerValueVariationPoint createUnlimitedIntegerValueVariationPoint() {
		return new UnlimitedIntegerValueVariationPoint();
	}

	public UnitGroup createUnitGroup() {
		return new UnitGroup();
	}

	public UnitRefs createUnitGroupUnitRefs() {
		return new UnitRefs();
	}

	public Unit createUnit() {
		return new Unit();
	}

	public UnassignFrameId createUnassignFrameId() {
		return new UnassignFrameId();
	}

	public UdpNmNode createUdpNmNode() {
		return new UdpNmNode();
	}

	public TxNmPduRefs createUdpNmNodeTxNmPduRefs() {
		return new TxNmPduRefs();
	}

	public RxNmPduRefs createUdpNmNodeRxNmPduRefs() {
		return new RxNmPduRefs();
	}

	public UdpNmClusterCoupling createUdpNmClusterCoupling() {
		return new UdpNmClusterCoupling();
	}

	public CoupledClusterRefs createUdpNmClusterCouplingCoupledClusterRefs() {
		return new CoupledClusterRefs();
	}

	public UdpNmCluster createUdpNmCluster() {
		return new UdpNmCluster();
	}

	public TtcanCommunicationControllerConditional createTtcanCommunicationControllerConditional() {
		return new TtcanCommunicationControllerConditional();
	}

	public TtcanCommunicationController createTtcanCommunicationController() {
		return new TtcanCommunicationController();
	}

	public TtcanCluster createTtcanCluster() {
		return new TtcanCluster();
	}

	public TtcanAbsolutelyScheduledTiming createTtcanAbsolutelyScheduledTiming() {
		return new TtcanAbsolutelyScheduledTiming();
	}

	public TriggerToSignalMapping createTriggerToSignalMapping() {
		return new TriggerToSignalMapping();
	}

	public ServiceInstanceRefs createTriggerToSignalMappingServiceInstanceRefs() {
		return new ServiceInstanceRefs();
	}

	public EventHandlerRefs createTriggerToSignalMappingEventHandlerRefs() {
		return new EventHandlerRefs();
	}

	public EventGroupRefs createTriggerToSignalMappingEventGroupRefs() {
		return new EventGroupRefs();
	}

	public TriggerRefConditional createTriggerRefConditional() {
		return new TriggerRefConditional();
	}

	public TriggerPortAnnotation createTriggerPortAnnotation() {
		return new TriggerPortAnnotation();
	}

	public TriggerMapping createTriggerMapping() {
		return new TriggerMapping();
	}

	public TriggerInterfaceMapping createTriggerInterfaceMapping() {
		return new TriggerInterfaceMapping();
	}

	public TriggerInterface createTriggerInterface() {
		return new TriggerInterface();
	}

	public TriggerInSystemInstanceRef createTriggerInSystemInstanceRef() {
		return new TriggerInSystemInstanceRef();
	}

	public TriggerIPduSendCondition createTriggerIPduSendCondition() {
		return new TriggerIPduSendCondition();
	}

	public ModeDeclarationRefs createTriggerIPduSendConditionModeDeclarationRefs() {
		return new ModeDeclarationRefs();
	}

	public TransmissionModeDeclaration createTransmissionModeDeclaration() {
		return new TransmissionModeDeclaration();
	}

	public TransmissionModeCondition createTransmissionModeCondition() {
		return new TransmissionModeCondition();
	}

	public TransformerHardErrorEvent createTransformerHardErrorEvent() {
		return new TransformerHardErrorEvent();
	}

	public TransformationTechnology createTransformationTechnology() {
		return new TransformationTechnology();
	}

	public TraceableText createTraceableText() {
		return new TraceableText();
	}

	public TraceRefs createTraceableTextTraceRefs() {
		return new TraceRefs();
	}

	public TimingDescriptionEventChain createTimingDescriptionEventChain() {
		return new TimingDescriptionEventChain();
	}

	public SegmentRefs createTimingDescriptionEventChainSegmentRefs() {
		return new SegmentRefs();
	}

	public TimeSyncClientConfiguration createTimeSyncClientConfiguration() {
		return new TimeSyncClientConfiguration();
	}

	public TimeRangeType createTimeRangeType() {
		return new TimeRangeType();
	}

	public TextTableMapping createTextTableMapping() {
		return new TextTableMapping();
	}

	public TargetIPduRef createTargetIPduRef() {
		return new TargetIPduRef();
	}

	public TdEventVfbReference createTdEventVfbReference() {
		return new TdEventVfbReference();
	}

	public TdEventVariableDataPrototype createTdEventVariableDataPrototype() {
		return new TdEventVariableDataPrototype();
	}

	public TdEventTrigger createTdEventTrigger() {
		return new TdEventTrigger();
	}

	public TdEventTtCanCycleStart createTdEventTtCanCycleStart() {
		return new TdEventTtCanCycleStart();
	}

	public TdEventSwcInternalBehaviorReference createTdEventSwcInternalBehaviorReference() {
		return new TdEventSwcInternalBehaviorReference();
	}

	public TdEventSwcInternalBehavior createTdEventSwcInternalBehavior() {
		return new TdEventSwcInternalBehavior();
	}

	public TdEventOperation createTdEventOperation() {
		return new TdEventOperation();
	}

	public TdEventOccurrenceExpressionFormula createTdEventOccurrenceExpressionFormula() {
		return new TdEventOccurrenceExpressionFormula();
	}

	public TdEventOccurrenceExpression createTdEventOccurrenceExpression() {
		return new TdEventOccurrenceExpression();
	}

	public TdEventModeDeclaration createTdEventModeDeclaration() {
		return new TdEventModeDeclaration();
	}

	public TdEventISignal createTdEventISignal() {
		return new TdEventISignal();
	}

	public TdEventIPdu createTdEventIPdu() {
		return new TdEventIPdu();
	}

	public TdEventFrame createTdEventFrame() {
		return new TdEventFrame();
	}

	public TdEventFrClusterCycleStart createTdEventFrClusterCycleStart() {
		return new TdEventFrClusterCycleStart();
	}

	public TdEventBswModule createTdEventBswModule() {
		return new TdEventBswModule();
	}

	public TdEventBswModeDeclaration createTdEventBswModeDeclaration() {
		return new TdEventBswModeDeclaration();
	}

	public TdEventBswInternalBehavior createTdEventBswInternalBehavior() {
		return new TdEventBswInternalBehavior();
	}

	public SystemTiming createSystemTiming() {
		return new SystemTiming();
	}

	public SystemSignalGroup createSystemSignalGroup() {
		return new SystemSignalGroup();
	}

	public SystemSignalRefs createSystemSignalGroupSystemSignalRefs() {
		return new SystemSignalRefs();
	}

	public SystemMapping createSystemMapping() {
		return new SystemMapping();
	}

	public System createSystem() {
		return new System();
	}

	public ClientIdDefinitionSetRefs createSystemClientIdDefinitionSetRefs() {
		return new ClientIdDefinitionSetRefs();
	}

	public SynchronousServerCallPoint createSynchronousServerCallPoint() {
		return new SynchronousServerCallPoint();
	}

	public SynchronizationTimingConstraint createSynchronizationTimingConstraint() {
		return new SynchronizationTimingConstraint();
	}

	public ScopeRefs createSynchronizationTimingConstraintScopeRefs() {
		return new ScopeRefs();
	}

	public ScopeEventRefs createSynchronizationTimingConstraintScopeEventRefs() {
		return new ScopeEventRefs();
	}

	public SwcToSwcSignal createSwcToSwcSignal() {
		return new SwcToSwcSignal();
	}

	public SwcToSwcOperationArguments createSwcToSwcOperationArguments() {
		return new SwcToSwcOperationArguments();
	}

	public SwcToImplMapping createSwcToImplMapping() {
		return new SwcToImplMapping();
	}

	public SwcToEcuMappingConstraint createSwcToEcuMappingConstraint() {
		return new SwcToEcuMappingConstraint();
	}

	public EcuInstanceRefs createSwcToEcuMappingConstraintEcuInstanceRefs() {
		return new EcuInstanceRefs();
	}

	public SwcToEcuMapping createSwcToEcuMapping() {
		return new SwcToEcuMapping();
	}

	public SwcTiming createSwcTiming() {
		return new SwcTiming();
	}

	public SwcServiceDependencyInCompositionInstanceRef createSwcServiceDependencyInCompositionInstanceRef() {
		return new SwcServiceDependencyInCompositionInstanceRef();
	}

	public SwcServiceDependency createSwcServiceDependency() {
		return new SwcServiceDependency();
	}

	public SwcModeSwitchEvent createSwcModeSwitchEvent() {
		return new SwcModeSwitchEvent();
	}

	public SwcInternalBehavior createSwcInternalBehavior() {
		return new SwcInternalBehavior();
	}

	public DataTypeMappingRefs createSwcInternalBehaviorDataTypeMappingRefs() {
		return new DataTypeMappingRefs();
	}

	public ConstantValueMappingRefs createSwcInternalBehaviorConstantValueMappingRefs() {
		return new ConstantValueMappingRefs();
	}

	public SwcImplementation createSwcImplementation() {
		return new SwcImplementation();
	}

	public HwElementRefs createSwcImplementationHwElementRefs() {
		return new HwElementRefs();
	}

	public SwcBswSynchronizedTrigger createSwcBswSynchronizedTrigger() {
		return new SwcBswSynchronizedTrigger();
	}

	public SwcBswSynchronizedModeGroupPrototype createSwcBswSynchronizedModeGroupPrototype() {
		return new SwcBswSynchronizedModeGroupPrototype();
	}

	public SwcBswRunnableMapping createSwcBswRunnableMapping() {
		return new SwcBswRunnableMapping();
	}

	public SwcBswMapping createSwcBswMapping() {
		return new SwcBswMapping();
	}

	public SwVariableRefProxy createSwVariableRefProxy() {
		return new SwVariableRefProxy();
	}

	public SwValueCont createSwValueCont() {
		return new SwValueCont();
	}

	public SwTextProps createSwTextProps() {
		return new SwTextProps();
	}

	public SwSystemconstantValueSet createSwSystemconstantValueSet() {
		return new SwSystemconstantValueSet();
	}

	public SwSystemconstValue createSwSystemconstValue() {
		return new SwSystemconstValue();
	}

	public SwRecordLayoutV createSwRecordLayoutV() {
		return new SwRecordLayoutV();
	}

	public SwRecordLayoutGroupContent createSwRecordLayoutGroupContent() {
		return new SwRecordLayoutGroupContent();
	}

	public SwRecordLayoutGroup createSwRecordLayoutGroup() {
		return new SwRecordLayoutGroup();
	}

	public SwPointerTargetProps createSwPointerTargetProps() {
		return new SwPointerTargetProps();
	}

	public SwGenericAxisParamType createSwGenericAxisParamType() {
		return new SwGenericAxisParamType();
	}

	public SwGenericAxisParam createSwGenericAxisParam() {
		return new SwGenericAxisParam();
	}

	public SwDataDependencyArgs createSwDataDependencyArgs() {
		return new SwDataDependencyArgs();
	}

	public SwDataDefPropsConditional createSwDataDefPropsConditional() {
		return new SwDataDefPropsConditional();
	}

	public SwDataDefProps createSwDataDefProps() {
		return new SwDataDefProps();
	}

	public SwComponentPrototype createSwComponentPrototype() {
		return new SwComponentPrototype();
	}

	public SwCalprmAxis createSwCalprmAxis() {
		return new SwCalprmAxis();
	}

	public SwAxisType createSwAxisType() {
		return new SwAxisType();
	}

	public SwAxisIndividual createSwAxisIndividual() {
		return new SwAxisIndividual();
	}

	public SwAxisGrouped createSwAxisGrouped() {
		return new SwAxisGrouped();
	}

	public SwAxisGeneric createSwAxisGeneric() {
		return new SwAxisGeneric();
	}

	public SwAxisCont createSwAxisCont() {
		return new SwAxisCont();
	}

	public SwAddrMethod createSwAddrMethod() {
		return new SwAddrMethod();
	}

	public SubElementMapping createSubElementMapping() {
		return new SubElementMapping();
	}

	public StructuredReq createStructuredReq() {
		return new StructuredReq();
	}

	public TestedItemRefs createStructuredReqTestedItemRefs() {
		return new TestedItemRefs();
	}

	public StaticPart createStaticPart() {
		return new StaticPart();
	}

	public SporadicEventTriggering createSporadicEventTriggering() {
		return new SporadicEventTriggering();
	}

	public SocketConnectionIpduIdentifier createSocketConnectionIpduIdentifier() {
		return new SocketConnectionIpduIdentifier();
	}

	public RoutingGroupRefs createSocketConnectionIpduIdentifierRoutingGroupRefs() {
		return new RoutingGroupRefs();
	}

	public SocketConnectionBundle createSocketConnectionBundle() {
		return new SocketConnectionBundle();
	}

	public SocketConnection createSocketConnection() {
		return new SocketConnection();
	}

	public SocketAddress createSocketAddress() {
		return new SocketAddress();
	}

	public MulticastConnectorRefs createSocketAddressMulticastConnectorRefs() {
		return new MulticastConnectorRefs();
	}

	public SoAdConfig createSoAdConfig() {
		return new SoAdConfig();
	}

	public SimulatedExecutionTime createSimulatedExecutionTime() {
		return new SimulatedExecutionTime();
	}

	public IncludedLibraryRefs createSimulatedExecutionTimeIncludedLibraryRefs() {
		return new IncludedLibraryRefs();
	}

	public SignalIPduReplication createSignalIPduReplication() {
		return new SignalIPduReplication();
	}

	public ReplicaPdusRefs createSignalIPduReplicationReplicaPdusRefs() {
		return new ReplicaPdusRefs();
	}

	public ServiceSwComponentType createServiceSwComponentType() {
		return new ServiceSwComponentType();
	}

	public UnitGroupRefs createServiceSwComponentTypeUnitGroupRefs() {
		return new UnitGroupRefs();
	}

	public ServerComSpec createServerComSpec() {
		return new ServerComSpec();
	}

	public SequenceCounterMapping createSequenceCounterMapping() {
		return new SequenceCounterMapping();
	}

	public SeparateSignalPath createSeparateSignalPath() {
		return new SeparateSignalPath();
	}

	public SensorActuatorSwComponentType createSensorActuatorSwComponentType() {
		return new SensorActuatorSwComponentType();
	}

	public SenderReceiverToSignalMapping createSenderReceiverToSignalMapping() {
		return new SenderReceiverToSignalMapping();
	}

	public SenderReceiverToSignalGroupMapping createSenderReceiverToSignalGroupMapping() {
		return new SenderReceiverToSignalGroupMapping();
	}

	public SenderReceiverInterface createSenderReceiverInterface() {
		return new SenderReceiverInterface();
	}

	public SenderReceiverCompositeElementToSignalMapping createSenderReceiverCompositeElementToSignalMapping() {
		return new SenderReceiverCompositeElementToSignalMapping();
	}

	public SenderRecRecordTypeMapping createSenderRecRecordTypeMapping() {
		return new SenderRecRecordTypeMapping();
	}

	public SenderRecRecordElementMapping createSenderRecRecordElementMapping() {
		return new SenderRecRecordElementMapping();
	}

	public SenderRecArrayTypeMapping createSenderRecArrayTypeMapping() {
		return new SenderRecArrayTypeMapping();
	}

	public SenderRecArrayElementMapping createSenderRecArrayElementMapping() {
		return new SenderRecArrayElementMapping();
	}

	public SenderAnnotation createSenderAnnotation() {
		return new SenderAnnotation();
	}

	public SecuredIPdu createSecuredIPdu() {
		return new SecuredIPdu();
	}

	public SectionNamePrefix createSectionNamePrefix() {
		return new SectionNamePrefix();
	}

	public SdgContents createSdgContents() {
		return new SdgContents();
	}

	public Sdg createSdg() {
		return new Sdg();
	}

	public SdServerConfig createSdServerConfig() {
		return new SdServerConfig();
	}

	public SdClientConfig createSdClientConfig() {
		return new SdClientConfig();
	}

	public SomeipTransformationISignalProps createSomeipTransformationISignalProps() {
		return new SomeipTransformationISignalProps();
	}

	public RunnableEntityInCompositionInstanceRef createRunnableEntityInCompositionInstanceRef() {
		return new RunnableEntityInCompositionInstanceRef();
	}

	public RunnableEntityGroup createRunnableEntityGroup() {
		return new RunnableEntityGroup();
	}

	public RunnableEntity createRunnableEntity() {
		return new RunnableEntity();
	}

	public RunsInsideExclusiveAreaRefs createRunnableEntityRunsInsideExclusiveAreaRefs() {
		return new RunsInsideExclusiveAreaRefs();
	}

	public ExclusiveAreaNestingOrderRefs createRunnableEntityExclusiveAreaNestingOrderRefs() {
		return new ExclusiveAreaNestingOrderRefs();
	}

	public CanEnterExclusiveAreaRefs createRunnableEntityCanEnterExclusiveAreaRefs() {
		return new CanEnterExclusiveAreaRefs();
	}

	public RuleBasedValueSpecification createRuleBasedValueSpecification() {
		return new RuleBasedValueSpecification();
	}

	public RuleBasedValueCont createRuleBasedValueCont() {
		return new RuleBasedValueCont();
	}

	public RuleBasedAxisCont createRuleBasedAxisCont() {
		return new RuleBasedAxisCont();
	}

	public RtpTp createRtpTp() {
		return new RtpTp();
	}

	public RteEventInEcuInstanceRef createRteEventInEcuInstanceRef() {
		return new RteEventInEcuInstanceRef();
	}

	public RptHook createRptHook() {
		return new RptHook();
	}

	public RptContainer createRptContainer() {
		return new RptContainer();
	}

	public RootSwCompositionPrototype createRootSwCompositionPrototype() {
		return new RootSwCompositionPrototype();
	}

	public CalibrationParameterValueSetRefs createRootSwCompositionPrototypeCalibrationParameterValueSetRefs() {
		return new CalibrationParameterValueSetRefs();
	}

	public RoleBasedPortAssignment createRoleBasedPortAssignment() {
		return new RoleBasedPortAssignment();
	}

	public RoleBasedMcDataAssignment createRoleBasedMcDataAssignment() {
		return new RoleBasedMcDataAssignment();
	}

	public McDataInstanceRefs createRoleBasedMcDataAssignmentMcDataInstanceRefs() {
		return new McDataInstanceRefs();
	}

	public RoleBasedDataTypeAssignment createRoleBasedDataTypeAssignment() {
		return new RoleBasedDataTypeAssignment();
	}

	public RoleBasedDataAssignment createRoleBasedDataAssignment() {
		return new RoleBasedDataAssignment();
	}

	public RoleBasedBswModuleEntryAssignment createRoleBasedBswModuleEntryAssignment() {
		return new RoleBasedBswModuleEntryAssignment();
	}

	public ResourceConsumption createResourceConsumption() {
		return new ResourceConsumption();
	}

	public ReferrableRefConditional createReferrableRefConditional() {
		return new ReferrableRefConditional();
	}

	public ReferenceValueSpecification createReferenceValueSpecification() {
		return new ReferenceValueSpecification();
	}

	public ReferenceBase createReferenceBase() {
		return new ReferenceBase();
	}

	public GlobalInPackageRefs createReferenceBaseGlobalInPackageRefs() {
		return new GlobalInPackageRefs();
	}

	public RecordValueSpecification createRecordValueSpecification() {
		return new RecordValueSpecification();
	}

	public RapidPrototypingScenario createRapidPrototypingScenario() {
		return new RapidPrototypingScenario();
	}

	public RVariableInAtomicSwcInstanceRef createRVariableInAtomicSwcInstanceRef() {
		return new RVariableInAtomicSwcInstanceRef();
	}

	public RTriggerInAtomicSwcInstanceRef createRTriggerInAtomicSwcInstanceRef() {
		return new RTriggerInAtomicSwcInstanceRef();
	}

	public RPortPrototype createRPortPrototype() {
		return new RPortPrototype();
	}

	public RPortInCompositionInstanceRef createRPortInCompositionInstanceRef() {
		return new RPortInCompositionInstanceRef();
	}

	public ROperationInAtomicSwcInstanceRef createROperationInAtomicSwcInstanceRef() {
		return new ROperationInAtomicSwcInstanceRef();
	}

	public RModeInAtomicSwcInstanceRef createRModeInAtomicSwcInstanceRef() {
		return new RModeInAtomicSwcInstanceRef();
	}

	public RModeGroupInAtomicSwcInstanceRef createRModeGroupInAtomicSwcInstanceRef() {
		return new RModeGroupInAtomicSwcInstanceRef();
	}

	public QueuedSenderComSpec createQueuedSenderComSpec() {
		return new QueuedSenderComSpec();
	}

	public QueuedReceiverComSpec createQueuedReceiverComSpec() {
		return new QueuedReceiverComSpec();
	}

	public ProvidedServiceInstance createProvidedServiceInstance() {
		return new ProvidedServiceInstance();
	}

	public RoutingGroupRefs createProvidedServiceInstanceRoutingGroupRefs() {
		return new RoutingGroupRefs();
	}

	public PredefinedVariant createPredefinedVariant() {
		return new PredefinedVariant();
	}

	public SwSystemconstantValueSetRefs createPredefinedVariantSwSystemconstantValueSetRefs() {
		return new SwSystemconstantValueSetRefs();
	}

	public PostBuildVariantCriterionValueSetRefs createPredefinedVariantPostBuildVariantCriterionValueSetRefs() {
		return new PostBuildVariantCriterionValueSetRefs();
	}

	public IncludedVariantRefs createPredefinedVariantIncludedVariantRefs() {
		return new IncludedVariantRefs();
	}

	public PostBuildVariantCriterionValueSet createPostBuildVariantCriterionValueSet() {
		return new PostBuildVariantCriterionValueSet();
	}

	public PostBuildVariantCriterionValue createPostBuildVariantCriterionValue() {
		return new PostBuildVariantCriterionValue();
	}

	public PostBuildVariantCriterion createPostBuildVariantCriterion() {
		return new PostBuildVariantCriterion();
	}

	public PostBuildVariantCondition createPostBuildVariantCondition() {
		return new PostBuildVariantCondition();
	}

	public PortPrototypeRefConditional createPortPrototypeRefConditional() {
		return new PortPrototypeRefConditional();
	}

	public PortPrototypeBlueprintMapping createPortPrototypeBlueprintMapping() {
		return new PortPrototypeBlueprintMapping();
	}

	public PortPrototypeBlueprintInitValue createPortPrototypeBlueprintInitValue() {
		return new PortPrototypeBlueprintInitValue();
	}

	public PortPrototypeBlueprint createPortPrototypeBlueprint() {
		return new PortPrototypeBlueprint();
	}

	public PortInterfaceMappingSet createPortInterfaceMappingSet() {
		return new PortInterfaceMappingSet();
	}

	public PortInterfaceBlueprintMapping createPortInterfaceBlueprintMapping() {
		return new PortInterfaceBlueprintMapping();
	}

	public PortGroupInSystemInstanceRef createPortGroupInSystemInstanceRef() {
		return new PortGroupInSystemInstanceRef();
	}

	public PortGroup createPortGroup() {
		return new PortGroup();
	}

	public PortDefinedArgumentValue createPortDefinedArgumentValue() {
		return new PortDefinedArgumentValue();
	}

	public PortApiOption createPortApiOption() {
		return new PortApiOption();
	}

	public PncMapping createPncMapping() {
		return new PncMapping();
	}

	public WakeupFrameRefs createPncMappingWakeupFrameRefs() {
		return new WakeupFrameRefs();
	}

	public PncGroupRefs createPncMappingPncGroupRefs() {
		return new PncGroupRefs();
	}

	public PhysicalDimensionMappingSet createPhysicalDimensionMappingSet() {
		return new PhysicalDimensionMappingSet();
	}

	public PhysicalDimensionMapping createPhysicalDimensionMapping() {
		return new PhysicalDimensionMapping();
	}

	public PhysConstrs createPhysConstrs() {
		return new PhysConstrs();
	}

	public PermissibleSignalPath createPermissibleSignalPath() {
		return new PermissibleSignalPath();
	}

	public PhysicalChannelRefs createPermissibleSignalPathPhysicalChannelRefs() {
		return new PhysicalChannelRefs();
	}

	public PerInstanceMemorySize createPerInstanceMemorySize() {
		return new PerInstanceMemorySize();
	}

	public PdurIPduGroup createPdurIPduGroup() {
		return new PdurIPduGroup();
	}

	public PduTriggeringRefConditional createPduTriggeringRefConditional() {
		return new PduTriggeringRefConditional();
	}

	public PduTriggering createPduTriggering() {
		return new PduTriggering();
	}

	public IPduPortRefs createPduTriggeringIPduPortRefs() {
		return new IPduPortRefs();
	}

	public PduToFrameMapping createPduToFrameMapping() {
		return new PduToFrameMapping();
	}

	public PduMappingDefaultValue createPduMappingDefaultValue() {
		return new PduMappingDefaultValue();
	}

	public PassThroughSwConnector createPassThroughSwConnector() {
		return new PassThroughSwConnector();
	}

	public ParameterSwComponentType createParameterSwComponentType() {
		return new ParameterSwComponentType();
	}

	public DataTypeMappingRefs createParameterSwComponentTypeDataTypeMappingRefs() {
		return new DataTypeMappingRefs();
	}

	public ConstantMappingRefs createParameterSwComponentTypeConstantMappingRefs() {
		return new ConstantMappingRefs();
	}

	public ParameterRequireComSpec createParameterRequireComSpec() {
		return new ParameterRequireComSpec();
	}

	public ParameterProvideComSpec createParameterProvideComSpec() {
		return new ParameterProvideComSpec();
	}

	public ParameterPortAnnotation createParameterPortAnnotation() {
		return new ParameterPortAnnotation();
	}

	public ParameterInterface createParameterInterface() {
		return new ParameterInterface();
	}

	public ParameterInAtomicSwcTypeInstanceRef createParameterInAtomicSwcTypeInstanceRef() {
		return new ParameterInAtomicSwcTypeInstanceRef();
	}

	public ParameterDataPrototype createParameterDataPrototype() {
		return new ParameterDataPrototype();
	}

	public PTriggerInAtomicSwcTypeInstanceRef createPTriggerInAtomicSwcTypeInstanceRef() {
		return new PTriggerInAtomicSwcTypeInstanceRef();
	}

	public PrPortPrototype createPrPortPrototype() {
		return new PrPortPrototype();
	}

	public PPortPrototype createPPortPrototype() {
		return new PPortPrototype();
	}

	public PPortInCompositionInstanceRef createPPortInCompositionInstanceRef() {
		return new PPortInCompositionInstanceRef();
	}

	public POperationInAtomicSwcInstanceRef createPOperationInAtomicSwcInstanceRef() {
		return new POperationInAtomicSwcInstanceRef();
	}

	public PModeGroupInAtomicSwcInstanceRef createPModeGroupInAtomicSwcInstanceRef() {
		return new PModeGroupInAtomicSwcInstanceRef();
	}

	public OrderedMaster createOrderedMaster() {
		return new OrderedMaster();
	}

	public OperationInSystemInstanceRef createOperationInSystemInstanceRef() {
		return new OperationInSystemInstanceRef();
	}

	public OperationArgumentInComponentInstanceRef createOperationArgumentInComponentInstanceRef() {
		return new OperationArgumentInComponentInstanceRef();
	}

	public OffsetTimingConstraint createOffsetTimingConstraint() {
		return new OffsetTimingConstraint();
	}

	public ObdRatioServiceNeeds createObdRatioServiceNeeds() {
		return new ObdRatioServiceNeeds();
	}

	public UsedSecondaryFidRefs createObdRatioServiceNeedsUsedSecondaryFidRefs() {
		return new UsedSecondaryFidRefs();
	}

	public NvRequireComSpec createNvRequireComSpec() {
		return new NvRequireComSpec();
	}

	public NvProvideComSpec createNvProvideComSpec() {
		return new NvProvideComSpec();
	}

	public NvDataPortAnnotation createNvDataPortAnnotation() {
		return new NvDataPortAnnotation();
	}

	public NvDataInterface createNvDataInterface() {
		return new NvDataInterface();
	}

	public NvBlockSwComponentType createNvBlockSwComponentType() {
		return new NvBlockSwComponentType();
	}

	public NvBlockDescriptor createNvBlockDescriptor() {
		return new NvBlockDescriptor();
	}

	public DataTypeMappingRefs createNvBlockDescriptorDataTypeMappingRefs() {
		return new DataTypeMappingRefs();
	}

	public ConstantValueMappingRefs createNvBlockDescriptorConstantValueMappingRefs() {
		return new ConstantValueMappingRefs();
	}

	public NonqueuedSenderComSpec createNonqueuedSenderComSpec() {
		return new NonqueuedSenderComSpec();
	}

	public NonqueuedReceiverComSpec createNonqueuedReceiverComSpec() {
		return new NonqueuedReceiverComSpec();
	}

	public NmPduRefConditional createNmPduRefConditional() {
		return new NmPduRefConditional();
	}

	public NmPdu createNmPdu() {
		return new NmPdu();
	}

	public NmEcu createNmEcu() {
		return new NmEcu();
	}

	public NmCoordinator createNmCoordinator() {
		return new NmCoordinator();
	}

	public NmNodeRefs createNmCoordinatorNmNodeRefs() {
		return new NmNodeRefs();
	}

	public NmConfig createNmConfig() {
		return new NmConfig();
	}

	public NetworkEndpoint createNetworkEndpoint() {
		return new NetworkEndpoint();
	}

	public MultiplexedIPdu createMultiplexedIPdu() {
		return new MultiplexedIPdu();
	}

	public ModeTransition createModeTransition() {
		return new ModeTransition();
	}

	public ModeSwitchedAckEvent createModeSwitchedAckEvent() {
		return new ModeSwitchedAckEvent();
	}

	public ModeSwitchSenderComSpec createModeSwitchSenderComSpec() {
		return new ModeSwitchSenderComSpec();
	}

	public ModeSwitchReceiverComSpec createModeSwitchReceiverComSpec() {
		return new ModeSwitchReceiverComSpec();
	}

	public ModeRequestTypeMap createModeRequestTypeMap() {
		return new ModeRequestTypeMap();
	}

	public ModePortAnnotation createModePortAnnotation() {
		return new ModePortAnnotation();
	}

	public ModeInBswModuleDescriptionInstanceRef createModeInBswModuleDescriptionInstanceRef() {
		return new ModeInBswModuleDescriptionInstanceRef();
	}

	public ModeErrorBehavior createModeErrorBehavior() {
		return new ModeErrorBehavior();
	}

	public ModeDrivenTransmissionModeCondition createModeDrivenTransmissionModeCondition() {
		return new ModeDrivenTransmissionModeCondition();
	}

	public ModeDeclarationRefs createModeDrivenTransmissionModeConditionModeDeclarationRefs() {
		return new ModeDeclarationRefs();
	}

	public ModeDeclarationMappingSet createModeDeclarationMappingSet() {
		return new ModeDeclarationMappingSet();
	}

	public ModeDeclarationMapping createModeDeclarationMapping() {
		return new ModeDeclarationMapping();
	}

	public FirstModeRefs createModeDeclarationMappingFirstModeRefs() {
		return new FirstModeRefs();
	}

	public ModeDeclarationGroupPrototypeRefConditional createModeDeclarationGroupPrototypeRefConditional() {
		return new ModeDeclarationGroupPrototypeRefConditional();
	}

	public ModeDeclarationGroupPrototypeMapping createModeDeclarationGroupPrototypeMapping() {
		return new ModeDeclarationGroupPrototypeMapping();
	}

	public ModeDeclarationGroupPrototype createModeDeclarationGroupPrototype() {
		return new ModeDeclarationGroupPrototype();
	}

	public ModeDeclarationGroup createModeDeclarationGroup() {
		return new ModeDeclarationGroup();
	}

	public ModeAccessPoint createModeAccessPoint() {
		return new ModeAccessPoint();
	}

	public MemorySectionLocation createMemorySectionLocation() {
		return new MemorySectionLocation();
	}

	public MemorySection createMemorySection() {
		return new MemorySection();
	}

	public ExecutableEntityRefs createMemorySectionExecutableEntityRefs() {
		return new ExecutableEntityRefs();
	}

	public McSwEmulationMethodSupport createMcSwEmulationMethodSupport() {
		return new McSwEmulationMethodSupport();
	}

	public McSupportData createMcSupportData() {
		return new McSupportData();
	}

	public MeasurableSystemConstantValuesRefs createMcSupportDataMeasurableSystemConstantValuesRefs() {
		return new MeasurableSystemConstantValuesRefs();
	}

	public McParameterElementGroup createMcParameterElementGroup() {
		return new McParameterElementGroup();
	}

	public McFunctionDataRefSetConditional createMcFunctionDataRefSetConditional() {
		return new McFunctionDataRefSetConditional();
	}

	public McDataInstanceRefs createMcFunctionDataRefSetConditionalMcDataInstanceRefs() {
		return new McDataInstanceRefs();
	}

	public FlatMapEntryRefs createMcFunctionDataRefSetConditionalFlatMapEntryRefs() {
		return new FlatMapEntryRefs();
	}

	public McFunctionDataRefSet createMcFunctionDataRefSet() {
		return new McFunctionDataRefSet();
	}

	public McFunction createMcFunction() {
		return new McFunction();
	}

	public SubFunctionRefs createMcFunctionSubFunctionRefs() {
		return new SubFunctionRefs();
	}

	public McDataInstance createMcDataInstance() {
		return new McDataInstance();
	}

	public McDataAccessDetails createMcDataAccessDetails() {
		return new McDataAccessDetails();
	}

	public MacMulticastConfiguration createMacMulticastConfiguration() {
		return new MacMulticastConfiguration();
	}

	public LinTpNode createLinTpNode() {
		return new LinTpNode();
	}

	public LinTpConnection createLinTpConnection() {
		return new LinTpConnection();
	}

	public ReceiverRefs createLinTpConnectionReceiverRefs() {
		return new ReceiverRefs();
	}

	public LinTpConfig createLinTpConfig() {
		return new LinTpConfig();
	}

	public LinSporadicFrame createLinSporadicFrame() {
		return new LinSporadicFrame();
	}

	public SubstitutedFrameRefs createLinSporadicFrameSubstitutedFrameRefs() {
		return new SubstitutedFrameRefs();
	}

	public LinSlaveConfig createLinSlaveConfig() {
		return new LinSlaveConfig();
	}

	public LinSlave createLinSlave() {
		return new LinSlave();
	}

	public LinScheduleTable createLinScheduleTable() {
		return new LinScheduleTable();
	}

	public LinPhysicalChannel createLinPhysicalChannel() {
		return new LinPhysicalChannel();
	}

	public LinOrderedConfigurableFrame createLinOrderedConfigurableFrame() {
		return new LinOrderedConfigurableFrame();
	}

	public LinMasterConditional createLinMasterConditional() {
		return new LinMasterConditional();
	}

	public LinMaster createLinMaster() {
		return new LinMaster();
	}

	public LinFrameTriggering createLinFrameTriggering() {
		return new LinFrameTriggering();
	}

	public FramePortRefs createLinFrameTriggeringFramePortRefs() {
		return new FramePortRefs();
	}

	public LinEventTriggeredFrame createLinEventTriggeredFrame() {
		return new LinEventTriggeredFrame();
	}

	public LinUnconditionalFrameRefs createLinEventTriggeredFrameLinUnconditionalFrameRefs() {
		return new LinUnconditionalFrameRefs();
	}

	public LinErrorResponse createLinErrorResponse() {
		return new LinErrorResponse();
	}

	public LinConfigurableFrame createLinConfigurableFrame() {
		return new LinConfigurableFrame();
	}

	public LinCommunicationConnector createLinCommunicationConnector() {
		return new LinCommunicationConnector();
	}

	public LinCluster createLinCluster() {
		return new LinCluster();
	}

	public LifeCycleStateDefinitionGroup createLifeCycleStateDefinitionGroup() {
		return new LifeCycleStateDefinitionGroup();
	}

	public LifeCycleInfoSet createLifeCycleInfoSet() {
		return new LifeCycleInfoSet();
	}

	public LifeCycleInfo createLifeCycleInfo() {
		return new LifeCycleInfo();
	}

	public UseInsteadRefs createLifeCycleInfoUseInsteadRefs() {
		return new UseInsteadRefs();
	}

	public LatencyTimingConstraint createLatencyTimingConstraint() {
		return new LatencyTimingConstraint();
	}

	public LParagraph createLParagraph() {
		return new LParagraph();
	}

	public LOverviewParagraph createLOverviewParagraph() {
		return new LOverviewParagraph();
	}

	public KeywordSet createKeywordSet() {
		return new KeywordSet();
	}

	public Keyword createKeyword() {
		return new Keyword();
	}

	public J1939TpPg createJ1939TpPg() {
		return new J1939TpPg();
	}

	public SduRefs createJ1939TpPgSduRefs() {
		return new SduRefs();
	}

	public J1939TpNode createJ1939TpNode() {
		return new J1939TpNode();
	}

	public J1939TpConnection createJ1939TpConnection() {
		return new J1939TpConnection();
	}

	public TpSduRefs createJ1939TpConnectionTpSduRefs() {
		return new TpSduRefs();
	}

	public ReceiverRefs createJ1939TpConnectionReceiverRefs() {
		return new ReceiverRefs();
	}

	public FlowControlPduRefs createJ1939TpConnectionFlowControlPduRefs() {
		return new FlowControlPduRefs();
	}

	public J1939TpConfig createJ1939TpConfig() {
		return new J1939TpConfig();
	}

	public J1939Cluster createJ1939Cluster() {
		return new J1939Cluster();
	}

	public Ipv6DhcpServerConfiguration createIpv6DhcpServerConfiguration() {
		return new Ipv6DhcpServerConfiguration();
	}

	public Ipv6Configuration createIpv6Configuration() {
		return new Ipv6Configuration();
	}

	public Ipv4DhcpServerConfiguration createIpv4DhcpServerConfiguration() {
		return new Ipv4DhcpServerConfiguration();
	}

	public Ipv4Configuration createIpv4Configuration() {
		return new Ipv4Configuration();
	}

	public IoHwAbstractionServerAnnotation createIoHwAbstractionServerAnnotation() {
		return new IoHwAbstractionServerAnnotation();
	}

	public InvalidationPolicy createInvalidationPolicy() {
		return new InvalidationPolicy();
	}

	public InterpolationRoutineMappingSet createInterpolationRoutineMappingSet() {
		return new InterpolationRoutineMappingSet();
	}

	public InterpolationRoutineMapping createInterpolationRoutineMapping() {
		return new InterpolationRoutineMapping();
	}

	public InterpolationRoutine createInterpolationRoutine() {
		return new InterpolationRoutine();
	}

	public InternalTriggerOccurredEvent createInternalTriggerOccurredEvent() {
		return new InternalTriggerOccurredEvent();
	}

	public InternalConstrs createInternalConstrs() {
		return new InternalConstrs();
	}

	public InstanceEventInCompositionInstanceRef createInstanceEventInCompositionInstanceRef() {
		return new InstanceEventInCompositionInstanceRef();
	}

	public InnerRunnableEntityGroupInCompositionInstanceRef createInnerRunnableEntityGroupInCompositionInstanceRef() {
		return new InnerRunnableEntityGroupInCompositionInstanceRef();
	}

	public InnerPortGroupInCompositionInstanceRef createInnerPortGroupInCompositionInstanceRef() {
		return new InnerPortGroupInCompositionInstanceRef();
	}

	public InnerDataPrototypeGroupInCompositionInstanceRef createInnerDataPrototypeGroupInCompositionInstanceRef() {
		return new InnerDataPrototypeGroupInCompositionInstanceRef();
	}

	public IndexedArrayElement createIndexedArrayElement() {
		return new IndexedArrayElement();
	}

	public IncludedModeDeclarationGroupSet createIncludedModeDeclarationGroupSet() {
		return new IncludedModeDeclarationGroupSet();
	}

	public ModeDeclarationGroupRefs createIncludedModeDeclarationGroupSetModeDeclarationGroupRefs() {
		return new ModeDeclarationGroupRefs();
	}

	public IncludedDataTypeSet createIncludedDataTypeSet() {
		return new IncludedDataTypeSet();
	}

	public DataTypeRefs createIncludedDataTypeSetDataTypeRefs() {
		return new DataTypeRefs();
	}

	public ImplementationElementInParameterInstanceRef createImplementationElementInParameterInstanceRef() {
		return new ImplementationElementInParameterInstanceRef();
	}

	public ImplementationDataTypeElement createImplementationDataTypeElement() {
		return new ImplementationDataTypeElement();
	}

	public ImplementationDataType createImplementationDataType() {
		return new ImplementationDataType();
	}

	public ISignalTriggeringRefConditional createISignalTriggeringRefConditional() {
		return new ISignalTriggeringRefConditional();
	}

	public ISignalTriggering createISignalTriggering() {
		return new ISignalTriggering();
	}

	public ISignalPortRefs createISignalTriggeringISignalPortRefs() {
		return new ISignalPortRefs();
	}

	public ISignalToIPduMapping createISignalToIPduMapping() {
		return new ISignalToIPduMapping();
	}

	public ISignalMapping createISignalMapping() {
		return new ISignalMapping();
	}

	public ISignalIPduRefConditional createISignalIPduRefConditional() {
		return new ISignalIPduRefConditional();
	}

	public ISignalIPduGroup createISignalIPduGroup() {
		return new ISignalIPduGroup();
	}

	public ContainedISignalIPduGroupRefs createISignalIPduGroupContainedISignalIPduGroupRefs() {
		return new ContainedISignalIPduGroupRefs();
	}

	public ISignalIPdu createISignalIPdu() {
		return new ISignalIPdu();
	}

	public ISignalGroup createISignalGroup() {
		return new ISignalGroup();
	}

	public ISignalRefs createISignalGroupISignalRefs() {
		return new ISignalRefs();
	}

	public ISignal createISignal() {
		return new ISignal();
	}

	public IPduMapping createIPduMapping() {
		return new IPduMapping();
	}

	public HwType createHwType() {
		return new HwType();
	}

	public HwCategoryRefs createHwTypeHwCategoryRefs() {
		return new HwCategoryRefs();
	}

	public HwPortMapping createHwPortMapping() {
		return new HwPortMapping();
	}

	public HwPinGroupConnector createHwPinGroupConnector() {
		return new HwPinGroupConnector();
	}

	public HwPinGroupRefs createHwPinGroupConnectorHwPinGroupRefs() {
		return new HwPinGroupRefs();
	}

	public HwPinConnector createHwPinConnector() {
		return new HwPinConnector();
	}

	public HwPinRefs createHwPinConnectorHwPinRefs() {
		return new HwPinRefs();
	}

	public HwElementRefConditional createHwElementRefConditional() {
		return new HwElementRefConditional();
	}

	public HwElementConnector createHwElementConnector() {
		return new HwElementConnector();
	}

	public HwElementRefs createHwElementConnectorHwElementRefs() {
		return new HwElementRefs();
	}

	public HwElement createHwElement() {
		return new HwElement();
	}

	public HwCategory createHwCategory() {
		return new HwCategory();
	}

	public HwAttributeValue createHwAttributeValue() {
		return new HwAttributeValue();
	}

	public HwAttributeDef createHwAttributeDef() {
		return new HwAttributeDef();
	}

	public Graphic createGraphic() {
		return new Graphic();
	}

	public GlobalTimeGateway createGlobalTimeGateway() {
		return new GlobalTimeGateway();
	}

	public GlobalTimeFrSlave createGlobalTimeFrSlave() {
		return new GlobalTimeFrSlave();
	}

	public GlobalTimeFrMaster createGlobalTimeFrMaster() {
		return new GlobalTimeFrMaster();
	}

	public GlobalTimeDomain createGlobalTimeDomain() {
		return new GlobalTimeDomain();
	}

	public SubDomainRefs createGlobalTimeDomainSubDomainRefs() {
		return new SubDomainRefs();
	}

	public CommunicationClusterRefs createGlobalTimeDomainCommunicationClusterRefs() {
		return new CommunicationClusterRefs();
	}

	public Gateway createGateway() {
		return new Gateway();
	}

	public FreeFormat createFreeFormat() {
		return new FreeFormat();
	}

	public FrameMapping createFrameMapping() {
		return new FrameMapping();
	}

	public ForbiddenSignalPath createForbiddenSignalPath() {
		return new ForbiddenSignalPath();
	}

	public PhysicalChannelRefs createForbiddenSignalPathPhysicalChannelRefs() {
		return new PhysicalChannelRefs();
	}

	public FlexrayTpPduPool createFlexrayTpPduPool() {
		return new FlexrayTpPduPool();
	}

	public NPduRefs createFlexrayTpPduPoolNPduRefs() {
		return new NPduRefs();
	}

	public FlexrayTpNode createFlexrayTpNode() {
		return new FlexrayTpNode();
	}

	public ConnectorRefs createFlexrayTpNodeConnectorRefs() {
		return new ConnectorRefs();
	}

	public FlexrayTpEcu createFlexrayTpEcu() {
		return new FlexrayTpEcu();
	}

	public FlexrayTpConnection createFlexrayTpConnection() {
		return new FlexrayTpConnection();
	}

	public ReceiverRefs createFlexrayTpConnectionReceiverRefs() {
		return new ReceiverRefs();
	}

	public FlexrayTpConfig createFlexrayTpConfig() {
		return new FlexrayTpConfig();
	}

	public FlexrayNmClusterCoupling createFlexrayNmClusterCoupling() {
		return new FlexrayNmClusterCoupling();
	}

	public CoupledClusterRefs createFlexrayNmClusterCouplingCoupledClusterRefs() {
		return new CoupledClusterRefs();
	}

	public FlexrayFrameTriggering createFlexrayFrameTriggering() {
		return new FlexrayFrameTriggering();
	}

	public FlexrayFifoConfiguration createFlexrayFifoConfiguration() {
		return new FlexrayFifoConfiguration();
	}

	public FlexrayCommunicationControllerConditional createFlexrayCommunicationControllerConditional() {
		return new FlexrayCommunicationControllerConditional();
	}

	public FlexrayCommunicationController createFlexrayCommunicationController() {
		return new FlexrayCommunicationController();
	}

	public FlexrayCluster createFlexrayCluster() {
		return new FlexrayCluster();
	}

	public FlexrayArTpNode createFlexrayArTpNode() {
		return new FlexrayArTpNode();
	}

	public ConnectorRefs createFlexrayArTpNodeConnectorRefs() {
		return new ConnectorRefs();
	}

	public FlexrayArTpConnection createFlexrayArTpConnection() {
		return new FlexrayArTpConnection();
	}

	public TransmitPduRefs createFlexrayArTpConnectionTransmitPduRefs() {
		return new TransmitPduRefs();
	}

	public TargetRefs createFlexrayArTpConnectionTargetRefs() {
		return new TargetRefs();
	}

	public FlexrayArTpConfig createFlexrayArTpConfig() {
		return new FlexrayArTpConfig();
	}

	public FlexrayArTpChannel createFlexrayArTpChannel() {
		return new FlexrayArTpChannel();
	}

	public NPduRefs createFlexrayArTpChannelNPduRefs() {
		return new NPduRefs();
	}

	public FlexrayAbsolutelyScheduledTiming createFlexrayAbsolutelyScheduledTiming() {
		return new FlexrayAbsolutelyScheduledTiming();
	}

	public FlatMap createFlatMap() {
		return new FlatMap();
	}

	public FibexElementRefConditional createFibexElementRefConditional() {
		return new FibexElementRefConditional();
	}

	public FmFeatureSelectionSet createFmFeatureSelectionSet() {
		return new FmFeatureSelectionSet();
	}

	public IncludeRefs createFmFeatureSelectionSetIncludeRefs() {
		return new IncludeRefs();
	}

	public FeatureModelRefs createFmFeatureSelectionSetFeatureModelRefs() {
		return new FeatureModelRefs();
	}

	public FmFeatureSelection createFmFeatureSelection() {
		return new FmFeatureSelection();
	}

	public FmFeatureRelation createFmFeatureRelation() {
		return new FmFeatureRelation();
	}

	public FeatureRefs createFmFeatureRelationFeatureRefs() {
		return new FeatureRefs();
	}

	public FmFeatureModel createFmFeatureModel() {
		return new FmFeatureModel();
	}

	public FeatureRefs createFmFeatureModelFeatureRefs() {
		return new FeatureRefs();
	}

	public FmFeatureMapElement createFmFeatureMapElement() {
		return new FmFeatureMapElement();
	}

	public SwSystemconstantValueSetRefs createFmFeatureMapElementSwSystemconstantValueSetRefs() {
		return new SwSystemconstantValueSetRefs();
	}

	public PostBuildVariantCriterionValueSetRefs createFmFeatureMapElementPostBuildVariantCriterionValueSetRefs() {
		return new PostBuildVariantCriterionValueSetRefs();
	}

	public FmFeatureMap createFmFeatureMap() {
		return new FmFeatureMap();
	}

	public FmFeatureDecomposition createFmFeatureDecomposition() {
		return new FmFeatureDecomposition();
	}

	public FeatureRefs createFmFeatureDecompositionFeatureRefs() {
		return new FeatureRefs();
	}

	public FmFeature createFmFeature() {
		return new FmFeature();
	}

	public FmConditionByFeaturesAndSwSystemconsts createFmConditionByFeaturesAndSwSystemconsts() {
		return new FmConditionByFeaturesAndSwSystemconsts();
	}

	public FmConditionByFeaturesAndAttributes createFmConditionByFeaturesAndAttributes() {
		return new FmConditionByFeaturesAndAttributes();
	}

	public FmAttributeValue createFmAttributeValue() {
		return new FmAttributeValue();
	}

	public ExternalTriggeringPoint createExternalTriggeringPoint() {
		return new ExternalTriggeringPoint();
	}

	public ExecutionTimeConstraint createExecutionTimeConstraint() {
		return new ExecutionTimeConstraint();
	}

	public ExecutionOrderConstraint createExecutionOrderConstraint() {
		return new ExecutionOrderConstraint();
	}

	public ExclusiveAreaNestingOrder createExclusiveAreaNestingOrder() {
		return new ExclusiveAreaNestingOrder();
	}

	public ExclusiveAreaRefs createExclusiveAreaNestingOrderExclusiveAreaRefs() {
		return new ExclusiveAreaRefs();
	}

	public EventHandler createEventHandler() {
		return new EventHandler();
	}

	public RoutingGroupRefs createEventHandlerRoutingGroupRefs() {
		return new RoutingGroupRefs();
	}

	public ConsumedEventGroupRefs createEventHandlerConsumedEventGroupRefs() {
		return new ConsumedEventGroupRefs();
	}

	public EvaluatedVariantSet createEvaluatedVariantSet() {
		return new EvaluatedVariantSet();
	}

	public EvaluatedVariantRefs createEvaluatedVariantSetEvaluatedVariantRefs() {
		return new EvaluatedVariantRefs();
	}

	public EvaluatedElementRefs createEvaluatedVariantSetEvaluatedElementRefs() {
		return new EvaluatedElementRefs();
	}

	public EthernetPhysicalChannel createEthernetPhysicalChannel() {
		return new EthernetPhysicalChannel();
	}

	public EthernetCommunicationControllerConditional createEthernetCommunicationControllerConditional() {
		return new EthernetCommunicationControllerConditional();
	}

	public EthernetCommunicationController createEthernetCommunicationController() {
		return new EthernetCommunicationController();
	}

	public EthernetCommunicationConnector createEthernetCommunicationConnector() {
		return new EthernetCommunicationConnector();
	}

	public NetworkEndpointRefs createEthernetCommunicationConnectorNetworkEndpointRefs() {
		return new NetworkEndpointRefs();
	}

	public EthernetClusterConditional createEthernetClusterConditional() {
		return new EthernetClusterConditional();
	}

	public EthernetCluster createEthernetCluster() {
		return new EthernetCluster();
	}

	public EndToEndTransformationISignalPropsConditional createEndToEndTransformationISignalPropsConditional() {
		return new EndToEndTransformationISignalPropsConditional();
	}

	public EndToEndTransformationISignalProps createEndToEndTransformationISignalProps() {
		return new EndToEndTransformationISignalProps();
	}

	public EndToEndProtectionVariablePrototype createEndToEndProtectionVariablePrototype() {
		return new EndToEndProtectionVariablePrototype();
	}

	public EndToEndProtectionSet createEndToEndProtectionSet() {
		return new EndToEndProtectionSet();
	}

	public EndToEndProtectionISignalIPdu createEndToEndProtectionISignalIPdu() {
		return new EndToEndProtectionISignalIPdu();
	}

	public EndToEndProtection createEndToEndProtection() {
		return new EndToEndProtection();
	}

	public EndToEndDescription createEndToEndDescription() {
		return new EndToEndDescription();
	}

	public EmptySignalMapping createEmptySignalMapping() {
		return new EmptySignalMapping();
	}

	public EcucValueCollection createEcucValueCollection() {
		return new EcucValueCollection();
	}

	public EcucValidationCondition createEcucValidationCondition() {
		return new EcucValidationCondition();
	}

	public EcucUriReferenceDef createEcucUriReferenceDef() {
		return new EcucUriReferenceDef();
	}

	public EcucTextualParamValue createEcucTextualParamValue() {
		return new EcucTextualParamValue();
	}

	public EcucSymbolicNameReferenceDef createEcucSymbolicNameReferenceDef() {
		return new EcucSymbolicNameReferenceDef();
	}

	public EcucStringParamDef createEcucStringParamDef() {
		return new EcucStringParamDef();
	}

	public EcucReferenceValue createEcucReferenceValue() {
		return new EcucReferenceValue();
	}

	public EcucReferenceDef createEcucReferenceDef() {
		return new EcucReferenceDef();
	}

	public EcucQueryExpression createEcucQueryExpression() {
		return new EcucQueryExpression();
	}

	public EcucParameterDerivationFormula createEcucParameterDerivationFormula() {
		return new EcucParameterDerivationFormula();
	}

	public EcucParamConfContainerDef createEcucParamConfContainerDef() {
		return new EcucParamConfContainerDef();
	}

	public DestinationUriRefs createEcucParamConfContainerDefDestinationUriRefs() {
		return new DestinationUriRefs();
	}

	public EcucMultilineStringParamDef createEcucMultilineStringParamDef() {
		return new EcucMultilineStringParamDef();
	}

	public EcucModuleDef createEcucModuleDef() {
		return new EcucModuleDef();
	}

	public EcucModuleConfigurationValuesRefConditional createEcucModuleConfigurationValuesRefConditional() {
		return new EcucModuleConfigurationValuesRefConditional();
	}

	public EcucModuleConfigurationValues createEcucModuleConfigurationValues() {
		return new EcucModuleConfigurationValues();
	}

	public EcucLinkerSymbolDef createEcucLinkerSymbolDef() {
		return new EcucLinkerSymbolDef();
	}

	public EcucFunctionNameDef createEcucFunctionNameDef() {
		return new EcucFunctionNameDef();
	}

	public EcucEnumerationParamDef createEcucEnumerationParamDef() {
		return new EcucEnumerationParamDef();
	}

	public EcucDestinationUriPolicy createEcucDestinationUriPolicy() {
		return new EcucDestinationUriPolicy();
	}

	public EcucDestinationUriDefSet createEcucDestinationUriDefSet() {
		return new EcucDestinationUriDefSet();
	}

	public EcucDerivationSpecification createEcucDerivationSpecification() {
		return new EcucDerivationSpecification();
	}

	public EcucDefinitionCollection createEcucDefinitionCollection() {
		return new EcucDefinitionCollection();
	}

	public ModuleRefs createEcucDefinitionCollectionModuleRefs() {
		return new ModuleRefs();
	}

	public EcucContainerValue createEcucContainerValue() {
		return new EcucContainerValue();
	}

	public EcucConfigurationClassAffection createEcucConfigurationClassAffection() {
		return new EcucConfigurationClassAffection();
	}

	public AffectedRefs createEcucConfigurationClassAffectionAffectedRefs() {
		return new AffectedRefs();
	}

	public EcucConditionSpecification createEcucConditionSpecification() {
		return new EcucConditionSpecification();
	}

	public EcucConditionFormula createEcucConditionFormula() {
		return new EcucConditionFormula();
	}

	public EcucChoiceReferenceDef createEcucChoiceReferenceDef() {
		return new EcucChoiceReferenceDef();
	}

	public DestinationRefs createEcucChoiceReferenceDefDestinationRefs() {
		return new DestinationRefs();
	}

	public EcucChoiceContainerDef createEcucChoiceContainerDef() {
		return new EcucChoiceContainerDef();
	}

	public EcuTiming createEcuTiming() {
		return new EcuTiming();
	}

	public EcuResourceEstimation createEcuResourceEstimation() {
		return new EcuResourceEstimation();
	}

	public SwCompToEcuMappingRefs createEcuResourceEstimationSwCompToEcuMappingRefs() {
		return new SwCompToEcuMappingRefs();
	}

	public EcuInstance createEcuInstance() {
		return new EcuInstance();
	}

	public TpAddressRefs createEcuInstanceTpAddressRefs() {
		return new TpAddressRefs();
	}

	public CanTpAddressRefs createEcuInstanceCanTpAddressRefs() {
		return new CanTpAddressRefs();
	}

	public AssociatedPdurIPduGroupRefs createEcuInstanceAssociatedPdurIPduGroupRefs() {
		return new AssociatedPdurIPduGroupRefs();
	}

	public AssociatedComIPduGroupRefs createEcuInstanceAssociatedComIPduGroupRefs() {
		return new AssociatedComIPduGroupRefs();
	}

	public EcuAbstractionSwComponentType createEcuAbstractionSwComponentType() {
		return new EcuAbstractionSwComponentType();
	}

	public HardwareElementRefs createEcuAbstractionSwComponentTypeHardwareElementRefs() {
		return new HardwareElementRefs();
	}

	public EocExecutableEntityRefGroup createEocExecutableEntityRefGroup() {
		return new EocExecutableEntityRefGroup();
	}

	public SuccessorRefs createEocExecutableEntityRefGroupSuccessorRefs() {
		return new SuccessorRefs();
	}

	public NestedElementRefs createEocExecutableEntityRefGroupNestedElementRefs() {
		return new NestedElementRefs();
	}

	public DirectSuccessorRefs createEocExecutableEntityRefGroupDirectSuccessorRefs() {
		return new DirectSuccessorRefs();
	}

	public EocExecutableEntityRef createEocExecutableEntityRef() {
		return new EocExecutableEntityRef();
	}

	public SuccessorRefs createEocExecutableEntityRefSuccessorRefs() {
		return new SuccessorRefs();
	}

	public EocEventRef createEocEventRef() {
		return new EocEventRef();
	}

	public SuccessorRefs createEocEventRefSuccessorRefs() {
		return new SuccessorRefs();
	}

	public EcuMapping createEcuMapping() {
		return new EcuMapping();
	}

	public DynamicPartAlternative createDynamicPartAlternative() {
		return new DynamicPartAlternative();
	}

	public DynamicPart createDynamicPart() {
		return new DynamicPart();
	}

	public DocumentationContext createDocumentationContext() {
		return new DocumentationContext();
	}

	public Documentation createDocumentation() {
		return new Documentation();
	}

	public DocRevision createDocRevision() {
		return new DocRevision();
	}

	public DoIpTpConnection createDoIpTpConnection() {
		return new DoIpTpConnection();
	}

	public DoIpTpConfig createDoIpTpConfig() {
		return new DoIpTpConfig();
	}

	public DiagnosticWriteMemoryByAddressClass createDiagnosticWriteMemoryByAddressClass() {
		return new DiagnosticWriteMemoryByAddressClass();
	}

	public DiagnosticWriteMemoryByAddress createDiagnosticWriteMemoryByAddress() {
		return new DiagnosticWriteMemoryByAddress();
	}

	public MemoryRangeRefs createDiagnosticWriteMemoryByAddressMemoryRangeRefs() {
		return new MemoryRangeRefs();
	}

	public DiagnosticWriteDataByIdentifier createDiagnosticWriteDataByIdentifier() {
		return new DiagnosticWriteDataByIdentifier();
	}

	public DiagnosticTroubleCodeUds createDiagnosticTroubleCodeUds() {
		return new DiagnosticTroubleCodeUds();
	}

	public DiagnosticTroubleCodeRefConditional createDiagnosticTroubleCodeRefConditional() {
		return new DiagnosticTroubleCodeRefConditional();
	}

	public DiagnosticTroubleCodeProps createDiagnosticTroubleCodeProps() {
		return new DiagnosticTroubleCodeProps();
	}

	public MemoryDestinationRefs createDiagnosticTroubleCodePropsMemoryDestinationRefs() {
		return new MemoryDestinationRefs();
	}

	public DiagnosticTroubleCodeGroup createDiagnosticTroubleCodeGroup() {
		return new DiagnosticTroubleCodeGroup();
	}

	public DiagnosticTransferExit createDiagnosticTransferExit() {
		return new DiagnosticTransferExit();
	}

	public DiagnosticStorageConditionRefConditional createDiagnosticStorageConditionRefConditional() {
		return new DiagnosticStorageConditionRefConditional();
	}

	public DiagnosticStorageConditionPortMapping createDiagnosticStorageConditionPortMapping() {
		return new DiagnosticStorageConditionPortMapping();
	}

	public DiagnosticStorageConditionGroup createDiagnosticStorageConditionGroup() {
		return new DiagnosticStorageConditionGroup();
	}

	public DiagnosticStopRoutine createDiagnosticStopRoutine() {
		return new DiagnosticStopRoutine();
	}

	public DiagnosticStartRoutine createDiagnosticStartRoutine() {
		return new DiagnosticStartRoutine();
	}

	public DiagnosticSessionControl createDiagnosticSessionControl() {
		return new DiagnosticSessionControl();
	}

	public DiagnosticServiceTableRefConditional createDiagnosticServiceTableRefConditional() {
		return new DiagnosticServiceTableRefConditional();
	}

	public DiagnosticServiceTable createDiagnosticServiceTable() {
		return new DiagnosticServiceTable();
	}

	public ServiceInstanceRefs createDiagnosticServiceTableServiceInstanceRefs() {
		return new ServiceInstanceRefs();
	}

	public DiagnosticServiceSwMapping createDiagnosticServiceSwMapping() {
		return new DiagnosticServiceSwMapping();
	}

	public DiagnosticServiceDataMapping createDiagnosticServiceDataMapping() {
		return new DiagnosticServiceDataMapping();
	}

	public DiagnosticSecurityAccess createDiagnosticSecurityAccess() {
		return new DiagnosticSecurityAccess();
	}

	public DiagnosticRoutineControl createDiagnosticRoutineControl() {
		return new DiagnosticRoutineControl();
	}

	public DiagnosticResponseOnEvent createDiagnosticResponseOnEvent() {
		return new DiagnosticResponseOnEvent();
	}

	public DiagnosticRequestUpload createDiagnosticRequestUpload() {
		return new DiagnosticRequestUpload();
	}

	public DiagnosticRequestRoutineResults createDiagnosticRequestRoutineResults() {
		return new DiagnosticRequestRoutineResults();
	}

	public DiagnosticRequestFileTransfer createDiagnosticRequestFileTransfer() {
		return new DiagnosticRequestFileTransfer();
	}

	public DiagnosticRequestDownload createDiagnosticRequestDownload() {
		return new DiagnosticRequestDownload();
	}

	public DiagnosticReadMemoryByAddress createDiagnosticReadMemoryByAddress() {
		return new DiagnosticReadMemoryByAddress();
	}

	public DiagnosticReadDataByPeriodicIdClass createDiagnosticReadDataByPeriodicIdClass() {
		return new DiagnosticReadDataByPeriodicIdClass();
	}

	public DiagnosticReadDataByPeriodicId createDiagnosticReadDataByPeriodicId() {
		return new DiagnosticReadDataByPeriodicId();
	}

	public DiagnosticReadDataByIdentifier createDiagnosticReadDataByIdentifier() {
		return new DiagnosticReadDataByIdentifier();
	}

	public DiagnosticReadDtcInformation createDiagnosticReadDtcInformation() {
		return new DiagnosticReadDtcInformation();
	}

	public DiagnosticParameter createDiagnosticParameter() {
		return new DiagnosticParameter();
	}

	public DiagnosticOperationCycleRefConditional createDiagnosticOperationCycleRefConditional() {
		return new DiagnosticOperationCycleRefConditional();
	}

	public DiagnosticOperationCyclePortMapping createDiagnosticOperationCyclePortMapping() {
		return new DiagnosticOperationCyclePortMapping();
	}

	public DiagnosticMemoryIdentifier createDiagnosticMemoryIdentifier() {
		return new DiagnosticMemoryIdentifier();
	}

	public DiagnosticIoControlNeeds createDiagnosticIoControlNeeds() {
		return new DiagnosticIoControlNeeds();
	}

	public DiagnosticIoControl createDiagnosticIoControl() {
		return new DiagnosticIoControl();
	}

	public DiagnosticFreezeFrameRefConditional createDiagnosticFreezeFrameRefConditional() {
		return new DiagnosticFreezeFrameRefConditional();
	}

	public DiagnosticExtendedDataRecordRefConditional createDiagnosticExtendedDataRecordRefConditional() {
		return new DiagnosticExtendedDataRecordRefConditional();
	}

	public DiagnosticExtendedDataRecord createDiagnosticExtendedDataRecord() {
		return new DiagnosticExtendedDataRecord();
	}

	public DiagnosticEventToTroubleCodeUdsMapping createDiagnosticEventToTroubleCodeUdsMapping() {
		return new DiagnosticEventToTroubleCodeUdsMapping();
	}

	public DiagnosticEventToStorageConditionGroupMapping createDiagnosticEventToStorageConditionGroupMapping() {
		return new DiagnosticEventToStorageConditionGroupMapping();
	}

	public DiagnosticEventToOperationCycleMapping createDiagnosticEventToOperationCycleMapping() {
		return new DiagnosticEventToOperationCycleMapping();
	}

	public DiagnosticEventToEnableConditionGroupMapping createDiagnosticEventToEnableConditionGroupMapping() {
		return new DiagnosticEventToEnableConditionGroupMapping();
	}

	public DiagnosticEventToDebounceAlgorithmMapping createDiagnosticEventToDebounceAlgorithmMapping() {
		return new DiagnosticEventToDebounceAlgorithmMapping();
	}

	public DiagnosticEventPortMapping createDiagnosticEventPortMapping() {
		return new DiagnosticEventPortMapping();
	}

	public DiagnosticEventNeeds createDiagnosticEventNeeds() {
		return new DiagnosticEventNeeds();
	}

	public InhibitingSecondaryFidRefs createDiagnosticEventNeedsInhibitingSecondaryFidRefs() {
		return new InhibitingSecondaryFidRefs();
	}

	public DeferringFidRefs createDiagnosticEventNeedsDeferringFidRefs() {
		return new DeferringFidRefs();
	}

	public DiagnosticEvent createDiagnosticEvent() {
		return new DiagnosticEvent();
	}

	public DiagnosticEnableConditionRefConditional createDiagnosticEnableConditionRefConditional() {
		return new DiagnosticEnableConditionRefConditional();
	}

	public DiagnosticEnableConditionPortMapping createDiagnosticEnableConditionPortMapping() {
		return new DiagnosticEnableConditionPortMapping();
	}

	public DiagnosticEnableConditionGroup createDiagnosticEnableConditionGroup() {
		return new DiagnosticEnableConditionGroup();
	}

	public DiagnosticEcuReset createDiagnosticEcuReset() {
		return new DiagnosticEcuReset();
	}

	public DiagnosticDynamicallyDefineDataIdentifier createDiagnosticDynamicallyDefineDataIdentifier() {
		return new DiagnosticDynamicallyDefineDataIdentifier();
	}

	public DiagnosticDemProvidedDataMapping createDiagnosticDemProvidedDataMapping() {
		return new DiagnosticDemProvidedDataMapping();
	}

	public DiagnosticDebounceAlgorithmProps createDiagnosticDebounceAlgorithmProps() {
		return new DiagnosticDebounceAlgorithmProps();
	}

	public DiagnosticDataTransfer createDiagnosticDataTransfer() {
		return new DiagnosticDataTransfer();
	}

	public DiagnosticDataIdentifierSet createDiagnosticDataIdentifierSet() {
		return new DiagnosticDataIdentifierSet();
	}

	public DataIdentifierRefs createDiagnosticDataIdentifierSetDataIdentifierRefs() {
		return new DataIdentifierRefs();
	}

	public DiagnosticDataIdentifier createDiagnosticDataIdentifier() {
		return new DiagnosticDataIdentifier();
	}

	public DiagnosticDataChangeTrigger createDiagnosticDataChangeTrigger() {
		return new DiagnosticDataChangeTrigger();
	}

	public DiagnosticControlDtcSetting createDiagnosticControlDtcSetting() {
		return new DiagnosticControlDtcSetting();
	}

	public DiagnosticContributionSet createDiagnosticContributionSet() {
		return new DiagnosticContributionSet();
	}

	public EcuInstanceRefs createDiagnosticContributionSetEcuInstanceRefs() {
		return new EcuInstanceRefs();
	}

	public DiagnosticConnectionRefConditional createDiagnosticConnectionRefConditional() {
		return new DiagnosticConnectionRefConditional();
	}

	public DiagnosticConnection createDiagnosticConnection() {
		return new DiagnosticConnection();
	}

	public PeriodicResponseUudtRefs createDiagnosticConnectionPeriodicResponseUudtRefs() {
		return new PeriodicResponseUudtRefs();
	}

	public FunctionalRequestRefs createDiagnosticConnectionFunctionalRequestRefs() {
		return new FunctionalRequestRefs();
	}

	public DiagnosticConnectedIndicator createDiagnosticConnectedIndicator() {
		return new DiagnosticConnectedIndicator();
	}

	public DiagnosticCommonPropsConditional createDiagnosticCommonPropsConditional() {
		return new DiagnosticCommonPropsConditional();
	}

	public DiagnosticCommonProps createDiagnosticCommonProps() {
		return new DiagnosticCommonProps();
	}

	public DiagnosticCommonElementRefConditional createDiagnosticCommonElementRefConditional() {
		return new DiagnosticCommonElementRefConditional();
	}

	public DiagnosticComControlSubNodeChannel createDiagnosticComControlSubNodeChannel() {
		return new DiagnosticComControlSubNodeChannel();
	}

	public DiagnosticComControlSpecificChannel createDiagnosticComControlSpecificChannel() {
		return new DiagnosticComControlSpecificChannel();
	}

	public DiagnosticComControlClass createDiagnosticComControlClass() {
		return new DiagnosticComControlClass();
	}

	public AllChannelsRefs createDiagnosticComControlClassAllChannelsRefs() {
		return new AllChannelsRefs();
	}

	public DiagnosticComControl createDiagnosticComControl() {
		return new DiagnosticComControl();
	}

	public DiagnosticClearDiagnosticInformation createDiagnosticClearDiagnosticInformation() {
		return new DiagnosticClearDiagnosticInformation();
	}

	public DiagnosticAging createDiagnosticAging() {
		return new DiagnosticAging();
	}

	public DiagnosticAccessPermission createDiagnosticAccessPermission() {
		return new DiagnosticAccessPermission();
	}

	public SecurityLevelRefs createDiagnosticAccessPermissionSecurityLevelRefs() {
		return new SecurityLevelRefs();
	}

	public DiagnosticSessionRefs createDiagnosticAccessPermissionDiagnosticSessionRefs() {
		return new DiagnosticSessionRefs();
	}

	public DependencyOnArtifact createDependencyOnArtifact() {
		return new DependencyOnArtifact();
	}

	public DelegationSwConnector createDelegationSwConnector() {
		return new DelegationSwConnector();
	}

	public DataWriteCompletedEvent createDataWriteCompletedEvent() {
		return new DataWriteCompletedEvent();
	}

	public DataTypeMappingSet createDataTypeMappingSet() {
		return new DataTypeMappingSet();
	}

	public DataTypeMap createDataTypeMap() {
		return new DataTypeMap();
	}

	public DataTransformationSet createDataTransformationSet() {
		return new DataTransformationSet();
	}

	public DataTransformationRefConditional createDataTransformationRefConditional() {
		return new DataTransformationRefConditional();
	}

	public DataTransformation createDataTransformation() {
		return new DataTransformation();
	}

	public TransformerChainRefs createDataTransformationTransformerChainRefs() {
		return new TransformerChainRefs();
	}

	public DataSendCompletedEvent createDataSendCompletedEvent() {
		return new DataSendCompletedEvent();
	}

	public DataPrototypeMapping createDataPrototypeMapping() {
		return new DataPrototypeMapping();
	}

	public DataPrototypeInSystemInstanceRef createDataPrototypeInSystemInstanceRef() {
		return new DataPrototypeInSystemInstanceRef();
	}

	public DataPrototypeGroup createDataPrototypeGroup() {
		return new DataPrototypeGroup();
	}

	public DataDumpEntry createDataDumpEntry() {
		return new DataDumpEntry();
	}

	public DataConstr createDataConstr() {
		return new DataConstr();
	}

	public CouplingPortTrafficClassAssignment createCouplingPortTrafficClassAssignment() {
		return new CouplingPortTrafficClassAssignment();
	}

	public CouplingPortShaper createCouplingPortShaper() {
		return new CouplingPortShaper();
	}

	public CouplingPortScheduler createCouplingPortScheduler() {
		return new CouplingPortScheduler();
	}

	public PredecessorRefs createCouplingPortSchedulerPredecessorRefs() {
		return new PredecessorRefs();
	}

	public CouplingPortFifo createCouplingPortFifo() {
		return new CouplingPortFifo();
	}

	public CouplingPortDetails createCouplingPortDetails() {
		return new CouplingPortDetails();
	}

	public CouplingPortConnection createCouplingPortConnection() {
		return new CouplingPortConnection();
	}

	public CouplingPort createCouplingPort() {
		return new CouplingPort();
	}

	public MacMulticastAddressRefs createCouplingPortMacMulticastAddressRefs() {
		return new MacMulticastAddressRefs();
	}

	public CouplingElement createCouplingElement() {
		return new CouplingElement();
	}

	public ContainerIPdu createContainerIPdu() {
		return new ContainerIPdu();
	}

	public ContainedPduTriggeringRefs createContainerIPduContainedPduTriggeringRefs() {
		return new ContainedPduTriggeringRefs();
	}

	public ConsumedServiceInstance createConsumedServiceInstance() {
		return new ConsumedServiceInstance();
	}

	public ConsumedEventGroup createConsumedEventGroup() {
		return new ConsumedEventGroup();
	}

	public RoutingGroupRefs createConsumedEventGroupRoutingGroupRefs() {
		return new RoutingGroupRefs();
	}

	public ConstantSpecificationMappingSet createConstantSpecificationMappingSet() {
		return new ConstantSpecificationMappingSet();
	}

	public ConstantSpecificationMapping createConstantSpecificationMapping() {
		return new ConstantSpecificationMapping();
	}

	public ConstantSpecification createConstantSpecification() {
		return new ConstantSpecification();
	}

	public ConstantReference createConstantReference() {
		return new ConstantReference();
	}

	public ConsistencyNeedsBlueprintSet createConsistencyNeedsBlueprintSet() {
		return new ConsistencyNeedsBlueprintSet();
	}

	public ConsistencyNeeds createConsistencyNeeds() {
		return new ConsistencyNeeds();
	}

	public ConcretePatternEventTriggering createConcretePatternEventTriggering() {
		return new ConcretePatternEventTriggering();
	}

	public CompuScales createCompuScales() {
		return new CompuScales();
	}

	public CompuMethod createCompuMethod() {
		return new CompuMethod();
	}

	public CompositionSwComponentType createCompositionSwComponentType() {
		return new CompositionSwComponentType();
	}

	public DataTypeMappingRefs createCompositionSwComponentTypeDataTypeMappingRefs() {
		return new DataTypeMappingRefs();
	}

	public ConstantValueMappingRefs createCompositionSwComponentTypeConstantValueMappingRefs() {
		return new ConstantValueMappingRefs();
	}

	public ComponentSeparation createComponentSeparation() {
		return new ComponentSeparation();
	}

	public ComponentInSystemInstanceRef createComponentInSystemInstanceRef() {
		return new ComponentInSystemInstanceRef();
	}

	public ComponentInCompositionInstanceRef createComponentInCompositionInstanceRef() {
		return new ComponentInCompositionInstanceRef();
	}

	public ComponentClustering createComponentClustering() {
		return new ComponentClustering();
	}

	public ComplexDeviceDriverSwComponentType createComplexDeviceDriverSwComponentType() {
		return new ComplexDeviceDriverSwComponentType();
	}

	public HardwareElementRefs createComplexDeviceDriverSwComponentTypeHardwareElementRefs() {
		return new HardwareElementRefs();
	}

	public CommunicationControllerMapping createCommunicationControllerMapping() {
		return new CommunicationControllerMapping();
	}

	public CommunicationConnectorRefConditional createCommunicationConnectorRefConditional() {
		return new CommunicationConnectorRefConditional();
	}

	public CommonSignalPath createCommonSignalPath() {
		return new CommonSignalPath();
	}

	public Collection createCollection() {
		return new Collection();
	}

	public SourceElementRefs createCollectionSourceElementRefs() {
		return new SourceElementRefs();
	}

	public ElementRefs createCollectionElementRefs() {
		return new ElementRefs();
	}

	public Code createCode() {
		return new Code();
	}

	public CallbackHeaderRefs createCodeCallbackHeaderRefs() {
		return new CallbackHeaderRefs();
	}

	public ClientServerToSignalMapping createClientServerToSignalMapping() {
		return new ClientServerToSignalMapping();
	}

	public ClientServerToSignalGroupMapping createClientServerToSignalGroupMapping() {
		return new ClientServerToSignalGroupMapping();
	}

	public ClientServerRecordTypeMapping createClientServerRecordTypeMapping() {
		return new ClientServerRecordTypeMapping();
	}

	public ClientServerRecordElementMapping createClientServerRecordElementMapping() {
		return new ClientServerRecordElementMapping();
	}

	public ClientServerPrimitiveTypeMapping createClientServerPrimitiveTypeMapping() {
		return new ClientServerPrimitiveTypeMapping();
	}

	public ClientServerOperationMapping createClientServerOperationMapping() {
		return new ClientServerOperationMapping();
	}

	public ClientServerOperation createClientServerOperation() {
		return new ClientServerOperation();
	}

	public PossibleErrorRefs createClientServerOperationPossibleErrorRefs() {
		return new PossibleErrorRefs();
	}

	public ClientServerInterfaceMapping createClientServerInterfaceMapping() {
		return new ClientServerInterfaceMapping();
	}

	public ClientServerInterface createClientServerInterface() {
		return new ClientServerInterface();
	}

	public ClientServerArrayTypeMapping createClientServerArrayTypeMapping() {
		return new ClientServerArrayTypeMapping();
	}

	public ClientServerArrayElementMapping createClientServerArrayElementMapping() {
		return new ClientServerArrayElementMapping();
	}

	public ClientServerApplicationErrorMapping createClientServerApplicationErrorMapping() {
		return new ClientServerApplicationErrorMapping();
	}

	public ClientServerAnnotation createClientServerAnnotation() {
		return new ClientServerAnnotation();
	}

	public ClientIdMapping createClientIdMapping() {
		return new ClientIdMapping();
	}

	public ClientIdDefinitionSet createClientIdDefinitionSet() {
		return new ClientIdDefinitionSet();
	}

	public ClientComSpec createClientComSpec() {
		return new ClientComSpec();
	}

	public CanTpNode createCanTpNode() {
		return new CanTpNode();
	}

	public CanTpEcu createCanTpEcu() {
		return new CanTpEcu();
	}

	public CanTpConnection createCanTpConnection() {
		return new CanTpConnection();
	}

	public ReceiverRefs createCanTpConnectionReceiverRefs() {
		return new ReceiverRefs();
	}

	public CanTpConfig createCanTpConfig() {
		return new CanTpConfig();
	}

	public CanNmClusterCoupling createCanNmClusterCoupling() {
		return new CanNmClusterCoupling();
	}

	public CoupledClusterRefs createCanNmClusterCouplingCoupledClusterRefs() {
		return new CoupledClusterRefs();
	}

	public CanFrameTriggering createCanFrameTriggering() {
		return new CanFrameTriggering();
	}

	public CanCommunicationController createCanCommunicationController() {
		return new CanCommunicationController();
	}

	public CanCluster createCanCluster() {
		return new CanCluster();
	}

	public CalibrationParameterValueSet createCalibrationParameterValueSet() {
		return new CalibrationParameterValueSet();
	}

	public CalibrationParameterValue createCalibrationParameterValue() {
		return new CalibrationParameterValue();
	}

	public BuildActionManifestRefConditional createBuildActionManifestRefConditional() {
		return new BuildActionManifestRefConditional();
	}

	public BuildActionManifest createBuildActionManifest() {
		return new BuildActionManifest();
	}

	public DynamicActionRefs createBuildActionManifestDynamicActionRefs() {
		return new DynamicActionRefs();
	}

	public TearDownActionRefs createBuildActionManifestTearDownActionRefs() {
		return new TearDownActionRefs();
	}

	public StartActionRefs createBuildActionManifestStartActionRefs() {
		return new StartActionRefs();
	}

	public BuildActionIoElement createBuildActionIoElement() {
		return new BuildActionIoElement();
	}

	public BuildActionInvocator createBuildActionInvocator() {
		return new BuildActionInvocator();
	}

	public BuildActionEnvironment createBuildActionEnvironment() {
		return new BuildActionEnvironment();
	}

	public BuildAction createBuildAction() {
		return new BuildAction();
	}

	public FollowUpActionRefs createBuildActionFollowUpActionRefs() {
		return new FollowUpActionRefs();
	}

	public PredecessorActionRefs createBuildActionPredecessorActionRefs() {
		return new PredecessorActionRefs();
	}

	public BswVariableAccess createBswVariableAccess() {
		return new BswVariableAccess();
	}

	public ContextLimitationRefs createBswVariableAccessContextLimitationRefs() {
		return new ContextLimitationRefs();
	}

	public BswTriggerDirectImplementation createBswTriggerDirectImplementation() {
		return new BswTriggerDirectImplementation();
	}

	public BswTimingEvent createBswTimingEvent() {
		return new BswTimingEvent();
	}

	public ContextLimitationRefs createBswTimingEventContextLimitationRefs() {
		return new ContextLimitationRefs();
	}

	public BswSynchronousServerCallPoint createBswSynchronousServerCallPoint() {
		return new BswSynchronousServerCallPoint();
	}

	public ContextLimitationRefs createBswSynchronousServerCallPointContextLimitationRefs() {
		return new ContextLimitationRefs();
	}

	public BswServiceDependency createBswServiceDependency() {
		return new BswServiceDependency();
	}

	public BswSchedulableEntity createBswSchedulableEntity() {
		return new BswSchedulableEntity();
	}

	public BswReleasedTriggerPolicy createBswReleasedTriggerPolicy() {
		return new BswReleasedTriggerPolicy();
	}

	public BswQueuedDataReceptionPolicy createBswQueuedDataReceptionPolicy() {
		return new BswQueuedDataReceptionPolicy();
	}

	public BswPerInstanceMemoryPolicy createBswPerInstanceMemoryPolicy() {
		return new BswPerInstanceMemoryPolicy();
	}

	public BswParameterPolicy createBswParameterPolicy() {
		return new BswParameterPolicy();
	}

	public BswOperationInvokedEvent createBswOperationInvokedEvent() {
		return new BswOperationInvokedEvent();
	}

	public BswModuleTiming createBswModuleTiming() {
		return new BswModuleTiming();
	}

	public BswModuleEntryRefConditional createBswModuleEntryRefConditional() {
		return new BswModuleEntryRefConditional();
	}

	public BswModuleEntry createBswModuleEntry() {
		return new BswModuleEntry();
	}

	public BswModuleDescriptionRefConditional createBswModuleDescriptionRefConditional() {
		return new BswModuleDescriptionRefConditional();
	}

	public BswModuleDescription createBswModuleDescription() {
		return new BswModuleDescription();
	}

	public BswModuleDependency createBswModuleDependency() {
		return new BswModuleDependency();
	}

	public BswModuleClientServerEntry createBswModuleClientServerEntry() {
		return new BswModuleClientServerEntry();
	}

	public BswModeSwitchedAckEvent createBswModeSwitchedAckEvent() {
		return new BswModeSwitchedAckEvent();
	}

	public BswModeSwitchEvent createBswModeSwitchEvent() {
		return new BswModeSwitchEvent();
	}

	public BswModeSenderPolicy createBswModeSenderPolicy() {
		return new BswModeSenderPolicy();
	}

	public BswModeReceiverPolicy createBswModeReceiverPolicy() {
		return new BswModeReceiverPolicy();
	}

	public BswModeManagerErrorEvent createBswModeManagerErrorEvent() {
		return new BswModeManagerErrorEvent();
	}

	public BswInternalTriggeringPointRefConditional createBswInternalTriggeringPointRefConditional() {
		return new BswInternalTriggeringPointRefConditional();
	}

	public BswInternalTriggeringPointPolicy createBswInternalTriggeringPointPolicy() {
		return new BswInternalTriggeringPointPolicy();
	}

	public BswInternalTriggerOccurredEvent createBswInternalTriggerOccurredEvent() {
		return new BswInternalTriggerOccurredEvent();
	}

	public BswInternalBehavior createBswInternalBehavior() {
		return new BswInternalBehavior();
	}

	public BswImplementation createBswImplementation() {
		return new BswImplementation();
	}

	public VendorSpecificModuleDefRefs createBswImplementationVendorSpecificModuleDefRefs() {
		return new VendorSpecificModuleDefRefs();
	}

	public RecommendedConfigurationRefs createBswImplementationRecommendedConfigurationRefs() {
		return new RecommendedConfigurationRefs();
	}

	public PreconfiguredConfigurationRefs createBswImplementationPreconfiguredConfigurationRefs() {
		return new PreconfiguredConfigurationRefs();
	}

	public BswExternalTriggerOccurredEvent createBswExternalTriggerOccurredEvent() {
		return new BswExternalTriggerOccurredEvent();
	}

	public BswExclusiveAreaPolicy createBswExclusiveAreaPolicy() {
		return new BswExclusiveAreaPolicy();
	}

	public BswDirectCallPoint createBswDirectCallPoint() {
		return new BswDirectCallPoint();
	}

	public BswDebugInfo createBswDebugInfo() {
		return new BswDebugInfo();
	}

	public VariableAccessedForDebugRefs createBswDebugInfoVariableAccessedForDebugRefs() {
		return new VariableAccessedForDebugRefs();
	}

	public ParameterAccessedForDebugRefs createBswDebugInfoParameterAccessedForDebugRefs() {
		return new ParameterAccessedForDebugRefs();
	}

	public BswDataSendPolicy createBswDataSendPolicy() {
		return new BswDataSendPolicy();
	}

	public BswDataReceivedEvent createBswDataReceivedEvent() {
		return new BswDataReceivedEvent();
	}

	public BswClientPolicy createBswClientPolicy() {
		return new BswClientPolicy();
	}

	public BswAsynchronousServerCallReturnsEvent createBswAsynchronousServerCallReturnsEvent() {
		return new BswAsynchronousServerCallReturnsEvent();
	}

	public BswAsynchronousServerCallResultPoint createBswAsynchronousServerCallResultPoint() {
		return new BswAsynchronousServerCallResultPoint();
	}

	public BswAsynchronousServerCallPoint createBswAsynchronousServerCallPoint() {
		return new BswAsynchronousServerCallPoint();
	}

	public BlueprintMappingSet createBlueprintMappingSet() {
		return new BlueprintMappingSet();
	}

	public BlueprintMapping createBlueprintMapping() {
		return new BlueprintMapping();
	}

	public BlueprintFormula createBlueprintFormula() {
		return new BlueprintFormula();
	}

	public AutosarVariableRef createAutosarVariableRef() {
		return new AutosarVariableRef();
	}

	public AutosarParameterRef createAutosarParameterRef() {
		return new AutosarParameterRef();
	}

	public AutosarDataTypeRefConditional createAutosarDataTypeRefConditional() {
		return new AutosarDataTypeRefConditional();
	}

	public AsynchronousServerCallReturnsEvent createAsynchronousServerCallReturnsEvent() {
		return new AsynchronousServerCallReturnsEvent();
	}

	public AsynchronousServerCallResultPoint createAsynchronousServerCallResultPoint() {
		return new AsynchronousServerCallResultPoint();
	}

	public AssignFrameIdRange createAssignFrameIdRange() {
		return new AssignFrameIdRange();
	}

	public AssignFrameId createAssignFrameId() {
		return new AssignFrameId();
	}

	public ArrayValueSpecification createArrayValueSpecification() {
		return new ArrayValueSpecification();
	}

	public ArgumentDataPrototype createArgumentDataPrototype() {
		return new ArgumentDataPrototype();
	}

	public ArbitraryEventTriggering createArbitraryEventTriggering() {
		return new ArbitraryEventTriggering();
	}

	public ArVariableInImplementationDataInstanceRef createArVariableInImplementationDataInstanceRef() {
		return new ArVariableInImplementationDataInstanceRef();
	}

	public ContextDataPrototypeRefs createArVariableInImplementationDataInstanceRefContextDataPrototypeRefs() {
		return new ContextDataPrototypeRefs();
	}

	public ApplicationValueSpecification createApplicationValueSpecification() {
		return new ApplicationValueSpecification();
	}

	public ApplicationRuleBasedValueSpecification createApplicationRuleBasedValueSpecification() {
		return new ApplicationRuleBasedValueSpecification();
	}

	public ApplicationRecordElement createApplicationRecordElement() {
		return new ApplicationRecordElement();
	}

	public ApplicationRecordDataType createApplicationRecordDataType() {
		return new ApplicationRecordDataType();
	}

	public ApplicationErrorMapping createApplicationErrorMapping() {
		return new ApplicationErrorMapping();
	}

	public ApplicationEntry createApplicationEntry() {
		return new ApplicationEntry();
	}

	public ApplicationEndpoint createApplicationEndpoint() {
		return new ApplicationEndpoint();
	}

	public ApplicationCompositeElementInPortInterfaceInstanceRef createApplicationCompositeElementInPortInterfaceInstanceRef() {
		return new ApplicationCompositeElementInPortInterfaceInstanceRef();
	}

	public AnyInstanceRef createAnyInstanceRef() {
		return new AnyInstanceRef();
	}

	public AliasNameSet createAliasNameSet() {
		return new AliasNameSet();
	}

	public AliasNameAssignment createAliasNameAssignment() {
		return new AliasNameAssignment();
	}

	public AgeConstraint createAgeConstraint() {
		return new AgeConstraint();
	}

	public AdminData createAdminData() {
		return new AdminData();
	}

	public AclPermission createAclPermission() {
		return new AclPermission();
	}

	public AclRoleRefs createAclPermissionAclRoleRefs() {
		return new AclRoleRefs();
	}

	public AclOperationRefs createAclPermissionAclOperationRefs() {
		return new AclOperationRefs();
	}

	public AclObjectRefs createAclPermissionAclObjectRefs() {
		return new AclObjectRefs();
	}

	public AclOperation createAclOperation() {
		return new AclOperation();
	}

	public ImpliedOperationRefs createAclOperationImpliedOperationRefs() {
		return new ImpliedOperationRefs();
	}

	public AclObjectSet createAclObjectSet() {
		return new AclObjectSet();
	}

	public ObjectRefs createAclObjectSetObjectRefs() {
		return new ObjectRefs();
	}

	public ObjectDefintionRefs createAclObjectSetObjectDefintionRefs() {
		return new ObjectDefintionRefs();
	}

	public ObjectDefinitionRefs createAclObjectSetObjectDefinitionRefs() {
		return new ObjectDefinitionRefs();
	}

	public DerivedFromBlueprintRefs createAclObjectSetDerivedFromBlueprintRefs() {
		return new DerivedFromBlueprintRefs();
	}

	public ArPackage createArPackage() {
		return new ArPackage();
	}

	public Autosar createAutosar() {
		return new Autosar();
	}

	public AbsoluteTolerance createAbsoluteTolerance() {
		return new AbsoluteTolerance();
	}

	public AclRole createAclRole() {
		return new AclRole();
	}

	public AnalyzedExecutionTime createAnalyzedExecutionTime() {
		return new AnalyzedExecutionTime();
	}

	public Annotation createAnnotation() {
		return new Annotation();
	}

	public ApplicationArrayDataType createApplicationArrayDataType() {
		return new ApplicationArrayDataType();
	}

	public ApplicationArrayElement createApplicationArrayElement() {
		return new ApplicationArrayElement();
	}

	public ApplicationCompositeDataTypeSubElementRef createApplicationCompositeDataTypeSubElementRef() {
		return new ApplicationCompositeDataTypeSubElementRef();
	}

	public ApplicationError createApplicationError() {
		return new ApplicationError();
	}

	public ApplicationPrimitiveDataType createApplicationPrimitiveDataType() {
		return new ApplicationPrimitiveDataType();
	}

	public ApplicationSwComponentType createApplicationSwComponentType() {
		return new ApplicationSwComponentType();
	}

	public Area createArea() {
		return new Area();
	}

	public AssemblySwConnector createAssemblySwConnector() {
		return new AssemblySwConnector();
	}

	public AssignNad createAssignNad() {
		return new AssignNad();
	}

	public AsynchronousServerCallPoint createAsynchronousServerCallPoint() {
		return new AsynchronousServerCallPoint();
	}

	public AutosarEngineeringObject createAutosarEngineeringObject() {
		return new AutosarEngineeringObject();
	}

	public AutosarOperationArgumentInstance createAutosarOperationArgumentInstance() {
		return new AutosarOperationArgumentInstance();
	}

	public AutosarVariableInstance createAutosarVariableInstance() {
		return new AutosarVariableInstance();
	}

	public BackgroundEvent createBackgroundEvent() {
		return new BackgroundEvent();
	}

	public BaseTypeDirectDefinition createBaseTypeDirectDefinition() {
		return new BaseTypeDirectDefinition();
	}

	public BlueprintPolicyList createBlueprintPolicyList() {
		return new BlueprintPolicyList();
	}

	public BlueprintPolicyNotModifiable createBlueprintPolicyNotModifiable() {
		return new BlueprintPolicyNotModifiable();
	}

	public BlueprintPolicySingle createBlueprintPolicySingle() {
		return new BlueprintPolicySingle();
	}

	public BooleanValueVariationPoint createBooleanValueVariationPoint() {
		return new BooleanValueVariationPoint();
	}

	public Br createBr() {
		return new Br();
	}

	public BswBackgroundEvent createBswBackgroundEvent() {
		return new BswBackgroundEvent();
	}

	public BswCalledEntity createBswCalledEntity() {
		return new BswCalledEntity();
	}

	public BswDistinguishedPartition createBswDistinguishedPartition() {
		return new BswDistinguishedPartition();
	}

	public BswInternalTriggeringPoint createBswInternalTriggeringPoint() {
		return new BswInternalTriggeringPoint();
	}

	public BswInterruptEntity createBswInterruptEntity() {
		return new BswInterruptEntity();
	}

	public BswMgrNeeds createBswMgrNeeds() {
		return new BswMgrNeeds();
	}

	public BswModeSwitchAckRequest createBswModeSwitchAckRequest() {
		return new BswModeSwitchAckRequest();
	}

	public BswSchedulerNamePrefix createBswSchedulerNamePrefix() {
		return new BswSchedulerNamePrefix();
	}

	public BswServiceDependencyIdent createBswServiceDependencyIdent() {
		return new BswServiceDependencyIdent();
	}

	public BufferProperties createBufferProperties() {
		return new BufferProperties();
	}

	public BuildEngineeringObject createBuildEngineeringObject() {
		return new BuildEngineeringObject();
	}

	public BurstPatternEventTriggering createBurstPatternEventTriggering() {
		return new BurstPatternEventTriggering();
	}

	public CIdentifier createCIdentifier() {
		return new CIdentifier();
	}

	public CanClusterBusOffRecovery createCanClusterBusOffRecovery() {
		return new CanClusterBusOffRecovery();
	}

	public CanClusterConditional createCanClusterConditional() {
		return new CanClusterConditional();
	}

	public CanCommunicationConnector createCanCommunicationConnector() {
		return new CanCommunicationConnector();
	}

	public CanCommunicationControllerConditional createCanCommunicationControllerConditional() {
		return new CanCommunicationControllerConditional();
	}

	public CanControllerConfiguration createCanControllerConfiguration() {
		return new CanControllerConfiguration();
	}

	public CanControllerConfigurationRequirements createCanControllerConfigurationRequirements() {
		return new CanControllerConfigurationRequirements();
	}

	public CanControllerFdConfiguration createCanControllerFdConfiguration() {
		return new CanControllerFdConfiguration();
	}

	public CanControllerFdConfigurationRequirements createCanControllerFdConfigurationRequirements() {
		return new CanControllerFdConfigurationRequirements();
	}

	public CanFrame createCanFrame() {
		return new CanFrame();
	}

	public CanNmCluster createCanNmCluster() {
		return new CanNmCluster();
	}

	public CanNmEcu createCanNmEcu() {
		return new CanNmEcu();
	}

	public CanNmNode createCanNmNode() {
		return new CanNmNode();
	}

	public CanNmRangeConfig createCanNmRangeConfig() {
		return new CanNmRangeConfig();
	}

	public CanPhysicalChannel createCanPhysicalChannel() {
		return new CanPhysicalChannel();
	}

	public CanTpAddress createCanTpAddress() {
		return new CanTpAddress();
	}

	public CanTpChannel createCanTpChannel() {
		return new CanTpChannel();
	}

	public Caption createCaption() {
		return new Caption();
	}

	public Chapter createChapter() {
		return new Chapter();
	}

	public ChapterContent createChapterContent() {
		return new ChapterContent();
	}

	public ChapterModel createChapterModel() {
		return new ChapterModel();
	}

	public ChapterOrMsrQuery createChapterOrMsrQuery() {
		return new ChapterOrMsrQuery();
	}

	public ClientIdDefinition createClientIdDefinition() {
		return new ClientIdDefinition();
	}

	public ClientIdRange createClientIdRange() {
		return new ClientIdRange();
	}

	public Colspec createColspec() {
		return new Colspec();
	}

	public ComMgrUserNeeds createComMgrUserNeeds() {
		return new ComMgrUserNeeds();
	}

	public Compiler createCompiler() {
		return new Compiler();
	}

	public CompositeNetworkRepresentation createCompositeNetworkRepresentation() {
		return new CompositeNetworkRepresentation();
	}

	public Compu createCompu() {
		return new Compu();
	}

	public CompuConst createCompuConst() {
		return new CompuConst();
	}

	public CompuConstFormulaContent createCompuConstFormulaContent() {
		return new CompuConstFormulaContent();
	}

	public CompuConstNumericContent createCompuConstNumericContent() {
		return new CompuConstNumericContent();
	}

	public CompuConstTextContent createCompuConstTextContent() {
		return new CompuConstTextContent();
	}

	public CompuGenericMath createCompuGenericMath() {
		return new CompuGenericMath();
	}

	public CompuNominatorDenominator createCompuNominatorDenominator() {
		return new CompuNominatorDenominator();
	}

	public CompuRationalCoeffs createCompuRationalCoeffs() {
		return new CompuRationalCoeffs();
	}

	public CompuScale createCompuScale() {
		return new CompuScale();
	}

	public CompuScaleConstantContents createCompuScaleConstantContents() {
		return new CompuScaleConstantContents();
	}

	public CompuScaleRationalFormula createCompuScaleRationalFormula() {
		return new CompuScaleRationalFormula();
	}

	public ConditionByFormula createConditionByFormula() {
		return new ConditionByFormula();
	}

	public ConditionalChangeNad createConditionalChangeNad() {
		return new ConditionalChangeNad();
	}

	public ConfidenceInterval createConfidenceInterval() {
		return new ConfidenceInterval();
	}

	public ContainedIPduProps createContainedIPduProps() {
		return new ContainedIPduProps();
	}

	public CryptoServiceNeeds createCryptoServiceNeeds() {
		return new CryptoServiceNeeds();
	}

	public CycleCounter createCycleCounter() {
		return new CycleCounter();
	}

	public CycleRepetition createCycleRepetition() {
		return new CycleRepetition();
	}

	public CyclicTiming createCyclicTiming() {
		return new CyclicTiming();
	}

	public DataConstrRule createDataConstrRule() {
		return new DataConstrRule();
	}

	public DataFilter createDataFilter() {
		return new DataFilter();
	}

	public DataReceiveErrorEvent createDataReceiveErrorEvent() {
		return new DataReceiveErrorEvent();
	}

	public DataReceivedEvent createDataReceivedEvent() {
		return new DataReceivedEvent();
	}

	public DcmIPdu createDcmIPdu() {
		return new DcmIPdu();
	}

	public DefItem createDefItem() {
		return new DefItem();
	}

	public DefList createDefList() {
		return new DefList();
	}

	public DefaultValueElement createDefaultValueElement() {
		return new DefaultValueElement();
	}

	public DelegatedPortAnnotation createDelegatedPortAnnotation() {
		return new DelegatedPortAnnotation();
	}

	public DhcpServerConfiguration createDhcpServerConfiguration() {
		return new DhcpServerConfiguration();
	}

	public DiagEventDebounceCounterBased createDiagEventDebounceCounterBased() {
		return new DiagEventDebounceCounterBased();
	}

	public DiagEventDebounceMonitorInternal createDiagEventDebounceMonitorInternal() {
		return new DiagEventDebounceMonitorInternal();
	}

	public DiagEventDebounceTimeBased createDiagEventDebounceTimeBased() {
		return new DiagEventDebounceTimeBased();
	}

	public DiagnosticClearDiagnosticInformationClass createDiagnosticClearDiagnosticInformationClass() {
		return new DiagnosticClearDiagnosticInformationClass();
	}

	public DiagnosticCommunicationManagerNeeds createDiagnosticCommunicationManagerNeeds() {
		return new DiagnosticCommunicationManagerNeeds();
	}

	public DiagnosticControlDtcSettingClass createDiagnosticControlDtcSettingClass() {
		return new DiagnosticControlDtcSettingClass();
	}

	public DiagnosticCustomServiceClass createDiagnosticCustomServiceClass() {
		return new DiagnosticCustomServiceClass();
	}

	public DiagnosticDataElement createDiagnosticDataElement() {
		return new DiagnosticDataElement();
	}

	public DiagnosticDataTransferClass createDiagnosticDataTransferClass() {
		return new DiagnosticDataTransferClass();
	}

	public DiagnosticDtcChangeTrigger createDiagnosticDtcChangeTrigger() {
		return new DiagnosticDtcChangeTrigger();
	}

	public DiagnosticDynamicDataIdentifier createDiagnosticDynamicDataIdentifier() {
		return new DiagnosticDynamicDataIdentifier();
	}

	public DiagnosticDynamicallyDefineDataIdentifierClass createDiagnosticDynamicallyDefineDataIdentifierClass() {
		return new DiagnosticDynamicallyDefineDataIdentifierClass();
	}

	public DiagnosticEcuProps createDiagnosticEcuProps() {
		return new DiagnosticEcuProps();
	}

	public DiagnosticEcuResetClass createDiagnosticEcuResetClass() {
		return new DiagnosticEcuResetClass();
	}

	public DiagnosticEnableCondition createDiagnosticEnableCondition() {
		return new DiagnosticEnableCondition();
	}

	public DiagnosticEnableConditionNeeds createDiagnosticEnableConditionNeeds() {
		return new DiagnosticEnableConditionNeeds();
	}

	public DiagnosticEventInfoNeeds createDiagnosticEventInfoNeeds() {
		return new DiagnosticEventInfoNeeds();
	}

	public DiagnosticEventManagerNeeds createDiagnosticEventManagerNeeds() {
		return new DiagnosticEventManagerNeeds();
	}

	public DiagnosticEventWindow createDiagnosticEventWindow() {
		return new DiagnosticEventWindow();
	}

	public DiagnosticFreezeFrame createDiagnosticFreezeFrame() {
		return new DiagnosticFreezeFrame();
	}

	public DiagnosticIndicator createDiagnosticIndicator() {
		return new DiagnosticIndicator();
	}

	public DiagnosticIoControlClass createDiagnosticIoControlClass() {
		return new DiagnosticIoControlClass();
	}

	public DiagnosticMemoryDestinationMirror createDiagnosticMemoryDestinationMirror() {
		return new DiagnosticMemoryDestinationMirror();
	}

	public DiagnosticMemoryDestinationPrimary createDiagnosticMemoryDestinationPrimary() {
		return new DiagnosticMemoryDestinationPrimary();
	}

	public DiagnosticMemoryDestinationUserDefined createDiagnosticMemoryDestinationUserDefined() {
		return new DiagnosticMemoryDestinationUserDefined();
	}

	public DiagnosticOperationCycle createDiagnosticOperationCycle() {
		return new DiagnosticOperationCycle();
	}

	public DiagnosticOperationCycleNeeds createDiagnosticOperationCycleNeeds() {
		return new DiagnosticOperationCycleNeeds();
	}

	public DiagnosticPeriodicRate createDiagnosticPeriodicRate() {
		return new DiagnosticPeriodicRate();
	}

	public DiagnosticReadDtcInformationClass createDiagnosticReadDtcInformationClass() {
		return new DiagnosticReadDtcInformationClass();
	}

	public DiagnosticReadDataByIdentifierClass createDiagnosticReadDataByIdentifierClass() {
		return new DiagnosticReadDataByIdentifierClass();
	}

	public DiagnosticReadMemoryByAddressClass createDiagnosticReadMemoryByAddressClass() {
		return new DiagnosticReadMemoryByAddressClass();
	}

	public DiagnosticRequestDownloadClass createDiagnosticRequestDownloadClass() {
		return new DiagnosticRequestDownloadClass();
	}

	public DiagnosticRequestFileTransferClass createDiagnosticRequestFileTransferClass() {
		return new DiagnosticRequestFileTransferClass();
	}

	public DiagnosticRequestUploadClass createDiagnosticRequestUploadClass() {
		return new DiagnosticRequestUploadClass();
	}

	public DiagnosticResponseOnEventClass createDiagnosticResponseOnEventClass() {
		return new DiagnosticResponseOnEventClass();
	}

	public DiagnosticRoutine createDiagnosticRoutine() {
		return new DiagnosticRoutine();
	}

	public DiagnosticRoutineControlClass createDiagnosticRoutineControlClass() {
		return new DiagnosticRoutineControlClass();
	}

	public DiagnosticRoutineNeeds createDiagnosticRoutineNeeds() {
		return new DiagnosticRoutineNeeds();
	}

	public DiagnosticSecurityAccessClass createDiagnosticSecurityAccessClass() {
		return new DiagnosticSecurityAccessClass();
	}

	public DiagnosticSecurityLevel createDiagnosticSecurityLevel() {
		return new DiagnosticSecurityLevel();
	}

	public DiagnosticSession createDiagnosticSession() {
		return new DiagnosticSession();
	}

	public DiagnosticSessionControlClass createDiagnosticSessionControlClass() {
		return new DiagnosticSessionControlClass();
	}

	public DiagnosticStorageCondition createDiagnosticStorageCondition() {
		return new DiagnosticStorageCondition();
	}

	public DiagnosticStorageConditionNeeds createDiagnosticStorageConditionNeeds() {
		return new DiagnosticStorageConditionNeeds();
	}

	public DiagnosticTransferExitClass createDiagnosticTransferExitClass() {
		return new DiagnosticTransferExitClass();
	}

	public DiagnosticTroubleCodeJ1939 createDiagnosticTroubleCodeJ1939() {
		return new DiagnosticTroubleCodeJ1939();
	}

	public DiagnosticTroubleCodeObd createDiagnosticTroubleCodeObd() {
		return new DiagnosticTroubleCodeObd();
	}

	public DiagnosticValueNeeds createDiagnosticValueNeeds() {
		return new DiagnosticValueNeeds();
	}

	public DiagnosticWriteDataByIdentifierClass createDiagnosticWriteDataByIdentifierClass() {
		return new DiagnosticWriteDataByIdentifierClass();
	}

	public DiagnosticsCommunicationSecurityNeeds createDiagnosticsCommunicationSecurityNeeds() {
		return new DiagnosticsCommunicationSecurityNeeds();
	}

	public DiscoveryTechnology createDiscoveryTechnology() {
		return new DiscoveryTechnology();
	}

	public DltUserNeeds createDltUserNeeds() {
		return new DltUserNeeds();
	}

	public DoIpActivationLineNeeds createDoIpActivationLineNeeds() {
		return new DoIpActivationLineNeeds();
	}

	public DoIpEntity createDoIpEntity() {
		return new DoIpEntity();
	}

	public DoIpGidNeeds createDoIpGidNeeds() {
		return new DoIpGidNeeds();
	}

	public DoIpGidSynchronizationNeeds createDoIpGidSynchronizationNeeds() {
		return new DoIpGidSynchronizationNeeds();
	}

	public DoIpLogicAddress createDoIpLogicAddress() {
		return new DoIpLogicAddress();
	}

	public DoIpPowerModeStatusNeeds createDoIpPowerModeStatusNeeds() {
		return new DoIpPowerModeStatusNeeds();
	}

	public DoIpRoutingActivationAuthenticationNeeds createDoIpRoutingActivationAuthenticationNeeds() {
		return new DoIpRoutingActivationAuthenticationNeeds();
	}

	public DoIpRoutingActivationConfirmationNeeds createDoIpRoutingActivationConfirmationNeeds() {
		return new DoIpRoutingActivationConfirmationNeeds();
	}

	public DocumentationBlock createDocumentationBlock() {
		return new DocumentationBlock();
	}

	public DtcStatusChangeNotificationNeeds createDtcStatusChangeNotificationNeeds() {
		return new DtcStatusChangeNotificationNeeds();
	}

	public EcuPartition createEcuPartition() {
		return new EcuPartition();
	}

	public EcuStateMgrUserNeeds createEcuStateMgrUserNeeds() {
		return new EcuStateMgrUserNeeds();
	}

	public EcucAddInfoParamDef createEcucAddInfoParamDef() {
		return new EcucAddInfoParamDef();
	}

	public EcucAddInfoParamValue createEcucAddInfoParamValue() {
		return new EcucAddInfoParamValue();
	}

	public EcucBooleanParamDef createEcucBooleanParamDef() {
		return new EcucBooleanParamDef();
	}

	public EcucDestinationUriDef createEcucDestinationUriDef() {
		return new EcucDestinationUriDef();
	}

	public EcucEnumerationLiteralDef createEcucEnumerationLiteralDef() {
		return new EcucEnumerationLiteralDef();
	}

	public EcucFloatParamDef createEcucFloatParamDef() {
		return new EcucFloatParamDef();
	}

	public EcucForeignReferenceDef createEcucForeignReferenceDef() {
		return new EcucForeignReferenceDef();
	}

	public EcucFunctionNameDefConditional createEcucFunctionNameDefConditional() {
		return new EcucFunctionNameDefConditional();
	}

	public EcucImplementationConfigurationClass createEcucImplementationConfigurationClass() {
		return new EcucImplementationConfigurationClass();
	}

	public EcucInstanceReferenceDef createEcucInstanceReferenceDef() {
		return new EcucInstanceReferenceDef();
	}

	public EcucInstanceReferenceValue createEcucInstanceReferenceValue() {
		return new EcucInstanceReferenceValue();
	}

	public EcucIntegerParamDef createEcucIntegerParamDef() {
		return new EcucIntegerParamDef();
	}

	public EcucLinkerSymbolDefConditional createEcucLinkerSymbolDefConditional() {
		return new EcucLinkerSymbolDefConditional();
	}

	public EcucMultilineStringParamDefConditional createEcucMultilineStringParamDefConditional() {
		return new EcucMultilineStringParamDefConditional();
	}

	public EcucMultiplicityConfigurationClass createEcucMultiplicityConfigurationClass() {
		return new EcucMultiplicityConfigurationClass();
	}

	public EcucNumericalParamValue createEcucNumericalParamValue() {
		return new EcucNumericalParamValue();
	}

	public EcucQuery createEcucQuery() {
		return new EcucQuery();
	}

	public EcucStringParamDefConditional createEcucStringParamDefConditional() {
		return new EcucStringParamDefConditional();
	}

	public EcucValueConfigurationClass createEcucValueConfigurationClass() {
		return new EcucValueConfigurationClass();
	}

	public EmphasisText createEmphasisText() {
		return new EmphasisText();
	}

	public EndToEndTransformationComSpecProps createEndToEndTransformationComSpecProps() {
		return new EndToEndTransformationComSpecProps();
	}

	public EndToEndTransformationDescription createEndToEndTransformationDescription() {
		return new EndToEndTransformationDescription();
	}

	public Entry createEntry() {
		return new Entry();
	}

	public EthernetFrame createEthernetFrame() {
		return new EthernetFrame();
	}

	public EthernetFrameTriggering createEthernetFrameTriggering() {
		return new EthernetFrameTriggering();
	}

	public EthernetPriorityRegeneration createEthernetPriorityRegeneration() {
		return new EthernetPriorityRegeneration();
	}

	public EventControlledTiming createEventControlledTiming() {
		return new EventControlledTiming();
	}

	public ExclusiveArea createExclusiveArea() {
		return new ExclusiveArea();
	}

	public ExecutableEntityActivationReason createExecutableEntityActivationReason() {
		return new ExecutableEntityActivationReason();
	}

	public ExternalTriggerOccurredEvent createExternalTriggerOccurredEvent() {
		return new ExternalTriggerOccurredEvent();
	}

	public ExternalTriggeringPointIdent createExternalTriggeringPointIdent() {
		return new ExternalTriggeringPointIdent();
	}

	public FmAttributeDef createFmAttributeDef() {
		return new FmAttributeDef();
	}

	public FmFeatureMapAssertion createFmFeatureMapAssertion() {
		return new FmFeatureMapAssertion();
	}

	public FmFeatureMapCondition createFmFeatureMapCondition() {
		return new FmFeatureMapCondition();
	}

	public FmFeatureRestriction createFmFeatureRestriction() {
		return new FmFeatureRestriction();
	}

	public FlatInstanceDescriptor createFlatInstanceDescriptor() {
		return new FlatInstanceDescriptor();
	}

	public FlexrayClusterConditional createFlexrayClusterConditional() {
		return new FlexrayClusterConditional();
	}

	public FlexrayCommunicationConnector createFlexrayCommunicationConnector() {
		return new FlexrayCommunicationConnector();
	}

	public FlexrayFifoRange createFlexrayFifoRange() {
		return new FlexrayFifoRange();
	}

	public FlexrayFrame createFlexrayFrame() {
		return new FlexrayFrame();
	}

	public FlexrayNmCluster createFlexrayNmCluster() {
		return new FlexrayNmCluster();
	}

	public FlexrayNmEcu createFlexrayNmEcu() {
		return new FlexrayNmEcu();
	}

	public FlexrayNmNode createFlexrayNmNode() {
		return new FlexrayNmNode();
	}

	public FlexrayPhysicalChannel createFlexrayPhysicalChannel() {
		return new FlexrayPhysicalChannel();
	}

	public FlexrayTpConnectionControl createFlexrayTpConnectionControl() {
		return new FlexrayTpConnectionControl();
	}

	public FloatValueVariationPoint createFloatValueVariationPoint() {
		return new FloatValueVariationPoint();
	}

	public ForeignModelReference createForeignModelReference() {
		return new ForeignModelReference();
	}

	public FramePid createFramePid() {
		return new FramePid();
	}

	public FramePort createFramePort() {
		return new FramePort();
	}

	public FunctionInhibitionNeeds createFunctionInhibitionNeeds() {
		return new FunctionInhibitionNeeds();
	}

	public GeneralParameter createGeneralParameter() {
		return new GeneralParameter();
	}

	public GeneralPurposeIPdu createGeneralPurposeIPdu() {
		return new GeneralPurposeIPdu();
	}

	public GeneralPurposePdu createGeneralPurposePdu() {
		return new GeneralPurposePdu();
	}

	public GenericEthernetFrame createGenericEthernetFrame() {
		return new GenericEthernetFrame();
	}

	public GenericModelReference createGenericModelReference() {
		return new GenericModelReference();
	}

	public GenericTp createGenericTp() {
		return new GenericTp();
	}

	public GlobalTimeCanMaster createGlobalTimeCanMaster() {
		return new GlobalTimeCanMaster();
	}

	public GlobalTimeCanSlave createGlobalTimeCanSlave() {
		return new GlobalTimeCanSlave();
	}

	public GlobalTimeEthMaster createGlobalTimeEthMaster() {
		return new GlobalTimeEthMaster();
	}

	public GlobalTimeEthSlave createGlobalTimeEthSlave() {
		return new GlobalTimeEthSlave();
	}

	public HardwareConfiguration createHardwareConfiguration() {
		return new HardwareConfiguration();
	}

	public HttpTp createHttpTp() {
		return new HttpTp();
	}

	public HwAttributeLiteralDef createHwAttributeLiteralDef() {
		return new HwAttributeLiteralDef();
	}

	public HwPin createHwPin() {
		return new HwPin();
	}

	public HwPinGroup createHwPinGroup() {
		return new HwPinGroup();
	}

	public HwPinGroupContent createHwPinGroupContent() {
		return new HwPinGroupContent();
	}

	public IPduPort createIPduPort() {
		return new IPduPort();
	}

	public IPduTiming createIPduTiming() {
		return new IPduTiming();
	}

	public ISignalPort createISignalPort() {
		return new ISignalPort();
	}

	public ISignalProps createISignalProps() {
		return new ISignalProps();
	}

	public Identifier createIdentifier() {
		return new Identifier();
	}

	public Ieee1722Tp createIeee1722Tp() {
		return new Ieee1722Tp();
	}

	public Ieee1722TpEthernetFrame createIeee1722TpEthernetFrame() {
		return new Ieee1722TpEthernetFrame();
	}

	public ImplementationDataTypeSubElementRef createImplementationDataTypeSubElementRef() {
		return new ImplementationDataTypeSubElementRef();
	}

	public IndentSample createIndentSample() {
		return new IndentSample();
	}

	public IndexEntry createIndexEntry() {
		return new IndexEntry();
	}

	public InfrastructureServices createInfrastructureServices() {
		return new InfrastructureServices();
	}

	public InitEvent createInitEvent() {
		return new InitEvent();
	}

	public InitialSdDelayConfig createInitialSdDelayConfig() {
		return new InitialSdDelayConfig();
	}

	public InstantiationDataDefProps createInstantiationDataDefProps() {
		return new InstantiationDataDefProps();
	}

	public InstantiationTimingEventProps createInstantiationTimingEventProps() {
		return new InstantiationTimingEventProps();
	}

	public IntegerValueVariationPoint createIntegerValueVariationPoint() {
		return new IntegerValueVariationPoint();
	}

	public InternalTriggeringPoint createInternalTriggeringPoint() {
		return new InternalTriggeringPoint();
	}

	public Item createItem() {
		return new Item();
	}

	public J1939ClusterConditional createJ1939ClusterConditional() {
		return new J1939ClusterConditional();
	}

	public J1939DcmIPdu createJ1939DcmIPdu() {
		return new J1939DcmIPdu();
	}

	public J1939NmCluster createJ1939NmCluster() {
		return new J1939NmCluster();
	}

	public J1939NmEcu createJ1939NmEcu() {
		return new J1939NmEcu();
	}

	public J1939NmNode createJ1939NmNode() {
		return new J1939NmNode();
	}

	public J1939NodeName createJ1939NodeName() {
		return new J1939NodeName();
	}

	public LGraphic createLGraphic() {
		return new LGraphic();
	}

	public LLongName createLLongName() {
		return new LLongName();
	}

	public LPlainText createLPlainText() {
		return new LPlainText();
	}

	public LVerbatim createLVerbatim() {
		return new LVerbatim();
	}

	public LabeledItem createLabeledItem() {
		return new LabeledItem();
	}

	public LabeledList createLabeledList() {
		return new LabeledList();
	}

	public LifeCyclePeriod createLifeCyclePeriod() {
		return new LifeCyclePeriod();
	}

	public LifeCycleState createLifeCycleState() {
		return new LifeCycleState();
	}

	public LimitValue createLimitValue() {
		return new LimitValue();
	}

	public Limit createLimit() {
		return new Limit();
	}

	public LinClusterConditional createLinClusterConditional() {
		return new LinClusterConditional();
	}

	public LinSlaveConditional createLinSlaveConditional() {
		return new LinSlaveConditional();
	}

	public LinSlaveConfigIdent createLinSlaveConfigIdent() {
		return new LinSlaveConfigIdent();
	}

	public LinUnconditionalFrame createLinUnconditionalFrame() {
		return new LinUnconditionalFrame();
	}

	public Linker createLinker() {
		return new Linker();
	}

	public List createList() {
		return new List();
	}

	public LogicAddress createLogicAddress() {
		return new LogicAddress();
	}

	public MacMulticastGroup createMacMulticastGroup() {
		return new MacMulticastGroup();
	}

	public Map createMap() {
		return new Map();
	}

	public MeasuredExecutionTime createMeasuredExecutionTime() {
		return new MeasuredExecutionTime();
	}

	public MeasuredHeapUsage createMeasuredHeapUsage() {
		return new MeasuredHeapUsage();
	}

	public MeasuredStackUsage createMeasuredStackUsage() {
		return new MeasuredStackUsage();
	}

	public MlFigure createMlFigure() {
		return new MlFigure();
	}

	public MlFormula createMlFormula() {
		return new MlFormula();
	}

	public ModeAccessPointIdent createModeAccessPointIdent() {
		return new ModeAccessPointIdent();
	}

	public ModeDeclaration createModeDeclaration() {
		return new ModeDeclaration();
	}

	public ModeInterfaceMapping createModeInterfaceMapping() {
		return new ModeInterfaceMapping();
	}

	public ModeSwitchInterface createModeSwitchInterface() {
		return new ModeSwitchInterface();
	}

	public ModeSwitchPoint createModeSwitchPoint() {
		return new ModeSwitchPoint();
	}

	public ModeSwitchedAckRequest createModeSwitchedAckRequest() {
		return new ModeSwitchedAckRequest();
	}

	public Modification createModification() {
		return new Modification();
	}

	public MsrQueryArg createMsrQueryArg() {
		return new MsrQueryArg();
	}

	public MsrQueryChapter createMsrQueryChapter() {
		return new MsrQueryChapter();
	}

	public MsrQueryP1 createMsrQueryP1() {
		return new MsrQueryP1();
	}

	public MsrQueryP2 createMsrQueryP2() {
		return new MsrQueryP2();
	}

	public MsrQueryProps createMsrQueryProps() {
		return new MsrQueryProps();
	}

	public MsrQueryResultChapter createMsrQueryResultChapter() {
		return new MsrQueryResultChapter();
	}

	public MsrQueryResultTopic1 createMsrQueryResultTopic1() {
		return new MsrQueryResultTopic1();
	}

	public MsrQueryTopic1 createMsrQueryTopic1() {
		return new MsrQueryTopic1();
	}

	public MultiLanguageOverviewParagraph createMultiLanguageOverviewParagraph() {
		return new MultiLanguageOverviewParagraph();
	}

	public MultiLanguageParagraph createMultiLanguageParagraph() {
		return new MultiLanguageParagraph();
	}

	public MultiLanguagePlainText createMultiLanguagePlainText() {
		return new MultiLanguagePlainText();
	}

	public MultiLanguageVerbatim createMultiLanguageVerbatim() {
		return new MultiLanguageVerbatim();
	}

	public MultidimensionalTime createMultidimensionalTime() {
		return new MultidimensionalTime();
	}

	public MultilanguageLongName createMultilanguageLongName() {
		return new MultilanguageLongName();
	}

	public NPdu createNPdu() {
		return new NPdu();
	}

	public Note createNote() {
		return new Note();
	}

	public NumericalOrText createNumericalOrText() {
		return new NumericalOrText();
	}

	public NumericalRuleBasedValueSpecification createNumericalRuleBasedValueSpecification() {
		return new NumericalRuleBasedValueSpecification();
	}

	public NumericalValueSpecification createNumericalValueSpecification() {
		return new NumericalValueSpecification();
	}

	public NumericalValueVariationPoint createNumericalValueVariationPoint() {
		return new NumericalValueVariationPoint();
	}

	public NvBlockDataMapping createNvBlockDataMapping() {
		return new NvBlockDataMapping();
	}

	public NvBlockNeeds createNvBlockNeeds() {
		return new NvBlockNeeds();
	}

	public ObdControlServiceNeeds createObdControlServiceNeeds() {
		return new ObdControlServiceNeeds();
	}

	public ObdInfoServiceNeeds createObdInfoServiceNeeds() {
		return new ObdInfoServiceNeeds();
	}

	public ObdMonitorServiceNeeds createObdMonitorServiceNeeds() {
		return new ObdMonitorServiceNeeds();
	}

	public ObdPidServiceNeeds createObdPidServiceNeeds() {
		return new ObdPidServiceNeeds();
	}

	public OperationInvokedEvent createOperationInvokedEvent() {
		return new OperationInvokedEvent();
	}

	public ParameterAccess createParameterAccess() {
		return new ParameterAccess();
	}

	public PerInstanceMemory createPerInstanceMemory() {
		return new PerInstanceMemory();
	}

	public PeriodicEventTriggering createPeriodicEventTriggering() {
		return new PeriodicEventTriggering();
	}

	public PhysicalDimension createPhysicalDimension() {
		return new PhysicalDimension();
	}

	public PositiveIntegerValueVariationPoint createPositiveIntegerValueVariationPoint() {
		return new PositiveIntegerValueVariationPoint();
	}

	public PredefinedChapter createPredefinedChapter() {
		return new PredefinedChapter();
	}

	public PrmChar createPrmChar() {
		return new PrmChar();
	}

	public PrmCharAbsTol createPrmCharAbsTol() {
		return new PrmCharAbsTol();
	}

	public PrmCharMinTypMax createPrmCharMinTypMax() {
		return new PrmCharMinTypMax();
	}

	public PrmCharNumericalContents createPrmCharNumericalContents() {
		return new PrmCharNumericalContents();
	}

	public PrmCharTextualContents createPrmCharTextualContents() {
		return new PrmCharTextualContents();
	}

	public Prms createPrms() {
		return new Prms();
	}

	public ReceiverAnnotation createReceiverAnnotation() {
		return new ReceiverAnnotation();
	}

	public Ref createRef() {
		return new Ref();
	}

	public RelativeTolerance createRelativeTolerance() {
		return new RelativeTolerance();
	}

	public RemotingTechnology createRemotingTechnology() {
		return new RemotingTechnology();
	}

	public RequestResponseDelay createRequestResponseDelay() {
		return new RequestResponseDelay();
	}

	public RoughEstimateHeapUsage createRoughEstimateHeapUsage() {
		return new RoughEstimateHeapUsage();
	}

	public RoughEstimateOfExecutionTime createRoughEstimateOfExecutionTime() {
		return new RoughEstimateOfExecutionTime();
	}

	public RoughEstimateStackUsage createRoughEstimateStackUsage() {
		return new RoughEstimateStackUsage();
	}

	public Row createRow() {
		return new Row();
	}

	public RuleArguments createRuleArguments() {
		return new RuleArguments();
	}

	public RunnableEntityArgument createRunnableEntityArgument() {
		return new RunnableEntityArgument();
	}

	public RxIdentifierRange createRxIdentifierRange() {
		return new RxIdentifierRange();
	}

	public SomeipTransformationDescription createSomeipTransformationDescription() {
		return new SomeipTransformationDescription();
	}

	public SomeipTransformationISignalPropsConditional createSomeipTransformationISignalPropsConditional() {
		return new SomeipTransformationISignalPropsConditional();
	}

	public SaveConfigurationEntry createSaveConfigurationEntry() {
		return new SaveConfigurationEntry();
	}

	public ScaleConstr createScaleConstr() {
		return new ScaleConstr();
	}

	public Sd createSd() {
		return new Sd();
	}

	public Sdf createSdf() {
		return new Sdf();
	}

	public SdgCaption createSdgCaption() {
		return new SdgCaption();
	}

	public SecureCommunicationProps createSecureCommunicationProps() {
		return new SecureCommunicationProps();
	}

	public SegmentPosition createSegmentPosition() {
		return new SegmentPosition();
	}

	public SerializationTechnology createSerializationTechnology() {
		return new SerializationTechnology();
	}

	public ServiceProxySwComponentType createServiceProxySwComponentType() {
		return new ServiceProxySwComponentType();
	}

	public ShortNameFragment createShortNameFragment() {
		return new ShortNameFragment();
	}

	public SignalIPduCounter createSignalIPduCounter() {
		return new SignalIPduCounter();
	}

	public SingleLanguageLongName createSingleLanguageLongName() {
		return new SingleLanguageLongName();
	}

	public SingleLanguageUnitNames createSingleLanguageUnitNames() {
		return new SingleLanguageUnitNames();
	}

	public SoAdRoutingGroup createSoAdRoutingGroup() {
		return new SoAdRoutingGroup();
	}

	public SoftwareContext createSoftwareContext() {
		return new SoftwareContext();
	}

	public Std createStd() {
		return new Std();
	}

	public SupervisedEntityNeeds createSupervisedEntityNeeds() {
		return new SupervisedEntityNeeds();
	}

	public SwBaseType createSwBaseType() {
		return new SwBaseType();
	}

	public SwBitRepresentation createSwBitRepresentation() {
		return new SwBitRepresentation();
	}

	public SwCalprmAxisSet createSwCalprmAxisSet() {
		return new SwCalprmAxisSet();
	}

	public SwCalprmRefProxy createSwCalprmRefProxy() {
		return new SwCalprmRefProxy();
	}

	public SwComponentDocumentation createSwComponentDocumentation() {
		return new SwComponentDocumentation();
	}

	public SwDataDependency createSwDataDependency() {
		return new SwDataDependency();
	}

	public SwRecordLayout createSwRecordLayout() {
		return new SwRecordLayout();
	}

	public SwServiceArg createSwServiceArg() {
		return new SwServiceArg();
	}

	public SwSystemconst createSwSystemconst() {
		return new SwSystemconst();
	}

	public SwValues createSwValues() {
		return new SwValues();
	}

	public SwcModeManagerErrorEvent createSwcModeManagerErrorEvent() {
		return new SwcModeManagerErrorEvent();
	}

	public SymbolProps createSymbolProps() {
		return new SymbolProps();
	}

	public SymbolString createSymbolString() {
		return new SymbolString();
	}

	public SymbolicNameProps createSymbolicNameProps() {
		return new SymbolicNameProps();
	}

	public SyncTimeBaseMgrUserNeeds createSyncTimeBaseMgrUserNeeds() {
		return new SyncTimeBaseMgrUserNeeds();
	}

	public SystemSignal createSystemSignal() {
		return new SystemSignal();
	}

	public TdEventComplex createTdEventComplex() {
		return new TdEventComplex();
	}

	public Table createTable() {
		return new Table();
	}

	public TagWithOptionalValue createTagWithOptionalValue() {
		return new TagWithOptionalValue();
	}

	public Tbody createTbody() {
		return new Tbody();
	}

	public TcpTp createTcpTp() {
		return new TcpTp();
	}

	public TextTableValuePair createTextTableValuePair() {
		return new TextTableValuePair();
	}

	public TextValueSpecification createTextValueSpecification() {
		return new TextValueSpecification();
	}

	public Tgroup createTgroup() {
		return new Tgroup();
	}

	public TimeSyncServerConfiguration createTimeSyncServerConfiguration() {
		return new TimeSyncServerConfiguration();
	}

	public TimeSynchronization createTimeSynchronization() {
		return new TimeSynchronization();
	}

	public TimingEvent createTimingEvent() {
		return new TimingEvent();
	}

	public Topic1 createTopic1() {
		return new Topic1();
	}

	public TopicContent createTopicContent() {
		return new TopicContent();
	}

	public TopicContentOrMsrQuery createTopicContentOrMsrQuery() {
		return new TopicContentOrMsrQuery();
	}

	public TopicOrMsrQuery createTopicOrMsrQuery() {
		return new TopicOrMsrQuery();
	}

	public TpAddress createTpAddress() {
		return new TpAddress();
	}

	public TpConnectionIdent createTpConnectionIdent() {
		return new TpConnectionIdent();
	}

	public TpPort createTpPort() {
		return new TpPort();
	}

	public TransmissionAcknowledgementRequest createTransmissionAcknowledgementRequest() {
		return new TransmissionAcknowledgementRequest();
	}

	public TransmissionModeTiming createTransmissionModeTiming() {
		return new TransmissionModeTiming();
	}

	public Trigger createTrigger() {
		return new Trigger();
	}

	public Tt createTt() {
		return new Tt();
	}

	public TtcanClusterConditional createTtcanClusterConditional() {
		return new TtcanClusterConditional();
	}

	public TtcanCommunicationConnector createTtcanCommunicationConnector() {
		return new TtcanCommunicationConnector();
	}

	public TtcanPhysicalChannel createTtcanPhysicalChannel() {
		return new TtcanPhysicalChannel();
	}

	public UdpNmEcu createUdpNmEcu() {
		return new UdpNmEcu();
	}

	public UdpTp createUdpTp() {
		return new UdpTp();
	}

	public Url createUrl() {
		return new Url();
	}

	public UserDefinedCommunicationControllerConditional createUserDefinedCommunicationControllerConditional() {
		return new UserDefinedCommunicationControllerConditional();
	}

	public UserDefinedIPdu createUserDefinedIPdu() {
		return new UserDefinedIPdu();
	}

	public UserDefinedPdu createUserDefinedPdu() {
		return new UserDefinedPdu();
	}

	public UserDefinedTransformationComSpecProps createUserDefinedTransformationComSpecProps() {
		return new UserDefinedTransformationComSpecProps();
	}

	public UserDefinedTransformationDescription createUserDefinedTransformationDescription() {
		return new UserDefinedTransformationDescription();
	}

	public ValueGroup createValueGroup() {
		return new ValueGroup();
	}

	public ValueList createValueList() {
		return new ValueList();
	}

	public VariableAccess createVariableAccess() {
		return new VariableAccess();
	}

	public VerbatimString createVerbatimString() {
		return new VerbatimString();
	}

	public VlanConfig createVlanConfig() {
		return new VlanConfig();
	}

	public Xdoc createXdoc() {
		return new Xdoc();
	}

	public Xfile createXfile() {
		return new Xfile();
	}

	public AclScopeEnum createAclScopeEnum() {
		return new AclScopeEnum();
	}

	public AdditionalBindingTimeEnum createAdditionalBindingTimeEnum() {
		return new AdditionalBindingTimeEnum();
	}

	public Address createAddress() {
		return new Address();
	}

	public AlignEnum createAlignEnum() {
		return new AlignEnum();
	}

	public AlignmentType createAlignmentType() {
		return new AlignmentType();
	}

	public AreaEnumNohref createAreaEnumNohref() {
		return new AreaEnumNohref();
	}

	public AreaEnumShape createAreaEnumShape() {
		return new AreaEnumShape();
	}

	public ArgumentDirectionEnum createArgumentDirectionEnum() {
		return new ArgumentDirectionEnum();
	}

	public ArraySizeHandlingEnum createArraySizeHandlingEnum() {
		return new ArraySizeHandlingEnum();
	}

	public ArraySizeSemanticsEnum createArraySizeSemanticsEnum() {
		return new ArraySizeSemanticsEnum();
	}

	public AsamRecordLayoutSemantics createAsamRecordLayoutSemantics() {
		return new AsamRecordLayoutSemantics();
	}

	public AutoCollectEnum createAutoCollectEnum() {
		return new AutoCollectEnum();
	}

	public AxisIndexType createAxisIndexType() {
		return new AxisIndexType();
	}

	public BaseTypeEncodingString createBaseTypeEncodingString() {
		return new BaseTypeEncodingString();
	}

	public BindingTimeEnum createBindingTimeEnum() {
		return new BindingTimeEnum();
	}

	public Boolean createBoolean() {
		return new Boolean();
	}

	public BswCallType createBswCallType() {
		return new BswCallType();
	}

	public BswExecutionContext createBswExecutionContext() {
		return new BswExecutionContext();
	}

	public BswInterruptCategory createBswInterruptCategory() {
		return new BswInterruptCategory();
	}

	public ByteOrderEnum createByteOrderEnum() {
		return new ByteOrderEnum();
	}

	public CIdentifierWithIndex createCIdentifierWithIndex() {
		return new CIdentifierWithIndex();
	}

	public CsTransformerErrorReactionEnum createCsTransformerErrorReactionEnum() {
		return new CsTransformerErrorReactionEnum();
	}

	public CalprmAxisCategoryEnum createCalprmAxisCategoryEnum() {
		return new CalprmAxisCategoryEnum();
	}

	public CanAddressingModeType createCanAddressingModeType() {
		return new CanAddressingModeType();
	}

	public CanFrameRxBehaviorEnum createCanFrameRxBehaviorEnum() {
		return new CanFrameRxBehaviorEnum();
	}

	public CanFrameTxBehaviorEnum createCanFrameTxBehaviorEnum() {
		return new CanFrameTxBehaviorEnum();
	}

	public CanTpAddressingFormatType createCanTpAddressingFormatType() {
		return new CanTpAddressingFormatType();
	}

	public CanTpChannelModeType createCanTpChannelModeType() {
		return new CanTpChannelModeType();
	}

	public CategoryString createCategoryString() {
		return new CategoryString();
	}

	public ChapterEnumBreak createChapterEnumBreak() {
		return new ChapterEnumBreak();
	}

	public CommunicationDirectionType createCommunicationDirectionType() {
		return new CommunicationDirectionType();
	}

	public ContainedIPduCollectionSemanticsEnum createContainedIPduCollectionSemanticsEnum() {
		return new ContainedIPduCollectionSemanticsEnum();
	}

	public ContainerIPduHeaderTypeEnum createContainerIPduHeaderTypeEnum() {
		return new ContainerIPduHeaderTypeEnum();
	}

	public ContainerIPduTriggerEnum createContainerIPduTriggerEnum() {
		return new ContainerIPduTriggerEnum();
	}

	public CouplingElementEnum createCouplingElementEnum() {
		return new CouplingElementEnum();
	}

	public CseCodeTypeString createCseCodeTypeString() {
		return new CseCodeTypeString();
	}

	public CycleRepetitionType createCycleRepetitionType() {
		return new CycleRepetitionType();
	}

	public DataFilterTypeEnum createDataFilterTypeEnum() {
		return new DataFilterTypeEnum();
	}

	public DataIdModeEnum createDataIdModeEnum() {
		return new DataIdModeEnum();
	}

	public DataLimitKindEnum createDataLimitKindEnum() {
		return new DataLimitKindEnum();
	}

	public DataTransformationErrorHandlingEnum createDataTransformationErrorHandlingEnum() {
		return new DataTransformationErrorHandlingEnum();
	}

	public DataTypePolicyEnum createDataTypePolicyEnum() {
		return new DataTypePolicyEnum();
	}

	public Date createDate() {
		return new Date();
	}

	public DependencyUsageEnum createDependencyUsageEnum() {
		return new DependencyUsageEnum();
	}

	public DiagPduType createDiagPduType() {
		return new DiagPduType();
	}

	public DiagRequirementIdString createDiagRequirementIdString() {
		return new DiagRequirementIdString();
	}

	public DiagnosticAccessPermissionValidityEnum createDiagnosticAccessPermissionValidityEnum() {
		return new DiagnosticAccessPermissionValidityEnum();
	}

	public DiagnosticAudienceEnum createDiagnosticAudienceEnum() {
		return new DiagnosticAudienceEnum();
	}

	public DiagnosticClearDtcLimitationEnum createDiagnosticClearDtcLimitationEnum() {
		return new DiagnosticClearDtcLimitationEnum();
	}

	public DiagnosticClearEventBehaviorEnum createDiagnosticClearEventBehaviorEnum() {
		return new DiagnosticClearEventBehaviorEnum();
	}

	public DiagnosticConnectedIndicatorBehaviorEnum createDiagnosticConnectedIndicatorBehaviorEnum() {
		return new DiagnosticConnectedIndicatorBehaviorEnum();
	}

	public DiagnosticDataCaptureEnum createDiagnosticDataCaptureEnum() {
		return new DiagnosticDataCaptureEnum();
	}

	public DiagnosticDebounceBehaviorEnum createDiagnosticDebounceBehaviorEnum() {
		return new DiagnosticDebounceBehaviorEnum();
	}

	public DiagnosticEventClearAllowedEnum createDiagnosticEventClearAllowedEnum() {
		return new DiagnosticEventClearAllowedEnum();
	}

	public DiagnosticEventDisplacementStrategyEnum createDiagnosticEventDisplacementStrategyEnum() {
		return new DiagnosticEventDisplacementStrategyEnum();
	}

	public DiagnosticEventKindEnum createDiagnosticEventKindEnum() {
		return new DiagnosticEventKindEnum();
	}

	public DiagnosticEventWindowTimeEnum createDiagnosticEventWindowTimeEnum() {
		return new DiagnosticEventWindowTimeEnum();
	}

	public DiagnosticHandleDddiConfigurationEnum createDiagnosticHandleDddiConfigurationEnum() {
		return new DiagnosticHandleDddiConfigurationEnum();
	}

	public DiagnosticIndicatorTypeEnum createDiagnosticIndicatorTypeEnum() {
		return new DiagnosticIndicatorTypeEnum();
	}

	public DiagnosticInitialEventStatusEnum createDiagnosticInitialEventStatusEnum() {
		return new DiagnosticInitialEventStatusEnum();
	}

	public DiagnosticJumpToBootLoaderEnum createDiagnosticJumpToBootLoaderEnum() {
		return new DiagnosticJumpToBootLoaderEnum();
	}

	public DiagnosticMemoryEntryStorageTriggerEnum createDiagnosticMemoryEntryStorageTriggerEnum() {
		return new DiagnosticMemoryEntryStorageTriggerEnum();
	}

	public DiagnosticOccurrenceCounterProcessingEnum createDiagnosticOccurrenceCounterProcessingEnum() {
		return new DiagnosticOccurrenceCounterProcessingEnum();
	}

	public DiagnosticOperationCycleTypeEnum createDiagnosticOperationCycleTypeEnum() {
		return new DiagnosticOperationCycleTypeEnum();
	}

	public DiagnosticProcessingStyleEnum createDiagnosticProcessingStyleEnum() {
		return new DiagnosticProcessingStyleEnum();
	}

	public DiagnosticRecordTriggerEnum createDiagnosticRecordTriggerEnum() {
		return new DiagnosticRecordTriggerEnum();
	}

	public DiagnosticResponseToEcuResetEnum createDiagnosticResponseToEcuResetEnum() {
		return new DiagnosticResponseToEcuResetEnum();
	}

	public DiagnosticRoutineTypeEnum createDiagnosticRoutineTypeEnum() {
		return new DiagnosticRoutineTypeEnum();
	}

	public DiagnosticServiceRequestCallbackTypeEnum createDiagnosticServiceRequestCallbackTypeEnum() {
		return new DiagnosticServiceRequestCallbackTypeEnum();
	}

	public DiagnosticSignificanceEnum createDiagnosticSignificanceEnum() {
		return new DiagnosticSignificanceEnum();
	}

	public DiagnosticStatusBitHandlingTestFailedSinceLastClearEnum createDiagnosticStatusBitHandlingTestFailedSinceLastClearEnum() {
		return new DiagnosticStatusBitHandlingTestFailedSinceLastClearEnum();
	}

	public DiagnosticTypeOfDtcSupportedEnum createDiagnosticTypeOfDtcSupportedEnum() {
		return new DiagnosticTypeOfDtcSupportedEnum();
	}

	public DiagnosticTypeOfFreezeFrameRecordNumerationEnum createDiagnosticTypeOfFreezeFrameRecordNumerationEnum() {
		return new DiagnosticTypeOfFreezeFrameRecordNumerationEnum();
	}

	public DiagnosticUdsSeverityEnum createDiagnosticUdsSeverityEnum() {
		return new DiagnosticUdsSeverityEnum();
	}

	public DiagnosticValueAccessEnum createDiagnosticValueAccessEnum() {
		return new DiagnosticValueAccessEnum();
	}

	public DiscoveryTechnologyEnum createDiscoveryTechnologyEnum() {
		return new DiscoveryTechnologyEnum();
	}

	public DisplayFormatString createDisplayFormatString() {
		return new DisplayFormatString();
	}

	public DoIpEntityRoleEnum createDoIpEntityRoleEnum() {
		return new DoIpEntityRoleEnum();
	}

	public DtcFormatTypeEnum createDtcFormatTypeEnum() {
		return new DtcFormatTypeEnum();
	}

	public DtcKindEnum createDtcKindEnum() {
		return new DtcKindEnum();
	}

	public EEnum createEEnum() {
		return new EEnum();
	}

	public EEnumFont createEEnumFont() {
		return new EEnumFont();
	}

	public EcucAffectionEnum createEcucAffectionEnum() {
		return new EcucAffectionEnum();
	}

	public EcucConfigurationClassEnum createEcucConfigurationClassEnum() {
		return new EcucConfigurationClassEnum();
	}

	public EcucConfigurationVariantEnum createEcucConfigurationVariantEnum() {
		return new EcucConfigurationVariantEnum();
	}

	public EcucDestinationUriNestingContractEnum createEcucDestinationUriNestingContractEnum() {
		return new EcucDestinationUriNestingContractEnum();
	}

	public EcucScopeEnum createEcucScopeEnum() {
		return new EcucScopeEnum();
	}

	public EndToEndProfileBehaviorEnum createEndToEndProfileBehaviorEnum() {
		return new EndToEndProfileBehaviorEnum();
	}

	public EnvironmentCaptureToReportingEnum createEnvironmentCaptureToReportingEnum() {
		return new EnvironmentCaptureToReportingEnum();
	}

	public EthernetConnectionNegotiationEnum createEthernetConnectionNegotiationEnum() {
		return new EthernetConnectionNegotiationEnum();
	}

	public EthernetCouplingPortSchedulerEnum createEthernetCouplingPortSchedulerEnum() {
		return new EthernetCouplingPortSchedulerEnum();
	}

	public EthernetPhysicalLayerTypeEnum createEthernetPhysicalLayerTypeEnum() {
		return new EthernetPhysicalLayerTypeEnum();
	}

	public EthernetSwitchVlanEgressTaggingEnum createEthernetSwitchVlanEgressTaggingEnum() {
		return new EthernetSwitchVlanEgressTaggingEnum();
	}

	public EventAcceptanceStatusEnum createEventAcceptanceStatusEnum() {
		return new EventAcceptanceStatusEnum();
	}

	public EventGroupControlTypeEnum createEventGroupControlTypeEnum() {
		return new EventGroupControlTypeEnum();
	}

	public EventOccurrenceKindEnum createEventOccurrenceKindEnum() {
		return new EventOccurrenceKindEnum();
	}

	public ExecutionOrderConstraintTypeEnum createExecutionOrderConstraintTypeEnum() {
		return new ExecutionOrderConstraintTypeEnum();
	}

	public ExecutionTimeTypeEnum createExecutionTimeTypeEnum() {
		return new ExecutionTimeTypeEnum();
	}

	public ExtIdClassEnum createExtIdClassEnum() {
		return new ExtIdClassEnum();
	}

	public FmFeatureSelectionState createFmFeatureSelectionState() {
		return new FmFeatureSelectionState();
	}

	public FilterDebouncingEnum createFilterDebouncingEnum() {
		return new FilterDebouncingEnum();
	}

	public FlexrayChannelName createFlexrayChannelName() {
		return new FlexrayChannelName();
	}

	public FlexrayNmScheduleVariant createFlexrayNmScheduleVariant() {
		return new FlexrayNmScheduleVariant();
	}

	public Float createFloat() {
		return new Float();
	}

	public FloatEnum createFloatEnum() {
		return new FloatEnum();
	}

	public FrArTpAckType createFrArTpAckType() {
		return new FrArTpAckType();
	}

	public FrameEnum createFrameEnum() {
		return new FrameEnum();
	}

	public GlobalTimeCrcSupportEnum createGlobalTimeCrcSupportEnum() {
		return new GlobalTimeCrcSupportEnum();
	}

	public GlobalTimeCrcValidationEnum createGlobalTimeCrcValidationEnum() {
		return new GlobalTimeCrcValidationEnum();
	}

	public GraphicFitEnum createGraphicFitEnum() {
		return new GraphicFitEnum();
	}

	public GraphicNotationEnum createGraphicNotationEnum() {
		return new GraphicNotationEnum();
	}

	public HandleInvalidEnum createHandleInvalidEnum() {
		return new HandleInvalidEnum();
	}

	public HandleOutOfRangeEnum createHandleOutOfRangeEnum() {
		return new HandleOutOfRangeEnum();
	}

	public HandleOutOfRangeStatusEnum createHandleOutOfRangeStatusEnum() {
		return new HandleOutOfRangeStatusEnum();
	}

	public HandleTerminationAndRestartEnum createHandleTerminationAndRestartEnum() {
		return new HandleTerminationAndRestartEnum();
	}

	public HandleTimeoutEnum createHandleTimeoutEnum() {
		return new HandleTimeoutEnum();
	}

	public IPduSignalProcessingEnum createIPduSignalProcessingEnum() {
		return new IPduSignalProcessingEnum();
	}

	public Integer createInteger() {
		return new Integer();
	}

	public IntervalTypeEnum createIntervalTypeEnum() {
		return new IntervalTypeEnum();
	}

	public Ip4AddressString createIp4AddressString() {
		return new Ip4AddressString();
	}

	public Ip6AddressString createIp6AddressString() {
		return new Ip6AddressString();
	}

	public IpAddressKeepEnum createIpAddressKeepEnum() {
		return new IpAddressKeepEnum();
	}

	public Ipv4AddressSourceEnum createIpv4AddressSourceEnum() {
		return new Ipv4AddressSourceEnum();
	}

	public Ipv6AddressSourceEnum createIpv6AddressSourceEnum() {
		return new Ipv6AddressSourceEnum();
	}

	public ItemLabelPosEnum createItemLabelPosEnum() {
		return new ItemLabelPosEnum();
	}

	public KeepWithPreviousEnum createKeepWithPreviousEnum() {
		return new KeepWithPreviousEnum();
	}

	public KeyUsageRestrictionEnum createKeyUsageRestrictionEnum() {
		return new KeyUsageRestrictionEnum();
	}

	public LEnum createLEnum() {
		return new LEnum();
	}

	public LatencyConstraintTypeEnum createLatencyConstraintTypeEnum() {
		return new LatencyConstraintTypeEnum();
	}

	public LinChecksumType createLinChecksumType() {
		return new LinChecksumType();
	}

	public ListEnum createListEnum() {
		return new ListEnum();
	}

	public MacAddressString createMacAddressString() {
		return new MacAddressString();
	}

	public MappingDirectionEnum createMappingDirectionEnum() {
		return new MappingDirectionEnum();
	}

	public MappingScopeEnum createMappingScopeEnum() {
		return new MappingScopeEnum();
	}

	public MaxCommModeEnum createMaxCommModeEnum() {
		return new MaxCommModeEnum();
	}

	public MaximumMessageLengthType createMaximumMessageLengthType() {
		return new MaximumMessageLengthType();
	}

	public McdIdentifier createMcdIdentifier() {
		return new McdIdentifier();
	}

	public MemoryAllocationKeywordPolicyType createMemoryAllocationKeywordPolicyType() {
		return new MemoryAllocationKeywordPolicyType();
	}

	public MemorySectionType createMemorySectionType() {
		return new MemorySectionType();
	}

	public MimeTypeString createMimeTypeString() {
		return new MimeTypeString();
	}

	public ModeActivationKind createModeActivationKind() {
		return new ModeActivationKind();
	}

	public ModeErrorReactionPolicyEnum createModeErrorReactionPolicyEnum() {
		return new ModeErrorReactionPolicyEnum();
	}

	public ModificationTypeEnum createModificationTypeEnum() {
		return new ModificationTypeEnum();
	}

	public MonotonyEnum createMonotonyEnum() {
		return new MonotonyEnum();
	}

	public NmtokenString createNmtokenString() {
		return new NmtokenString();
	}

	public NmtokensString createNmtokensString() {
		return new NmtokensString();
	}

	public NativeDeclarationString createNativeDeclarationString() {
		return new NativeDeclarationString();
	}

	public NetworkTargetAddressType createNetworkTargetAddressType() {
		return new NetworkTargetAddressType();
	}

	public NmCoordinatorRoleEnum createNmCoordinatorRoleEnum() {
		return new NmCoordinatorRoleEnum();
	}

	public NoteTypeEnum createNoteTypeEnum() {
		return new NoteTypeEnum();
	}

	public NumericalValue createNumericalValue() {
		return new NumericalValue();
	}

	public NvBlockNeedsReliabilityEnum createNvBlockNeedsReliabilityEnum() {
		return new NvBlockNeedsReliabilityEnum();
	}

	public NvBlockNeedsWritingPriorityEnum createNvBlockNeedsWritingPriorityEnum() {
		return new NvBlockNeedsWritingPriorityEnum();
	}

	public ObdRatioConnectionKindEnum createObdRatioConnectionKindEnum() {
		return new ObdRatioConnectionKindEnum();
	}

	public OperationCycleTypeEnum createOperationCycleTypeEnum() {
		return new OperationCycleTypeEnum();
	}

	public OrientEnum createOrientEnum() {
		return new OrientEnum();
	}

	public PduCollectionTriggerEnum createPduCollectionTriggerEnum() {
		return new PduCollectionTriggerEnum();
	}

	public PgwideEnum createPgwideEnum() {
		return new PgwideEnum();
	}

	public PncGatewayTypeEnum createPncGatewayTypeEnum() {
		return new PncGatewayTypeEnum();
	}

	public PositiveInteger createPositiveInteger() {
		return new PositiveInteger();
	}

	public PositiveUnlimitedInteger createPositiveUnlimitedInteger() {
		return new PositiveUnlimitedInteger();
	}

	public PrimitiveIdentifier createPrimitiveIdentifier() {
		return new PrimitiveIdentifier();
	}

	public ProcessingKindEnum createProcessingKindEnum() {
		return new ProcessingKindEnum();
	}

	public ProgramminglanguageEnum createProgramminglanguageEnum() {
		return new ProgramminglanguageEnum();
	}

	public PulseTestEnum createPulseTestEnum() {
		return new PulseTestEnum();
	}

	public RamBlockStatusControlEnum createRamBlockStatusControlEnum() {
		return new RamBlockStatusControlEnum();
	}

	public RecordLayoutIteratorPoint createRecordLayoutIteratorPoint() {
		return new RecordLayoutIteratorPoint();
	}

	public ReentrancyLevelEnum createReentrancyLevelEnum() {
		return new ReentrancyLevelEnum();
	}

	public RegularExpression createRegularExpression() {
		return new RegularExpression();
	}

	public RemotingTechnologyEnum createRemotingTechnologyEnum() {
		return new RemotingTechnologyEnum();
	}

	public ReportBehaviorEnum createReportBehaviorEnum() {
		return new ReportBehaviorEnum();
	}

	public RequestMethodEnum createRequestMethodEnum() {
		return new RequestMethodEnum();
	}

	public ResolutionPolicyEnum createResolutionPolicyEnum() {
		return new ResolutionPolicyEnum();
	}

	public ResumePosition createResumePosition() {
		return new ResumePosition();
	}

	public RevisionLabelString createRevisionLabelString() {
		return new RevisionLabelString();
	}

	public RunMode createRunMode() {
		return new RunMode();
	}

	public RuntimeAddressConfigurationEnum createRuntimeAddressConfigurationEnum() {
		return new RuntimeAddressConfigurationEnum();
	}

	public RxAcceptContainedIPduEnum createRxAcceptContainedIPduEnum() {
		return new RxAcceptContainedIPduEnum();
	}

	public SomeipMessageTypeEnum createSomeipMessageTypeEnum() {
		return new SomeipMessageTypeEnum();
	}

	public SomeipTransformerSessionHandlingEnum createSomeipTransformerSessionHandlingEnum() {
		return new SomeipTransformerSessionHandlingEnum();
	}

	public ScaleConstrValidityEnum createScaleConstrValidityEnum() {
		return new ScaleConstrValidityEnum();
	}

	public SectionInitializationPolicyType createSectionInitializationPolicyType() {
		return new SectionInitializationPolicyType();
	}

	public ServerArgumentImplPolicyEnum createServerArgumentImplPolicyEnum() {
		return new ServerArgumentImplPolicyEnum();
	}

	public ServiceProviderEnum createServiceProviderEnum() {
		return new ServiceProviderEnum();
	}

	public ShowContentEnum createShowContentEnum() {
		return new ShowContentEnum();
	}

	public ShowResourceAliasNameEnum createShowResourceAliasNameEnum() {
		return new ShowResourceAliasNameEnum();
	}

	public ShowResourceCategoryEnum createShowResourceCategoryEnum() {
		return new ShowResourceCategoryEnum();
	}

	public ShowResourceLongNameEnum createShowResourceLongNameEnum() {
		return new ShowResourceLongNameEnum();
	}

	public ShowResourceNumberEnum createShowResourceNumberEnum() {
		return new ShowResourceNumberEnum();
	}

	public ShowResourcePageEnum createShowResourcePageEnum() {
		return new ShowResourcePageEnum();
	}

	public ShowResourceShortNameEnum createShowResourceShortNameEnum() {
		return new ShowResourceShortNameEnum();
	}

	public ShowResourceTypeEnum createShowResourceTypeEnum() {
		return new ShowResourceTypeEnum();
	}

	public ShowSeeEnum createShowSeeEnum() {
		return new ShowSeeEnum();
	}

	public SignalFanEnum createSignalFanEnum() {
		return new SignalFanEnum();
	}

	public SoAdConnectorType createSoAdConnectorType() {
		return new SoAdConnectorType();
	}

	public SoAdProtocolType createSoAdProtocolType() {
		return new SoAdProtocolType();
	}

	public StorageConditionStatusEnum createStorageConditionStatusEnum() {
		return new StorageConditionStatusEnum();
	}

	public String createString() {
		return new String();
	}

	public Supscript createSupscript() {
		return new Supscript();
	}

	public SwCalibrationAccessEnum createSwCalibrationAccessEnum() {
		return new SwCalibrationAccessEnum();
	}

	public SwImplPolicyEnum createSwImplPolicyEnum() {
		return new SwImplPolicyEnum();
	}

	public SwServiceImplPolicyEnum createSwServiceImplPolicyEnum() {
		return new SwServiceImplPolicyEnum();
	}

	public SwServiceReentranceEnum createSwServiceReentranceEnum() {
		return new SwServiceReentranceEnum();
	}

	public SwVariableAccessImplPolicyEnum createSwVariableAccessImplPolicyEnum() {
		return new SwVariableAccessImplPolicyEnum();
	}

	public SwcToEcuMappingConstraintType createSwcToEcuMappingConstraintType() {
		return new SwcToEcuMappingConstraintType();
	}

	public SwcToSwcOperationArgumentsDirectionEnum createSwcToSwcOperationArgumentsDirectionEnum() {
		return new SwcToSwcOperationArgumentsDirectionEnum();
	}

	public SynchronizationTypeEnum createSynchronizationTypeEnum() {
		return new SynchronizationTypeEnum();
	}

	public TdEventBswInternalBehaviorTypeEnum createTdEventBswInternalBehaviorTypeEnum() {
		return new TdEventBswInternalBehaviorTypeEnum();
	}

	public TdEventBswModeDeclarationTypeEnum createTdEventBswModeDeclarationTypeEnum() {
		return new TdEventBswModeDeclarationTypeEnum();
	}

	public TdEventBswModuleTypeEnum createTdEventBswModuleTypeEnum() {
		return new TdEventBswModuleTypeEnum();
	}

	public TdEventFrameTypeEnum createTdEventFrameTypeEnum() {
		return new TdEventFrameTypeEnum();
	}

	public TdEventIPduTypeEnum createTdEventIPduTypeEnum() {
		return new TdEventIPduTypeEnum();
	}

	public TdEventISignalTypeEnum createTdEventISignalTypeEnum() {
		return new TdEventISignalTypeEnum();
	}

	public TdEventModeDeclarationTypeEnum createTdEventModeDeclarationTypeEnum() {
		return new TdEventModeDeclarationTypeEnum();
	}

	public TdEventOperationTypeEnum createTdEventOperationTypeEnum() {
		return new TdEventOperationTypeEnum();
	}

	public TdEventSwcInternalBehaviorTypeEnum createTdEventSwcInternalBehaviorTypeEnum() {
		return new TdEventSwcInternalBehaviorTypeEnum();
	}

	public TdEventTriggerTypeEnum createTdEventTriggerTypeEnum() {
		return new TdEventTriggerTypeEnum();
	}

	public TdEventVariableDataPrototypeTypeEnum createTdEventVariableDataPrototypeTypeEnum() {
		return new TdEventVariableDataPrototypeTypeEnum();
	}

	public TableSeparatorString createTableSeparatorString() {
		return new TableSeparatorString();
	}

	public TimeSyncTechnologyEnum createTimeSyncTechnologyEnum() {
		return new TimeSyncTechnologyEnum();
	}

	public TimeValue createTimeValue() {
		return new TimeValue();
	}

	public TpAckType createTpAckType() {
		return new TpAckType();
	}

	public TransferPropertyEnum createTransferPropertyEnum() {
		return new TransferPropertyEnum();
	}

	public TransformerClassEnum createTransformerClassEnum() {
		return new TransformerClassEnum();
	}

	public TriggerMode createTriggerMode() {
		return new TriggerMode();
	}

	public TtcanTriggerType createTtcanTriggerType() {
		return new TtcanTriggerType();
	}

	public UnlimitedInteger createUnlimitedInteger() {
		return new UnlimitedInteger();
	}

	public UriString createUriString() {
		return new UriString();
	}

	public ValignEnum createValignEnum() {
		return new ValignEnum();
	}

	public VariableAccessScopeEnum createVariableAccessScopeEnum() {
		return new VariableAccessScopeEnum();
	}

	public VerbatimStringPlain createVerbatimStringPlain() {
		return new VerbatimStringPlain();
	}

	public ViewTokens createViewTokens() {
		return new ViewTokens();
	}

	public XmlSpaceEnum createXmlSpaceEnum() {
		return new XmlSpaceEnum();
	}

	public ReferrableRef createXrefReferrableRef() {
		return new ReferrableRef();
	}

	public ExecutableEntityRef createWorstCaseStackUsageExecutableEntityRef() {
		return new ExecutableEntityRef();
	}

	public HwElementRef createWorstCaseStackUsageHwElementRef() {
		return new HwElementRef();
	}

	public HwElementRef createWorstCaseHeapUsageHwElementRef() {
		return new HwElementRef();
	}

	public TriggerRef createWaitPointTriggerRef() {
		return new TriggerRef();
	}

	public VlanRef createVlanMembershipVlanRef() {
		return new VlanRef();
	}

	public SecondElementRef createViewMapSecondElementRefsSecondElementRef() {
		return new SecondElementRef();
	}

	public FirstElementRef createViewMapFirstElementRefsFirstElementRef() {
		return new FirstElementRef();
	}

	public BlueprintPolicys createVfbTimingBlueprintPolicys() {
		return new BlueprintPolicys();
	}

	public TimingDescriptions createVfbTimingTimingDescriptions() {
		return new TimingDescriptions();
	}

	public TimingGuarantees createVfbTimingTimingGuarantees() {
		return new TimingGuarantees();
	}

	public TimingRequirements createVfbTimingTimingRequirements() {
		return new TimingRequirements();
	}

	public ComponentRef createVfbTimingComponentRef() {
		return new ComponentRef();
	}

	public ImplementationDataTypeRef createVariationPointProxyImplementationDataTypeRef() {
		return new ImplementationDataTypeRef();
	}

	public PostBuildValueAccessRef createVariationPointProxyPostBuildValueAccessRef() {
		return new PostBuildValueAccessRef();
	}

	public ValueAccess createVariationPointProxyValueAccess() {
		return new ValueAccess();
	}

	public ContextComponentRef createVariableInComponentInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextPortPrototypeRef createVariableInComponentInstanceRefContextPortPrototypeRef() {
		return new ContextPortPrototypeRef();
	}

	public RootVariableDataPrototypeRef createVariableInComponentInstanceRefRootVariableDataPrototypeRef() {
		return new RootVariableDataPrototypeRef();
	}

	public ContextDataPrototypeRef createVariableInComponentInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataProtoypeRef createVariableInComponentInstanceRefTargetDataProtoypeRef() {
		return new TargetDataProtoypeRef();
	}

	public PortPrototypeRef createVariableInAtomicSwcTypeInstanceRefPortPrototypeRef() {
		return new PortPrototypeRef();
	}

	public RootVariableDataPrototypeRef createVariableInAtomicSwcTypeInstanceRefRootVariableDataPrototypeRef() {
		return new RootVariableDataPrototypeRef();
	}

	public ContextDataPrototypeRef createVariableInAtomicSwcTypeInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataPrototypeRef createVariableInAtomicSwcTypeInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public ContextComponentRef createVariableDataPrototypeInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextCompositionRef createVariableDataPrototypeInSystemInstanceRefContextCompositionRef() {
		return new ContextCompositionRef();
	}

	public ContextPortRef createVariableDataPrototypeInSystemInstanceRefContextPortRef() {
		return new ContextPortRef();
	}

	public TargetDataPrototypeRef createVariableDataPrototypeInSystemInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public ContextSwComponentPrototypeRef createVariableDataPrototypeInCompositionInstanceRefContextSwComponentPrototypeRef() {
		return new ContextSwComponentPrototypeRef();
	}

	public ContextPortPrototypeRef createVariableDataPrototypeInCompositionInstanceRefContextPortPrototypeRef() {
		return new ContextPortPrototypeRef();
	}

	public TargetVariableDataPrototypeRef createVariableDataPrototypeInCompositionInstanceRefTargetVariableDataPrototypeRef() {
		return new TargetVariableDataPrototypeRef();
	}

	public TypeTref createVariableDataPrototypeTypeTref() {
		return new TypeTref();
	}

	public InitValue createVariableDataPrototypeInitValue() {
		return new InitValue();
	}

	public ContextRootCompositionRef createVariableAccessInEcuInstanceRefContextRootCompositionRef() {
		return new ContextRootCompositionRef();
	}

	public ContextAtomicComponentRef createVariableAccessInEcuInstanceRefContextAtomicComponentRef() {
		return new ContextAtomicComponentRef();
	}

	public TargetVariableAccessRef createVariableAccessInEcuInstanceRefTargetVariableAccessRef() {
		return new TargetVariableAccessRef();
	}

	public TransformerRef createUserDefinedTransformationISignalPropsConditionalTransformerRef() {
		return new TransformerRef();
	}

	public FrameTriggerings createUserDefinedPhysicalChannelFrameTriggerings() {
		return new FrameTriggerings();
	}

	public CommControllerRef createUserDefinedCommunicationConnectorCommControllerRef() {
		return new CommControllerRef();
	}

	public EcuCommPortInstances createUserDefinedCommunicationConnectorEcuCommPortInstances() {
		return new EcuCommPortInstances();
	}

	public PhysicalChannels createUserDefinedClusterConditionalPhysicalChannels() {
		return new PhysicalChannels();
	}

	public SyscStringRef createUnlimitedIntegerValueVariationPointSyscStringRef() {
		return new SyscStringRef();
	}

	public SyscRef createUnlimitedIntegerValueVariationPointSyscRef() {
		return new SyscRef();
	}

	public UnitRef createUnitGroupUnitRefsUnitRef() {
		return new UnitRef();
	}

	public PhysicalDimensionRef createUnitPhysicalDimensionRef() {
		return new PhysicalDimensionRef();
	}

	public AssignedControllerRef createUnassignFrameIdAssignedControllerRef() {
		return new AssignedControllerRef();
	}

	public AssignedLinSlaveConfigRef createUnassignFrameIdAssignedLinSlaveConfigRef() {
		return new AssignedLinSlaveConfigRef();
	}

	public UnassignedFrameTriggeringRef createUnassignFrameIdUnassignedFrameTriggeringRef() {
		return new UnassignedFrameTriggeringRef();
	}

	public ControllerRef createUdpNmNodeControllerRef() {
		return new ControllerRef();
	}

	public NmIfEcuRef createUdpNmNodeNmIfEcuRef() {
		return new NmIfEcuRef();
	}

	public TxNmPduRef createUdpNmNodeTxNmPduRefsTxNmPduRef() {
		return new TxNmPduRef();
	}

	public RxNmPduRef createUdpNmNodeRxNmPduRefsRxNmPduRef() {
		return new RxNmPduRef();
	}

	public CoupledClusterRef createUdpNmClusterCouplingCoupledClusterRefsCoupledClusterRef() {
		return new CoupledClusterRef();
	}

	public CommunicationClusterRef createUdpNmClusterCommunicationClusterRef() {
		return new CommunicationClusterRef();
	}

	public NmNodes createUdpNmClusterNmNodes() {
		return new NmNodes();
	}

	public CanControllerAttributes createTtcanCommunicationControllerConditionalCanControllerAttributes() {
		return new CanControllerAttributes();
	}

	public CommunicationCycle createTtcanAbsolutelyScheduledTimingCommunicationCycle() {
		return new CommunicationCycle();
	}

	public SystemSignalRef createTriggerToSignalMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public ServiceInstanceRef createTriggerToSignalMappingServiceInstanceRefsServiceInstanceRef() {
		return new ServiceInstanceRef();
	}

	public EventHandlerRef createTriggerToSignalMappingEventHandlerRefsEventHandlerRef() {
		return new EventHandlerRef();
	}

	public EventGroupRef createTriggerToSignalMappingEventGroupRefsEventGroupRef() {
		return new EventGroupRef();
	}

	public TriggerRef createTriggerRefConditionalTriggerRef() {
		return new TriggerRef();
	}

	public TriggerRef createTriggerPortAnnotationTriggerRef() {
		return new TriggerRef();
	}

	public FirstTriggerRef createTriggerMappingFirstTriggerRef() {
		return new FirstTriggerRef();
	}

	public SecondTriggerRef createTriggerMappingSecondTriggerRef() {
		return new SecondTriggerRef();
	}

	public ContextCompositionRef createTriggerInSystemInstanceRefContextCompositionRef() {
		return new ContextCompositionRef();
	}

	public ContextComponentRef createTriggerInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextPortRef createTriggerInSystemInstanceRefContextPortRef() {
		return new ContextPortRef();
	}

	public TargetTriggerRef createTriggerInSystemInstanceRefTargetTriggerRef() {
		return new TargetTriggerRef();
	}

	public ModeDeclarationRef createTriggerIPduSendConditionModeDeclarationRefsModeDeclarationRef() {
		return new ModeDeclarationRef();
	}

	public ISignalInIPduRef createTransmissionModeConditionISignalInIPduRef() {
		return new ISignalInIPduRef();
	}

	public ActivationReasonRepresentationRef createTransformerHardErrorEventActivationReasonRepresentationRef() {
		return new ActivationReasonRepresentationRef();
	}

	public StartOnEventRef createTransformerHardErrorEventStartOnEventRef() {
		return new StartOnEventRef();
	}

	public TransformationDescriptions createTransformationTechnologyTransformationDescriptions() {
		return new TransformationDescriptions();
	}

	public TraceRef createTraceableTextTraceRefsTraceRef() {
		return new TraceRef();
	}

	public StimulusRef createTimingDescriptionEventChainStimulusRef() {
		return new StimulusRef();
	}

	public ResponseRef createTimingDescriptionEventChainResponseRef() {
		return new ResponseRef();
	}

	public SegmentRef createTimingDescriptionEventChainSegmentRefsSegmentRef() {
		return new SegmentRef();
	}

	public Tolerance createTimeRangeTypeTolerance() {
		return new Tolerance();
	}

	public TargetIPduRefElement createTargetIPduRefTargetIPduRefElement() {
		return new TargetIPduRefElement();
	}

	public ReferencedTdEventVfbRef createTdEventVfbReferenceReferencedTdEventVfbRef() {
		return new ReferencedTdEventVfbRef();
	}

	public PortPrototypeBlueprintRef createTdEventVariableDataPrototypePortPrototypeBlueprintRef() {
		return new PortPrototypeBlueprintRef();
	}

	public PortRef createTdEventVariableDataPrototypePortRef() {
		return new PortRef();
	}

	public DataElementRef createTdEventVariableDataPrototypeDataElementRef() {
		return new DataElementRef();
	}

	public TriggerRef createTdEventTriggerTriggerRef() {
		return new TriggerRef();
	}

	public EcuInstanceRef createTdEventTtCanCycleStartEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public TtCanClusterRef createTdEventTtCanCycleStartTtCanClusterRef() {
		return new TtCanClusterRef();
	}

	public ReferencedTdEventSwcRef createTdEventSwcInternalBehaviorReferenceReferencedTdEventSwcRef() {
		return new ReferencedTdEventSwcRef();
	}

	public RunnableRef createTdEventSwcInternalBehaviorRunnableRef() {
		return new RunnableRef();
	}

	public VariableAccessRef createTdEventSwcInternalBehaviorVariableAccessRef() {
		return new VariableAccessRef();
	}

	public OperationRef createTdEventOperationOperationRef() {
		return new OperationRef();
	}

	public ArgumentRef createTdEventOccurrenceExpressionFormulaArgumentRef() {
		return new ArgumentRef();
	}

	public EventRef createTdEventOccurrenceExpressionFormulaEventRef() {
		return new EventRef();
	}

	public VariableRef createTdEventOccurrenceExpressionFormulaVariableRef() {
		return new VariableRef();
	}

	public EntryModeDeclarationRef createTdEventModeDeclarationEntryModeDeclarationRef() {
		return new EntryModeDeclarationRef();
	}

	public ExitModeDeclarationRef createTdEventModeDeclarationExitModeDeclarationRef() {
		return new ExitModeDeclarationRef();
	}

	public ModeDeclarationRef createTdEventModeDeclarationModeDeclarationRef() {
		return new ModeDeclarationRef();
	}

	public ISignalRef createTdEventISignalISignalRef() {
		return new ISignalRef();
	}

	public PhysicalChannelRef createTdEventISignalPhysicalChannelRef() {
		return new PhysicalChannelRef();
	}

	public IPduRef createTdEventIPduIPduRef() {
		return new IPduRef();
	}

	public PhysicalChannelRef createTdEventIPduPhysicalChannelRef() {
		return new PhysicalChannelRef();
	}

	public FrameRef createTdEventFrameFrameRef() {
		return new FrameRef();
	}

	public PhysicalChannelRef createTdEventFramePhysicalChannelRef() {
		return new PhysicalChannelRef();
	}

	public FrClusterRef createTdEventFrClusterCycleStartFrClusterRef() {
		return new FrClusterRef();
	}

	public BswModuleDescriptionRef createTdEventBswModuleBswModuleDescriptionRef() {
		return new BswModuleDescriptionRef();
	}

	public BswModuleEntryRef createTdEventBswModuleBswModuleEntryRef() {
		return new BswModuleEntryRef();
	}

	public EntryModeDeclarationRef createTdEventBswModeDeclarationEntryModeDeclarationRef() {
		return new EntryModeDeclarationRef();
	}

	public ExitModeDeclarationRef createTdEventBswModeDeclarationExitModeDeclarationRef() {
		return new ExitModeDeclarationRef();
	}

	public ModeDeclarationRef createTdEventBswModeDeclarationModeDeclarationRef() {
		return new ModeDeclarationRef();
	}

	public BswModuleEntityRef createTdEventBswInternalBehaviorBswModuleEntityRef() {
		return new BswModuleEntityRef();
	}

	public SystemRef createSystemTimingSystemRef() {
		return new SystemRef();
	}

	public TransformingSystemSignalRef createSystemSignalGroupTransformingSystemSignalRef() {
		return new TransformingSystemSignalRef();
	}

	public SystemSignalRef createSystemSignalGroupSystemSignalRefsSystemSignalRef() {
		return new SystemSignalRef();
	}

	public DataMappings createSystemMappingDataMappings() {
		return new DataMappings();
	}

	public MappingConstraints createSystemMappingMappingConstraints() {
		return new MappingConstraints();
	}

	public SignalPathConstraints createSystemMappingSignalPathConstraints() {
		return new SignalPathConstraints();
	}

	public ClientIdDefinitionSetRef createSystemClientIdDefinitionSetRefsClientIdDefinitionSetRef() {
		return new ClientIdDefinitionSetRef();
	}

	public CalledFromWithinExclusiveAreaRef createSynchronousServerCallPointCalledFromWithinExclusiveAreaRef() {
		return new CalledFromWithinExclusiveAreaRef();
	}

	public ScopeRef createSynchronizationTimingConstraintScopeRefsScopeRef() {
		return new ScopeRef();
	}

	public ScopeEventRef createSynchronizationTimingConstraintScopeEventRefsScopeEventRef() {
		return new ScopeEventRef();
	}

	public ComponentImplementationRef createSwcToImplMappingComponentImplementationRef() {
		return new ComponentImplementationRef();
	}

	public EcuInstanceRef createSwcToEcuMappingConstraintEcuInstanceRefsEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public ControlledHwElementRef createSwcToEcuMappingControlledHwElementRef() {
		return new ControlledHwElementRef();
	}

	public EcuInstanceRef createSwcToEcuMappingEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public PartitionRef createSwcToEcuMappingPartitionRef() {
		return new PartitionRef();
	}

	public ProcessingUnitRef createSwcToEcuMappingProcessingUnitRef() {
		return new ProcessingUnitRef();
	}

	public BehaviorRef createSwcTimingBehaviorRef() {
		return new BehaviorRef();
	}

	public ComponentRef createSwcTimingComponentRef() {
		return new ComponentRef();
	}

	public BaseRef createSwcServiceDependencyInCompositionInstanceRefBaseRef() {
		return new BaseRef();
	}

	public RootContextRef createSwcServiceDependencyInCompositionInstanceRefRootContextRef() {
		return new RootContextRef();
	}

	public ContextSwComponentPrototypeRef createSwcServiceDependencyInCompositionInstanceRefContextSwComponentPrototypeRef() {
		return new ContextSwComponentPrototypeRef();
	}

	public TargetSwcServiceDependencyRef createSwcServiceDependencyInCompositionInstanceRefTargetSwcServiceDependencyRef() {
		return new TargetSwcServiceDependencyRef();
	}

	public RepresentedPortGroupRef createSwcServiceDependencyRepresentedPortGroupRef() {
		return new RepresentedPortGroupRef();
	}

	public ServiceNeeds createSwcServiceDependencyServiceNeeds() {
		return new ServiceNeeds();
	}

	public Events createSwcInternalBehaviorEvents() {
		return new Events();
	}

	public DataTypeMappingRef createSwcInternalBehaviorDataTypeMappingRefsDataTypeMappingRef() {
		return new DataTypeMappingRef();
	}

	public ConstantValueMappingRef createSwcInternalBehaviorConstantValueMappingRefsConstantValueMappingRef() {
		return new ConstantValueMappingRef();
	}

	public SwcBswMappingRef createSwcImplementationSwcBswMappingRef() {
		return new SwcBswMappingRef();
	}

	public BehaviorRef createSwcImplementationBehaviorRef() {
		return new BehaviorRef();
	}

	public HwElementRef createSwcImplementationHwElementRefsHwElementRef() {
		return new HwElementRef();
	}

	public BswTriggerRef createSwcBswSynchronizedTriggerBswTriggerRef() {
		return new BswTriggerRef();
	}

	public BswModeGroupRef createSwcBswSynchronizedModeGroupPrototypeBswModeGroupRef() {
		return new BswModeGroupRef();
	}

	public BswEntityRef createSwcBswRunnableMappingBswEntityRef() {
		return new BswEntityRef();
	}

	public SwcRunnableRef createSwcBswRunnableMappingSwcRunnableRef() {
		return new SwcRunnableRef();
	}

	public BswBehaviorRef createSwcBswMappingBswBehaviorRef() {
		return new BswBehaviorRef();
	}

	public SwcBehaviorRef createSwcBswMappingSwcBehaviorRef() {
		return new SwcBehaviorRef();
	}

	public McDataInstanceVarRef createSwVariableRefProxyMcDataInstanceVarRef() {
		return new McDataInstanceVarRef();
	}

	public UnitRef createSwValueContUnitRef() {
		return new UnitRef();
	}

	public BaseTypeRef createSwTextPropsBaseTypeRef() {
		return new BaseTypeRef();
	}

	public SwSystemconstRef createSwSystemconstValueSwSystemconstRef() {
		return new SwSystemconstRef();
	}

	public BaseTypeRef createSwRecordLayoutVBaseTypeRef() {
		return new BaseTypeRef();
	}

	public SwGenericAxisParamTypeRef createSwRecordLayoutVSwGenericAxisParamTypeRef() {
		return new SwGenericAxisParamTypeRef();
	}

	public SwRecordLayoutRef createSwRecordLayoutGroupContentSwRecordLayoutRef() {
		return new SwRecordLayoutRef();
	}

	public SwGenericAxisParamTypeRef createSwRecordLayoutGroupSwGenericAxisParamTypeRef() {
		return new SwGenericAxisParamTypeRef();
	}

	public FunctionPointerSignatureRef createSwPointerTargetPropsFunctionPointerSignatureRef() {
		return new FunctionPointerSignatureRef();
	}

	public DataConstrRef createSwGenericAxisParamTypeDataConstrRef() {
		return new DataConstrRef();
	}

	public SwGenericAxisParamTypeRef createSwGenericAxisParamSwGenericAxisParamTypeRef() {
		return new SwGenericAxisParamTypeRef();
	}

	public McDataInstanceRef createSwDataDependencyArgsMcDataInstanceRef() {
		return new McDataInstanceRef();
	}

	public SwAddrMethodRef createSwDataDefPropsConditionalSwAddrMethodRef() {
		return new SwAddrMethodRef();
	}

	public BaseTypeRef createSwDataDefPropsConditionalBaseTypeRef() {
		return new BaseTypeRef();
	}

	public SwComparisonVariables createSwDataDefPropsConditionalSwComparisonVariables() {
		return new SwComparisonVariables();
	}

	public CompuMethodRef createSwDataDefPropsConditionalCompuMethodRef() {
		return new CompuMethodRef();
	}

	public DataConstrRef createSwDataDefPropsConditionalDataConstrRef() {
		return new DataConstrRef();
	}

	public ImplementationDataTypeRef createSwDataDefPropsConditionalImplementationDataTypeRef() {
		return new ImplementationDataTypeRef();
	}

	public InvalidValue createSwDataDefPropsConditionalInvalidValue() {
		return new InvalidValue();
	}

	public SwRecordLayoutRef createSwDataDefPropsConditionalSwRecordLayoutRef() {
		return new SwRecordLayoutRef();
	}

	public UnitRef createSwDataDefPropsConditionalUnitRef() {
		return new UnitRef();
	}

	public ValueAxisDataTypeRef createSwDataDefPropsConditionalValueAxisDataTypeRef() {
		return new ValueAxisDataTypeRef();
	}

	public TypeTref createSwComponentPrototypeTypeTref() {
		return new TypeTref();
	}

	public BaseTypeRef createSwCalprmAxisBaseTypeRef() {
		return new BaseTypeRef();
	}

	public InputVariableTypeRef createSwAxisIndividualInputVariableTypeRef() {
		return new InputVariableTypeRef();
	}

	public SwVariableRefs createSwAxisIndividualSwVariableRefs() {
		return new SwVariableRefs();
	}

	public CompuMethodRef createSwAxisIndividualCompuMethodRef() {
		return new CompuMethodRef();
	}

	public UnitRef createSwAxisIndividualUnitRef() {
		return new UnitRef();
	}

	public DataConstrRef createSwAxisIndividualDataConstrRef() {
		return new DataConstrRef();
	}

	public SharedAxisTypeRef createSwAxisGroupedSharedAxisTypeRef() {
		return new SharedAxisTypeRef();
	}

	public SwAxisTypeRef createSwAxisGenericSwAxisTypeRef() {
		return new SwAxisTypeRef();
	}

	public UnitRef createSwAxisContUnitRef() {
		return new UnitRef();
	}

	public FirstElements createSubElementMappingFirstElements() {
		return new FirstElements();
	}

	public SecondElements createSubElementMappingSecondElements() {
		return new SecondElements();
	}

	public TestedItemRef createStructuredReqTestedItemRefsTestedItemRef() {
		return new TestedItemRef();
	}

	public IPduRef createStaticPartIPduRef() {
		return new IPduRef();
	}

	public EventRef createSporadicEventTriggeringEventRef() {
		return new EventRef();
	}

	public PduRef createSocketConnectionIpduIdentifierPduRef() {
		return new PduRef();
	}

	public PduTriggeringRef createSocketConnectionIpduIdentifierPduTriggeringRef() {
		return new PduTriggeringRef();
	}

	public RoutingGroupRef createSocketConnectionIpduIdentifierRoutingGroupRefsRoutingGroupRef() {
		return new RoutingGroupRef();
	}

	public ServerPortRef createSocketConnectionBundleServerPortRef() {
		return new ServerPortRef();
	}

	public ClientPortRef createSocketConnectionClientPortRef() {
		return new ClientPortRef();
	}

	public DoIpSourceAddressRef createSocketConnectionDoIpSourceAddressRef() {
		return new DoIpSourceAddressRef();
	}

	public DoIpTargetAddressRef createSocketConnectionDoIpTargetAddressRef() {
		return new DoIpTargetAddressRef();
	}

	public LocalPortRef createSocketConnectionLocalPortRef() {
		return new LocalPortRef();
	}

	public NPduRef createSocketConnectionNPduRef() {
		return new NPduRef();
	}

	public RemotePortRef createSocketConnectionRemotePortRef() {
		return new RemotePortRef();
	}

	public ConnectorRef createSocketAddressConnectorRef() {
		return new ConnectorRef();
	}

	public MulticastConnectorRef createSocketAddressMulticastConnectorRefsMulticastConnectorRef() {
		return new MulticastConnectorRef();
	}

	public ExclusiveAreaRef createSimulatedExecutionTimeExclusiveAreaRef() {
		return new ExclusiveAreaRef();
	}

	public ExecutableEntityRef createSimulatedExecutionTimeExecutableEntityRef() {
		return new ExecutableEntityRef();
	}

	public HwElementRef createSimulatedExecutionTimeHwElementRef() {
		return new HwElementRef();
	}

	public IncludedLibraryRef createSimulatedExecutionTimeIncludedLibraryRefsIncludedLibraryRef() {
		return new IncludedLibraryRef();
	}

	public ReplicaPdusRef createSignalIPduReplicationReplicaPdusRefsReplicaPdusRef() {
		return new ReplicaPdusRef();
	}

	public Ports createServiceSwComponentTypePorts() {
		return new Ports();
	}

	public UnitGroupRef createServiceSwComponentTypeUnitGroupRefsUnitGroupRef() {
		return new UnitGroupRef();
	}

	public OperationRef createServerComSpecOperationRef() {
		return new OperationRef();
	}

	public TransformationComSpecPropss createServerComSpecTransformationComSpecPropss() {
		return new TransformationComSpecPropss();
	}

	public SystemSignalRef createSequenceCounterMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public SensorActuatorRef createSensorActuatorSwComponentTypeSensorActuatorRef() {
		return new SensorActuatorRef();
	}

	public SystemSignalRef createSenderReceiverToSignalMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public SignalGroupRef createSenderReceiverToSignalGroupMappingSignalGroupRef() {
		return new SignalGroupRef();
	}

	public TypeMapping createSenderReceiverToSignalGroupMappingTypeMapping() {
		return new TypeMapping();
	}

	public SystemSignalRef createSenderReceiverCompositeElementToSignalMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public TypeMapping createSenderReceiverCompositeElementToSignalMappingTypeMapping() {
		return new TypeMapping();
	}

	public ApplicationRecordElementRef createSenderRecRecordElementMappingApplicationRecordElementRef() {
		return new ApplicationRecordElementRef();
	}

	public ComplexTypeMapping createSenderRecRecordElementMappingComplexTypeMapping() {
		return new ComplexTypeMapping();
	}

	public ImplementationRecordElementRef createSenderRecRecordElementMappingImplementationRecordElementRef() {
		return new ImplementationRecordElementRef();
	}

	public SystemSignalRef createSenderRecRecordElementMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public ComplexTypeMapping createSenderRecArrayElementMappingComplexTypeMapping() {
		return new ComplexTypeMapping();
	}

	public SystemSignalRef createSenderRecArrayElementMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public DataElementRef createSenderAnnotationDataElementRef() {
		return new DataElementRef();
	}

	public PayloadRef createSecuredIPduPayloadRef() {
		return new PayloadRef();
	}

	public ImplementedInRef createSectionNamePrefixImplementedInRef() {
		return new ImplementedInRef();
	}

	public SdxRef createSdgContentsSdxRef() {
		return new SdxRef();
	}

	public SdgCaptionRef createSdgSdgCaptionRef() {
		return new SdgCaptionRef();
	}

	public ContextSwComponentPrototypeRef createRunnableEntityInCompositionInstanceRefContextSwComponentPrototypeRef() {
		return new ContextSwComponentPrototypeRef();
	}

	public TargetRunnableEntityRef createRunnableEntityInCompositionInstanceRefTargetRunnableEntityRef() {
		return new TargetRunnableEntityRef();
	}

	public SwAddrMethodRef createRunnableEntitySwAddrMethodRef() {
		return new SwAddrMethodRef();
	}

	public ServerCallPoints createRunnableEntityServerCallPoints() {
		return new ServerCallPoints();
	}

	public RunsInsideExclusiveAreaRef createRunnableEntityRunsInsideExclusiveAreaRefsRunsInsideExclusiveAreaRef() {
		return new RunsInsideExclusiveAreaRef();
	}

	public ExclusiveAreaNestingOrderRef createRunnableEntityExclusiveAreaNestingOrderRefsExclusiveAreaNestingOrderRef() {
		return new ExclusiveAreaNestingOrderRef();
	}

	public CanEnterExclusiveAreaRef createRunnableEntityCanEnterExclusiveAreaRefsCanEnterExclusiveAreaRef() {
		return new CanEnterExclusiveAreaRef();
	}

	public UnitRef createRuleBasedValueContUnitRef() {
		return new UnitRef();
	}

	public UnitRef createRuleBasedAxisContUnitRef() {
		return new UnitRef();
	}

	public TcpUdpConfig createRtpTpTcpUdpConfig() {
		return new TcpUdpConfig();
	}

	public ContextRootCompositionRef createRteEventInEcuInstanceRefContextRootCompositionRef() {
		return new ContextRootCompositionRef();
	}

	public ContextAtomicComponentRef createRteEventInEcuInstanceRefContextAtomicComponentRef() {
		return new ContextAtomicComponentRef();
	}

	public TargetRteEventRef createRteEventInEcuInstanceRefTargetRteEventRef() {
		return new TargetRteEventRef();
	}

	public FlatMapRef createRootSwCompositionPrototypeFlatMapRef() {
		return new FlatMapRef();
	}

	public SoftwareCompositionTref createRootSwCompositionPrototypeSoftwareCompositionTref() {
		return new SoftwareCompositionTref();
	}

	public CalibrationParameterValueSetRef createRootSwCompositionPrototypeCalibrationParameterValueSetRefsCalibrationParameterValueSetRef() {
		return new CalibrationParameterValueSetRef();
	}

	public PortPrototypeRef createRoleBasedPortAssignmentPortPrototypeRef() {
		return new PortPrototypeRef();
	}

	public McDataInstanceRef createRoleBasedMcDataAssignmentMcDataInstanceRefsMcDataInstanceRef() {
		return new McDataInstanceRef();
	}

	public UsedImplementationDataTypeRef createRoleBasedDataTypeAssignmentUsedImplementationDataTypeRef() {
		return new UsedImplementationDataTypeRef();
	}

	public UsedPimRef createRoleBasedDataAssignmentUsedPimRef() {
		return new UsedPimRef();
	}

	public AssignedEntryRef createRoleBasedBswModuleEntryAssignmentAssignedEntryRef() {
		return new AssignedEntryRef();
	}

	public ExecutionTimes createResourceConsumptionExecutionTimes() {
		return new ExecutionTimes();
	}

	public HeapUsages createResourceConsumptionHeapUsages() {
		return new HeapUsages();
	}

	public StackUsages createResourceConsumptionStackUsages() {
		return new StackUsages();
	}

	public ReferrableRef createReferrableRefConditionalReferrableRef() {
		return new ReferrableRef();
	}

	public ReferenceValueRef createReferenceValueSpecificationReferenceValueRef() {
		return new ReferenceValueRef();
	}

	public PackageRef createReferenceBasePackageRef() {
		return new PackageRef();
	}

	public GlobalInPackageRef createReferenceBaseGlobalInPackageRefsGlobalInPackageRef() {
		return new GlobalInPackageRef();
	}

	public Fields createRecordValueSpecificationFields() {
		return new Fields();
	}

	public HostSystemRef createRapidPrototypingScenarioHostSystemRef() {
		return new HostSystemRef();
	}

	public RptSystemRef createRapidPrototypingScenarioRptSystemRef() {
		return new RptSystemRef();
	}

	public ContextRPortRef createRVariableInAtomicSwcInstanceRefContextRPortRef() {
		return new ContextRPortRef();
	}

	public TargetDataElementRef createRVariableInAtomicSwcInstanceRefTargetDataElementRef() {
		return new TargetDataElementRef();
	}

	public ContextRPortRef createRTriggerInAtomicSwcInstanceRefContextRPortRef() {
		return new ContextRPortRef();
	}

	public TargetTriggerRef createRTriggerInAtomicSwcInstanceRefTargetTriggerRef() {
		return new TargetTriggerRef();
	}

	public SenderReceiverAnnotations createRPortPrototypeSenderReceiverAnnotations() {
		return new SenderReceiverAnnotations();
	}

	public RequiredComSpecs createRPortPrototypeRequiredComSpecs() {
		return new RequiredComSpecs();
	}

	public RequiredInterfaceTref createRPortPrototypeRequiredInterfaceTref() {
		return new RequiredInterfaceTref();
	}

	public ContextComponentRef createRPortInCompositionInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public TargetRPortRef createRPortInCompositionInstanceRefTargetRPortRef() {
		return new TargetRPortRef();
	}

	public ContextRPortRef createROperationInAtomicSwcInstanceRefContextRPortRef() {
		return new ContextRPortRef();
	}

	public TargetRequiredOperationRef createROperationInAtomicSwcInstanceRefTargetRequiredOperationRef() {
		return new TargetRequiredOperationRef();
	}

	public ContextPortRef createRModeInAtomicSwcInstanceRefContextPortRef() {
		return new ContextPortRef();
	}

	public ContextModeDeclarationGroupPrototypeRef createRModeInAtomicSwcInstanceRefContextModeDeclarationGroupPrototypeRef() {
		return new ContextModeDeclarationGroupPrototypeRef();
	}

	public TargetModeDeclarationRef createRModeInAtomicSwcInstanceRefTargetModeDeclarationRef() {
		return new TargetModeDeclarationRef();
	}

	public ContextRPortRef createRModeGroupInAtomicSwcInstanceRefContextRPortRef() {
		return new ContextRPortRef();
	}

	public TargetModeGroupRef createRModeGroupInAtomicSwcInstanceRefTargetModeGroupRef() {
		return new TargetModeGroupRef();
	}

	public DataElementRef createQueuedSenderComSpecDataElementRef() {
		return new DataElementRef();
	}

	public DataElementRef createQueuedReceiverComSpecDataElementRef() {
		return new DataElementRef();
	}

	public ExternalReplacementRef createQueuedReceiverComSpecExternalReplacementRef() {
		return new ExternalReplacementRef();
	}

	public TransformationComSpecPropss createQueuedReceiverComSpecTransformationComSpecPropss() {
		return new TransformationComSpecPropss();
	}

	public RoutingGroupRef createProvidedServiceInstanceRoutingGroupRefsRoutingGroupRef() {
		return new RoutingGroupRef();
	}

	public SwSystemconstantValueSetRef createPredefinedVariantSwSystemconstantValueSetRefsSwSystemconstantValueSetRef() {
		return new SwSystemconstantValueSetRef();
	}

	public PostBuildVariantCriterionValueSetRef createPredefinedVariantPostBuildVariantCriterionValueSetRefsPostBuildVariantCriterionValueSetRef() {
		return new PostBuildVariantCriterionValueSetRef();
	}

	public IncludedVariantRef createPredefinedVariantIncludedVariantRefsIncludedVariantRef() {
		return new IncludedVariantRef();
	}

	public VariantCriterionRef createPostBuildVariantCriterionValueVariantCriterionRef() {
		return new VariantCriterionRef();
	}

	public CompuMethodRef createPostBuildVariantCriterionCompuMethodRef() {
		return new CompuMethodRef();
	}

	public MatchingCriterionRef createPostBuildVariantConditionMatchingCriterionRef() {
		return new MatchingCriterionRef();
	}

	public PortPrototypeRef createPortPrototypeRefConditionalPortPrototypeRef() {
		return new PortPrototypeRef();
	}

	public PortPrototypeBlueprintRef createPortPrototypeBlueprintMappingPortPrototypeBlueprintRef() {
		return new PortPrototypeBlueprintRef();
	}

	public DerivedPortPrototypeRef createPortPrototypeBlueprintMappingDerivedPortPrototypeRef() {
		return new DerivedPortPrototypeRef();
	}

	public DataPrototypeRef createPortPrototypeBlueprintInitValueDataPrototypeRef() {
		return new DataPrototypeRef();
	}

	public Value createPortPrototypeBlueprintInitValueValue() {
		return new Value();
	}

	public InterfaceRef createPortPrototypeBlueprintInterfaceRef() {
		return new InterfaceRef();
	}

	public ProvidedComSpecs createPortPrototypeBlueprintProvidedComSpecs() {
		return new ProvidedComSpecs();
	}

	public RequiredComSpecs createPortPrototypeBlueprintRequiredComSpecs() {
		return new RequiredComSpecs();
	}

	public PortInterfaceMappings createPortInterfaceMappingSetPortInterfaceMappings() {
		return new PortInterfaceMappings();
	}

	public PortInterfaceBlueprintRef createPortInterfaceBlueprintMappingPortInterfaceBlueprintRef() {
		return new PortInterfaceBlueprintRef();
	}

	public DerivedPortInterfaceRef createPortInterfaceBlueprintMappingDerivedPortInterfaceRef() {
		return new DerivedPortInterfaceRef();
	}

	public ContextCompositionRef createPortGroupInSystemInstanceRefContextCompositionRef() {
		return new ContextCompositionRef();
	}

	public ContextComponentRef createPortGroupInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public TargetRef createPortGroupInSystemInstanceRefTargetRef() {
		return new TargetRef();
	}

	public Value createPortDefinedArgumentValueValue() {
		return new Value();
	}

	public ValueTypeTref createPortDefinedArgumentValueValueTypeTref() {
		return new ValueTypeTref();
	}

	public PortRef createPortApiOptionPortRef() {
		return new PortRef();
	}

	public WakeupFrameRef createPncMappingWakeupFrameRefsWakeupFrameRef() {
		return new WakeupFrameRef();
	}

	public PncGroupRef createPncMappingPncGroupRefsPncGroupRef() {
		return new PncGroupRef();
	}

	public FirstPhysicalDimensionRef createPhysicalDimensionMappingFirstPhysicalDimensionRef() {
		return new FirstPhysicalDimensionRef();
	}

	public SecondPhysicalDimensionRef createPhysicalDimensionMappingSecondPhysicalDimensionRef() {
		return new SecondPhysicalDimensionRef();
	}

	public UnitRef createPhysConstrsUnitRef() {
		return new UnitRef();
	}

	public PhysicalChannelRef createPermissibleSignalPathPhysicalChannelRefsPhysicalChannelRef() {
		return new PhysicalChannelRef();
	}

	public PerInstanceMemoryRef createPerInstanceMemorySizePerInstanceMemoryRef() {
		return new PerInstanceMemoryRef();
	}

	public PduTriggeringRef createPduTriggeringRefConditionalPduTriggeringRef() {
		return new PduTriggeringRef();
	}

	public IPduRef createPduTriggeringIPduRef() {
		return new IPduRef();
	}

	public IPduPortRef createPduTriggeringIPduPortRefsIPduPortRef() {
		return new IPduPortRef();
	}

	public PduRef createPduToFrameMappingPduRef() {
		return new PduRef();
	}

	public MappingRef createPassThroughSwConnectorMappingRef() {
		return new MappingRef();
	}

	public ProvidedOuterPortRef createPassThroughSwConnectorProvidedOuterPortRef() {
		return new ProvidedOuterPortRef();
	}

	public RequiredOuterPortRef createPassThroughSwConnectorRequiredOuterPortRef() {
		return new RequiredOuterPortRef();
	}

	public DataTypeMappingRef createParameterSwComponentTypeDataTypeMappingRefsDataTypeMappingRef() {
		return new DataTypeMappingRef();
	}

	public ConstantMappingRef createParameterSwComponentTypeConstantMappingRefsConstantMappingRef() {
		return new ConstantMappingRef();
	}

	public InitValue createParameterRequireComSpecInitValue() {
		return new InitValue();
	}

	public ParameterRef createParameterRequireComSpecParameterRef() {
		return new ParameterRef();
	}

	public InitValue createParameterProvideComSpecInitValue() {
		return new InitValue();
	}

	public ParameterRef createParameterProvideComSpecParameterRef() {
		return new ParameterRef();
	}

	public ParameterRef createParameterPortAnnotationParameterRef() {
		return new ParameterRef();
	}

	public PortPrototypeRef createParameterInAtomicSwcTypeInstanceRefPortPrototypeRef() {
		return new PortPrototypeRef();
	}

	public RootParameterDataPrototypeRef createParameterInAtomicSwcTypeInstanceRefRootParameterDataPrototypeRef() {
		return new RootParameterDataPrototypeRef();
	}

	public ContextDataPrototypeRef createParameterInAtomicSwcTypeInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataPrototypeRef createParameterInAtomicSwcTypeInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public InitValue createParameterDataPrototypeInitValue() {
		return new InitValue();
	}

	public ContextPPortRef createPTriggerInAtomicSwcTypeInstanceRefContextPPortRef() {
		return new ContextPPortRef();
	}

	public TargetTriggerRef createPTriggerInAtomicSwcTypeInstanceRefTargetTriggerRef() {
		return new TargetTriggerRef();
	}

	public ProvidedComSpecs createPrPortPrototypeProvidedComSpecs() {
		return new ProvidedComSpecs();
	}

	public ProvidedRequiredInterfaceTref createPrPortPrototypeProvidedRequiredInterfaceTref() {
		return new ProvidedRequiredInterfaceTref();
	}

	public ProvidedInterfaceTref createPPortPrototypeProvidedInterfaceTref() {
		return new ProvidedInterfaceTref();
	}

	public ContextComponentRef createPPortInCompositionInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public TargetPPortRef createPPortInCompositionInstanceRefTargetPPortRef() {
		return new TargetPPortRef();
	}

	public ContextPPortRef createPOperationInAtomicSwcInstanceRefContextPPortRef() {
		return new ContextPPortRef();
	}

	public TargetProvidedOperationRef createPOperationInAtomicSwcInstanceRefTargetProvidedOperationRef() {
		return new TargetProvidedOperationRef();
	}

	public ContextPPortRef createPModeGroupInAtomicSwcInstanceRefContextPPortRef() {
		return new ContextPPortRef();
	}

	public TargetModeGroupRef createPModeGroupInAtomicSwcInstanceRefTargetModeGroupRef() {
		return new TargetModeGroupRef();
	}

	public TimeSyncServerRef createOrderedMasterTimeSyncServerRef() {
		return new TimeSyncServerRef();
	}

	public ContextCompositionRef createOperationInSystemInstanceRefContextCompositionRef() {
		return new ContextCompositionRef();
	}

	public ContextComponentRef createOperationInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextPortRef createOperationInSystemInstanceRefContextPortRef() {
		return new ContextPortRef();
	}

	public TargetOperationRef createOperationInSystemInstanceRefTargetOperationRef() {
		return new TargetOperationRef();
	}

	public BaseRef createOperationArgumentInComponentInstanceRefBaseRef() {
		return new BaseRef();
	}

	public ContextComponentRef createOperationArgumentInComponentInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextPortPrototypeRef createOperationArgumentInComponentInstanceRefContextPortPrototypeRef() {
		return new ContextPortPrototypeRef();
	}

	public ContextOperationRef createOperationArgumentInComponentInstanceRefContextOperationRef() {
		return new ContextOperationRef();
	}

	public RootArgumentDataPrototypeRef createOperationArgumentInComponentInstanceRefRootArgumentDataPrototypeRef() {
		return new RootArgumentDataPrototypeRef();
	}

	public ContextDataPrototypeRef createOperationArgumentInComponentInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataPrototypeRef createOperationArgumentInComponentInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public SourceRef createOffsetTimingConstraintSourceRef() {
		return new SourceRef();
	}

	public TargetRef createOffsetTimingConstraintTargetRef() {
		return new TargetRef();
	}

	public RateBasedMonitoredEventRef createObdRatioServiceNeedsRateBasedMonitoredEventRef() {
		return new RateBasedMonitoredEventRef();
	}

	public UsedFidRef createObdRatioServiceNeedsUsedFidRef() {
		return new UsedFidRef();
	}

	public UsedSecondaryFidRef createObdRatioServiceNeedsUsedSecondaryFidRefsUsedSecondaryFidRef() {
		return new UsedSecondaryFidRef();
	}

	public InitValue createNvRequireComSpecInitValue() {
		return new InitValue();
	}

	public VariableRef createNvRequireComSpecVariableRef() {
		return new VariableRef();
	}

	public RamBlockInitValue createNvProvideComSpecRamBlockInitValue() {
		return new RamBlockInitValue();
	}

	public RomBlockInitValue createNvProvideComSpecRomBlockInitValue() {
		return new RomBlockInitValue();
	}

	public VariableRef createNvProvideComSpecVariableRef() {
		return new VariableRef();
	}

	public VariableRef createNvDataPortAnnotationVariableRef() {
		return new VariableRef();
	}

	public TimingEventRef createNvBlockDescriptorTimingEventRef() {
		return new TimingEventRef();
	}

	public DataTypeMappingRef createNvBlockDescriptorDataTypeMappingRefsDataTypeMappingRef() {
		return new DataTypeMappingRef();
	}

	public ConstantValueMappingRef createNvBlockDescriptorConstantValueMappingRefsConstantValueMappingRef() {
		return new ConstantValueMappingRef();
	}

	public InitValue createNonqueuedSenderComSpecInitValue() {
		return new InitValue();
	}

	public InitValue createNonqueuedReceiverComSpecInitValue() {
		return new InitValue();
	}

	public NmPduRef createNmPduRefConditionalNmPduRef() {
		return new NmPduRef();
	}

	public BusDependentNmEcus createNmEcuBusDependentNmEcus() {
		return new BusDependentNmEcus();
	}

	public BusSpecificNmEcu createNmEcuBusSpecificNmEcu() {
		return new BusSpecificNmEcu();
	}

	public EcuInstanceRef createNmEcuEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public NmNodeRef createNmCoordinatorNmNodeRefsNmNodeRef() {
		return new NmNodeRef();
	}

	public NmClusters createNmConfigNmClusters() {
		return new NmClusters();
	}

	public NmClusterCouplings createNmConfigNmClusterCouplings() {
		return new NmClusterCouplings();
	}

	public NetworkEndpointAddresses createNetworkEndpointNetworkEndpointAddresses() {
		return new NetworkEndpointAddresses();
	}

	public EnteredModeRef createModeTransitionEnteredModeRef() {
		return new EnteredModeRef();
	}

	public ExitedModeRef createModeTransitionExitedModeRef() {
		return new ExitedModeRef();
	}

	public EventSourceRef createModeSwitchedAckEventEventSourceRef() {
		return new EventSourceRef();
	}

	public ModeGroupRef createModeSwitchSenderComSpecModeGroupRef() {
		return new ModeGroupRef();
	}

	public ModeGroupRef createModeSwitchReceiverComSpecModeGroupRef() {
		return new ModeGroupRef();
	}

	public ImplementationDataTypeRef createModeRequestTypeMapImplementationDataTypeRef() {
		return new ImplementationDataTypeRef();
	}

	public ModeGroupRef createModeRequestTypeMapModeGroupRef() {
		return new ModeGroupRef();
	}

	public ModeGroupRef createModePortAnnotationModeGroupRef() {
		return new ModeGroupRef();
	}

	public ContextModeDeclarationGroupRef createModeInBswModuleDescriptionInstanceRefContextModeDeclarationGroupRef() {
		return new ContextModeDeclarationGroupRef();
	}

	public TargetModeRef createModeInBswModuleDescriptionInstanceRefTargetModeRef() {
		return new TargetModeRef();
	}

	public DefaultModeRef createModeErrorBehaviorDefaultModeRef() {
		return new DefaultModeRef();
	}

	public ModeDeclarationRef createModeDrivenTransmissionModeConditionModeDeclarationRefsModeDeclarationRef() {
		return new ModeDeclarationRef();
	}

	public SecondModeRef createModeDeclarationMappingSecondModeRef() {
		return new SecondModeRef();
	}

	public FirstModeRef createModeDeclarationMappingFirstModeRefsFirstModeRef() {
		return new FirstModeRef();
	}

	public ModeDeclarationGroupPrototypeRef createModeDeclarationGroupPrototypeRefConditionalModeDeclarationGroupPrototypeRef() {
		return new ModeDeclarationGroupPrototypeRef();
	}

	public FirstModeGroupRef createModeDeclarationGroupPrototypeMappingFirstModeGroupRef() {
		return new FirstModeGroupRef();
	}

	public ModeDeclarationMappingSetRef createModeDeclarationGroupPrototypeMappingModeDeclarationMappingSetRef() {
		return new ModeDeclarationMappingSetRef();
	}

	public SecondModeGroupRef createModeDeclarationGroupPrototypeMappingSecondModeGroupRef() {
		return new SecondModeGroupRef();
	}

	public TypeTref createModeDeclarationGroupPrototypeTypeTref() {
		return new TypeTref();
	}

	public InitialModeRef createModeDeclarationGroupInitialModeRef() {
		return new InitialModeRef();
	}

	public ModeGroupIref createModeAccessPointModeGroupIref() {
		return new ModeGroupIref();
	}

	public ProvidedMemoryRef createMemorySectionLocationProvidedMemoryRef() {
		return new ProvidedMemoryRef();
	}

	public SoftwareMemorySectionRef createMemorySectionLocationSoftwareMemorySectionRef() {
		return new SoftwareMemorySectionRef();
	}

	public PrefixRef createMemorySectionPrefixRef() {
		return new PrefixRef();
	}

	public SwAddrMethodRef createMemorySectionSwAddrmethodRef() {
		return new SwAddrMethodRef();
	}

	public ExecutableEntityRef createMemorySectionExecutableEntityRefsExecutableEntityRef() {
		return new ExecutableEntityRef();
	}

	public BaseReferenceRef createMcSwEmulationMethodSupportBaseReferenceRef() {
		return new BaseReferenceRef();
	}

	public ReferenceTableRef createMcSwEmulationMethodSupportReferenceTableRef() {
		return new ReferenceTableRef();
	}

	public MeasurableSystemConstantValuesRef createMcSupportDataMeasurableSystemConstantValuesRefsMeasurableSystemConstantValuesRef() {
		return new MeasurableSystemConstantValuesRef();
	}

	public RamLocationRef createMcParameterElementGroupRamLocationRef() {
		return new RamLocationRef();
	}

	public RomLocationRef createMcParameterElementGroupRomLocationRef() {
		return new RomLocationRef();
	}

	public McDataInstanceRef createMcFunctionDataRefSetConditionalMcDataInstanceRefsMcDataInstanceRef() {
		return new McDataInstanceRef();
	}

	public FlatMapEntryRef createMcFunctionDataRefSetConditionalFlatMapEntryRefsFlatMapEntryRef() {
		return new FlatMapEntryRef();
	}

	public SubFunctionRef createMcFunctionSubFunctionRefsSubFunctionRef() {
		return new SubFunctionRef();
	}

	public FlatMapEntryRef createMcDataInstanceFlatMapEntryRef() {
		return new FlatMapEntryRef();
	}

	public MacMulticastGroupRef createMacMulticastConfigurationMacMulticastGroupRef() {
		return new MacMulticastGroupRef();
	}

	public ConnectorRef createLinTpNodeConnectorRef() {
		return new ConnectorRef();
	}

	public TpAddressRef createLinTpNodeTpAddressRef() {
		return new TpAddressRef();
	}

	public DataPduRef createLinTpConnectionDataPduRef() {
		return new DataPduRef();
	}

	public FlowControlRef createLinTpConnectionFlowControlRef() {
		return new FlowControlRef();
	}

	public LinTpNSduRef createLinTpConnectionLinTpNSduRef() {
		return new LinTpNSduRef();
	}

	public MulticastRef createLinTpConnectionMulticastRef() {
		return new MulticastRef();
	}

	public TransmitterRef createLinTpConnectionTransmitterRef() {
		return new TransmitterRef();
	}

	public ReceiverRef createLinTpConnectionReceiverRefsReceiverRef() {
		return new ReceiverRef();
	}

	public CommunicationClusterRef createLinTpConfigCommunicationClusterRef() {
		return new CommunicationClusterRef();
	}

	public SubstitutedFrameRef createLinSporadicFrameSubstitutedFrameRefsSubstitutedFrameRef() {
		return new SubstitutedFrameRef();
	}

	public LinSlaveEcuRef createLinSlaveConfigLinSlaveEcuRef() {
		return new LinSlaveEcuRef();
	}

	public TableEntrys createLinScheduleTableTableEntrys() {
		return new TableEntrys();
	}

	public FrameRef createLinOrderedConfigurableFrameFrameRef() {
		return new FrameRef();
	}

	public FrameRef createLinFrameTriggeringFrameRef() {
		return new FrameRef();
	}

	public FramePortRef createLinFrameTriggeringFramePortRefsFramePortRef() {
		return new FramePortRef();
	}

	public CollisionResolvingScheduleRef createLinEventTriggeredFrameCollisionResolvingScheduleRef() {
		return new CollisionResolvingScheduleRef();
	}

	public LinUnconditionalFrameRef createLinEventTriggeredFrameLinUnconditionalFrameRefsLinUnconditionalFrameRef() {
		return new LinUnconditionalFrameRef();
	}

	public FrameTriggeringRef createLinErrorResponseFrameTriggeringRef() {
		return new FrameTriggeringRef();
	}

	public FrameRef createLinConfigurableFrameFrameRef() {
		return new FrameRef();
	}

	public DefaultLcStateRef createLifeCycleInfoSetDefaultLcStateRef() {
		return new DefaultLcStateRef();
	}

	public UsedLifeCycleStateDefinitionGroupRef createLifeCycleInfoSetUsedLifeCycleStateDefinitionGroupRef() {
		return new UsedLifeCycleStateDefinitionGroupRef();
	}

	public LcObjectRef createLifeCycleInfoLcObjectRef() {
		return new LcObjectRef();
	}

	public LcStateRef createLifeCycleInfoLcStateRef() {
		return new LcStateRef();
	}

	public UseInsteadRef createLifeCycleInfoUseInsteadRefsUseInsteadRef() {
		return new UseInsteadRef();
	}

	public ScopeRef createLatencyTimingConstraintScopeRef() {
		return new ScopeRef();
	}

	public TraceRef createLParagraphTraceRef() {
		return new TraceRef();
	}

	public TraceRef createLOverviewParagraphTraceRef() {
		return new TraceRef();
	}

	public DirectPduRef createJ1939TpPgDirectPduRef() {
		return new DirectPduRef();
	}

	public TpSduRef createJ1939TpPgTpSduRef() {
		return new TpSduRef();
	}

	public SduRef createJ1939TpPgSduRefsSduRef() {
		return new SduRef();
	}

	public ConnectorRef createJ1939TpNodeConnectorRef() {
		return new ConnectorRef();
	}

	public TpAddressRef createJ1939TpNodeTpAddressRef() {
		return new TpAddressRef();
	}

	public DataPduRef createJ1939TpConnectionDataPduRef() {
		return new DataPduRef();
	}

	public DirectPduRef createJ1939TpConnectionDirectPduRef() {
		return new DirectPduRef();
	}

	public TransmitterRef createJ1939TpConnectionTransmitterRef() {
		return new TransmitterRef();
	}

	public TpSduRef createJ1939TpConnectionTpSduRefsTpSduRef() {
		return new TpSduRef();
	}

	public ReceiverRef createJ1939TpConnectionReceiverRefsReceiverRef() {
		return new ReceiverRef();
	}

	public FlowControlPduRef createJ1939TpConnectionFlowControlPduRefsFlowControlPduRef() {
		return new FlowControlPduRef();
	}

	public ArgumentRef createIoHwAbstractionServerAnnotationArgumentRef() {
		return new ArgumentRef();
	}

	public DataElementRef createIoHwAbstractionServerAnnotationDataElementRef() {
		return new DataElementRef();
	}

	public FailureMonitoringRef createIoHwAbstractionServerAnnotationFailureMonitoringRef() {
		return new FailureMonitoringRef();
	}

	public TriggerRef createIoHwAbstractionServerAnnotationTriggerRef() {
		return new TriggerRef();
	}

	public DataElementRef createInvalidationPolicyDataElementRef() {
		return new DataElementRef();
	}

	public SwRecordLayoutRef createInterpolationRoutineMappingSwRecordLayoutRef() {
		return new SwRecordLayoutRef();
	}

	public InterpolationRoutineRef createInterpolationRoutineInterpolationRoutineRef() {
		return new InterpolationRoutineRef();
	}

	public EventSourceRef createInternalTriggerOccurredEventEventSourceRef() {
		return new EventSourceRef();
	}

	public ContextComponentPrototypeRef createInstanceEventInCompositionInstanceRefContextComponentPrototypeRef() {
		return new ContextComponentPrototypeRef();
	}

	public TargetEventRef createInstanceEventInCompositionInstanceRefTargetEventRef() {
		return new TargetEventRef();
	}

	public ContextSwComponentPrototypeRef createInnerRunnableEntityGroupInCompositionInstanceRefContextSwComponentPrototypeRef() {
		return new ContextSwComponentPrototypeRef();
	}

	public TargetRunnableEntityGroupRef createInnerRunnableEntityGroupInCompositionInstanceRefTargetRunnableEntityGroupRef() {
		return new TargetRunnableEntityGroupRef();
	}

	public ContextRef createInnerPortGroupInCompositionInstanceRefContextRef() {
		return new ContextRef();
	}

	public TargetRef createInnerPortGroupInCompositionInstanceRefTargetRef() {
		return new TargetRef();
	}

	public ContextSwComponentPrototypeRef createInnerDataPrototypeGroupInCompositionInstanceRefContextSwComponentPrototypeRef() {
		return new ContextSwComponentPrototypeRef();
	}

	public TargetDataPrototypeGroupRef createInnerDataPrototypeGroupInCompositionInstanceRefTargetDataPrototypeGroupRef() {
		return new TargetDataPrototypeGroupRef();
	}

	public ApplicationArrayElementRef createIndexedArrayElementApplicationArrayElementRef() {
		return new ApplicationArrayElementRef();
	}

	public ImplementationArrayElementRef createIndexedArrayElementImplementationArrayElementRef() {
		return new ImplementationArrayElementRef();
	}

	public ModeDeclarationGroupRef createIncludedModeDeclarationGroupSetModeDeclarationGroupRefsModeDeclarationGroupRef() {
		return new ModeDeclarationGroupRef();
	}

	public DataTypeRef createIncludedDataTypeSetDataTypeRefsDataTypeRef() {
		return new DataTypeRef();
	}

	public ContextRef createImplementationElementInParameterInstanceRefContextRef() {
		return new ContextRef();
	}

	public TargetRef createImplementationElementInParameterInstanceRefTargetRef() {
		return new TargetRef();
	}

	public ISignalTriggeringRef createISignalTriggeringRefConditionalISignalTriggeringRef() {
		return new ISignalTriggeringRef();
	}

	public ISignalGroupRef createISignalTriggeringISignalGroupRef() {
		return new ISignalGroupRef();
	}

	public ISignalRef createISignalTriggeringISignalRef() {
		return new ISignalRef();
	}

	public ISignalPortRef createISignalTriggeringISignalPortRefsISignalPortRef() {
		return new ISignalPortRef();
	}

	public ISignalGroupRef createISignalToIPduMappingISignalGroupRef() {
		return new ISignalGroupRef();
	}

	public ISignalRef createISignalToIPduMappingISignalRef() {
		return new ISignalRef();
	}

	public SourceSignalRef createISignalMappingSourceSignalRef() {
		return new SourceSignalRef();
	}

	public TargetSignalRef createISignalMappingTargetSignalRef() {
		return new TargetSignalRef();
	}

	public ISignalIPduRef createISignalIPduRefConditionalISignalIPduRef() {
		return new ISignalIPduRef();
	}

	public ContainedISignalIPduGroupRef createISignalIPduGroupContainedISignalIPduGroupRefsContainedISignalIPduGroupRef() {
		return new ContainedISignalIPduGroupRef();
	}

	public SystemSignalGroupRef createISignalGroupSystemSignalGroupRef() {
		return new SystemSignalGroupRef();
	}

	public TransformationISignalPropss createISignalGroupTransformationISignalPropss() {
		return new TransformationISignalPropss();
	}

	public ISignalRef createISignalGroupISignalRefsISignalRef() {
		return new ISignalRef();
	}

	public InitValue createISignalInitValue() {
		return new InitValue();
	}

	public SystemSignalRef createISignalSystemSignalRef() {
		return new SystemSignalRef();
	}

	public TransformationISignalPropss createISignalTransformationISignalPropss() {
		return new TransformationISignalPropss();
	}

	public SourceIPduRef createIPduMappingSourceIPduRef() {
		return new SourceIPduRef();
	}

	public HwTypeRef createHwTypeHwTypeRef() {
		return new HwTypeRef();
	}

	public HwCategoryRef createHwTypeHwCategoryRefsHwCategoryRef() {
		return new HwCategoryRef();
	}

	public CommunicationConnectorRef createHwPortMappingCommunicationConnectorRef() {
		return new CommunicationConnectorRef();
	}

	public HwCommunicationPortRef createHwPortMappingHwCommunicationPortRef() {
		return new HwCommunicationPortRef();
	}

	public HwPinGroupRef createHwPinGroupConnectorHwPinGroupRefsHwPinGroupRef() {
		return new HwPinGroupRef();
	}

	public HwPinRef createHwPinConnectorHwPinRefsHwPinRef() {
		return new HwPinRef();
	}

	public HwElementRef createHwElementRefConditionalHwElementRef() {
		return new HwElementRef();
	}

	public HwElementRef createHwElementConnectorHwElementRefsHwElementRef() {
		return new HwElementRef();
	}

	public HwAttributeDefRef createHwAttributeValueHwAttributeDefRef() {
		return new HwAttributeDefRef();
	}

	public UnitRef createHwAttributeDefUnitRef() {
		return new UnitRef();
	}

	public HostRef createGlobalTimeGatewayHostRef() {
		return new HostRef();
	}

	public MasterRef createGlobalTimeGatewayMasterRef() {
		return new MasterRef();
	}

	public SlaveRef createGlobalTimeGatewaySlaveRef() {
		return new SlaveRef();
	}

	public CommunicationConnectorRef createGlobalTimeFrSlaveCommunicationConnectorRef() {
		return new CommunicationConnectorRef();
	}

	public CommunicationConnectorRef createGlobalTimeFrMasterCommunicationConnectorRef() {
		return new CommunicationConnectorRef();
	}

	public GlobalTimePduRef createGlobalTimeDomainGlobalTimePduRef() {
		return new GlobalTimePduRef();
	}

	public Master createGlobalTimeDomainMaster() {
		return new Master();
	}

	public OffsetTimeDomainRef createGlobalTimeDomainOffsetTimeDomainRef() {
		return new OffsetTimeDomainRef();
	}

	public Slaves createGlobalTimeDomainSlaves() {
		return new Slaves();
	}

	public SubDomainRef createGlobalTimeDomainSubDomainRefsSubDomainRef() {
		return new SubDomainRef();
	}

	public CommunicationClusterRef createGlobalTimeDomainCommunicationClusterRefsCommunicationClusterRef() {
		return new CommunicationClusterRef();
	}

	public EcuRef createGatewayEcuRef() {
		return new EcuRef();
	}

	public SourceFrameRef createFrameMappingSourceFrameRef() {
		return new SourceFrameRef();
	}

	public TargetFrameRef createFrameMappingTargetFrameRef() {
		return new TargetFrameRef();
	}

	public PhysicalChannelRef createForbiddenSignalPathPhysicalChannelRefsPhysicalChannelRef() {
		return new PhysicalChannelRef();
	}

	public NPduRef createFlexrayTpPduPoolNPduRefsNPduRef() {
		return new NPduRef();
	}

	public TpAddressRef createFlexrayTpNodeTpAddressRef() {
		return new TpAddressRef();
	}

	public ConnectorRef createFlexrayTpNodeConnectorRefsConnectorRef() {
		return new ConnectorRef();
	}

	public EcuInstanceRef createFlexrayTpEcuEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public DirectTpSduRef createFlexrayTpConnectionDirectTpSduRef() {
		return new DirectTpSduRef();
	}

	public MulticastRef createFlexrayTpConnectionMulticastRef() {
		return new MulticastRef();
	}

	public ReversedTpSduRef createFlexrayTpConnectionReversedTpSduRef() {
		return new ReversedTpSduRef();
	}

	public RxPduPoolRef createFlexrayTpConnectionRxPduPoolRef() {
		return new RxPduPoolRef();
	}

	public TpConnectionControlRef createFlexrayTpConnectionTpConnectionControlRef() {
		return new TpConnectionControlRef();
	}

	public TransmitterRef createFlexrayTpConnectionTransmitterRef() {
		return new TransmitterRef();
	}

	public TxPduPoolRef createFlexrayTpConnectionTxPduPoolRef() {
		return new TxPduPoolRef();
	}

	public ReceiverRef createFlexrayTpConnectionReceiverRefsReceiverRef() {
		return new ReceiverRef();
	}

	public CoupledClusterRef createFlexrayNmClusterCouplingCoupledClusterRefsCoupledClusterRef() {
		return new CoupledClusterRef();
	}

	public ChannelRef createFlexrayFifoConfigurationChannelRef() {
		return new ChannelRef();
	}

	public TpAddressRef createFlexrayArTpNodeTpAddressRef() {
		return new TpAddressRef();
	}

	public ConnectorRef createFlexrayArTpNodeConnectorRefsConnectorRef() {
		return new ConnectorRef();
	}

	public DirectTpSduRef createFlexrayArTpConnectionDirectTpSduRef() {
		return new DirectTpSduRef();
	}

	public FlowControlPduRef createFlexrayArTpConnectionFlowControlPduRef() {
		return new FlowControlPduRef();
	}

	public MulticastRef createFlexrayArTpConnectionMulticastRef() {
		return new MulticastRef();
	}

	public ReversedTpSduRef createFlexrayArTpConnectionReversedTpSduRef() {
		return new ReversedTpSduRef();
	}

	public SourceRef createFlexrayArTpConnectionSourceRef() {
		return new SourceRef();
	}

	public TransmitPduRef createFlexrayArTpConnectionTransmitPduRefsTransmitPduRef() {
		return new TransmitPduRef();
	}

	public TargetRef createFlexrayArTpConnectionTargetRefsTargetRef() {
		return new TargetRef();
	}

	public FlowControlPduRef createFlexrayArTpChannelFlowControlPduRef() {
		return new FlowControlPduRef();
	}

	public NPduRef createFlexrayArTpChannelNPduRefsNPduRef() {
		return new NPduRef();
	}

	public CommunicationCycle createFlexrayAbsolutelyScheduledTimingCommunicationCycle() {
		return new CommunicationCycle();
	}

	public FibexElementRef createFibexElementRefConditionalFibexElementRef() {
		return new FibexElementRef();
	}

	public IncludeRef createFmFeatureSelectionSetIncludeRefsIncludeRef() {
		return new IncludeRef();
	}

	public FeatureModelRef createFmFeatureSelectionSetFeatureModelRefsFeatureModelRef() {
		return new FeatureModelRef();
	}

	public FeatureRef createFmFeatureSelectionFeatureRef() {
		return new FeatureRef();
	}

	public FeatureRef createFmFeatureRelationFeatureRefsFeatureRef() {
		return new FeatureRef();
	}

	public RootRef createFmFeatureModelRootRef() {
		return new RootRef();
	}

	public FeatureRef createFmFeatureModelFeatureRefsFeatureRef() {
		return new FeatureRef();
	}

	public SwSystemconstantValueSetRef createFmFeatureMapElementSwSystemconstantValueSetRefsSwSystemconstantValueSetRef() {
		return new SwSystemconstantValueSetRef();
	}

	public PostBuildVariantCriterionValueSetRef createFmFeatureMapElementPostBuildVariantCriterionValueSetRefsPostBuildVariantCriterionValueSetRef() {
		return new PostBuildVariantCriterionValueSetRef();
	}

	public FeatureRef createFmFeatureDecompositionFeatureRefsFeatureRef() {
		return new FeatureRef();
	}

	public FeatureRef createFmConditionByFeaturesAndSwSystemconstsFeatureRef() {
		return new FeatureRef();
	}

	public AttributeRef createFmConditionByFeaturesAndAttributesAttributeRef() {
		return new AttributeRef();
	}

	public FeatureRef createFmConditionByFeaturesAndAttributesFeatureRef() {
		return new FeatureRef();
	}

	public DefinitionRef createFmAttributeValueDefinitionRef() {
		return new DefinitionRef();
	}

	public TriggerIref createExternalTriggeringPointTriggerIref() {
		return new TriggerIref();
	}

	public ExecutableRef createExecutionTimeConstraintExecutableRef() {
		return new ExecutableRef();
	}

	public BaseCompositionRef createExecutionOrderConstraintBaseCompositionRef() {
		return new BaseCompositionRef();
	}

	public OrderedElements createExecutionOrderConstraintOrderedElements() {
		return new OrderedElements();
	}

	public ExclusiveAreaRef createExclusiveAreaNestingOrderExclusiveAreaRefsExclusiveAreaRef() {
		return new ExclusiveAreaRef();
	}

	public ApplicationEndpointRef createEventHandlerApplicationEndpointRef() {
		return new ApplicationEndpointRef();
	}

	public RoutingGroupRef createEventHandlerRoutingGroupRefsRoutingGroupRef() {
		return new RoutingGroupRef();
	}

	public ConsumedEventGroupRef createEventHandlerConsumedEventGroupRefsConsumedEventGroupRef() {
		return new ConsumedEventGroupRef();
	}

	public EvaluatedVariantRef createEvaluatedVariantSetEvaluatedVariantRefsEvaluatedVariantRef() {
		return new EvaluatedVariantRef();
	}

	public EvaluatedElementRef createEvaluatedVariantSetEvaluatedElementRefsEvaluatedElementRef() {
		return new EvaluatedElementRef();
	}

	public NetworkEndpointRef createEthernetCommunicationConnectorNetworkEndpointRefsNetworkEndpointRef() {
		return new NetworkEndpointRef();
	}

	public ISignalGroupRef createEndToEndProtectionISignalIPduISignalGroupRef() {
		return new ISignalGroupRef();
	}

	public ISignalIPduRef createEndToEndProtectionISignalIPduISignalIPduRef() {
		return new ISignalIPduRef();
	}

	public SystemSignalRef createEmptySignalMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public EcuExtractRef createEcucValueCollectionEcuExtractRef() {
		return new EcuExtractRef();
	}

	public RelatedTraceItemRef createEcucUriReferenceDefRelatedTraceItemRef() {
		return new RelatedTraceItemRef();
	}

	public DestinationUriRef createEcucUriReferenceDefDestinationUriRef() {
		return new DestinationUriRef();
	}

	public DefinitionRef createEcucTextualParamValueDefinitionRef() {
		return new DefinitionRef();
	}

	public DestinationRef createEcucSymbolicNameReferenceDefDestinationRef() {
		return new DestinationRef();
	}

	public DefinitionRef createEcucReferenceValueDefinitionRef() {
		return new DefinitionRef();
	}

	public ValueRef createEcucReferenceValueValueRef() {
		return new ValueRef();
	}

	public DestinationRef createEcucReferenceDefDestinationRef() {
		return new DestinationRef();
	}

	public ConfigElementDefGlobalRef createEcucQueryExpressionConfigElementDefGlobalRef() {
		return new ConfigElementDefGlobalRef();
	}

	public ConfigElementDefLocalRef createEcucQueryExpressionConfigElementDefLocalRef() {
		return new ConfigElementDefLocalRef();
	}

	public EcucQueryRef createEcucParameterDerivationFormulaEcucQueryRef() {
		return new EcucQueryRef();
	}

	public EcucQueryStringRef createEcucParameterDerivationFormulaEcucQueryStringRef() {
		return new EcucQueryStringRef();
	}

	public Parameters createEcucParamConfContainerDefParameters() {
		return new Parameters();
	}

	public References createEcucParamConfContainerDefReferences() {
		return new References();
	}

	public SubContainers createEcucParamConfContainerDefSubContainers() {
		return new SubContainers();
	}

	public DestinationUriRef createEcucParamConfContainerDefDestinationUriRefsDestinationUriRef() {
		return new DestinationUriRef();
	}

	public RefinedModuleDefRef createEcucModuleDefRefinedModuleDefRef() {
		return new RefinedModuleDefRef();
	}

	public Containers createEcucModuleDefContainers() {
		return new Containers();
	}

	public EcucModuleConfigurationValuesRef createEcucModuleConfigurationValuesRefConditionalEcucModuleConfigurationValuesRef() {
		return new EcucModuleConfigurationValuesRef();
	}

	public DefinitionRef createEcucModuleConfigurationValuesDefinitionRef() {
		return new DefinitionRef();
	}

	public ModuleDescriptionRef createEcucModuleConfigurationValuesModuleDescriptionRef() {
		return new ModuleDescriptionRef();
	}

	public Containers createEcucDestinationUriPolicyContainers() {
		return new Containers();
	}

	public Parameters createEcucDestinationUriPolicyParameters() {
		return new Parameters();
	}

	public References createEcucDestinationUriPolicyReferences() {
		return new References();
	}

	public ModuleRef createEcucDefinitionCollectionModuleRefsModuleRef() {
		return new ModuleRef();
	}

	public DefinitionRef createEcucContainerValueDefinitionRef() {
		return new DefinitionRef();
	}

	public ParameterValues createEcucContainerValueParameterValues() {
		return new ParameterValues();
	}

	public ReferenceValues createEcucContainerValueReferenceValues() {
		return new ReferenceValues();
	}

	public AffectedRef createEcucConfigurationClassAffectionAffectedRefsAffectedRef() {
		return new AffectedRef();
	}

	public EcucQueryRef createEcucConditionFormulaEcucQueryRef() {
		return new EcucQueryRef();
	}

	public EcucQueryStringRef createEcucConditionFormulaEcucQueryStringRef() {
		return new EcucQueryStringRef();
	}

	public DestinationRef createEcucChoiceReferenceDefDestinationRefsDestinationRef() {
		return new DestinationRef();
	}

	public EcuConfigurationRef createEcuTimingEcuConfigurationRef() {
		return new EcuConfigurationRef();
	}

	public EcuInstanceRef createEcuResourceEstimationEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public SwCompToEcuMappingRef createEcuResourceEstimationSwCompToEcuMappingRefsSwCompToEcuMappingRef() {
		return new SwCompToEcuMappingRef();
	}

	public CommControllers createEcuInstanceCommControllers() {
		return new CommControllers();
	}

	public Connectors createEcuInstanceConnectors() {
		return new Connectors();
	}

	public TpAddressRef createEcuInstanceTpAddressRefsTpAddressRef() {
		return new TpAddressRef();
	}

	public CanTpAddressRef createEcuInstanceCanTpAddressRefsCanTpAddressRef() {
		return new CanTpAddressRef();
	}

	public AssociatedPdurIPduGroupRef createEcuInstanceAssociatedPdurIPduGroupRefsAssociatedPdurIPduGroupRef() {
		return new AssociatedPdurIPduGroupRef();
	}

	public AssociatedComIPduGroupRef createEcuInstanceAssociatedComIPduGroupRefsAssociatedComIPduGroupRef() {
		return new AssociatedComIPduGroupRef();
	}

	public HardwareElementRef createEcuAbstractionSwComponentTypeHardwareElementRefsHardwareElementRef() {
		return new HardwareElementRef();
	}

	public TriggeringEventRef createEocExecutableEntityRefGroupTriggeringEventRef() {
		return new TriggeringEventRef();
	}

	public SuccessorRef createEocExecutableEntityRefGroupSuccessorRefsSuccessorRef() {
		return new SuccessorRef();
	}

	public NestedElementRef createEocExecutableEntityRefGroupNestedElementRefsNestedElementRef() {
		return new NestedElementRef();
	}

	public DirectSuccessorRef createEocExecutableEntityRefGroupDirectSuccessorRefsDirectSuccessorRef() {
		return new DirectSuccessorRef();
	}

	public BswModuleInstanceRef createEocExecutableEntityRefBswModuleInstanceRef() {
		return new BswModuleInstanceRef();
	}

	public ExecutableRef createEocExecutableEntityRefExecutableRef() {
		return new ExecutableRef();
	}

	public SuccessorRef createEocExecutableEntityRefSuccessorRefsSuccessorRef() {
		return new SuccessorRef();
	}

	public BswModuleInstanceRef createEocEventRefBswModuleInstanceRef() {
		return new BswModuleInstanceRef();
	}

	public EventRef createEocEventRefEventRef() {
		return new EventRef();
	}

	public SuccessorRef createEocEventRefSuccessorRefsSuccessorRef() {
		return new SuccessorRef();
	}

	public EcuInstanceRef createEcuMappingEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public EcuRef createEcuMappingEcuRef() {
		return new EcuRef();
	}

	public IPduRef createDynamicPartAlternativeIPduRef() {
		return new IPduRef();
	}

	public IdentifiableRef createDocumentationContextIdentifiableRef() {
		return new IdentifiableRef();
	}

	public DoIpSourceAddressRef createDoIpTpConnectionDoIpSourceAddressRef() {
		return new DoIpSourceAddressRef();
	}

	public DoIpTargetAddressRef createDoIpTpConnectionDoIpTargetAddressRef() {
		return new DoIpTargetAddressRef();
	}

	public TpSduRef createDoIpTpConnectionTpSduRef() {
		return new TpSduRef();
	}

	public AccessPermissionRef createDiagnosticWriteMemoryByAddressClassAccessPermissionRef() {
		return new AccessPermissionRef();
	}

	public AccessPermissionRef createDiagnosticWriteMemoryByAddressAccessPermissionRef() {
		return new AccessPermissionRef();
	}

	public WriteClassRef createDiagnosticWriteMemoryByAddressWriteClassRef() {
		return new WriteClassRef();
	}

	public MemoryRangeRef createDiagnosticWriteMemoryByAddressMemoryRangeRefsMemoryRangeRef() {
		return new MemoryRangeRef();
	}

	public DataIdentifierRef createDiagnosticWriteDataByIdentifierDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public WriteClassRef createDiagnosticWriteDataByIdentifierWriteClassRef() {
		return new WriteClassRef();
	}

	public DtcPropsRef createDiagnosticTroubleCodeUdsDtcPropsRef() {
		return new DtcPropsRef();
	}

	public DiagnosticTroubleCodeRef createDiagnosticTroubleCodeRefConditionalDiagnosticTroubleCodeRef() {
		return new DiagnosticTroubleCodeRef();
	}

	public AgingRef createDiagnosticTroubleCodePropsAgingRef() {
		return new AgingRef();
	}

	public FreezeFrameContentRef createDiagnosticTroubleCodePropsFreezeFrameContentRef() {
		return new FreezeFrameContentRef();
	}

	public MemoryDestinationRef createDiagnosticTroubleCodePropsMemoryDestinationRefsMemoryDestinationRef() {
		return new MemoryDestinationRef();
	}

	public TransferExitClassRef createDiagnosticTransferExitTransferExitClassRef() {
		return new TransferExitClassRef();
	}

	public DiagnosticStorageConditionRef createDiagnosticStorageConditionRefConditionalDiagnosticStorageConditionRef() {
		return new DiagnosticStorageConditionRef();
	}

	public DiagnosticStorageConditionRef createDiagnosticStorageConditionPortMappingDiagnosticStorageConditionRef() {
		return new DiagnosticStorageConditionRef();
	}

	public SwcFlatServiceDependencyRef createDiagnosticStorageConditionPortMappingSwcFlatServiceDependencyRef() {
		return new SwcFlatServiceDependencyRef();
	}

	public DiagnosticSessionRef createDiagnosticSessionControlDiagnosticSessionRef() {
		return new DiagnosticSessionRef();
	}

	public SessionControlClassRef createDiagnosticSessionControlSessionControlClassRef() {
		return new SessionControlClassRef();
	}

	public DiagnosticServiceTableRef createDiagnosticServiceTableRefConditionalDiagnosticServiceTableRef() {
		return new DiagnosticServiceTableRef();
	}

	public EcuInstanceRef createDiagnosticServiceTableEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public ServiceInstanceRef createDiagnosticServiceTableServiceInstanceRefsServiceInstanceRef() {
		return new ServiceInstanceRef();
	}

	public DiagnosticDataElementRef createDiagnosticServiceSwMappingDiagnosticDataElementRef() {
		return new DiagnosticDataElementRef();
	}

	public MappedBswServiceDependencyRef createDiagnosticServiceSwMappingMappedBswServiceDependencyRef() {
		return new MappedBswServiceDependencyRef();
	}

	public MappedFlatSwcServiceDependencyRef createDiagnosticServiceSwMappingMappedFlatSwcServiceDependencyRef() {
		return new MappedFlatSwcServiceDependencyRef();
	}

	public ServiceInstanceRef createDiagnosticServiceSwMappingServiceInstanceRef() {
		return new ServiceInstanceRef();
	}

	public DiagnosticDataElementRef createDiagnosticServiceDataMappingDiagnosticDataElementRef() {
		return new DiagnosticDataElementRef();
	}

	public SecurityAccessClassRef createDiagnosticSecurityAccessSecurityAccessClassRef() {
		return new SecurityAccessClassRef();
	}

	public SecurityLevelRef createDiagnosticSecurityAccessSecurityLevelRef() {
		return new SecurityLevelRef();
	}

	public RoutineControlClassRef createDiagnosticRoutineControlRoutineControlClassRef() {
		return new RoutineControlClassRef();
	}

	public RoutineRef createDiagnosticRoutineControlRoutineRef() {
		return new RoutineRef();
	}

	public Events createDiagnosticResponseOnEventEvents() {
		return new Events();
	}

	public ResponseOnEventClassRef createDiagnosticResponseOnEventResponseOnEventClassRef() {
		return new ResponseOnEventClassRef();
	}

	public RequestUploadClassRef createDiagnosticRequestUploadRequestUploadClassRef() {
		return new RequestUploadClassRef();
	}

	public RequestFileTransferClassRef createDiagnosticRequestFileTransferRequestFileTransferClassRef() {
		return new RequestFileTransferClassRef();
	}

	public RequestDownloadClassRef createDiagnosticRequestDownloadRequestDownloadClassRef() {
		return new RequestDownloadClassRef();
	}

	public ReadClassRef createDiagnosticReadMemoryByAddressReadClassRef() {
		return new ReadClassRef();
	}

	public DataIdentifierRef createDiagnosticReadDataByPeriodicIdDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public ReadDataClassRef createDiagnosticReadDataByPeriodicIdReadDataClassRef() {
		return new ReadDataClassRef();
	}

	public ReadClassRef createDiagnosticReadDataByIdentifierReadClassRef() {
		return new ReadClassRef();
	}

	public ReadDtcInformationClassRef createDiagnosticReadDtcInformationReadDtcInformationClassRef() {
		return new ReadDtcInformationClassRef();
	}

	public DiagnosticOperationCycleRef createDiagnosticOperationCycleRefConditionalDiagnosticOperationCycleRef() {
		return new DiagnosticOperationCycleRef();
	}

	public OperationCycleRef createDiagnosticOperationCyclePortMappingOperationCycleRef() {
		return new OperationCycleRef();
	}

	public SwcFlatServiceDependencyRef createDiagnosticOperationCyclePortMappingSwcFlatServiceDependencyRef() {
		return new SwcFlatServiceDependencyRef();
	}

	public AccessPermissionRef createDiagnosticMemoryIdentifierAccessPermissionRef() {
		return new AccessPermissionRef();
	}

	public CurrentValueRef createDiagnosticIoControlNeedsCurrentValueRef() {
		return new CurrentValueRef();
	}

	public DataIdentifierRef createDiagnosticIoControlDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public IoControlClassRef createDiagnosticIoControlIoControlClassRef() {
		return new IoControlClassRef();
	}

	public DiagnosticFreezeFrameRef createDiagnosticFreezeFrameRefConditionalDiagnosticFreezeFrameRef() {
		return new DiagnosticFreezeFrameRef();
	}

	public DiagnosticExtendedDataRecordRef createDiagnosticExtendedDataRecordRefConditionalDiagnosticExtendedDataRecordRef() {
		return new DiagnosticExtendedDataRecordRef();
	}

	public DiagnosticEventRef createDiagnosticEventToTroubleCodeUdsMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public TroubleCodeUdsRef createDiagnosticEventToTroubleCodeUdsMappingTroubleCodeUdsRef() {
		return new TroubleCodeUdsRef();
	}

	public DiagnosticEventRef createDiagnosticEventToStorageConditionGroupMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public StorageConditionGroupRef createDiagnosticEventToStorageConditionGroupMappingStorageConditionGroupRef() {
		return new StorageConditionGroupRef();
	}

	public DiagnosticEventRef createDiagnosticEventToOperationCycleMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public OperationCycleRef createDiagnosticEventToOperationCycleMappingOperationCycleRef() {
		return new OperationCycleRef();
	}

	public DiagnosticEventRef createDiagnosticEventToEnableConditionGroupMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public EnableConditionGroupRef createDiagnosticEventToEnableConditionGroupMappingEnableConditionGroupRef() {
		return new EnableConditionGroupRef();
	}

	public DebounceAlgorithmRef createDiagnosticEventToDebounceAlgorithmMappingDebounceAlgorithmRef() {
		return new DebounceAlgorithmRef();
	}

	public DiagnosticEventRef createDiagnosticEventToDebounceAlgorithmMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public BswServiceDependencyRef createDiagnosticEventPortMappingBswServiceDependencyRef() {
		return new BswServiceDependencyRef();
	}

	public DiagnosticEventRef createDiagnosticEventPortMappingDiagnosticEventRef() {
		return new DiagnosticEventRef();
	}

	public SwcFlatServiceDependencyRef createDiagnosticEventPortMappingSwcFlatServiceDependencyRef() {
		return new SwcFlatServiceDependencyRef();
	}

	public DiagEventDebounceAlgorithm createDiagnosticEventNeedsDiagEventDebounceAlgorithm() {
		return new DiagEventDebounceAlgorithm();
	}

	public InhibitingFidRef createDiagnosticEventNeedsInhibitingFidRef() {
		return new InhibitingFidRef();
	}

	public InhibitingSecondaryFidRef createDiagnosticEventNeedsInhibitingSecondaryFidRefsInhibitingSecondaryFidRef() {
		return new InhibitingSecondaryFidRef();
	}

	public DeferringFidRef createDiagnosticEventNeedsDeferringFidRefsDeferringFidRef() {
		return new DeferringFidRef();
	}

	public DiagnosticEnableConditionRef createDiagnosticEnableConditionRefConditionalDiagnosticEnableConditionRef() {
		return new DiagnosticEnableConditionRef();
	}

	public EnableConditionRef createDiagnosticEnableConditionPortMappingEnableConditionRef() {
		return new EnableConditionRef();
	}

	public SwcFlatServiceDependencyRef createDiagnosticEnableConditionPortMappingSwcFlatServiceDependencyRef() {
		return new SwcFlatServiceDependencyRef();
	}

	public EcuResetClassRef createDiagnosticEcuResetEcuResetClassRef() {
		return new EcuResetClassRef();
	}

	public DataIdentifierRef createDiagnosticDynamicallyDefineDataIdentifierDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public DynamicallyDefineDataIdentifierClassRef createDiagnosticDynamicallyDefineDataIdentifierDynamicallyDefineDataIdentifierClassRef() {
		return new DynamicallyDefineDataIdentifierClassRef();
	}

	public DataElementRef createDiagnosticDemProvidedDataMappingDataElementRef() {
		return new DataElementRef();
	}

	public DebounceAlgorithm createDiagnosticDebounceAlgorithmPropsDebounceAlgorithm() {
		return new DebounceAlgorithm();
	}

	public DataTransferClassRef createDiagnosticDataTransferDataTransferClassRef() {
		return new DataTransferClassRef();
	}

	public DataIdentifierRef createDiagnosticDataIdentifierSetDataIdentifierRefsDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public DataIdentifierRef createDiagnosticDataChangeTriggerDataIdentifierRef() {
		return new DataIdentifierRef();
	}

	public DtcSettingClassRef createDiagnosticControlDtcSettingDtcSettingClassRef() {
		return new DtcSettingClassRef();
	}

	public EcuInstanceRef createDiagnosticContributionSetEcuInstanceRefsEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public DiagnosticConnectionRef createDiagnosticConnectionRefConditionalDiagnosticConnectionRef() {
		return new DiagnosticConnectionRef();
	}

	public PhysicalRequestRef createDiagnosticConnectionPhysicalRequestRef() {
		return new PhysicalRequestRef();
	}

	public ResponseOnEventRef createDiagnosticConnectionResponseOnEventRef() {
		return new ResponseOnEventRef();
	}

	public ResponseRef createDiagnosticConnectionResponseRef() {
		return new ResponseRef();
	}

	public PeriodicResponseUudtRef createDiagnosticConnectionPeriodicResponseUudtRefsPeriodicResponseUudtRef() {
		return new PeriodicResponseUudtRef();
	}

	public FunctionalRequestRef createDiagnosticConnectionFunctionalRequestRefsFunctionalRequestRef() {
		return new FunctionalRequestRef();
	}

	public HealingCycleRef createDiagnosticConnectedIndicatorHealingCycleRef() {
		return new HealingCycleRef();
	}

	public IndicatorRef createDiagnosticConnectedIndicatorIndicatorRef() {
		return new IndicatorRef();
	}

	public DiagnosticCommonElementRef createDiagnosticCommonElementRefConditionalDiagnosticCommonElementRef() {
		return new DiagnosticCommonElementRef();
	}

	public SubNodeChannelRef createDiagnosticComControlSubNodeChannelSubNodeChannelRef() {
		return new SubNodeChannelRef();
	}

	public SpecificChannelRef createDiagnosticComControlSpecificChannelSpecificChannelRef() {
		return new SpecificChannelRef();
	}

	public AllChannelsRef createDiagnosticComControlClassAllChannelsRefsAllChannelsRef() {
		return new AllChannelsRef();
	}

	public ComControlClassRef createDiagnosticComControlComControlClassRef() {
		return new ComControlClassRef();
	}

	public ClearDiagnosticInformationClassRef createDiagnosticClearDiagnosticInformationClearDiagnosticInformationClassRef() {
		return new ClearDiagnosticInformationClassRef();
	}

	public SecurityLevelRef createDiagnosticAccessPermissionSecurityLevelRefsSecurityLevelRef() {
		return new SecurityLevelRef();
	}

	public DiagnosticSessionRef createDiagnosticAccessPermissionDiagnosticSessionRefsDiagnosticSessionRef() {
		return new DiagnosticSessionRef();
	}

	public InnerPortIref createDelegationSwConnectorInnerPortIref() {
		return new InnerPortIref();
	}

	public OuterPortRef createDelegationSwConnectorOuterPortRef() {
		return new OuterPortRef();
	}

	public EventSourceRef createDataWriteCompletedEventEventSourceRef() {
		return new EventSourceRef();
	}

	public ApplicationDataTypeRef createDataTypeMapApplicationDataTypeRef() {
		return new ApplicationDataTypeRef();
	}

	public ImplementationDataTypeRef createDataTypeMapImplementationDataTypeRef() {
		return new ImplementationDataTypeRef();
	}

	public DataTransformationRef createDataTransformationRefConditionalDataTransformationRef() {
		return new DataTransformationRef();
	}

	public TransformerChainRef createDataTransformationTransformerChainRefsTransformerChainRef() {
		return new TransformerChainRef();
	}

	public EventSourceRef createDataSendCompletedEventEventSourceRef() {
		return new EventSourceRef();
	}

	public FirstDataPrototypeRef createDataPrototypeMappingFirstDataPrototypeRef() {
		return new FirstDataPrototypeRef();
	}

	public FirstToSecondDataTransformationRef createDataPrototypeMappingFirstToSecondDataTransformationRef() {
		return new FirstToSecondDataTransformationRef();
	}

	public SecondDataPrototypeRef createDataPrototypeMappingSecondDataPrototypeRef() {
		return new SecondDataPrototypeRef();
	}

	public ContextRootCompositionRef createDataPrototypeInSystemInstanceRefContextRootCompositionRef() {
		return new ContextRootCompositionRef();
	}

	public ContextComponentRef createDataPrototypeInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public ContextPortRef createDataPrototypeInSystemInstanceRefContextPortRef() {
		return new ContextPortRef();
	}

	public ContextDataPrototypeRef createDataPrototypeInSystemInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataPrototypeRef createDataPrototypeInSystemInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public PredecessorFifoRef createCouplingPortShaperPredecessorFifoRef() {
		return new PredecessorFifoRef();
	}

	public PredecessorRef createCouplingPortSchedulerPredecessorRefsPredecessorRef() {
		return new PredecessorRef();
	}

	public CouplingPortStructuralElements createCouplingPortDetailsCouplingPortStructuralElements() {
		return new CouplingPortStructuralElements();
	}

	public LastEgressSchedulerRef createCouplingPortDetailsLastEgressSchedulerRef() {
		return new LastEgressSchedulerRef();
	}

	public FirstPortRef createCouplingPortConnectionFirstPortRef() {
		return new FirstPortRef();
	}

	public SecondPortRef createCouplingPortConnectionSecondPortRef() {
		return new SecondPortRef();
	}

	public DefaultVlanRef createCouplingPortDefaultVlanRef() {
		return new DefaultVlanRef();
	}

	public VlanModifierRef createCouplingPortVlanModifierRef() {
		return new VlanModifierRef();
	}

	public MacMulticastAddressRef createCouplingPortMacMulticastAddressRefsMacMulticastAddressRef() {
		return new MacMulticastAddressRef();
	}

	public CommunicationClusterRef createCouplingElementCommunicationClusterRef() {
		return new CommunicationClusterRef();
	}

	public EcuInstanceRef createCouplingElementEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public ContainedPduTriggeringRef createContainerIPduContainedPduTriggeringRefsContainedPduTriggeringRef() {
		return new ContainedPduTriggeringRef();
	}

	public ProvidedServiceInstanceRef createConsumedServiceInstanceProvidedServiceInstanceRef() {
		return new ProvidedServiceInstanceRef();
	}

	public ApplicationEndpointRef createConsumedEventGroupApplicationEndpointRef() {
		return new ApplicationEndpointRef();
	}

	public RoutingGroupRef createConsumedEventGroupRoutingGroupRefsRoutingGroupRef() {
		return new RoutingGroupRef();
	}

	public ApplConstantRef createConstantSpecificationMappingApplConstantRef() {
		return new ApplConstantRef();
	}

	public ImplConstantRef createConstantSpecificationMappingImplConstantRef() {
		return new ImplConstantRef();
	}

	public ValueSpec createConstantSpecificationValueSpec() {
		return new ValueSpec();
	}

	public ConstantRef createConstantReferenceConstantRef() {
		return new ConstantRef();
	}

	public CompuScalesElement createCompuScalesCompuScalesElement() {
		return new CompuScalesElement();
	}

	public UnitRef createCompuMethodUnitRef() {
		return new UnitRef();
	}

	public Connectors createCompositionSwComponentTypeConnectors() {
		return new Connectors();
	}

	public DataTypeMappingRef createCompositionSwComponentTypeDataTypeMappingRefsDataTypeMappingRef() {
		return new DataTypeMappingRef();
	}

	public ConstantValueMappingRef createCompositionSwComponentTypeConstantValueMappingRefsConstantValueMappingRef() {
		return new ConstantValueMappingRef();
	}

	public ContextCompositionRef createComponentInSystemInstanceRefContextCompositionRef() {
		return new ContextCompositionRef();
	}

	public ContextComponentRef createComponentInSystemInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public TargetComponentRef createComponentInSystemInstanceRefTargetComponentRef() {
		return new TargetComponentRef();
	}

	public ContextComponentRef createComponentInCompositionInstanceRefContextComponentRef() {
		return new ContextComponentRef();
	}

	public TargetComponentRef createComponentInCompositionInstanceRefTargetComponentRef() {
		return new TargetComponentRef();
	}

	public HardwareElementRef createComplexDeviceDriverSwComponentTypeHardwareElementRefsHardwareElementRef() {
		return new HardwareElementRef();
	}

	public CommunicationControllerRef createCommunicationControllerMappingCommunicationControllerRef() {
		return new CommunicationControllerRef();
	}

	public HwCommunicationControllerRef createCommunicationControllerMappingHwCommunicationControllerRef() {
		return new HwCommunicationControllerRef();
	}

	public CommunicationConnectorRef createCommunicationConnectorRefConditionalCommunicationConnectorRef() {
		return new CommunicationConnectorRef();
	}

	public SourceElementRef createCollectionSourceElementRefsSourceElementRef() {
		return new SourceElementRef();
	}

	public ElementRef createCollectionElementRefsElementRef() {
		return new ElementRef();
	}

	public CallbackHeaderRef createCodeCallbackHeaderRefsCallbackHeaderRef() {
		return new CallbackHeaderRef();
	}

	public CallSignalRef createClientServerToSignalMappingCallSignalRef() {
		return new CallSignalRef();
	}

	public ReturnSignalRef createClientServerToSignalMappingReturnSignalRef() {
		return new ReturnSignalRef();
	}

	public SerializerRef createClientServerToSignalMappingSerializerRef() {
		return new SerializerRef();
	}

	public CompositeTypeMappings createClientServerToSignalGroupMappingCompositeTypeMappings() {
		return new CompositeTypeMappings();
	}

	public RequestGroupRef createClientServerToSignalGroupMappingRequestGroupRef() {
		return new RequestGroupRef();
	}

	public ResponseGroupRef createClientServerToSignalGroupMappingResponseGroupRef() {
		return new ResponseGroupRef();
	}

	public ArgumentRef createClientServerRecordTypeMappingArgumentRef() {
		return new ArgumentRef();
	}

	public ApplicationRecordElementRef createClientServerRecordElementMappingApplicationRecordElementRef() {
		return new ApplicationRecordElementRef();
	}

	public ComplexTypeMapping createClientServerRecordElementMappingComplexTypeMapping() {
		return new ComplexTypeMapping();
	}

	public ImplementationRecordElementRef createClientServerRecordElementMappingImplementationRecordElementRef() {
		return new ImplementationRecordElementRef();
	}

	public SystemSignalRef createClientServerRecordElementMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public ArgumentRef createClientServerPrimitiveTypeMappingArgumentRef() {
		return new ArgumentRef();
	}

	public SystemSignalRef createClientServerPrimitiveTypeMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public FirstOperationRef createClientServerOperationMappingFirstOperationRef() {
		return new FirstOperationRef();
	}

	public SecondOperationRef createClientServerOperationMappingSecondOperationRef() {
		return new SecondOperationRef();
	}

	public PossibleErrorRef createClientServerOperationPossibleErrorRefsPossibleErrorRef() {
		return new PossibleErrorRef();
	}

	public ComplexTypeMapping createClientServerArrayElementMappingComplexTypeMapping() {
		return new ComplexTypeMapping();
	}

	public SystemSignalRef createClientServerArrayElementMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public FirstApplicationErrorRef createClientServerApplicationErrorMappingFirstApplicationErrorRef() {
		return new FirstApplicationErrorRef();
	}

	public SecondApplicationErrorRef createClientServerApplicationErrorMappingSecondApplicationErrorRef() {
		return new SecondApplicationErrorRef();
	}

	public OperationRef createClientServerAnnotationOperationRef() {
		return new OperationRef();
	}

	public SystemSignalRef createClientIdMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public OperationRef createClientComSpecOperationRef() {
		return new OperationRef();
	}

	public TransformationComSpecPropss createClientComSpecTransformationComSpecPropss() {
		return new TransformationComSpecPropss();
	}

	public ConnectorRef createCanTpNodeConnectorRef() {
		return new ConnectorRef();
	}

	public TpAddressRef createCanTpNodeTpAddressRef() {
		return new TpAddressRef();
	}

	public EcuInstanceRef createCanTpEcuEcuInstanceRef() {
		return new EcuInstanceRef();
	}

	public CanTpChannelRef createCanTpConnectionCanTpChannelRef() {
		return new CanTpChannelRef();
	}

	public DataPduRef createCanTpConnectionDataPduRef() {
		return new DataPduRef();
	}

	public FlowControlPduRef createCanTpConnectionFlowControlPduRef() {
		return new FlowControlPduRef();
	}

	public MulticastRef createCanTpConnectionMulticastRef() {
		return new MulticastRef();
	}

	public TpSduRef createCanTpConnectionTpSduRef() {
		return new TpSduRef();
	}

	public TransmitterRef createCanTpConnectionTransmitterRef() {
		return new TransmitterRef();
	}

	public ReceiverRef createCanTpConnectionReceiverRefsReceiverRef() {
		return new ReceiverRef();
	}

	public CoupledClusterRef createCanNmClusterCouplingCoupledClusterRefsCoupledClusterRef() {
		return new CoupledClusterRef();
	}

	public ApplInitValue createCalibrationParameterValueApplInitValue() {
		return new ApplInitValue();
	}

	public ImplInitValue createCalibrationParameterValueImplInitValue() {
		return new ImplInitValue();
	}

	public InitializedParameterRef createCalibrationParameterValueInitializedParameterRef() {
		return new InitializedParameterRef();
	}

	public BuildActionManifestRef createBuildActionManifestRefConditionalBuildActionManifestRef() {
		return new BuildActionManifestRef();
	}

	public DynamicActionRef createBuildActionManifestDynamicActionRefsDynamicActionRef() {
		return new DynamicActionRef();
	}

	public TearDownActionRef createBuildActionManifestTearDownActionRefsTearDownActionRef() {
		return new TearDownActionRef();
	}

	public StartActionRef createBuildActionManifestStartActionRefsStartActionRef() {
		return new StartActionRef();
	}

	public EcucDefinitionRef createBuildActionIoElementEcucDefinitionRef() {
		return new EcucDefinitionRef();
	}

	public RequiredEnvironmentRef createBuildActionRequiredEnvironmentRef() {
		return new RequiredEnvironmentRef();
	}

	public FollowUpActionRef createBuildActionFollowUpActionRefsFollowUpActionRef() {
		return new FollowUpActionRef();
	}

	public PredecessorActionRef createBuildActionPredecessorActionRefsPredecessorActionRef() {
		return new PredecessorActionRef();
	}

	public AccessedVariableRef createBswVariableAccessAccessedVariableRef() {
		return new AccessedVariableRef();
	}

	public ContextLimitationRef createBswVariableAccessContextLimitationRefsContextLimitationRef() {
		return new ContextLimitationRef();
	}

	public MasteredTriggerRef createBswTriggerDirectImplementationMasteredTriggerRef() {
		return new MasteredTriggerRef();
	}

	public StartsOnEventRef createBswTimingEventStartsOnEventRef() {
		return new StartsOnEventRef();
	}

	public ContextLimitationRef createBswTimingEventContextLimitationRefsContextLimitationRef() {
		return new ContextLimitationRef();
	}

	public CalledEntryRef createBswSynchronousServerCallPointCalledEntryRef() {
		return new CalledEntryRef();
	}

	public CalledFromWithinExclusiveAreaRef createBswSynchronousServerCallPointCalledFromWithinExclusiveAreaRef() {
		return new CalledFromWithinExclusiveAreaRef();
	}

	public ContextLimitationRef createBswSynchronousServerCallPointContextLimitationRefsContextLimitationRef() {
		return new ContextLimitationRef();
	}

	public ServiceNeeds createBswServiceDependencyServiceNeeds() {
		return new ServiceNeeds();
	}

	public CallPoints createBswSchedulableEntityCallPoints() {
		return new CallPoints();
	}

	public ImplementedEntryRef createBswSchedulableEntityImplementedEntryRef() {
		return new ImplementedEntryRef();
	}

	public SchedulerNamePrefixRef createBswSchedulableEntitySchedulerNamePrefixRef() {
		return new SchedulerNamePrefixRef();
	}

	public ReleasedTriggerRef createBswReleasedTriggerPolicyReleasedTriggerRef() {
		return new ReleasedTriggerRef();
	}

	public ReceivedDataRef createBswQueuedDataReceptionPolicyReceivedDataRef() {
		return new ReceivedDataRef();
	}

	public ArTypedPerInstanceMemoryRef createBswPerInstanceMemoryPolicyArTypedPerInstanceMemoryRef() {
		return new ArTypedPerInstanceMemoryRef();
	}

	public PerInstanceParameterRef createBswParameterPolicyPerInstanceParameterRef() {
		return new PerInstanceParameterRef();
	}

	public EntryRef createBswOperationInvokedEventEntryRef() {
		return new EntryRef();
	}

	public BehaviorRef createBswModuleTimingBehaviorRef() {
		return new BehaviorRef();
	}

	public BswModuleEntryRef createBswModuleEntryRefConditionalBswModuleEntryRef() {
		return new BswModuleEntryRef();
	}

	public BswModuleDescriptionRef createBswModuleDescriptionRefConditionalBswModuleDescriptionRef() {
		return new BswModuleDescriptionRef();
	}

	public ServiceItems createBswModuleDependencyServiceItems() {
		return new ServiceItems();
	}

	public EncapsulatedEntryRef createBswModuleClientServerEntryEncapsulatedEntryRef() {
		return new EncapsulatedEntryRef();
	}

	public ModeGroupRef createBswModeSwitchedAckEventModeGroupRef() {
		return new ModeGroupRef();
	}

	public ProvidedModeGroupRef createBswModeSenderPolicyProvidedModeGroupRef() {
		return new ProvidedModeGroupRef();
	}

	public RequiredModeGroupRef createBswModeReceiverPolicyRequiredModeGroupRef() {
		return new RequiredModeGroupRef();
	}

	public ModeGroupRef createBswModeManagerErrorEventModeGroupRef() {
		return new ModeGroupRef();
	}

	public BswInternalTriggeringPointRef createBswInternalTriggeringPointRefConditionalBswInternalTriggeringPointRef() {
		return new BswInternalTriggeringPointRef();
	}

	public BswInternalTriggeringPointRef createBswInternalTriggeringPointPolicyBswInternalTriggeringPointRef() {
		return new BswInternalTriggeringPointRef();
	}

	public EventSourceRef createBswInternalTriggerOccurredEventEventSourceRef() {
		return new EventSourceRef();
	}

	public Entitys createBswInternalBehaviorEntitys() {
		return new Entitys();
	}

	public Events createBswInternalBehaviorEvents() {
		return new Events();
	}

	public BehaviorRef createBswImplementationBehaviorRef() {
		return new BehaviorRef();
	}

	public VendorSpecificModuleDefRef createBswImplementationVendorSpecificModuleDefRefsVendorSpecificModuleDefRef() {
		return new VendorSpecificModuleDefRef();
	}

	public RecommendedConfigurationRef createBswImplementationRecommendedConfigurationRefsRecommendedConfigurationRef() {
		return new RecommendedConfigurationRef();
	}

	public PreconfiguredConfigurationRef createBswImplementationPreconfiguredConfigurationRefsPreconfiguredConfigurationRef() {
		return new PreconfiguredConfigurationRef();
	}

	public TriggerRef createBswExternalTriggerOccurredEventTriggerRef() {
		return new TriggerRef();
	}

	public ExclusiveAreaRef createBswExclusiveAreaPolicyExclusiveAreaRef() {
		return new ExclusiveAreaRef();
	}

	public CalledEntryRef createBswDirectCallPointCalledEntryRef() {
		return new CalledEntryRef();
	}

	public CalledFromWithinExclusiveAreaRef createBswDirectCallPointCalledFromWithinExclusiveAreaRef() {
		return new CalledFromWithinExclusiveAreaRef();
	}

	public VariableAccessedForDebugRef createBswDebugInfoVariableAccessedForDebugRefsVariableAccessedForDebugRef() {
		return new VariableAccessedForDebugRef();
	}

	public ParameterAccessedForDebugRef createBswDebugInfoParameterAccessedForDebugRefsParameterAccessedForDebugRef() {
		return new ParameterAccessedForDebugRef();
	}

	public ProviedeDataRef createBswDataSendPolicyProviedeDataRef() {
		return new ProviedeDataRef();
	}

	public DataRef createBswDataReceivedEventDataRef() {
		return new DataRef();
	}

	public RequiredClientServerEntryRef createBswClientPolicyRequiredClientServerEntryRef() {
		return new RequiredClientServerEntryRef();
	}

	public EventSourceRef createBswAsynchronousServerCallReturnsEventEventSourceRef() {
		return new EventSourceRef();
	}

	public AsynchronousServerCallPointRef createBswAsynchronousServerCallResultPointAsynchronousServerCallPointRef() {
		return new AsynchronousServerCallPointRef();
	}

	public CalledEntryRef createBswAsynchronousServerCallPointCalledEntryRef() {
		return new CalledEntryRef();
	}

	public BlueprintMaps createBlueprintMappingSetBlueprintMaps() {
		return new BlueprintMaps();
	}

	public BlueprintRef createBlueprintMappingBlueprintRef() {
		return new BlueprintRef();
	}

	public DerivedObjectRef createBlueprintMappingDerivedObjectRef() {
		return new DerivedObjectRef();
	}

	public EcucQueryRef createBlueprintFormulaEcucQueryRef() {
		return new EcucQueryRef();
	}

	public EcucRef createBlueprintFormulaEcucRef() {
		return new EcucRef();
	}

	public LocalVariableRef createAutosarVariableRefLocalVariableRef() {
		return new LocalVariableRef();
	}

	public LocalParameterRef createAutosarParameterRefLocalParameterRef() {
		return new LocalParameterRef();
	}

	public AutosarDataTypeRef createAutosarDataTypeRefConditionalAutosarDataTypeRef() {
		return new AutosarDataTypeRef();
	}

	public EventSourceRef createAsynchronousServerCallReturnsEventEventSourceRef() {
		return new EventSourceRef();
	}

	public AsynchronousServerCallPointRef createAsynchronousServerCallResultPointAsynchronousServerCallPointRef() {
		return new AsynchronousServerCallPointRef();
	}

	public AssignedFrameTriggeringRef createAssignFrameIdAssignedFrameTriggeringRef() {
		return new AssignedFrameTriggeringRef();
	}

	public Elements createArrayValueSpecificationElements() {
		return new Elements();
	}

	public PortPrototypeRef createArVariableInImplementationDataInstanceRefPortPrototypeRef() {
		return new PortPrototypeRef();
	}

	public RootVariableDataPrototypeRef createArVariableInImplementationDataInstanceRefRootVariableDataPrototypeRef() {
		return new RootVariableDataPrototypeRef();
	}

	public TargetDataPrototypeRef createArVariableInImplementationDataInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public ContextDataPrototypeRef createArVariableInImplementationDataInstanceRefContextDataPrototypeRefsContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TypeTref createApplicationRecordElementTypeTref() {
		return new TypeTref();
	}

	public SystemSignalRef createApplicationErrorMappingSystemSignalRef() {
		return new SystemSignalRef();
	}

	public FrameTriggeringRef createApplicationEntryFrameTriggeringRef() {
		return new FrameTriggeringRef();
	}

	public NetworkEndpointRef createApplicationEndpointNetworkEndpointRef() {
		return new NetworkEndpointRef();
	}

	public SerializationTechnologyRef createApplicationEndpointSerializationTechnologyRef() {
		return new SerializationTechnologyRef();
	}

	public TpConfiguration createApplicationEndpointTpConfiguration() {
		return new TpConfiguration();
	}

	public RootDataPrototypeRef createApplicationCompositeElementInPortInterfaceInstanceRefRootDataPrototypeRef() {
		return new RootDataPrototypeRef();
	}

	public ContextDataPrototypeRef createApplicationCompositeElementInPortInterfaceInstanceRefContextDataPrototypeRef() {
		return new ContextDataPrototypeRef();
	}

	public TargetDataPrototypeRef createApplicationCompositeElementInPortInterfaceInstanceRefTargetDataPrototypeRef() {
		return new TargetDataPrototypeRef();
	}

	public ContextElementRef createAnyInstanceRefContextElementRef() {
		return new ContextElementRef();
	}

	public TargetRef createAnyInstanceRefTargetRef() {
		return new TargetRef();
	}

	public IdentifiableRef createAliasNameAssignmentIdentifiableRef() {
		return new IdentifiableRef();
	}

	public FlatInstanceRef createAliasNameAssignmentFlatInstanceRef() {
		return new FlatInstanceRef();
	}

	public ScopeRef createAgeConstraintScopeRef() {
		return new ScopeRef();
	}

	public AclRoleRef createAclPermissionAclRoleRefsAclRoleRef() {
		return new AclRoleRef();
	}

	public AclOperationRef createAclPermissionAclOperationRefsAclOperationRef() {
		return new AclOperationRef();
	}

	public AclObjectRef createAclPermissionAclObjectRefsAclObjectRef() {
		return new AclObjectRef();
	}

	public ImpliedOperationRef createAclOperationImpliedOperationRefsImpliedOperationRef() {
		return new ImpliedOperationRef();
	}

	public CollectionRef createAclObjectSetCollectionRef() {
		return new CollectionRef();
	}

	public ObjectRef createAclObjectSetObjectRefsObjectRef() {
		return new ObjectRef();
	}

	public ObjectDefintionRef createAclObjectSetObjectDefintionRefsObjectDefintionRef() {
		return new ObjectDefintionRef();
	}

	public ObjectDefinitionRef createAclObjectSetObjectDefinitionRefsObjectDefinitionRef() {
		return new ObjectDefinitionRef();
	}

	public DerivedFromBlueprintRef createAclObjectSetDerivedFromBlueprintRefsDerivedFromBlueprintRef() {
		return new DerivedFromBlueprintRef();
	}

	public Elements createArPackageElements() {
		return new Elements();
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "AUTOSAR")
	public JAXBElement<Autosar> createAutosar(Autosar value) {
		return new JAXBElement<>(_Autosar_QNAME, Autosar.class, null, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = UnlimitedIntegerValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createUnlimitedIntegerValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				UnlimitedIntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = UnlimitedIntegerValueVariationPoint.class)
	public JAXBElement<SyscRef> createUnlimitedIntegerValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				UnlimitedIntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ARGUMENT-REF", scope = TdEventOccurrenceExpressionFormula.class)
	public JAXBElement<ArgumentRef> createTdEventOccurrenceExpressionFormulaArgumentRef(ArgumentRef value) {
		return new JAXBElement<>(_TdEventOccurrenceExpressionFormulaArgumentRef_QNAME, ArgumentRef.class,
				TdEventOccurrenceExpressionFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "EVENT-REF", scope = TdEventOccurrenceExpressionFormula.class)
	public JAXBElement<EventRef> createTdEventOccurrenceExpressionFormulaEventRef(EventRef value) {
		return new JAXBElement<>(_TdEventOccurrenceExpressionFormulaEventRef_QNAME, EventRef.class,
				TdEventOccurrenceExpressionFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "VARIABLE-REF", scope = TdEventOccurrenceExpressionFormula.class)
	public JAXBElement<VariableRef> createTdEventOccurrenceExpressionFormulaVariableRef(VariableRef value) {
		return new JAXBElement<>(_TdEventOccurrenceExpressionFormulaVariableRef_QNAME, VariableRef.class,
				TdEventOccurrenceExpressionFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = SingleLanguageUnitNames.class)
	public JAXBElement<Supscript> createSingleLanguageUnitNamesSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, SingleLanguageUnitNames.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = SingleLanguageUnitNames.class)
	public JAXBElement<Supscript> createSingleLanguageUnitNamesSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, SingleLanguageUnitNames.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = SingleLanguageLongName.class)
	public JAXBElement<Tt> createSingleLanguageLongNameTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, SingleLanguageLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "E", scope = SingleLanguageLongName.class)
	public JAXBElement<EmphasisText> createSingleLanguageLongNameE(EmphasisText value) {
		return new JAXBElement<>(_SingleLanguageLongNameE_QNAME, EmphasisText.class, SingleLanguageLongName.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = SingleLanguageLongName.class)
	public JAXBElement<Supscript> createSingleLanguageLongNameSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, SingleLanguageLongName.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = SingleLanguageLongName.class)
	public JAXBElement<Supscript> createSingleLanguageLongNameSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, SingleLanguageLongName.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "IE", scope = SingleLanguageLongName.class)
	public JAXBElement<IndexEntry> createSingleLanguageLongNameIe(IndexEntry value) {
		return new JAXBElement<>(_SingleLanguageLongNameIe_QNAME, IndexEntry.class, SingleLanguageLongName.class,
				value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = PositiveIntegerValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createPositiveIntegerValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				PositiveIntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = PositiveIntegerValueVariationPoint.class)
	public JAXBElement<SyscRef> createPositiveIntegerValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				PositiveIntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = NumericalValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createNumericalValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				NumericalValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = NumericalValueVariationPoint.class)
	public JAXBElement<SyscRef> createNumericalValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				NumericalValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = Limit.class)
	public JAXBElement<SyscStringRef> createLimitSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				Limit.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = Limit.class)
	public JAXBElement<SyscRef> createLimitSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class, Limit.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = LVerbatim.class)
	public JAXBElement<Tt> createLVerbatimTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, LVerbatim.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "E", scope = LVerbatim.class)
	public JAXBElement<EmphasisText> createLVerbatimE(EmphasisText value) {
		return new JAXBElement<>(_SingleLanguageLongNameE_QNAME, EmphasisText.class, LVerbatim.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XREF", scope = LVerbatim.class)
	public JAXBElement<Xref> createLVerbatimXref(Xref value) {
		return new JAXBElement<>(_LVerbatimXref_QNAME, Xref.class, LVerbatim.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "BR", scope = LVerbatim.class)
	public JAXBElement<Br> createLVerbatimBr(Br value) {
		return new JAXBElement<>(_LVerbatimBr_QNAME, Br.class, LVerbatim.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "FT", scope = LParagraph.class)
	public JAXBElement<LParagraph> createLParagraphFt(LParagraph value) {
		return new JAXBElement<>(_LParagraphFt_QNAME, LParagraph.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TRACE-REF", scope = LParagraph.class)
	public JAXBElement<TraceRef> createLParagraphTraceRef(TraceRef value) {
		return new JAXBElement<>(_LParagraphTraceRef_QNAME, TraceRef.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = LParagraph.class)
	public JAXBElement<Tt> createLParagraphTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "BR", scope = LParagraph.class)
	public JAXBElement<Br> createLParagraphBr(Br value) {
		return new JAXBElement<>(_LVerbatimBr_QNAME, Br.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XREF", scope = LParagraph.class)
	public JAXBElement<Xref> createLParagraphXref(Xref value) {
		return new JAXBElement<>(_LVerbatimXref_QNAME, Xref.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XREF-TARGET", scope = LParagraph.class)
	public JAXBElement<XrefTarget> createLParagraphXrefTarget(XrefTarget value) {
		return new JAXBElement<>(_LParagraphXrefTarget_QNAME, XrefTarget.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "E", scope = LParagraph.class)
	public JAXBElement<EmphasisText> createLParagraphE(EmphasisText value) {
		return new JAXBElement<>(_SingleLanguageLongNameE_QNAME, EmphasisText.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = LParagraph.class)
	public JAXBElement<Supscript> createLParagraphSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = LParagraph.class)
	public JAXBElement<Supscript> createLParagraphSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "IE", scope = LParagraph.class)
	public JAXBElement<IndexEntry> createLParagraphIe(IndexEntry value) {
		return new JAXBElement<>(_SingleLanguageLongNameIe_QNAME, IndexEntry.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "STD", scope = LParagraph.class)
	public JAXBElement<Std> createLParagraphStd(Std value) {
		return new JAXBElement<>(_LParagraphStd_QNAME, Std.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XDOC", scope = LParagraph.class)
	public JAXBElement<Xdoc> createLParagraphXdoc(Xdoc value) {
		return new JAXBElement<>(_LParagraphXdoc_QNAME, Xdoc.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XFILE", scope = LParagraph.class)
	public JAXBElement<Xfile> createLParagraphXfile(Xfile value) {
		return new JAXBElement<>(_LParagraphXfile_QNAME, Xfile.class, LParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "BR", scope = LOverviewParagraph.class)
	public JAXBElement<Br> createLOverviewParagraphBr(Br value) {
		return new JAXBElement<>(_LVerbatimBr_QNAME, Br.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "FT", scope = LOverviewParagraph.class)
	public JAXBElement<LOverviewParagraph> createLOverviewParagraphFt(LOverviewParagraph value) {
		return new JAXBElement<>(_LParagraphFt_QNAME, LOverviewParagraph.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TRACE-REF", scope = LOverviewParagraph.class)
	public JAXBElement<TraceRef> createLOverviewParagraphTraceRef(TraceRef value) {
		return new JAXBElement<>(_LParagraphTraceRef_QNAME, TraceRef.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = LOverviewParagraph.class)
	public JAXBElement<Tt> createLOverviewParagraphTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XREF", scope = LOverviewParagraph.class)
	public JAXBElement<Xref> createLOverviewParagraphXref(Xref value) {
		return new JAXBElement<>(_LVerbatimXref_QNAME, Xref.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "XREF-TARGET", scope = LOverviewParagraph.class)
	public JAXBElement<XrefTarget> createLOverviewParagraphXrefTarget(XrefTarget value) {
		return new JAXBElement<>(_LParagraphXrefTarget_QNAME, XrefTarget.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "E", scope = LOverviewParagraph.class)
	public JAXBElement<EmphasisText> createLOverviewParagraphE(EmphasisText value) {
		return new JAXBElement<>(_SingleLanguageLongNameE_QNAME, EmphasisText.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = LOverviewParagraph.class)
	public JAXBElement<Supscript> createLOverviewParagraphSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = LOverviewParagraph.class)
	public JAXBElement<Supscript> createLOverviewParagraphSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "IE", scope = LOverviewParagraph.class)
	public JAXBElement<IndexEntry> createLOverviewParagraphIe(IndexEntry value) {
		return new JAXBElement<>(_SingleLanguageLongNameIe_QNAME, IndexEntry.class, LOverviewParagraph.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = LLongName.class)
	public JAXBElement<Tt> createLLongNameTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, LLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "E", scope = LLongName.class)
	public JAXBElement<EmphasisText> createLLongNameE(EmphasisText value) {
		return new JAXBElement<>(_SingleLanguageLongNameE_QNAME, EmphasisText.class, LLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = LLongName.class)
	public JAXBElement<Supscript> createLLongNameSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, LLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = LLongName.class)
	public JAXBElement<Supscript> createLLongNameSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, LLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "IE", scope = LLongName.class)
	public JAXBElement<IndexEntry> createLLongNameIe(IndexEntry value) {
		return new JAXBElement<>(_SingleLanguageLongNameIe_QNAME, IndexEntry.class, LLongName.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = IntegerValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createIntegerValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				IntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = IntegerValueVariationPoint.class)
	public JAXBElement<SyscRef> createIntegerValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				IntegerValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = IndexEntry.class)
	public JAXBElement<Supscript> createIndexEntrySup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, IndexEntry.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = IndexEntry.class)
	public JAXBElement<Supscript> createIndexEntrySub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, IndexEntry.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = FloatValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createFloatValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				FloatValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = FloatValueVariationPoint.class)
	public JAXBElement<SyscRef> createFloatValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				FloatValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = FmConditionByFeaturesAndSwSystemconsts.class)
	public JAXBElement<SyscStringRef> createFmConditionByFeaturesAndSwSystemconstsSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				FmConditionByFeaturesAndSwSystemconsts.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = FmConditionByFeaturesAndSwSystemconsts.class)
	public JAXBElement<SyscRef> createFmConditionByFeaturesAndSwSystemconstsSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				FmConditionByFeaturesAndSwSystemconsts.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "FEATURE-REF", scope = FmConditionByFeaturesAndSwSystemconsts.class)
	public JAXBElement<FeatureRef> createFmConditionByFeaturesAndSwSystemconstsFeatureRef(FeatureRef value) {
		return new JAXBElement<>(_FmConditionByFeaturesAndSwSystemconstsFeatureRef_QNAME, FeatureRef.class,
				FmConditionByFeaturesAndSwSystemconsts.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ATTRIBUTE-REF", scope = FmConditionByFeaturesAndAttributes.class)
	public JAXBElement<AttributeRef> createFmConditionByFeaturesAndAttributesAttributeRef(AttributeRef value) {
		return new JAXBElement<>(_FmConditionByFeaturesAndAttributesAttributeRef_QNAME, AttributeRef.class,
				FmConditionByFeaturesAndAttributes.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "FEATURE-REF", scope = FmConditionByFeaturesAndAttributes.class)
	public JAXBElement<FeatureRef> createFmConditionByFeaturesAndAttributesFeatureRef(FeatureRef value) {
		return new JAXBElement<>(_FmConditionByFeaturesAndSwSystemconstsFeatureRef_QNAME, FeatureRef.class,
				FmConditionByFeaturesAndAttributes.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUB", scope = EmphasisText.class)
	public JAXBElement<Supscript> createEmphasisTextSub(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSub_QNAME, Supscript.class, EmphasisText.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SUP", scope = EmphasisText.class)
	public JAXBElement<Supscript> createEmphasisTextSup(Supscript value) {
		return new JAXBElement<>(_SingleLanguageUnitNamesSup_QNAME, Supscript.class, EmphasisText.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "TT", scope = EmphasisText.class)
	public JAXBElement<Tt> createEmphasisTextTt(Tt value) {
		return new JAXBElement<>(_SingleLanguageLongNameTt_QNAME, Tt.class, EmphasisText.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "CONFIG-ELEMENT-DEF-GLOBAL-REF", scope = EcucQueryExpression.class)
	public JAXBElement<ConfigElementDefGlobalRef> createEcucQueryExpressionConfigElementDefGlobalRef(
			ConfigElementDefGlobalRef value) {
		return new JAXBElement<>(_EcucQueryExpressionConfigElementDefGlobalRef_QNAME, ConfigElementDefGlobalRef.class,
				EcucQueryExpression.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "CONFIG-ELEMENT-DEF-LOCAL-REF", scope = EcucQueryExpression.class)
	public JAXBElement<ConfigElementDefLocalRef> createEcucQueryExpressionConfigElementDefLocalRef(
			ConfigElementDefLocalRef value) {
		return new JAXBElement<>(_EcucQueryExpressionConfigElementDefLocalRef_QNAME, ConfigElementDefLocalRef.class,
				EcucQueryExpression.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-QUERY-REF", scope = EcucParameterDerivationFormula.class)
	public JAXBElement<EcucQueryRef> createEcucParameterDerivationFormulaEcucQueryRef(EcucQueryRef value) {
		return new JAXBElement<>(_EcucParameterDerivationFormulaEcucQueryRef_QNAME, EcucQueryRef.class,
				EcucParameterDerivationFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-QUERY-STRING-REF", scope = EcucParameterDerivationFormula.class)
	public JAXBElement<EcucQueryStringRef> createEcucParameterDerivationFormulaEcucQueryStringRef(
			EcucQueryStringRef value) {
		return new JAXBElement<>(_EcucParameterDerivationFormulaEcucQueryStringRef_QNAME, EcucQueryStringRef.class,
				EcucParameterDerivationFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-QUERY-REF", scope = EcucConditionFormula.class)
	public JAXBElement<EcucQueryRef> createEcucConditionFormulaEcucQueryRef(EcucQueryRef value) {
		return new JAXBElement<>(_EcucParameterDerivationFormulaEcucQueryRef_QNAME, EcucQueryRef.class,
				EcucConditionFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-QUERY-STRING-REF", scope = EcucConditionFormula.class)
	public JAXBElement<EcucQueryStringRef> createEcucConditionFormulaEcucQueryStringRef(EcucQueryStringRef value) {
		return new JAXBElement<>(_EcucParameterDerivationFormulaEcucQueryStringRef_QNAME, EcucQueryStringRef.class,
				EcucConditionFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = ConditionByFormula.class)
	public JAXBElement<SyscStringRef> createConditionByFormulaSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				ConditionByFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = ConditionByFormula.class)
	public JAXBElement<SyscRef> createConditionByFormulaSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				ConditionByFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = BooleanValueVariationPoint.class)
	public JAXBElement<SyscStringRef> createBooleanValueVariationPointSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				BooleanValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = BooleanValueVariationPoint.class)
	public JAXBElement<SyscRef> createBooleanValueVariationPointSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				BooleanValueVariationPoint.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-STRING-REF", scope = BlueprintFormula.class)
	public JAXBElement<SyscStringRef> createBlueprintFormulaSyscStringRef(SyscStringRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscStringRef_QNAME, SyscStringRef.class,
				BlueprintFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "SYSC-REF", scope = BlueprintFormula.class)
	public JAXBElement<SyscRef> createBlueprintFormulaSyscRef(SyscRef value) {
		return new JAXBElement<>(_UnlimitedIntegerValueVariationPointSyscRef_QNAME, SyscRef.class,
				BlueprintFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-QUERY-REF", scope = BlueprintFormula.class)
	public JAXBElement<EcucQueryRef> createBlueprintFormulaEcucQueryRef(EcucQueryRef value) {
		return new JAXBElement<>(_EcucParameterDerivationFormulaEcucQueryRef_QNAME, EcucQueryRef.class,
				BlueprintFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "ECUC-REF", scope = BlueprintFormula.class)
	public JAXBElement<EcucRef> createBlueprintFormulaEcucRef(EcucRef value) {
		return new JAXBElement<>(_BlueprintFormulaEcucRef_QNAME, EcucRef.class, BlueprintFormula.class, value);
	}

	@XmlElementDecl(namespace = "http://autosar.org/schema/r4.0", name = "VERBATIM", scope = BlueprintFormula.class)
	public JAXBElement<MultiLanguageVerbatim> createBlueprintFormulaVerbatim(MultiLanguageVerbatim value) {
		return new JAXBElement<>(_BlueprintFormulaVerbatim_QNAME, MultiLanguageVerbatim.class, BlueprintFormula.class,
				value);
	}
}
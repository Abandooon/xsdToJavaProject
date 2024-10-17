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
	private static final QName _UnlimitedIntegerValueVariationPointSyscStringRef_QNAME = new QName("http://autosar.org/schema/r4.0", "SYSC-STRING-REF");
	private static final QName _UnlimitedIntegerValueVariationPointSyscRef_QNAME = new QName("http://autosar.org/schema/r4.0", "SYSC-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaArgumentRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ARGUMENT-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaEventRef_QNAME = new QName("http://autosar.org/schema/r4.0", "EVENT-REF");
	private static final QName _TdEventOccurrenceExpressionFormulaVariableRef_QNAME = new QName("http://autosar.org/schema/r4.0", "VARIABLE-REF");
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
	private static final QName _FmConditionByFeaturesAndSwSystemconstsFeatureRef_QNAME = new QName("http://autosar.org/schema/r4.0", "FEATURE-REF");
	private static final QName _FmConditionByFeaturesAndAttributesAttributeRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ATTRIBUTE-REF");
	private static final QName _EcucQueryExpressionConfigElementDefGlobalRef_QNAME = new QName("http://autosar.org/schema/r4.0", "CONFIG-ELEMENT-DEF-GLOBAL-REF");
	private static final QName _EcucQueryExpressionConfigElementDefLocalRef_QNAME = new QName("http://autosar.org/schema/r4.0", "CONFIG-ELEMENT-DEF-LOCAL-REF");
	private static final QName _EcucParameterDerivationFormulaEcucQueryRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ECUC-QUERY-REF");
	private static final QName _EcucParameterDerivationFormulaEcucQueryStringRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ECUC-QUERY-STRING-REF");
	private static final QName _BlueprintFormulaEcucRef_QNAME = new QName("http://autosar.org/schema/r4.0", "ECUC-REF");
	private static final QName _BlueprintFormulaVerbatim_QNAME = new QName("http://autosar.org/schema/r4.0","VERBATIM");

	public ObjectFactory() {
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
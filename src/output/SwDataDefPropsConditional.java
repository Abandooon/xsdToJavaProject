package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwDataDefPropsConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Float stepSize;
    
    
    
    protected Annotations annotations;
    
    
    
    protected SwAddrMethodRef swAddrMethodRef;
    
    
    
    protected AlignmentType swAlignment;
    
    
    
    protected BaseTypeRef baseTypeRef;
    
    
    
    protected SwBitRepresentation swBitRepresentation;
    
    
    
    protected SwCalibrationAccessEnum swCalibrationAccess;
    
    
    
    protected NumericalValueVariationPoint swValueBlockSize;
    
    
    
    protected SwCalprmAxisSet swCalprmAxisSet;
    
    
    
    protected SwTextProps swTextProps;
    
    
    
    protected SwComparisonVariables swComparisonVariables;
    
    
    
    protected CompuMethodRef compuMethodRef;
    
    
    
    protected DataConstrRef dataConstrRef;
    
    
    
    protected SwDataDependency swDataDependency;
    
    
    
    protected DisplayFormatString displayFormat;
    
    
    
    protected ImplementationDataTypeRef implementationDataTypeRef;
    
    
    
    protected SwVariableRefProxy swHostVariable;
    
    
    
    protected SwImplPolicyEnum swImplPolicy;
    
    
    
    protected NativeDeclarationString additionalNativeTypeQualifier;
    
    
    
    protected NumericalValue swIntendedResolution;
    
    
    
    protected Identifier swInterpolationMethod;
    
    
    
    protected InvalidValue invalidValue;
    
    
    
    protected Identifier mcFunction;
    
    
    
    protected Boolean swIsVirtual;
    
    
    
    protected SwPointerTargetProps swPointerTargetProps;
    
    
    
    protected SwRecordLayoutRef swRecordLayoutRef;
    
    
    
    protected MultidimensionalTime swRefreshTiming;
    
    
    
    protected UnitRef unitRef;
    
    
    
    protected ValueAxisDataTypeRef valueAxisDataTypeRef;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="STEP-SIZE")
    public Float getStepSize() {
        return this.stepSize;
    }

    public void setStepSize(Float value) {
        this.stepSize = value;
    }
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="SW-ADDR-METHOD-REF")
    public SwAddrMethodRef getSwAddrMethodRef() {
        return this.swAddrMethodRef;
    }

    public void setSwAddrMethodRef(SwAddrMethodRef value) {
        this.swAddrMethodRef = value;
    }
    
    
    
    @XmlElement(name="SW-ALIGNMENT")
    public AlignmentType getSwAlignment() {
        return this.swAlignment;
    }

    public void setSwAlignment(AlignmentType value) {
        this.swAlignment = value;
    }
    
    
    
    @XmlElement(name="BASE-TYPE-REF")
    public BaseTypeRef getBaseTypeRef() {
        return this.baseTypeRef;
    }

    public void setBaseTypeRef(BaseTypeRef value) {
        this.baseTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-BIT-REPRESENTATION")
    public SwBitRepresentation getSwBitRepresentation() {
        return this.swBitRepresentation;
    }

    public void setSwBitRepresentation(SwBitRepresentation value) {
        this.swBitRepresentation = value;
    }
    
    
    
    @XmlElement(name="SW-CALIBRATION-ACCESS")
    public SwCalibrationAccessEnum getSwCalibrationAccess() {
        return this.swCalibrationAccess;
    }

    public void setSwCalibrationAccess(SwCalibrationAccessEnum value) {
        this.swCalibrationAccess = value;
    }
    
    
    
    @XmlElement(name="SW-VALUE-BLOCK-SIZE")
    public NumericalValueVariationPoint getSwValueBlockSize() {
        return this.swValueBlockSize;
    }

    public void setSwValueBlockSize(NumericalValueVariationPoint value) {
        this.swValueBlockSize = value;
    }
    
    
    
    @XmlElement(name="SW-CALPRM-AXIS-SET")
    public SwCalprmAxisSet getSwCalprmAxisSet() {
        return this.swCalprmAxisSet;
    }

    public void setSwCalprmAxisSet(SwCalprmAxisSet value) {
        this.swCalprmAxisSet = value;
    }
    
    
    
    @XmlElement(name="SW-TEXT-PROPS")
    public SwTextProps getSwTextProps() {
        return this.swTextProps;
    }

    public void setSwTextProps(SwTextProps value) {
        this.swTextProps = value;
    }
    
    
    
    @XmlElement(name="SW-COMPARISON-VARIABLES")
    public SwComparisonVariables getSwComparisonVariables() {
        return this.swComparisonVariables;
    }

    public void setSwComparisonVariables(SwComparisonVariables value) {
        this.swComparisonVariables = value;
    }
    
    
    
    @XmlElement(name="COMPU-METHOD-REF")
    public CompuMethodRef getCompuMethodRef() {
        return this.compuMethodRef;
    }

    public void setCompuMethodRef(CompuMethodRef value) {
        this.compuMethodRef = value;
    }
    
    
    
    @XmlElement(name="DATA-CONSTR-REF")
    public DataConstrRef getDataConstrRef() {
        return this.dataConstrRef;
    }

    public void setDataConstrRef(DataConstrRef value) {
        this.dataConstrRef = value;
    }
    
    
    
    @XmlElement(name="SW-DATA-DEPENDENCY")
    public SwDataDependency getSwDataDependency() {
        return this.swDataDependency;
    }

    public void setSwDataDependency(SwDataDependency value) {
        this.swDataDependency = value;
    }
    
    
    
    @XmlElement(name="DISPLAY-FORMAT")
    public DisplayFormatString getDisplayFormat() {
        return this.displayFormat;
    }

    public void setDisplayFormat(DisplayFormatString value) {
        this.displayFormat = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-REF")
    public ImplementationDataTypeRef getImplementationDataTypeRef() {
        return this.implementationDataTypeRef;
    }

    public void setImplementationDataTypeRef(ImplementationDataTypeRef value) {
        this.implementationDataTypeRef = value;
    }
    
    
    
    @XmlElement(name="SW-HOST-VARIABLE")
    public SwVariableRefProxy getSwHostVariable() {
        return this.swHostVariable;
    }

    public void setSwHostVariable(SwVariableRefProxy value) {
        this.swHostVariable = value;
    }
    
    
    
    @XmlElement(name="SW-IMPL-POLICY")
    public SwImplPolicyEnum getSwImplPolicy() {
        return this.swImplPolicy;
    }

    public void setSwImplPolicy(SwImplPolicyEnum value) {
        this.swImplPolicy = value;
    }
    
    
    
    @XmlElement(name="ADDITIONAL-NATIVE-TYPE-QUALIFIER")
    public NativeDeclarationString getAdditionalNativeTypeQualifier() {
        return this.additionalNativeTypeQualifier;
    }

    public void setAdditionalNativeTypeQualifier(NativeDeclarationString value) {
        this.additionalNativeTypeQualifier = value;
    }
    
    
    
    @XmlElement(name="SW-INTENDED-RESOLUTION")
    public NumericalValue getSwIntendedResolution() {
        return this.swIntendedResolution;
    }

    public void setSwIntendedResolution(NumericalValue value) {
        this.swIntendedResolution = value;
    }
    
    
    
    @XmlElement(name="SW-INTERPOLATION-METHOD")
    public Identifier getSwInterpolationMethod() {
        return this.swInterpolationMethod;
    }

    public void setSwInterpolationMethod(Identifier value) {
        this.swInterpolationMethod = value;
    }
    
    
    
    @XmlElement(name="INVALID-VALUE")
    public InvalidValue getInvalidValue() {
        return this.invalidValue;
    }

    public void setInvalidValue(InvalidValue value) {
        this.invalidValue = value;
    }
    
    
    
    @XmlElement(name="MC-FUNCTION")
    public Identifier getMcFunction() {
        return this.mcFunction;
    }

    public void setMcFunction(Identifier value) {
        this.mcFunction = value;
    }
    
    
    
    @XmlElement(name="SW-IS-VIRTUAL")
    public Boolean getSwIsVirtual() {
        return this.swIsVirtual;
    }

    public void setSwIsVirtual(Boolean value) {
        this.swIsVirtual = value;
    }
    
    
    
    @XmlElement(name="SW-POINTER-TARGET-PROPS")
    public SwPointerTargetProps getSwPointerTargetProps() {
        return this.swPointerTargetProps;
    }

    public void setSwPointerTargetProps(SwPointerTargetProps value) {
        this.swPointerTargetProps = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-REF")
    public SwRecordLayoutRef getSwRecordLayoutRef() {
        return this.swRecordLayoutRef;
    }

    public void setSwRecordLayoutRef(SwRecordLayoutRef value) {
        this.swRecordLayoutRef = value;
    }
    
    
    
    @XmlElement(name="SW-REFRESH-TIMING")
    public MultidimensionalTime getSwRefreshTiming() {
        return this.swRefreshTiming;
    }

    public void setSwRefreshTiming(MultidimensionalTime value) {
        this.swRefreshTiming = value;
    }
    
    
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
        return this.unitRef;
    }

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
    }
    
    
    
    @XmlElement(name="VALUE-AXIS-DATA-TYPE-REF")
    public ValueAxisDataTypeRef getValueAxisDataTypeRef() {
        return this.valueAxisDataTypeRef;
    }

    public void setValueAxisDataTypeRef(ValueAxisDataTypeRef value) {
        this.valueAxisDataTypeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}
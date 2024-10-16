package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Float;
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwDataDefPropsConditionalWrapper {

    
    private SwDataDefPropsConditional swDataDefPropsConditional;

    public SwDataDefPropsConditionalWrapper(SwDataDefPropsConditional swDataDefPropsConditional) {
        this.swDataDefPropsConditional = swDataDefPropsConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getS())) {
            
            return swDataDefPropsConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getT())) {
            
            return swDataDefPropsConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public FloatWrapper getStepSize() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getStepSize())) {
            
            return new FloatWrapper(swDataDefPropsConditional.getStepSize());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getAnnotations())) {
            ArrayList<Annotation> originalList = swDataDefPropsConditional.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwAddrMethodRefWrapper getSwAddrMethodRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwAddrMethodRef())) {
            
            return new SwAddrMethodRefWrapper(swDataDefPropsConditional.getSwAddrMethodRef());
            
        } else {
            return null;
        }
        
    }

    public AlignmentTypeWrapper getSwAlignment() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwAlignment())) {
            
            return new AlignmentTypeWrapper(swDataDefPropsConditional.getSwAlignment());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeRefWrapper getBaseTypeRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getBaseTypeRef())) {
            
            return new BaseTypeRefWrapper(swDataDefPropsConditional.getBaseTypeRef());
            
        } else {
            return null;
        }
        
    }

    public SwBitRepresentationWrapper getSwBitRepresentation() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwBitRepresentation())) {
            
            return new SwBitRepresentationWrapper(swDataDefPropsConditional.getSwBitRepresentation());
            
        } else {
            return null;
        }
        
    }

    public SwCalibrationAccessEnumWrapper getSwCalibrationAccess() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwCalibrationAccess())) {
            
            return new SwCalibrationAccessEnumWrapper(swDataDefPropsConditional.getSwCalibrationAccess());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getSwValueBlockSize() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwValueBlockSize())) {
            
            return new NumericalValueVariationPointWrapper(swDataDefPropsConditional.getSwValueBlockSize());
            
        } else {
            return null;
        }
        
    }

    public SwCalprmAxisSetWrapper getSwCalprmAxisSet() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwCalprmAxisSet())) {
            
            return new SwCalprmAxisSetWrapper(swDataDefPropsConditional.getSwCalprmAxisSet());
            
        } else {
            return null;
        }
        
    }

    public SwTextPropsWrapper getSwTextProps() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwTextProps())) {
            
            return new SwTextPropsWrapper(swDataDefPropsConditional.getSwTextProps());
            
        } else {
            return null;
        }
        
    }

    public SwComparisonVariablesWrapper getSwComparisonVariables() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwComparisonVariables())) {
            
            return new SwComparisonVariablesWrapper(swDataDefPropsConditional.getSwComparisonVariables());
            
        } else {
            return null;
        }
        
    }

    public CompuMethodRefWrapper getCompuMethodRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getCompuMethodRef())) {
            
            return new CompuMethodRefWrapper(swDataDefPropsConditional.getCompuMethodRef());
            
        } else {
            return null;
        }
        
    }

    public DataConstrRefWrapper getDataConstrRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getDataConstrRef())) {
            
            return new DataConstrRefWrapper(swDataDefPropsConditional.getDataConstrRef());
            
        } else {
            return null;
        }
        
    }

    public SwDataDependencyWrapper getSwDataDependency() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwDataDependency())) {
            
            return new SwDataDependencyWrapper(swDataDefPropsConditional.getSwDataDependency());
            
        } else {
            return null;
        }
        
    }

    public DisplayFormatStringWrapper getDisplayFormat() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getDisplayFormat())) {
            
            return new DisplayFormatStringWrapper(swDataDefPropsConditional.getDisplayFormat());
            
        } else {
            return null;
        }
        
    }

    public ImplementationDataTypeRefWrapper getImplementationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getImplementationDataTypeRef())) {
            
            return new ImplementationDataTypeRefWrapper(swDataDefPropsConditional.getImplementationDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public SwVariableRefProxyWrapper getSwHostVariable() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwHostVariable())) {
            
            return new SwVariableRefProxyWrapper(swDataDefPropsConditional.getSwHostVariable());
            
        } else {
            return null;
        }
        
    }

    public SwImplPolicyEnumWrapper getSwImplPolicy() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwImplPolicy())) {
            
            return new SwImplPolicyEnumWrapper(swDataDefPropsConditional.getSwImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public NativeDeclarationStringWrapper getAdditionalNativeTypeQualifier() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getAdditionalNativeTypeQualifier())) {
            
            return new NativeDeclarationStringWrapper(swDataDefPropsConditional.getAdditionalNativeTypeQualifier());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getSwIntendedResolution() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwIntendedResolution())) {
            
            return new NumericalValueWrapper(swDataDefPropsConditional.getSwIntendedResolution());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getSwInterpolationMethod() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwInterpolationMethod())) {
            
            return new IdentifierWrapper(swDataDefPropsConditional.getSwInterpolationMethod());
            
        } else {
            return null;
        }
        
    }

    public InvalidValueWrapper getInvalidValue() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getInvalidValue())) {
            
            return new InvalidValueWrapper(swDataDefPropsConditional.getInvalidValue());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getMcFunction() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getMcFunction())) {
            
            return new IdentifierWrapper(swDataDefPropsConditional.getMcFunction());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSwIsVirtual() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwIsVirtual())) {
            
            return new BooleanWrapper(swDataDefPropsConditional.getSwIsVirtual());
            
        } else {
            return null;
        }
        
    }

    public SwPointerTargetPropsWrapper getSwPointerTargetProps() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwPointerTargetProps())) {
            
            return new SwPointerTargetPropsWrapper(swDataDefPropsConditional.getSwPointerTargetProps());
            
        } else {
            return null;
        }
        
    }

    public SwRecordLayoutRefWrapper getSwRecordLayoutRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwRecordLayoutRef())) {
            
            return new SwRecordLayoutRefWrapper(swDataDefPropsConditional.getSwRecordLayoutRef());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getSwRefreshTiming() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getSwRefreshTiming())) {
            
            return new MultidimensionalTimeWrapper(swDataDefPropsConditional.getSwRefreshTiming());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getUnitRef())) {
            
            return new UnitRefWrapper(swDataDefPropsConditional.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public ValueAxisDataTypeRefWrapper getValueAxisDataTypeRef() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getValueAxisDataTypeRef())) {
            
            return new ValueAxisDataTypeRefWrapper(swDataDefPropsConditional.getValueAxisDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swDataDefPropsConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(swDataDefPropsConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
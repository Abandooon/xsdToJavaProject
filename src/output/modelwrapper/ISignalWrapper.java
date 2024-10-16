package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class ISignalWrapper {

    
    private ISignal iSignal;

    public ISignalWrapper(ISignal iSignal) {
        this.iSignal = iSignal;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignal.getS())) {
            
            return iSignal.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignal.getT())) {
            
            return iSignal.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignal.getUuid())) {
            
            return iSignal.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignal.getShortName())) {
            
            return new IdentifierWrapper(iSignal.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignal.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignal.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignal.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignal.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignal.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignal.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignal.getCategory())) {
            
            return new CategoryStringWrapper(iSignal.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignal.getAdminData())) {
            
            return new AdminDataWrapper(iSignal.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignal.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignal.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignal.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignal.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignal.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignal.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTransformationRefConditionalWrapper> getDataTransformations() {
        
        if (CollUtil.isNotEmpty(iSignal.getDataTransformations())) {
            ArrayList<DataTransformationRefConditional> originalList = iSignal.getDataTransformations();
            ArrayList<DataTransformationRefConditionalWrapper> wrapperList = (ArrayList<DataTransformationRefConditionalWrapper>)originalList.stream()
                .map(item -> new DataTransformationRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DataTypePolicyEnumWrapper getDataTypePolicy() {
        
        if (CollUtil.isNotEmpty(iSignal.getDataTypePolicy())) {
            
            return new DataTypePolicyEnumWrapper(iSignal.getDataTypePolicy());
            
        } else {
            return null;
        }
        
    }

    public ISignalPropsWrapper getISignalProps() {
        
        if (CollUtil.isNotEmpty(iSignal.getISignalProps())) {
            
            return new ISignalPropsWrapper(iSignal.getISignalProps());
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(iSignal.getInitValue())) {
            
            return new InitValueWrapper(iSignal.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(iSignal.getLength())) {
            
            return new IntegerWrapper(iSignal.getLength());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentationProps() {
        
        if (CollUtil.isNotEmpty(iSignal.getNetworkRepresentationProps())) {
            
            return new SwDataDefPropsWrapper(iSignal.getNetworkRepresentationProps());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(iSignal.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(iSignal.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }

    public TransformationISignalPropssWrapper getTransformationISignalPropss() {
        
        if (CollUtil.isNotEmpty(iSignal.getTransformationISignalPropss())) {
            
            return new TransformationISignalPropssWrapper(iSignal.getTransformationISignalPropss());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class TdEventVariableDataPrototypeWrapper {

    
    private TdEventVariableDataPrototype tdEventVariableDataPrototype;

    public TdEventVariableDataPrototypeWrapper(TdEventVariableDataPrototype tdEventVariableDataPrototype) {
        this.tdEventVariableDataPrototype = tdEventVariableDataPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getS())) {
            
            return tdEventVariableDataPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getT())) {
            
            return tdEventVariableDataPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getUuid())) {
            
            return tdEventVariableDataPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getShortName())) {
            
            return new IdentifierWrapper(tdEventVariableDataPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventVariableDataPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventVariableDataPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventVariableDataPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getCategory())) {
            
            return new CategoryStringWrapper(tdEventVariableDataPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getAdminData())) {
            
            return new AdminDataWrapper(tdEventVariableDataPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventVariableDataPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventVariableDataPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventVariableDataPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventVariableDataPrototype.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventVariableDataPrototype.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsExternal() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getIsExternal())) {
            
            return new BooleanWrapper(tdEventVariableDataPrototype.getIsExternal());
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeBlueprintRefWrapper getPortPrototypeBlueprintRef() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getPortPrototypeBlueprintRef())) {
            
            return new PortPrototypeBlueprintRefWrapper(tdEventVariableDataPrototype.getPortPrototypeBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public PortRefWrapper getPortRef() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getPortRef())) {
            
            return new PortRefWrapper(tdEventVariableDataPrototype.getPortRef());
            
        } else {
            return null;
        }
        
    }

    public DataElementRef_InvalidationPolicyWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getDataElementRef())) {
            
            return new DataElementRef_InvalidationPolicyWrapper(tdEventVariableDataPrototype.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventVariableDataPrototypeTypeEnumWrapper getTdEventVariableDataPrototypeType() {
        
        if (CollUtil.isNotEmpty(tdEventVariableDataPrototype.getTdEventVariableDataPrototypeType())) {
            
            return new TdEventVariableDataPrototypeTypeEnumWrapper(tdEventVariableDataPrototype.getTdEventVariableDataPrototypeType());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class TdEventOperationWrapper {

    
    private TdEventOperation tdEventOperation;

    public TdEventOperationWrapper(TdEventOperation tdEventOperation) {
        this.tdEventOperation = tdEventOperation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getS())) {
            
            return tdEventOperation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getT())) {
            
            return tdEventOperation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getUuid())) {
            
            return tdEventOperation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getShortName())) {
            
            return new IdentifierWrapper(tdEventOperation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventOperation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventOperation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventOperation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getCategory())) {
            
            return new CategoryStringWrapper(tdEventOperation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getAdminData())) {
            
            return new AdminDataWrapper(tdEventOperation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventOperation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventOperation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventOperation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventOperation.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventOperation.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsExternal() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getIsExternal())) {
            
            return new BooleanWrapper(tdEventOperation.getIsExternal());
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeBlueprintRefWrapper getPortPrototypeBlueprintRef() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getPortPrototypeBlueprintRef())) {
            
            return new PortPrototypeBlueprintRefWrapper(tdEventOperation.getPortPrototypeBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public PortRefWrapper getPortRef() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getPortRef())) {
            
            return new PortRefWrapper(tdEventOperation.getPortRef());
            
        } else {
            return null;
        }
        
    }

    public OperationRefWrapper getOperationRef() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getOperationRef())) {
            
            return new OperationRefWrapper(tdEventOperation.getOperationRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventOperationTypeEnumWrapper getTdEventOperationType() {
        
        if (CollUtil.isNotEmpty(tdEventOperation.getTdEventOperationType())) {
            
            return new TdEventOperationTypeEnumWrapper(tdEventOperation.getTdEventOperationType());
            
        } else {
            return null;
        }
        
    }




    


    
}
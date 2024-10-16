package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class TdEventBswInternalBehaviorWrapper {

    
    private TdEventBswInternalBehavior tdEventBswInternalBehavior;

    public TdEventBswInternalBehaviorWrapper(TdEventBswInternalBehavior tdEventBswInternalBehavior) {
        this.tdEventBswInternalBehavior = tdEventBswInternalBehavior;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getS())) {
            
            return tdEventBswInternalBehavior.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getT())) {
            
            return tdEventBswInternalBehavior.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getUuid())) {
            
            return tdEventBswInternalBehavior.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getShortName())) {
            
            return new IdentifierWrapper(tdEventBswInternalBehavior.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventBswInternalBehavior.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventBswInternalBehavior.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventBswInternalBehavior.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getCategory())) {
            
            return new CategoryStringWrapper(tdEventBswInternalBehavior.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getAdminData())) {
            
            return new AdminDataWrapper(tdEventBswInternalBehavior.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventBswInternalBehavior.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventBswInternalBehavior.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventBswInternalBehavior.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventBswInternalBehavior.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public BswModuleEntityRefWrapper getBswModuleEntityRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getBswModuleEntityRef())) {
            
            return new BswModuleEntityRefWrapper(tdEventBswInternalBehavior.getBswModuleEntityRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventBswInternalBehaviorTypeEnumWrapper getTdEventBswInternalBehaviorType() {
        
        if (CollUtil.isNotEmpty(tdEventBswInternalBehavior.getTdEventBswInternalBehaviorType())) {
            
            return new TdEventBswInternalBehaviorTypeEnumWrapper(tdEventBswInternalBehavior.getTdEventBswInternalBehaviorType());
            
        } else {
            return null;
        }
        
    }




    


    
}
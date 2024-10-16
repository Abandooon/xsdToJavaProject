package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class TdEventSwcInternalBehaviorReferenceWrapper {

    
    private TdEventSwcInternalBehaviorReference tdEventSwcInternalBehaviorReference;

    public TdEventSwcInternalBehaviorReferenceWrapper(TdEventSwcInternalBehaviorReference tdEventSwcInternalBehaviorReference) {
        this.tdEventSwcInternalBehaviorReference = tdEventSwcInternalBehaviorReference;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getS())) {
            
            return tdEventSwcInternalBehaviorReference.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getT())) {
            
            return tdEventSwcInternalBehaviorReference.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getUuid())) {
            
            return tdEventSwcInternalBehaviorReference.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getShortName())) {
            
            return new IdentifierWrapper(tdEventSwcInternalBehaviorReference.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventSwcInternalBehaviorReference.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventSwcInternalBehaviorReference.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventSwcInternalBehaviorReference.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getCategory())) {
            
            return new CategoryStringWrapper(tdEventSwcInternalBehaviorReference.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getAdminData())) {
            
            return new AdminDataWrapper(tdEventSwcInternalBehaviorReference.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventSwcInternalBehaviorReference.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventSwcInternalBehaviorReference.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventSwcInternalBehaviorReference.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventSwcInternalBehaviorReference.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventSwcInternalBehaviorReference.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public ReferencedTdEventSwcRefWrapper getReferencedTdEventSwcRef() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehaviorReference.getReferencedTdEventSwcRef())) {
            
            return new ReferencedTdEventSwcRefWrapper(tdEventSwcInternalBehaviorReference.getReferencedTdEventSwcRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class TdEventVfbReferenceWrapper {

    
    private TdEventVfbReference tdEventVfbReference;

    public TdEventVfbReferenceWrapper(TdEventVfbReference tdEventVfbReference) {
        this.tdEventVfbReference = tdEventVfbReference;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getS())) {
            
            return tdEventVfbReference.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getT())) {
            
            return tdEventVfbReference.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getUuid())) {
            
            return tdEventVfbReference.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getShortName())) {
            
            return new IdentifierWrapper(tdEventVfbReference.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventVfbReference.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventVfbReference.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventVfbReference.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getCategory())) {
            
            return new CategoryStringWrapper(tdEventVfbReference.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getAdminData())) {
            
            return new AdminDataWrapper(tdEventVfbReference.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventVfbReference.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventVfbReference.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventVfbReference.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventVfbReference.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventVfbReference.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public ReferencedTdEventVfbRefWrapper getReferencedTdEventVfbRef() {
        
        if (CollUtil.isNotEmpty(tdEventVfbReference.getReferencedTdEventVfbRef())) {
            
            return new ReferencedTdEventVfbRefWrapper(tdEventVfbReference.getReferencedTdEventVfbRef());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class TdEventComplexWrapper {

    
    private TdEventComplex tdEventComplex;

    public TdEventComplexWrapper(TdEventComplex tdEventComplex) {
        this.tdEventComplex = tdEventComplex;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getS())) {
            
            return tdEventComplex.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getT())) {
            
            return tdEventComplex.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getUuid())) {
            
            return tdEventComplex.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getShortName())) {
            
            return new IdentifierWrapper(tdEventComplex.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventComplex.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventComplex.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventComplex.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getCategory())) {
            
            return new CategoryStringWrapper(tdEventComplex.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getAdminData())) {
            
            return new AdminDataWrapper(tdEventComplex.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventComplex.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventComplex.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventComplex.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventComplex.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventComplex.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }




    


    
}
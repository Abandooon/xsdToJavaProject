package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class EvaluatedVariantSetWrapper {

    
    private EvaluatedVariantSet evaluatedVariantSet;

    public EvaluatedVariantSetWrapper(EvaluatedVariantSet evaluatedVariantSet) {
        this.evaluatedVariantSet = evaluatedVariantSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getS())) {
            
            return evaluatedVariantSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getT())) {
            
            return evaluatedVariantSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getUuid())) {
            
            return evaluatedVariantSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getShortName())) {
            
            return new IdentifierWrapper(evaluatedVariantSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = evaluatedVariantSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(evaluatedVariantSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(evaluatedVariantSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getCategory())) {
            
            return new CategoryStringWrapper(evaluatedVariantSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getAdminData())) {
            
            return new AdminDataWrapper(evaluatedVariantSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(evaluatedVariantSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getAnnotations())) {
            ArrayList<Annotation> originalList = evaluatedVariantSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getVariationPoint())) {
            
            return new VariationPointWrapper(evaluatedVariantSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getApprovalStatus() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getApprovalStatus())) {
            
            return new NmtokenStringWrapper(evaluatedVariantSet.getApprovalStatus());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EvaluatedElementRefWrapper> getEvaluatedElementRefs() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getEvaluatedElementRefs())) {
            ArrayList<EvaluatedElementRef> originalList = evaluatedVariantSet.getEvaluatedElementRefs();
            ArrayList<EvaluatedElementRefWrapper> wrapperList = (ArrayList<EvaluatedElementRefWrapper>)originalList.stream()
                .map(item -> new EvaluatedElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EvaluatedVariantRefWrapper> getEvaluatedVariantRefs() {
        
        if (CollUtil.isNotEmpty(evaluatedVariantSet.getEvaluatedVariantRefs())) {
            ArrayList<EvaluatedVariantRef> originalList = evaluatedVariantSet.getEvaluatedVariantRefs();
            ArrayList<EvaluatedVariantRefWrapper> wrapperList = (ArrayList<EvaluatedVariantRefWrapper>)originalList.stream()
                .map(item -> new EvaluatedVariantRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
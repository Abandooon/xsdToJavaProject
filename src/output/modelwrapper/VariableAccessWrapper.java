package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class VariableAccessWrapper {

    
    private VariableAccess variableAccess;

    public VariableAccessWrapper(VariableAccess variableAccess) {
        this.variableAccess = variableAccess;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableAccess.getS())) {
            
            return variableAccess.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableAccess.getT())) {
            
            return variableAccess.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(variableAccess.getUuid())) {
            
            return variableAccess.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(variableAccess.getShortName())) {
            
            return new IdentifierWrapper(variableAccess.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(variableAccess.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = variableAccess.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(variableAccess.getLongName())) {
            
            return new MultilanguageLongNameWrapper(variableAccess.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(variableAccess.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(variableAccess.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(variableAccess.getCategory())) {
            
            return new CategoryStringWrapper(variableAccess.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(variableAccess.getAdminData())) {
            
            return new AdminDataWrapper(variableAccess.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(variableAccess.getIntroduction())) {
            
            return new DocumentationBlockWrapper(variableAccess.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(variableAccess.getAnnotations())) {
            ArrayList<Annotation> originalList = variableAccess.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getAccessedVariable() {
        
        if (CollUtil.isNotEmpty(variableAccess.getAccessedVariable())) {
            
            return new AutosarVariableRefWrapper(variableAccess.getAccessedVariable());
            
        } else {
            return null;
        }
        
    }

    public VariableAccessScopeEnumWrapper getScope() {
        
        if (CollUtil.isNotEmpty(variableAccess.getScope())) {
            
            return new VariableAccessScopeEnumWrapper(variableAccess.getScope());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(variableAccess.getVariationPoint())) {
            
            return new VariationPointWrapper(variableAccess.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
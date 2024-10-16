package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class EcucValidationConditionWrapper {

    
    private EcucValidationCondition ecucValidationCondition;

    public EcucValidationConditionWrapper(EcucValidationCondition ecucValidationCondition) {
        this.ecucValidationCondition = ecucValidationCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getS())) {
            
            return ecucValidationCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getT())) {
            
            return ecucValidationCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getUuid())) {
            
            return ecucValidationCondition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getShortName())) {
            
            return new IdentifierWrapper(ecucValidationCondition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucValidationCondition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucValidationCondition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucValidationCondition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getCategory())) {
            
            return new CategoryStringWrapper(ecucValidationCondition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getAdminData())) {
            
            return new AdminDataWrapper(ecucValidationCondition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucValidationCondition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucValidationCondition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucQueryWrapper> getEcucQuerys() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getEcucQuerys())) {
            ArrayList<EcucQuery> originalList = ecucValidationCondition.getEcucQuerys();
            ArrayList<EcucQueryWrapper> wrapperList = (ArrayList<EcucQueryWrapper>)originalList.stream()
                .map(item -> new EcucQueryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionFormulaWrapper getValidationFormula() {
        
        if (CollUtil.isNotEmpty(ecucValidationCondition.getValidationFormula())) {
            
            return new EcucConditionFormulaWrapper(ecucValidationCondition.getValidationFormula());
            
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class EcucQueryWrapper {

    
    private EcucQuery ecucQuery;

    public EcucQueryWrapper(EcucQuery ecucQuery) {
        this.ecucQuery = ecucQuery;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getS())) {
            
            return ecucQuery.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getT())) {
            
            return ecucQuery.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getUuid())) {
            
            return ecucQuery.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getShortName())) {
            
            return new IdentifierWrapper(ecucQuery.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucQuery.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucQuery.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucQuery.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getCategory())) {
            
            return new CategoryStringWrapper(ecucQuery.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getAdminData())) {
            
            return new AdminDataWrapper(ecucQuery.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucQuery.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucQuery.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucQueryExpressionWrapper getEcucQueryExpression() {
        
        if (CollUtil.isNotEmpty(ecucQuery.getEcucQueryExpression())) {
            
            return new EcucQueryExpressionWrapper(ecucQuery.getEcucQueryExpression());
            
        } else {
            return null;
        }
        
    }




    


    
}
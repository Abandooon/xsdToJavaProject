package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class SwRecordLayoutWrapper {

    
    private SwRecordLayout swRecordLayout;

    public SwRecordLayoutWrapper(SwRecordLayout swRecordLayout) {
        this.swRecordLayout = swRecordLayout;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getS())) {
            
            return swRecordLayout.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getT())) {
            
            return swRecordLayout.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getUuid())) {
            
            return swRecordLayout.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getShortName())) {
            
            return new IdentifierWrapper(swRecordLayout.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swRecordLayout.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swRecordLayout.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swRecordLayout.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getCategory())) {
            
            return new CategoryStringWrapper(swRecordLayout.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getAdminData())) {
            
            return new AdminDataWrapper(swRecordLayout.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swRecordLayout.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getAnnotations())) {
            ArrayList<Annotation> originalList = swRecordLayout.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getVariationPoint())) {
            
            return new VariationPointWrapper(swRecordLayout.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwRecordLayoutGroupWrapper getSwRecordLayoutGroup() {
        
        if (CollUtil.isNotEmpty(swRecordLayout.getSwRecordLayoutGroup())) {
            
            return new SwRecordLayoutGroupWrapper(swRecordLayout.getSwRecordLayoutGroup());
            
        } else {
            return null;
        }
        
    }




    


    
}
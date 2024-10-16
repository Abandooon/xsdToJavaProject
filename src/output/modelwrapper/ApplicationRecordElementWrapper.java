package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ApplicationRecordElementWrapper {

    
    private ApplicationRecordElement applicationRecordElement;

    public ApplicationRecordElementWrapper(ApplicationRecordElement applicationRecordElement) {
        this.applicationRecordElement = applicationRecordElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getS())) {
            
            return applicationRecordElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getT())) {
            
            return applicationRecordElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getUuid())) {
            
            return applicationRecordElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getShortName())) {
            
            return new IdentifierWrapper(applicationRecordElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationRecordElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationRecordElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationRecordElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getCategory())) {
            
            return new CategoryStringWrapper(applicationRecordElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getAdminData())) {
            
            return new AdminDataWrapper(applicationRecordElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationRecordElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationRecordElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(applicationRecordElement.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public TypeTrefWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getTypeTref())) {
            
            return new TypeTrefWrapper(applicationRecordElement.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationRecordElement.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationRecordElement.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
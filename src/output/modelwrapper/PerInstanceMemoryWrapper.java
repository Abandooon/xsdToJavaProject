package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class PerInstanceMemoryWrapper {

    
    private PerInstanceMemory perInstanceMemory;

    public PerInstanceMemoryWrapper(PerInstanceMemory perInstanceMemory) {
        this.perInstanceMemory = perInstanceMemory;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getS())) {
            
            return perInstanceMemory.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getT())) {
            
            return perInstanceMemory.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getUuid())) {
            
            return perInstanceMemory.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getShortName())) {
            
            return new IdentifierWrapper(perInstanceMemory.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = perInstanceMemory.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getLongName())) {
            
            return new MultilanguageLongNameWrapper(perInstanceMemory.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(perInstanceMemory.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getCategory())) {
            
            return new CategoryStringWrapper(perInstanceMemory.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getAdminData())) {
            
            return new AdminDataWrapper(perInstanceMemory.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getIntroduction())) {
            
            return new DocumentationBlockWrapper(perInstanceMemory.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getAnnotations())) {
            ArrayList<Annotation> originalList = perInstanceMemory.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StringWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getInitValue())) {
            
            return new StringWrapper(perInstanceMemory.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(perInstanceMemory.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getType() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getType())) {
            
            return new CIdentifierWrapper(perInstanceMemory.getType());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTypeDefinition() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getTypeDefinition())) {
            
            return new StringWrapper(perInstanceMemory.getTypeDefinition());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(perInstanceMemory.getVariationPoint())) {
            
            return new VariationPointWrapper(perInstanceMemory.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
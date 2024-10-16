package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class SwServiceArgWrapper {

    
    private SwServiceArg swServiceArg;

    public SwServiceArgWrapper(SwServiceArg swServiceArg) {
        this.swServiceArg = swServiceArg;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getS())) {
            
            return swServiceArg.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getT())) {
            
            return swServiceArg.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getUuid())) {
            
            return swServiceArg.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getShortName())) {
            
            return new IdentifierWrapper(swServiceArg.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swServiceArg.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swServiceArg.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swServiceArg.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getCategory())) {
            
            return new CategoryStringWrapper(swServiceArg.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getAdminData())) {
            
            return new AdminDataWrapper(swServiceArg.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swServiceArg.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getAnnotations())) {
            ArrayList<Annotation> originalList = swServiceArg.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArgumentDirectionEnumWrapper getDirection() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getDirection())) {
            
            return new ArgumentDirectionEnumWrapper(swServiceArg.getDirection());
            
        } else {
            return null;
        }
        
    }

    public ValueListWrapper getSwArraysize() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getSwArraysize())) {
            
            return new ValueListWrapper(swServiceArg.getSwArraysize());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(swServiceArg.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swServiceArg.getVariationPoint())) {
            
            return new VariationPointWrapper(swServiceArg.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
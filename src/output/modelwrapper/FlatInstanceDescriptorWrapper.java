package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class FlatInstanceDescriptorWrapper {

    
    private FlatInstanceDescriptor flatInstanceDescriptor;

    public FlatInstanceDescriptorWrapper(FlatInstanceDescriptor flatInstanceDescriptor) {
        this.flatInstanceDescriptor = flatInstanceDescriptor;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getS())) {
            
            return flatInstanceDescriptor.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getT())) {
            
            return flatInstanceDescriptor.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getUuid())) {
            
            return flatInstanceDescriptor.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getShortName())) {
            
            return new IdentifierWrapper(flatInstanceDescriptor.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flatInstanceDescriptor.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flatInstanceDescriptor.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flatInstanceDescriptor.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getCategory())) {
            
            return new CategoryStringWrapper(flatInstanceDescriptor.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getAdminData())) {
            
            return new AdminDataWrapper(flatInstanceDescriptor.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flatInstanceDescriptor.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getAnnotations())) {
            ArrayList<Annotation> originalList = flatInstanceDescriptor.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getRole())) {
            
            return new IdentifierWrapper(flatInstanceDescriptor.getRole());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(flatInstanceDescriptor.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public AnyInstanceRefWrapper getUpstreamReferenceIref() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getUpstreamReferenceIref())) {
            
            return new AnyInstanceRefWrapper(flatInstanceDescriptor.getUpstreamReferenceIref());
            
        } else {
            return null;
        }
        
    }

    public AnyInstanceRefWrapper getEcuExtractReferenceIref() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getEcuExtractReferenceIref())) {
            
            return new AnyInstanceRefWrapper(flatInstanceDescriptor.getEcuExtractReferenceIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flatInstanceDescriptor.getVariationPoint())) {
            
            return new VariationPointWrapper(flatInstanceDescriptor.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
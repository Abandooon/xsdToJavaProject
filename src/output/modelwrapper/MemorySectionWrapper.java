package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class MemorySectionWrapper {

    
    private MemorySection memorySection;

    public MemorySectionWrapper(MemorySection memorySection) {
        this.memorySection = memorySection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(memorySection.getS())) {
            
            return memorySection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(memorySection.getT())) {
            
            return memorySection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(memorySection.getUuid())) {
            
            return memorySection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(memorySection.getShortName())) {
            
            return new IdentifierWrapper(memorySection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(memorySection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = memorySection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(memorySection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(memorySection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(memorySection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(memorySection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(memorySection.getCategory())) {
            
            return new CategoryStringWrapper(memorySection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(memorySection.getAdminData())) {
            
            return new AdminDataWrapper(memorySection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(memorySection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(memorySection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(memorySection.getAnnotations())) {
            ArrayList<Annotation> originalList = memorySection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AlignmentTypeWrapper getAlignment() {
        
        if (CollUtil.isNotEmpty(memorySection.getAlignment())) {
            
            return new AlignmentTypeWrapper(memorySection.getAlignment());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutableEntityRefWrapper> getExecutableEntityRefs() {
        
        if (CollUtil.isNotEmpty(memorySection.getExecutableEntityRefs())) {
            ArrayList<ExecutableEntityRef> originalList = memorySection.getExecutableEntityRefs();
            ArrayList<ExecutableEntityRefWrapper> wrapperList = (ArrayList<ExecutableEntityRefWrapper>)originalList.stream()
                .map(item -> new ExecutableEntityRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getMemClassSymbol() {
        
        if (CollUtil.isNotEmpty(memorySection.getMemClassSymbol())) {
            
            return new CIdentifierWrapper(memorySection.getMemClassSymbol());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IdentifierWrapper> getOptions() {
        
        if (CollUtil.isNotEmpty(memorySection.getOptions())) {
            ArrayList<Identifier> originalList = memorySection.getOptions();
            ArrayList<IdentifierWrapper> wrapperList = (ArrayList<IdentifierWrapper>)originalList.stream()
                .map(item -> new IdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PrefixRefWrapper getPrefixRef() {
        
        if (CollUtil.isNotEmpty(memorySection.getPrefixRef())) {
            
            return new PrefixRefWrapper(memorySection.getPrefixRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSize() {
        
        if (CollUtil.isNotEmpty(memorySection.getSize())) {
            
            return new PositiveIntegerWrapper(memorySection.getSize());
            
        } else {
            return null;
        }
        
    }

    public SwAddrmethodRefWrapper getSwAddrmethodRef() {
        
        if (CollUtil.isNotEmpty(memorySection.getSwAddrmethodRef())) {
            
            return new SwAddrmethodRefWrapper(memorySection.getSwAddrmethodRef());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(memorySection.getSymbol())) {
            
            return new IdentifierWrapper(memorySection.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(memorySection.getVariationPoint())) {
            
            return new VariationPointWrapper(memorySection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
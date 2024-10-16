package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ResourceConsumptionWrapper {

    
    private ResourceConsumption resourceConsumption;

    public ResourceConsumptionWrapper(ResourceConsumption resourceConsumption) {
        this.resourceConsumption = resourceConsumption;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getS())) {
            
            return resourceConsumption.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getT())) {
            
            return resourceConsumption.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getUuid())) {
            
            return resourceConsumption.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getShortName())) {
            
            return new IdentifierWrapper(resourceConsumption.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = resourceConsumption.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getLongName())) {
            
            return new MultilanguageLongNameWrapper(resourceConsumption.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(resourceConsumption.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getCategory())) {
            
            return new CategoryStringWrapper(resourceConsumption.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getAdminData())) {
            
            return new AdminDataWrapper(resourceConsumption.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getIntroduction())) {
            
            return new DocumentationBlockWrapper(resourceConsumption.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getAnnotations())) {
            ArrayList<Annotation> originalList = resourceConsumption.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ExecutionTimesWrapper getExecutionTimes() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getExecutionTimes())) {
            
            return new ExecutionTimesWrapper(resourceConsumption.getExecutionTimes());
            
        } else {
            return null;
        }
        
    }

    public HeapUsagesWrapper getHeapUsages() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getHeapUsages())) {
            
            return new HeapUsagesWrapper(resourceConsumption.getHeapUsages());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemorySectionWrapper> getMemorySections() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getMemorySections())) {
            ArrayList<MemorySection> originalList = resourceConsumption.getMemorySections();
            ArrayList<MemorySectionWrapper> wrapperList = (ArrayList<MemorySectionWrapper>)originalList.stream()
                .map(item -> new MemorySectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SectionNamePrefixWrapper> getSectionNamePrefixs() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getSectionNamePrefixs())) {
            ArrayList<SectionNamePrefix> originalList = resourceConsumption.getSectionNamePrefixs();
            ArrayList<SectionNamePrefixWrapper> wrapperList = (ArrayList<SectionNamePrefixWrapper>)originalList.stream()
                .map(item -> new SectionNamePrefixWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public StackUsagesWrapper getStackUsages() {
        
        if (CollUtil.isNotEmpty(resourceConsumption.getStackUsages())) {
            
            return new StackUsagesWrapper(resourceConsumption.getStackUsages());
            
        } else {
            return null;
        }
        
    }




    


    
}
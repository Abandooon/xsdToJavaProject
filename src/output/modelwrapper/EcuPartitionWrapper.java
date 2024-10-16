package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class EcuPartitionWrapper {

    
    private EcuPartition ecuPartition;

    public EcuPartitionWrapper(EcuPartition ecuPartition) {
        this.ecuPartition = ecuPartition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getS())) {
            
            return ecuPartition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getT())) {
            
            return ecuPartition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getUuid())) {
            
            return ecuPartition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getShortName())) {
            
            return new IdentifierWrapper(ecuPartition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuPartition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuPartition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuPartition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getCategory())) {
            
            return new CategoryStringWrapper(ecuPartition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getAdminData())) {
            
            return new AdminDataWrapper(ecuPartition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuPartition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuPartition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getExecInUserMode() {
        
        if (CollUtil.isNotEmpty(ecuPartition.getExecInUserMode())) {
            
            return new BooleanWrapper(ecuPartition.getExecInUserMode());
            
        } else {
            return null;
        }
        
    }




    


    
}
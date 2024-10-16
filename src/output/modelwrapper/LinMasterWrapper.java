package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class LinMasterWrapper {

    
    private LinMaster linMaster;

    public LinMasterWrapper(LinMaster linMaster) {
        this.linMaster = linMaster;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linMaster.getS())) {
            
            return linMaster.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linMaster.getT())) {
            
            return linMaster.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linMaster.getUuid())) {
            
            return linMaster.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linMaster.getShortName())) {
            
            return new IdentifierWrapper(linMaster.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linMaster.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linMaster.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linMaster.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linMaster.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linMaster.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linMaster.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linMaster.getCategory())) {
            
            return new CategoryStringWrapper(linMaster.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linMaster.getAdminData())) {
            
            return new AdminDataWrapper(linMaster.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linMaster.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linMaster.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linMaster.getAnnotations())) {
            ArrayList<Annotation> originalList = linMaster.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinMasterConditionalWrapper> getLinMasterVariants() {
        
        if (CollUtil.isNotEmpty(linMaster.getLinMasterVariants())) {
            ArrayList<LinMasterConditional> originalList = linMaster.getLinMasterVariants();
            ArrayList<LinMasterConditionalWrapper> wrapperList = (ArrayList<LinMasterConditionalWrapper>)originalList.stream()
                .map(item -> new LinMasterConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
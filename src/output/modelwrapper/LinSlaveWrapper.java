package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class LinSlaveWrapper {

    
    private LinSlave linSlave;

    public LinSlaveWrapper(LinSlave linSlave) {
        this.linSlave = linSlave;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linSlave.getS())) {
            
            return linSlave.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linSlave.getT())) {
            
            return linSlave.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linSlave.getUuid())) {
            
            return linSlave.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linSlave.getShortName())) {
            
            return new IdentifierWrapper(linSlave.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linSlave.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linSlave.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linSlave.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linSlave.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linSlave.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linSlave.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linSlave.getCategory())) {
            
            return new CategoryStringWrapper(linSlave.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linSlave.getAdminData())) {
            
            return new AdminDataWrapper(linSlave.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linSlave.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linSlave.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linSlave.getAnnotations())) {
            ArrayList<Annotation> originalList = linSlave.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinSlaveConditionalWrapper> getLinSlaveVariants() {
        
        if (CollUtil.isNotEmpty(linSlave.getLinSlaveVariants())) {
            ArrayList<LinSlaveConditional> originalList = linSlave.getLinSlaveVariants();
            ArrayList<LinSlaveConditionalWrapper> wrapperList = (ArrayList<LinSlaveConditionalWrapper>)originalList.stream()
                .map(item -> new LinSlaveConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
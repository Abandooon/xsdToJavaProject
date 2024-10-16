package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class EcucDestinationUriDefWrapper {

    
    private EcucDestinationUriDef ecucDestinationUriDef;

    public EcucDestinationUriDefWrapper(EcucDestinationUriDef ecucDestinationUriDef) {
        this.ecucDestinationUriDef = ecucDestinationUriDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getS())) {
            
            return ecucDestinationUriDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getT())) {
            
            return ecucDestinationUriDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getUuid())) {
            
            return ecucDestinationUriDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getShortName())) {
            
            return new IdentifierWrapper(ecucDestinationUriDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucDestinationUriDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucDestinationUriDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucDestinationUriDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucDestinationUriDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucDestinationUriDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucDestinationUriDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucDestinationUriDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDestinationUriPolicyWrapper getDestinationUriPolicy() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDef.getDestinationUriPolicy())) {
            
            return new EcucDestinationUriPolicyWrapper(ecucDestinationUriDef.getDestinationUriPolicy());
            
        } else {
            return null;
        }
        
    }




    


    
}
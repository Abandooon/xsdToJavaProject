package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class EndToEndProtectionWrapper {

    
    private EndToEndProtection endToEndProtection;

    public EndToEndProtectionWrapper(EndToEndProtection endToEndProtection) {
        this.endToEndProtection = endToEndProtection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getS())) {
            
            return endToEndProtection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getT())) {
            
            return endToEndProtection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getUuid())) {
            
            return endToEndProtection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getShortName())) {
            
            return new IdentifierWrapper(endToEndProtection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = endToEndProtection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(endToEndProtection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(endToEndProtection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getCategory())) {
            
            return new CategoryStringWrapper(endToEndProtection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getAdminData())) {
            
            return new AdminDataWrapper(endToEndProtection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(endToEndProtection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getAnnotations())) {
            ArrayList<Annotation> originalList = endToEndProtection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EndToEndDescriptionWrapper getEndToEndProfile() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getEndToEndProfile())) {
            
            return new EndToEndDescriptionWrapper(endToEndProtection.getEndToEndProfile());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EndToEndProtectionISignalIPduWrapper> getEndToEndProtectionISignalIPdus() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getEndToEndProtectionISignalIPdus())) {
            ArrayList<EndToEndProtectionISignalIPdu> originalList = endToEndProtection.getEndToEndProtectionISignalIPdus();
            ArrayList<EndToEndProtectionISignalIPduWrapper> wrapperList = (ArrayList<EndToEndProtectionISignalIPduWrapper>)originalList.stream()
                .map(item -> new EndToEndProtectionISignalIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EndToEndProtectionVariablePrototypeWrapper> getEndToEndProtectionVariablePrototypes() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getEndToEndProtectionVariablePrototypes())) {
            ArrayList<EndToEndProtectionVariablePrototype> originalList = endToEndProtection.getEndToEndProtectionVariablePrototypes();
            ArrayList<EndToEndProtectionVariablePrototypeWrapper> wrapperList = (ArrayList<EndToEndProtectionVariablePrototypeWrapper>)originalList.stream()
                .map(item -> new EndToEndProtectionVariablePrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndProtection.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndProtection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
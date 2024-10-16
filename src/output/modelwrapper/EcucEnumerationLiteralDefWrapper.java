package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class EcucEnumerationLiteralDefWrapper {

    
    private EcucEnumerationLiteralDef ecucEnumerationLiteralDef;

    public EcucEnumerationLiteralDefWrapper(EcucEnumerationLiteralDef ecucEnumerationLiteralDef) {
        this.ecucEnumerationLiteralDef = ecucEnumerationLiteralDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getS())) {
            
            return ecucEnumerationLiteralDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getT())) {
            
            return ecucEnumerationLiteralDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getUuid())) {
            
            return ecucEnumerationLiteralDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getShortName())) {
            
            return new IdentifierWrapper(ecucEnumerationLiteralDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucEnumerationLiteralDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucEnumerationLiteralDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucEnumerationLiteralDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getCategory())) {
            
            return new CategoryStringWrapper(ecucEnumerationLiteralDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getAdminData())) {
            
            return new AdminDataWrapper(ecucEnumerationLiteralDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucEnumerationLiteralDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucEnumerationLiteralDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucConditionSpecificationWrapper getEcucCond() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getEcucCond())) {
            
            return new EcucConditionSpecificationWrapper(ecucEnumerationLiteralDef.getEcucCond());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getOrigin() {
        
        if (CollUtil.isNotEmpty(ecucEnumerationLiteralDef.getOrigin())) {
            
            return new StringWrapper(ecucEnumerationLiteralDef.getOrigin());
            
        } else {
            return null;
        }
        
    }




    


    
}
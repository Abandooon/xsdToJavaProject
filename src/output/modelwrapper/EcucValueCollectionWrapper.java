package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class EcucValueCollectionWrapper {

    
    private EcucValueCollection ecucValueCollection;

    public EcucValueCollectionWrapper(EcucValueCollection ecucValueCollection) {
        this.ecucValueCollection = ecucValueCollection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getS())) {
            
            return ecucValueCollection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getT())) {
            
            return ecucValueCollection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getUuid())) {
            
            return ecucValueCollection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getShortName())) {
            
            return new IdentifierWrapper(ecucValueCollection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucValueCollection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucValueCollection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucValueCollection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getCategory())) {
            
            return new CategoryStringWrapper(ecucValueCollection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getAdminData())) {
            
            return new AdminDataWrapper(ecucValueCollection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucValueCollection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucValueCollection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucValueCollection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EcuExtractRefWrapper getEcuExtractRef() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getEcuExtractRef())) {
            
            return new EcuExtractRefWrapper(ecucValueCollection.getEcuExtractRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucModuleConfigurationValuesRefConditionalWrapper> getEcucValues() {
        
        if (CollUtil.isNotEmpty(ecucValueCollection.getEcucValues())) {
            ArrayList<EcucModuleConfigurationValuesRefConditional> originalList = ecucValueCollection.getEcucValues();
            ArrayList<EcucModuleConfigurationValuesRefConditionalWrapper> wrapperList = (ArrayList<EcucModuleConfigurationValuesRefConditionalWrapper>)originalList.stream()
                .map(item -> new EcucModuleConfigurationValuesRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
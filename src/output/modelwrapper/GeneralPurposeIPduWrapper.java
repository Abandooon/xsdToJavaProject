package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class GeneralPurposeIPduWrapper {

    
    private GeneralPurposeIPdu generalPurposeIPdu;

    public GeneralPurposeIPduWrapper(GeneralPurposeIPdu generalPurposeIPdu) {
        this.generalPurposeIPdu = generalPurposeIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getS())) {
            
            return generalPurposeIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getT())) {
            
            return generalPurposeIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getUuid())) {
            
            return generalPurposeIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getShortName())) {
            
            return new IdentifierWrapper(generalPurposeIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = generalPurposeIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(generalPurposeIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(generalPurposeIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getCategory())) {
            
            return new CategoryStringWrapper(generalPurposeIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getAdminData())) {
            
            return new AdminDataWrapper(generalPurposeIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(generalPurposeIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = generalPurposeIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(generalPurposeIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getLength())) {
            
            return new IntegerWrapper(generalPurposeIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(generalPurposeIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(generalPurposeIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(generalPurposeIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }




    


    
}
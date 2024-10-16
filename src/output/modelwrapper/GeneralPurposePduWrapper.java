package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class GeneralPurposePduWrapper {

    
    private GeneralPurposePdu generalPurposePdu;

    public GeneralPurposePduWrapper(GeneralPurposePdu generalPurposePdu) {
        this.generalPurposePdu = generalPurposePdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getS())) {
            
            return generalPurposePdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getT())) {
            
            return generalPurposePdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getUuid())) {
            
            return generalPurposePdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getShortName())) {
            
            return new IdentifierWrapper(generalPurposePdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = generalPurposePdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(generalPurposePdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(generalPurposePdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getCategory())) {
            
            return new CategoryStringWrapper(generalPurposePdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getAdminData())) {
            
            return new AdminDataWrapper(generalPurposePdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(generalPurposePdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getAnnotations())) {
            ArrayList<Annotation> originalList = generalPurposePdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getVariationPoint())) {
            
            return new VariationPointWrapper(generalPurposePdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getLength())) {
            
            return new IntegerWrapper(generalPurposePdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(generalPurposePdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(generalPurposePdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }




    


    
}
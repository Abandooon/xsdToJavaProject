package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class HwAttributeLiteralDefWrapper {

    
    private HwAttributeLiteralDef hwAttributeLiteralDef;

    public HwAttributeLiteralDefWrapper(HwAttributeLiteralDef hwAttributeLiteralDef) {
        this.hwAttributeLiteralDef = hwAttributeLiteralDef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getS())) {
            
            return hwAttributeLiteralDef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getT())) {
            
            return hwAttributeLiteralDef.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getUuid())) {
            
            return hwAttributeLiteralDef.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getShortName())) {
            
            return new IdentifierWrapper(hwAttributeLiteralDef.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = hwAttributeLiteralDef.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getLongName())) {
            
            return new MultilanguageLongNameWrapper(hwAttributeLiteralDef.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwAttributeLiteralDef.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getCategory())) {
            
            return new CategoryStringWrapper(hwAttributeLiteralDef.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getAdminData())) {
            
            return new AdminDataWrapper(hwAttributeLiteralDef.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwAttributeLiteralDef.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(hwAttributeLiteralDef.getAnnotations())) {
            ArrayList<Annotation> originalList = hwAttributeLiteralDef.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
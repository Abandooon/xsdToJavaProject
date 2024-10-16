package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class LogicAddressWrapper {

    
    private LogicAddress logicAddress;

    public LogicAddressWrapper(LogicAddress logicAddress) {
        this.logicAddress = logicAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(logicAddress.getS())) {
            
            return logicAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(logicAddress.getT())) {
            
            return logicAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(logicAddress.getUuid())) {
            
            return logicAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(logicAddress.getShortName())) {
            
            return new IdentifierWrapper(logicAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(logicAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = logicAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(logicAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(logicAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(logicAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(logicAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(logicAddress.getCategory())) {
            
            return new CategoryStringWrapper(logicAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(logicAddress.getAdminData())) {
            
            return new AdminDataWrapper(logicAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(logicAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(logicAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(logicAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = logicAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getAddress() {
        
        if (CollUtil.isNotEmpty(logicAddress.getAddress())) {
            
            return new IntegerWrapper(logicAddress.getAddress());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(logicAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(logicAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}
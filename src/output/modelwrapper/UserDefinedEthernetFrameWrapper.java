package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class UserDefinedEthernetFrameWrapper {

    
    private UserDefinedEthernetFrame userDefinedEthernetFrame;

    public UserDefinedEthernetFrameWrapper(UserDefinedEthernetFrame userDefinedEthernetFrame) {
        this.userDefinedEthernetFrame = userDefinedEthernetFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getS())) {
            
            return userDefinedEthernetFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getT())) {
            
            return userDefinedEthernetFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getUuid())) {
            
            return userDefinedEthernetFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getShortName())) {
            
            return new IdentifierWrapper(userDefinedEthernetFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedEthernetFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedEthernetFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedEthernetFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedEthernetFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedEthernetFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedEthernetFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedEthernetFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedEthernetFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getFrameLength())) {
            
            return new IntegerWrapper(userDefinedEthernetFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(userDefinedEthernetFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = userDefinedEthernetFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
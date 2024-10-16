package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class PdurIPduGroupWrapper {

    
    private PdurIPduGroup pdurIPduGroup;

    public PdurIPduGroupWrapper(PdurIPduGroup pdurIPduGroup) {
        this.pdurIPduGroup = pdurIPduGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getS())) {
            
            return pdurIPduGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getT())) {
            
            return pdurIPduGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getUuid())) {
            
            return pdurIPduGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getShortName())) {
            
            return new IdentifierWrapper(pdurIPduGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = pdurIPduGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(pdurIPduGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(pdurIPduGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getCategory())) {
            
            return new CategoryStringWrapper(pdurIPduGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getAdminData())) {
            
            return new AdminDataWrapper(pdurIPduGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(pdurIPduGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = pdurIPduGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(pdurIPduGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getCommunicationMode() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getCommunicationMode())) {
            
            return new StringWrapper(pdurIPduGroup.getCommunicationMode());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringRefConditionalWrapper> getIPdus() {
        
        if (CollUtil.isNotEmpty(pdurIPduGroup.getIPdus())) {
            ArrayList<PduTriggeringRefConditional> originalList = pdurIPduGroup.getIPdus();
            ArrayList<PduTriggeringRefConditionalWrapper> wrapperList = (ArrayList<PduTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new PduTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
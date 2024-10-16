package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class ISignalIPduGroupWrapper {

    
    private ISignalIPduGroup iSignalIPduGroup;

    public ISignalIPduGroupWrapper(ISignalIPduGroup iSignalIPduGroup) {
        this.iSignalIPduGroup = iSignalIPduGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getS())) {
            
            return iSignalIPduGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getT())) {
            
            return iSignalIPduGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getUuid())) {
            
            return iSignalIPduGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getShortName())) {
            
            return new IdentifierWrapper(iSignalIPduGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalIPduGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalIPduGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalIPduGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getCategory())) {
            
            return new CategoryStringWrapper(iSignalIPduGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getAdminData())) {
            
            return new AdminDataWrapper(iSignalIPduGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalIPduGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalIPduGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalIPduGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(iSignalIPduGroup.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getCommunicationMode() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getCommunicationMode())) {
            
            return new StringWrapper(iSignalIPduGroup.getCommunicationMode());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContainedISignalIPduGroupRefWrapper> getContainedISignalIPduGroupRefs() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getContainedISignalIPduGroupRefs())) {
            ArrayList<ContainedISignalIPduGroupRef> originalList = iSignalIPduGroup.getContainedISignalIPduGroupRefs();
            ArrayList<ContainedISignalIPduGroupRefWrapper> wrapperList = (ArrayList<ContainedISignalIPduGroupRefWrapper>)originalList.stream()
                .map(item -> new ContainedISignalIPduGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalIPduRefConditionalWrapper> getISignalIPdus() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getISignalIPdus())) {
            ArrayList<ISignalIPduRefConditional> originalList = iSignalIPduGroup.getISignalIPdus();
            ArrayList<ISignalIPduRefConditionalWrapper> wrapperList = (ArrayList<ISignalIPduRefConditionalWrapper>)originalList.stream()
                .map(item -> new ISignalIPduRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NmPduRefConditionalWrapper> getNmPdus() {
        
        if (CollUtil.isNotEmpty(iSignalIPduGroup.getNmPdus())) {
            ArrayList<NmPduRefConditional> originalList = iSignalIPduGroup.getNmPdus();
            ArrayList<NmPduRefConditionalWrapper> wrapperList = (ArrayList<NmPduRefConditionalWrapper>)originalList.stream()
                .map(item -> new NmPduRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}
package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RPortPrototypeWrapper {

    
    private RPortPrototype rPortPrototype;

    public RPortPrototypeWrapper(RPortPrototype rPortPrototype) {
        this.rPortPrototype = rPortPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getS())) {
            
            return rPortPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getT())) {
            
            return rPortPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getUuid())) {
            
            return rPortPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getShortName())) {
            
            return new IdentifierWrapper(rPortPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = rPortPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(rPortPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(rPortPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getCategory())) {
            
            return new CategoryStringWrapper(rPortPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getAdminData())) {
            
            return new AdminDataWrapper(rPortPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(rPortPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = rPortPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerAnnotationWrapper> getClientServerAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getClientServerAnnotations())) {
            ArrayList<ClientServerAnnotation> originalList = rPortPrototype.getClientServerAnnotations();
            ArrayList<ClientServerAnnotationWrapper> wrapperList = (ArrayList<ClientServerAnnotationWrapper>)originalList.stream()
                .map(item -> new ClientServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DelegatedPortAnnotationWrapper getDelegatedPortAnnotation() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getDelegatedPortAnnotation())) {
            
            return new DelegatedPortAnnotationWrapper(rPortPrototype.getDelegatedPortAnnotation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IoHwAbstractionServerAnnotationWrapper> getIoHwAbstractionServerAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getIoHwAbstractionServerAnnotations())) {
            ArrayList<IoHwAbstractionServerAnnotation> originalList = rPortPrototype.getIoHwAbstractionServerAnnotations();
            ArrayList<IoHwAbstractionServerAnnotationWrapper> wrapperList = (ArrayList<IoHwAbstractionServerAnnotationWrapper>)originalList.stream()
                .map(item -> new IoHwAbstractionServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModePortAnnotationWrapper> getModePortAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getModePortAnnotations())) {
            ArrayList<ModePortAnnotation> originalList = rPortPrototype.getModePortAnnotations();
            ArrayList<ModePortAnnotationWrapper> wrapperList = (ArrayList<ModePortAnnotationWrapper>)originalList.stream()
                .map(item -> new ModePortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvDataPortAnnotationWrapper> getNvDataPortAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getNvDataPortAnnotations())) {
            ArrayList<NvDataPortAnnotation> originalList = rPortPrototype.getNvDataPortAnnotations();
            ArrayList<NvDataPortAnnotationWrapper> wrapperList = (ArrayList<NvDataPortAnnotationWrapper>)originalList.stream()
                .map(item -> new NvDataPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterPortAnnotationWrapper> getParameterPortAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getParameterPortAnnotations())) {
            ArrayList<ParameterPortAnnotation> originalList = rPortPrototype.getParameterPortAnnotations();
            ArrayList<ParameterPortAnnotationWrapper> wrapperList = (ArrayList<ParameterPortAnnotationWrapper>)originalList.stream()
                .map(item -> new ParameterPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SenderReceiverAnnotationsWrapper getSenderReceiverAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getSenderReceiverAnnotations())) {
            
            return new SenderReceiverAnnotationsWrapper(rPortPrototype.getSenderReceiverAnnotations());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerPortAnnotationWrapper> getTriggerPortAnnotations() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getTriggerPortAnnotations())) {
            ArrayList<TriggerPortAnnotation> originalList = rPortPrototype.getTriggerPortAnnotations();
            ArrayList<TriggerPortAnnotationWrapper> wrapperList = (ArrayList<TriggerPortAnnotationWrapper>)originalList.stream()
                .map(item -> new TriggerPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(rPortPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public RequiredComSpecsWrapper getRequiredComSpecs() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getRequiredComSpecs())) {
            
            return new RequiredComSpecsWrapper(rPortPrototype.getRequiredComSpecs());
            
        } else {
            return null;
        }
        
    }

    public RequiredInterfaceTrefWrapper getRequiredInterfaceTref() {
        
        if (CollUtil.isNotEmpty(rPortPrototype.getRequiredInterfaceTref())) {
            
            return new RequiredInterfaceTrefWrapper(rPortPrototype.getRequiredInterfaceTref());
            
        } else {
            return null;
        }
        
    }




    


    
}
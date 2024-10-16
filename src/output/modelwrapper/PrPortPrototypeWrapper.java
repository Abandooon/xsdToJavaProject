package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PrPortPrototypeWrapper {

    
    private PrPortPrototype prPortPrototype;

    public PrPortPrototypeWrapper(PrPortPrototype prPortPrototype) {
        this.prPortPrototype = prPortPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getS())) {
            
            return prPortPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getT())) {
            
            return prPortPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getUuid())) {
            
            return prPortPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getShortName())) {
            
            return new IdentifierWrapper(prPortPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = prPortPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(prPortPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(prPortPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getCategory())) {
            
            return new CategoryStringWrapper(prPortPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getAdminData())) {
            
            return new AdminDataWrapper(prPortPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(prPortPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = prPortPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerAnnotationWrapper> getClientServerAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getClientServerAnnotations())) {
            ArrayList<ClientServerAnnotation> originalList = prPortPrototype.getClientServerAnnotations();
            ArrayList<ClientServerAnnotationWrapper> wrapperList = (ArrayList<ClientServerAnnotationWrapper>)originalList.stream()
                .map(item -> new ClientServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DelegatedPortAnnotationWrapper getDelegatedPortAnnotation() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getDelegatedPortAnnotation())) {
            
            return new DelegatedPortAnnotationWrapper(prPortPrototype.getDelegatedPortAnnotation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IoHwAbstractionServerAnnotationWrapper> getIoHwAbstractionServerAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getIoHwAbstractionServerAnnotations())) {
            ArrayList<IoHwAbstractionServerAnnotation> originalList = prPortPrototype.getIoHwAbstractionServerAnnotations();
            ArrayList<IoHwAbstractionServerAnnotationWrapper> wrapperList = (ArrayList<IoHwAbstractionServerAnnotationWrapper>)originalList.stream()
                .map(item -> new IoHwAbstractionServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModePortAnnotationWrapper> getModePortAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getModePortAnnotations())) {
            ArrayList<ModePortAnnotation> originalList = prPortPrototype.getModePortAnnotations();
            ArrayList<ModePortAnnotationWrapper> wrapperList = (ArrayList<ModePortAnnotationWrapper>)originalList.stream()
                .map(item -> new ModePortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvDataPortAnnotationWrapper> getNvDataPortAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getNvDataPortAnnotations())) {
            ArrayList<NvDataPortAnnotation> originalList = prPortPrototype.getNvDataPortAnnotations();
            ArrayList<NvDataPortAnnotationWrapper> wrapperList = (ArrayList<NvDataPortAnnotationWrapper>)originalList.stream()
                .map(item -> new NvDataPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterPortAnnotationWrapper> getParameterPortAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getParameterPortAnnotations())) {
            ArrayList<ParameterPortAnnotation> originalList = prPortPrototype.getParameterPortAnnotations();
            ArrayList<ParameterPortAnnotationWrapper> wrapperList = (ArrayList<ParameterPortAnnotationWrapper>)originalList.stream()
                .map(item -> new ParameterPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SenderReceiverAnnotationsWrapper getSenderReceiverAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getSenderReceiverAnnotations())) {
            
            return new SenderReceiverAnnotationsWrapper(prPortPrototype.getSenderReceiverAnnotations());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerPortAnnotationWrapper> getTriggerPortAnnotations() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getTriggerPortAnnotations())) {
            ArrayList<TriggerPortAnnotation> originalList = prPortPrototype.getTriggerPortAnnotations();
            ArrayList<TriggerPortAnnotationWrapper> wrapperList = (ArrayList<TriggerPortAnnotationWrapper>)originalList.stream()
                .map(item -> new TriggerPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(prPortPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ProvidedComSpecsWrapper getProvidedComSpecs() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getProvidedComSpecs())) {
            
            return new ProvidedComSpecsWrapper(prPortPrototype.getProvidedComSpecs());
            
        } else {
            return null;
        }
        
    }

    public RequiredComSpecsWrapper getRequiredComSpecs() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getRequiredComSpecs())) {
            
            return new RequiredComSpecsWrapper(prPortPrototype.getRequiredComSpecs());
            
        } else {
            return null;
        }
        
    }

    public ProvidedRequiredInterfaceTrefWrapper getProvidedRequiredInterfaceTref() {
        
        if (CollUtil.isNotEmpty(prPortPrototype.getProvidedRequiredInterfaceTref())) {
            
            return new ProvidedRequiredInterfaceTrefWrapper(prPortPrototype.getProvidedRequiredInterfaceTref());
            
        } else {
            return null;
        }
        
    }




    


    
}
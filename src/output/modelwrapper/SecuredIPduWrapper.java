package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    


public class SecuredIPduWrapper {

    
    private SecuredIPdu securedIPdu;

    public SecuredIPduWrapper(SecuredIPdu securedIPdu) {
        this.securedIPdu = securedIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getS())) {
            
            return securedIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getT())) {
            
            return securedIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getUuid())) {
            
            return securedIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getShortName())) {
            
            return new IdentifierWrapper(securedIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = securedIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(securedIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(securedIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getCategory())) {
            
            return new CategoryStringWrapper(securedIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getAdminData())) {
            
            return new AdminDataWrapper(securedIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(securedIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = securedIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(securedIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getLength())) {
            
            return new IntegerWrapper(securedIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(securedIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(securedIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public PayloadRefWrapper getPayloadRef() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getPayloadRef())) {
            
            return new PayloadRefWrapper(securedIPdu.getPayloadRef());
            
        } else {
            return null;
        }
        
    }

    public SecureCommunicationPropsWrapper getSecureCommunicationProps() {
        
        if (CollUtil.isNotEmpty(securedIPdu.getSecureCommunicationProps())) {
            
            return new SecureCommunicationPropsWrapper(securedIPdu.getSecureCommunicationProps());
            
        } else {
            return null;
        }
        
    }




    


    
}